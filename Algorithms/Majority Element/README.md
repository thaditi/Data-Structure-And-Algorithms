# Majority Element

## Problem Introduction:

Majority rule is a decision rule that selects the alternative which has a majority,
that is, more than half the votes.
Given a sequence of elements 𝑎1, 𝑎2, . . . , 𝑎𝑛, you would like to check whether
it contains an element that appears more than 𝑛/2 times. Your goal is to use the divide-and-conquer technique to design an 𝑂(𝑛 log 𝑛) algorithm.

## Task:

The goal in this code problem is to check whether an input sequence contains a majority element.

## Input Format:

The first line contains an integer 𝑛, the next one contains a sequence of 𝑛 non-negative

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>5</sup>; 0 ≤ 𝑎𝑖 ≤ 𝑎𝑖 ≤ 10<sup>9</sup> for all 0 ≤ 𝑖 < 𝑛.

## Output Format:

Output 1 if the sequence contains an element that appears strictly more than 𝑛/2 times, and 0 otherwise.

## Sample:

```
Input:
4
1 2 3 4

Output:
0

```
