# Problem: Matching Against a Compressed String

## Task:

Implement BetterBWMatching algorithm.

## Input Format:

A string BWT(Text), followed by an integer 𝑛 and a collection of 𝑛 strings Patterns =
{𝑝1, . . . , 𝑝𝑛} (on one line separated by spaces).

## Constraints:

1 ≤ |BWT(Text)| ≤ 10<sup>6</sup>; except for the one \$ symbol, BWT(Text) contains symbols A, C,
G, T only; 1 ≤ 𝑛 ≤ 5 000; for all 1 ≤ 𝑖 ≤ 𝑛, 𝑝𝑖 is a string over A, C, G, T; 1 ≤ |𝑝𝑖| ≤ 1 000.

## Output Format:

A list of integers, where the 𝑖-th integer corresponds to the number of substring matches
of the 𝑖-th member of Patterns in Text.

## Sample:

```
Input:
ATT$AA
2
ATA A
Output:
2 3


```

Text = ATATA\$ contains two occurrences of ATA and three occurrences of A.
