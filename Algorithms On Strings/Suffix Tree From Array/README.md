# Problem: Construct the Suffix Tree from the Suffix Array

## Problem Introduction:

Many known algorithms for constructing suffix trees in linear time are quite complex.
It turns out, however, that one can first construct a suffix array in near-linear time (say, 𝑂(𝑛 log 𝑛)) and then transform it into a suffix tree in linear time. This gives a near-linear time algorithm for constructing a suffix tree!
SuffixTree(Text) can be constructed in linear time from SuffixArray(Text) by using the longest common
prefix (LCP) array of Text, LCP(Text), which stores the length of the longest common prefix shared by
consecutive lexicographically ordered suffixes of Text.
For example,
LCP(“panamabananas\$”) = (0, 1, 1, 3, 3, 1, 0, 0, 0, 2, 2, 0, 0).

## Task:

Construct a suffix tree from the suffix array and LCP array of a string.

## Input Format:

The first line contains a string Text ending with a “\$” symbol, the second line contains
SuffixArray(Text) as a list of |Text| integers separated by spaces, the last line contains LCP(Text) as a list of |Text| − 1 integers separated by spaces.

## Constraints:

1 ≤ |Text(Text)| ≤ 2 · 10<sup>5</sup>; except for the last symbol, Text contains symbols A, C, G, T only.

## Output Format:

Output the 𝑇𝑒𝑥𝑡 from the input on the first line. Then output all the edges of the suffix tree in a specific order (see below), each on its own line. Output each edge as a pair of integers (start, end), where start is the position in Text corresponding to the start of the edge label substring in the Text and end is the position right after the end of the edge label in the Text.

## Sample:

```
Input:
AAA$
3 2 1 0
0 1 2
Output:
AAA$
3 4
0 1
3 4
1 2
3 4
2 4


```

𝑖 | 𝑆𝐴[𝑖] | 𝐿𝐶𝑃[𝑖] | suffix

---

0 | 3 | 0 |$
1 | 2 | 1 | A$
2 | 1 | 2 | AA$
3 | 0 |   | AAA$
