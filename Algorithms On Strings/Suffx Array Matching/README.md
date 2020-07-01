# Problem: Pattern Matching with the Suffix Array

## Problem Introduction:

Use the suffix array to solve the Multiple Pattern Matching Problem. This is what actually happens when one needs to solve the pattern matching problem for a massive string like the human genome: instead of downloading the genome itself, one downloads its suffix array and solves the pattern matching problem using the array.

## Task:

Find all occurrences of a given collection of patterns in a string.

## Input Format:

The first line contains a string Text. The second line specifies an integer 𝑛. The last line
gives a collection of 𝑛 strings Patterns = {𝑝1, . . . , 𝑝𝑛} separated by spaces.

## Constraints:

All strings contain symbols A, C, G, T only; 1 ≤ |Text| ≤ 10<sup>5</sup>; 1 ≤ 𝑛 ≤ 10<sup>4</sup>;
Σ︀<sup>𝑛</sup><sub>𝑖</sub>=1 |𝑝𝑖| ≤ 10<sup>5</sup>.

## Output Format:

All starting positions (in any order) in Text where a pattern appears as a substring (using
0-based indexing as usual). If several patterns occur at the same position of the Text, still output this position only once.

## Sample:

```
Input:
ATATATA
3
ATA C TATAT
Output:
4 2 0 1

```

The pattern ATA appears at positions 0, 2, and 4, the pattern TATAT appears at position 1.
