# Problem: Find All Occurrences of a Pattern in a String

## Problem Introduction:

In this problem, we ask a simple question: how many times one string occurs as a substring of another?
Recall that different occurrences of a substring can overlap with each other. For example, ATA occurs three times in CGATATATCCATAG.
This is a classical pattern matching problem in Computer Science solved millions times per day all over the world when computer users use the common “Find” feature in text/code editors and Internet browsers.

## Task:

Find all occurrences of a pattern in a string.

## Input Format:

Strings Pattern and Genome.

## Constraints:

1 ≤ |Pattern| ≤ 10<sup>6</sup>; 1 ≤ |Genome| ≤ 10<sup>6</sup>; both strings are over A, C, G, T.

## Output Format:

All starting positions in Genome where Pattern appears as a substring (using 0-based
indexing).

## Sample:

```
Input:
ATA
ATATA
Output:
0 2

```

The pattern appears at positions 1 and 3 (and these two occurrences overlap each other).
