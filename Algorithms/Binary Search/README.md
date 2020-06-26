# Binary Search

## Problem Introduction:

In this problem, you will implement the binary search algorithm that allows searching
very efficiently (even huge) lists, provided that the list is sorted.

## Task:

The goal in this code problem is to implement the binary search algorithm.

## Input Format:

The first line of the input contains an integer 𝑛 and a sequence 𝑎<sub>0</sub> < 𝑎<sub>1</sub> < . . . < 𝑎<sub>𝑛−1</sub> of 𝑛 pairwise distinct positive integers in increasing order. The next line contains an integer 𝑘 and 𝑘 positive integers 𝑏<sub>0, 𝑏<sub>1</sub>, . . . , 𝑏<sub>𝑘−1</sub>.

## Constraints:

1 ≤ 𝑘 ≤ 10<sub>5</sub>; 1 ≤ 𝑛 ≤ 3 · 10<sub>4</sub>; 1 ≤ 𝑎𝑖 ≤ 10<sub>9</sub> for all 0 ≤ 𝑖 < 𝑛; 1 ≤ 𝑏𝑗 ≤ 10<sub>9</sub> for all 0 ≤ 𝑗 < 𝑘

## Output Format:

For all 𝑖 from 0 to 𝑘 − 1, output an index 0 ≤ 𝑗 ≤ 𝑛 − 1 such that 𝑎<sub>𝑗</sub> = 𝑏<sub>𝑖</sub> or −1 if there is no such index.

## Sample:

```
Input:
5 1 5 8 12 13
5 8 1 23 1 11
Output:
2 0 -1 0 -1

```
