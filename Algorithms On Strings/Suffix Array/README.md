# Problem: Construct the Suffix Array of a String

## Problem Introduction:

We saw that suffix trees can be too memory intensive to apply in practice. This becomes a serious issue for the case of massive datasets like the ones arising in bioinformatics.
In 1993, Udi Manber and Gene Myers introduced suffix arrays as a memory-efficient alternative to suffix trees. To construct SuffixArray(Text), we first sort all suffixes of Text lexicographically, assuming that “$” comes first in the alphabet. The suffix array is the list of starting positions of these sorted suffixes. 
For example,
SuffixArray(“panamabananas$”) = (13, 5, 3, 1, 7, 9, 11, 6, 4, 2, 8, 10, 0, 12)

## Task:

Construct the suffix array of a string.

## Input Format:

A string Text ending with a “\$” symbol.

## Constraints:

1 ≤ |Text| ≤ 10<sup>4</sup>; except for the last symbol, Text contains symbols A, C, G, T only.

## Output Format:

SuffixArray(Text), that is, the list of starting positions (0-based) of sorted suffixes separated
by spaces.

## Sample:

```
Input:
GAGAGAGA$
Output:
8 7 5 3 1 6 4 2 0


```

Sorted suffixes:
8 $
7 A$
5 AGA$
3 AGAGA$
1 AGAGAGA$
6 GA$
4 GAGA$
2 GAGAGA$
0 GAGAGAGA\$
