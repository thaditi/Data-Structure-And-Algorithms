# Problem: Find the Shortest Non-Shared Substring of Two Strings

## Problem Introduction:

A naive way to solve this problem is to iterate through all substrings of Text1 and for substring
to check whether it appears in Text2. This gives an algorithm with the running time 𝑂(𝑛<sup>4</sup>) (where 𝑛 = max{Text1,Text2}. Surprisingly, one can solve this problem in time 𝑂(𝑛) using suffix trees! (This, however, requires linear time construction of suffix trees. Since the corresponding algorithm is quite complex, we will not ask you to implement it.)
For this, construct the suffix tree of a string Text1#Text2$ (where # and $ are new symbols).
If in the first stage of this algorithm a linear time suffix tree construction algorithm is used, then the resulting algorithm has linear time, too.

## Task:

Find the shortest substring of one string that does not appear in another string.

## Input Format:

Strings Text1 and Text2.

## Constraints:

1 ≤ |Text1|, |Text2| ≤ 2 000; strings have equal length (|Text1| = |Text2|), are not equal
(Text1 ̸= Text2), and contain symbols A, C, G, T only.

## Output Format:

The shortest (non-empty) substring of Text1 that does not appear in Text2.

## Sample:

```
Input:
ATGCGATGACCTGACTGA
CTCAACGTATTGGCCAGA
Output:
ATG

```

The string ATG is a substring of Text1 and it does not appear in Text2. At the same time, Text2
contains all 16 strings of length 2 and all 4 strings of length 1.
