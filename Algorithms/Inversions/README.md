# Number of Inversions

## Problem Introduction:

An inversion of a sequence 𝑎0, 𝑎1, . . . , 𝑎𝑛−1 is a pair of indices 0 ≤ 𝑖 < 𝑗 < 𝑛 such
that 𝑎𝑖 > 𝑎𝑗 . The number of inversions of a sequence in some sense measures how
close the sequence is to being sorted. For example, a sorted (in non-descending
order) sequence contains no inversions at all, while in a sequence sorted in descending
order any two elements constitute an inversion (for a total of 𝑛(𝑛 − 1)/2
inversions).

## Task:

The goal in this problem is to count the number of inversions of a given sequence.
Input Format. The first line contains an integer 𝑛, the next one contains a sequence of integers
𝑎0, 𝑎1, . . . , 𝑎𝑛−1.

## Input Format:

The first line of the input contains an integer 𝑛. The next line contains a sequence of 𝑛 integers 𝑎0, 𝑎1, . . . , 𝑎𝑛−1.

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>5</sup>; 0 ≤ 𝑎𝑖 ≤ 𝑎𝑖 ≤ 10<sup>9</sup> for all 0 ≤ 𝑖 < 𝑛.

## Output Format:

Output the number of inversions in the sequence.

## Sample:

```
Input:
5
2 3 9 2 9

Output:
2

```
