# Problem: Construct the Suffix Array of a Long String

## Problem Introduction:

The goal in this problem is to construct the suffix array of a given string again, but this time for a longer string. In particular, a quadratic algorithm will not fit into the time limit in this problem. This will require you to implement an almost linear algorithm bringing you close to the state-of-the-art algorithms for constructing suffix arrays.

## Task:

Construct the suffix array of a string.

## Input Format:

A string Text ending with a “\$” symbol.

## Constraints:

1 ≤ |Text| ≤ 2 · 10<sup>5</sup>; except for the last symbol, Text contains symbols A, C, G, T only.

## Output Format:

SuffixArray(Text), that is, the list of starting positions of sorted suffixes separated by
spaces.

## Sample:

```
Input:
GAC$
Output:
3 1 2 0

```

Sorted suffixes:
3 $
1 AC$
2 C$
0 GAC$
