# Problem: Generalized Multiple Pattern Matching

## Problem Introduction:

The multiple pattern matching problem has many applications like highlighting programming
language keywords (like if, else, elif) in your favorite IDE (see the screenshot below) and locating reads in a reference genome.

## Task:

Find all occurrences of a collection of patterns in a text.

## Input Format:

The first line of the input contains a string Text, the second line contains an integer 𝑛,
each of the following 𝑛 lines contains a pattern from Patterns = {𝑝1, . . . , 𝑝𝑛}.

## Constraints:

1 ≤ |Text| ≤ 10 000; 1 ≤ 𝑛 ≤ 5 000; 1 ≤ |𝑝𝑖| ≤ 100 for all 1 ≤ 𝑖 ≤ 𝑛; all strings contain only
symbols A, C, G, T; it can be the case that 𝑝𝑖 is a prefix of 𝑝𝑗 for some 𝑖, 𝑗.

## Output Format:

All starting positions in Text where a string from Patterns appears as a substring in
increasing order (assuming that Text is a 0-based array of symbols). If more than one pattern
appears starting at position 𝑖, output 𝑖 once.

## Sample:

```
Input:
ACATA
3
AT
A
AG
Output:
0 2 4

```
