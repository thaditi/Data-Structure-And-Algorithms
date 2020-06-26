# Longest Common Subsequence of Three Sequences

## Problem Introduction:

Compute the length of a longest common subsequence of three sequences.

## Task:

Given three sequences 𝐴 = (𝑎1, 𝑎2, . . . , 𝑎𝑛), 𝐵 = (𝑏1, 𝑏2, . . . , 𝑏𝑚), and 𝐶 = (𝑐1, 𝑐2, . . . , 𝑐𝑙), find the length of their longest common subsequence, i.e., the largest non-negative integer 𝑝 such that there exist indices 1 ≤ 𝑖1 < 𝑖2 < · · · < 𝑖𝑝 ≤ 𝑛, 1 ≤ 𝑗1 < 𝑗2 < · · · < 𝑗𝑝 ≤ 𝑚, 1 ≤ 𝑘1 < 𝑘2 < · · · < 𝑘𝑝 ≤ 𝑙 such that 𝑎𝑖1 = 𝑏𝑗1 = 𝑐𝑘1 , . . . , 𝑎𝑖𝑝 = 𝑏𝑗𝑝 = 𝑐𝑘𝑝

## Input Format:

First line: 𝑛. Second line: 𝑎1, 𝑎2, . . . , 𝑎𝑛. Third line: 𝑚. Fourth line: 𝑏1, 𝑏2, . . . , 𝑏𝑚. Fifth line: 𝑙. Sixth line: 𝑐1, 𝑐2, . . . , 𝑐𝑙.

## Constraints:

1 ≤ 𝑛,𝑚 ≤ 100; −10<sup>9</sup> < 𝑎𝑖, 𝑏𝑖, 𝑐𝑖 < 10<sup>9</sup>.

## Output Format:

Output 𝑝.

## Sample:

```
Input:
5
8 3 2 1 7
7
8 2 1 3 8 10 7
6
6 8 3 1 4 7
Output:
3


```

One common subsequence of length 3 in this case is (8, 3, 7). Another one is (8, 1, 7).
