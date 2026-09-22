public class Homework2 {
    public static void main(String[] args) {
        int [] numbers = {11,3,2,27,7,15,5,23,12,95,34,89};
        System.out.println("Original Array:");
        for (int i = 0; i <= numbers.length-1; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println();

    //       Bubble Sort
        System.out.println("Bubble Sort Result:");
        int [] numbers2 = new int[numbers.length];
        for (int i = 0; i <= numbers.length-1; i++){
            numbers2[i] = numbers[i];
        }
        int [] bubbleArray = bubbleSort(numbers2);
        for (int i = 0; i <= numbers.length-1; i++) {
            System.out.print(bubbleArray[i]+" ");
        }
        System.out.println();
        System.out.println();

    //       Merge Sort
        System.out.println("Merge Sort Result:");
        int [] ms_numbers = new int[numbers.length];
        for (int i = 0; i <= numbers.length-1; i++){
            ms_numbers[i] = numbers[i];
        }
        mergeSort(ms_numbers);
        for(int i = 0; i < ms_numbers.length; i++){
            System.out.print(ms_numbers[i]+" ");
        }
        System.out.println();
        System.out.println();

    //        Linear Search
        System.out.println("Linear Search");
        int linearSearchTarget = 13;
        System.out.println("Target: " + linearSearchTarget);

        int linearSearchResult = linearSearch(numbers, linearSearchTarget);
        if (linearSearchResult == -1){
            System.out.println("Target not found.");
        }else{
            System.out.println("Target found at index " + linearSearchResult);
        }
        System.out.println();

    //        Binary Search
        System.out.println("Binary Search");
        int binarySearchTarget = 90;
        System.out.println("Target: " + binarySearchTarget);

        int binarySearchResult = binarySearch(ms_numbers, binarySearchTarget);
        if (binarySearchResult == -1){
            System.out.println("Target not found.");
        }else{
            System.out.println("Target found at index " + binarySearchResult);
        }
    }
    public static int[] bubbleSort(int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
    public static void mergeSort(int [] ms_numbers){
        if (ms_numbers.length <= 1){
            return;
        }
        int middle = ms_numbers.length/2;

        int [] left = new int[middle];
        int [] right = new int[ms_numbers.length-middle];

        for(int i = 0; i < middle; i++){
            left[i] = ms_numbers[i];
        }
        for(int i = middle; i < ms_numbers.length; i++){
            right[i - middle] = ms_numbers[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left,right, ms_numbers);
    }
    public static void merge(int [] left, int [] right, int [] ms_numbers){
        int leftIndex = 0;
        int rightIndex = 0;
        int numbersIndex = 0;

        while(leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] <= right[rightIndex]){
                ms_numbers[numbersIndex] = left[leftIndex];
                leftIndex++;
            }else{
                ms_numbers[numbersIndex] = right[rightIndex];
                rightIndex++;
            }
            numbersIndex++;
        }
        while(leftIndex < left.length){
            ms_numbers[numbersIndex] = left[leftIndex];

            leftIndex++;
            numbersIndex++;
        }
        while(rightIndex < right.length){
            ms_numbers[numbersIndex] = right[rightIndex];

            rightIndex++;
            numbersIndex++;
        }
    }
    public static int linearSearch(int [] numbers,int target){
        for (int i = 0; i < numbers.length-1; i++){
            if (numbers[i] == target){
                return i;
            }
        }
        return-1;
    }
    public static int binarySearch(int [] ms_numbers, int target){
        int low = 0, high = ms_numbers.length-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(target == ms_numbers[mid]){
                return mid;
            }else if(target < ms_numbers[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}