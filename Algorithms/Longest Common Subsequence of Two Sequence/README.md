# Longest Common Subsequence of Two Sequences

## Problem Introduction:

Compute the length of a longest common subsequence of two sequences.

## Task:

Given two sequences 𝐴 = (𝑎1, 𝑎2, . . . , 𝑎𝑛) and 𝐵 = (𝑏1, 𝑏2, . . . , 𝑏𝑚), find the length of their longest common subsequence, i.e., the largest non-negative integer 𝑝 such that there exist indices 1 ≤ 𝑖1 < 𝑖2 < · · · < 𝑖𝑝 ≤ 𝑛 and 1 ≤ 𝑗1 < 𝑗2 < · · · < 𝑗𝑝 ≤ 𝑚, such that 𝑎𝑖1 = 𝑏𝑗1 , . . . , 𝑎𝑖𝑝 = 𝑏𝑗𝑝 .

## Input Format:

First line: 𝑛. Second line: 𝑎1, 𝑎2, . . . , 𝑎𝑛. Third line: 𝑚. Fourth line: 𝑏1, 𝑏2, . . . , 𝑏𝑚.

## Constraints:

1 ≤ 𝑛,𝑚 ≤ 100; −10<sup>9</sup> < 𝑎𝑖, 𝑏𝑖 < 10<sup>9</sup>.

## Output Format:

Output 𝑝.

## Sample:

```
Input:
4
2 7 8 3
4
5 2 8 7
Output:
2

```

One common subsequence is (2, 7). Another one is (2, 8).
