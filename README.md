# HW2
Name: Kayode Moore
Programming Language: JAVA
IDE / Editor: IntelliJ IDEA


Part 4 — Bubble Sort Big O
Question 1
What is the worst-case Big O time complexity of Bubble Sort?

Answer:
The worst-case Big O time complexity of Bubble Sort is Big O(n^2).

Question 2
Why does Bubble Sort have this time complexity?
Your explanation should mention the repeated comparisons or nested loops.

Answer:
Bubble Sort has this time complexity because it uses nested loops, which cause the program to compare elements multiple times. The worst case time complexity increases as the number of elements grows and the number of comparisons increases.

Question 3
If Bubble Sort processes 10 elements, approximately how many comparisons could be required compared with 1,000 elements?
You do not need to calculate the exact number.
Explain the difference using the idea of:
O(n²)

Answer:
When Bubble Sort processes 10 elements versus 1000 elements, the number of comparisons increases much faster due to the quadratic growth of the time complexity. At 10 elements, the growth is slower than at 1000 elements.


Part 6 — Compare Bubble Sort and Merge Sort
Answer the following questions.

Question 4
What is the Big O time complexity of Merge Sort?

Answer:
The Big O time complexity of Merge Sort is Big O(n log n).

Question 5
Which algorithm generally performs better when the amount of data becomes very large?
Choose:
Bubble Sort
or:
Merge Sort
Explain why.

Answer:
Merge Sort performs better as the amount of data becomes larger because of the divide and conquer approach taken.

Question 6
Complete the following:

Bubble Sort = O(n^2)
Merge Sort = O(n log n)


Part 11 — Searching Questions
Answer each question in 2–4 sentences.

Question 7
What is the Big O time complexity of Linear Search?

Answer:
The Big O time complexity of Linear Search is O(n). The time complexity depends on where the number is located O(1) if it's near the beginning and O(n) if it's near the end.

Question 8
What is the Big O time complexity of Binary Search?

Answer:
The time complexity of Binary Search O(log n). Binary Search has the pros of a good time complexity but the con of having to sort the array first.

Question 9
Why does Binary Search require sorted data?

Answer:
Binary Search requires sorted data because it eliminates half of the array depending on whether the target is greater than or less than the midpoint. Without a sorted array, a Binary Search can't be performed.

Question 10
Which search would you use if the data were not sorted?
Explain why.

Answer:
I would use Linear Search if the data were not sorted. I would use it because even as the number of elements grows, Linear Search's worst case scenario remains O(n).

Question 11
Which search would generally be better for a very large sorted array?
Explain why.

Answer:
Binary Search would be better for a large sorted array. Binary Search's time complexity does not become worse than O(log n) as the number of elements increases.


Part 12 — Algorithm Comparison Table
Complete the table.

Big O

Bubble Sort
O(n^2)

Merge Sort
O(n log n)

Linear Search
O(n)

Binary Search
O(log n)
