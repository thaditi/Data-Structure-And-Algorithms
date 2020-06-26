# Find pattern in text

## Problem Introduction:

In this problem, your goal is to implement the Rabin–Karp’s algorithm.

## Task:

In this problem your goal is to implement the Rabin–Karp’s algorithm for searching the given pattern
in the given text.

## Input Format:

There are two strings in the input: the pattern 𝑃 and the text 𝑇.

## Constraints:

1 ≤ |𝑃| ≤ |𝑇| ≤ 5 · 10<sup>5</sup>. The total length of all occurrences of 𝑃 in 𝑇 doesn’t exceed 10<sup>8</sup>. The pattern and the text contain only latin letters.

## Output Format:

Print all the positions of the occurrences of 𝑃 in 𝑇 in the ascending order. Use 0-based
indexing of positions in the the text 𝑇.

## Sample:

```
Input:
aba
abacaba
Output:
0 4

```

The pattern 𝑎𝑏𝑎 can be found in positions 0 (**aba**caba) and 4 (abac**aba**) of the text 𝑎𝑏𝑎𝑐𝑎𝑏𝑎.
