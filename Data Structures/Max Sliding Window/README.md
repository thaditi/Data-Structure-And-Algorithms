# Maximum in Sliding Window

## Problem Introduction:

Given a sequence 𝑎1, . . . , 𝑎𝑛 of integers and an integer 𝑚 ≤ 𝑛, find the maximum among {𝑎𝑖, . . . , 𝑎𝑖+𝑚−1} for every 1 ≤ 𝑖 ≤ 𝑛 − 𝑚 + 1. A naive 𝑂(𝑛𝑚) algorithm for solving this problem scans each window separately.
Your goal is to design an 𝑂(𝑛) algorithm.

## Input Format:

The first line contains an integer 𝑛, the second line contains 𝑛 integers 𝑎1, . . . , 𝑎𝑛 separated by spaces, the third line contains an integer 𝑚.

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>5</sup>, 1 ≤ 𝑚 ≤ 𝑛, 0 ≤ 𝑎𝑖 ≤ 10<sup>5</sup> for all 1 ≤ 𝑖 ≤ 𝑛.

## Output Format:

Output max{𝑎𝑖, . . . , 𝑎𝑖+𝑚−1} for every 1 ≤ 𝑖 ≤ 𝑛 − 𝑚 + 1.

## Sample:

```
Input:
8
2 7 3 1 5 2 6 2
4
Output:
7 7 5 6 6

```
