# Problem: Detecting Anomalies in Currency Exchange Rates

## Problem Introduction:

You are given a list of currencies 𝑐1, 𝑐2, . . . , 𝑐𝑛 together with a list of exchange
rates: 𝑟<sub>𝑖𝑗</sub> is the number of units of currency 𝑐𝑗 that one gets for one unit
of 𝑐𝑖. You would like to check whether it is possible to start with one unit
of some currency, perform a sequence of exchanges, and get more than one
unit of the same currency.
In other words, you would like to find currencies
𝑐<sub>𝑖1</sub> , 𝑐<sub>𝑖2</sub> , . . . , 𝑐<sub>𝑖𝑘</sub> such that 𝑟<sub>𝑖1,𝑖2</sub> · 𝑟<sub>𝑖2,𝑖3</sub> · 𝑟<sub>𝑖𝑘−1,𝑖𝑘</sub> , 𝑟<sub>𝑖𝑘,𝑖1</sub> > 1.
For this, you construct the following graph: vertices are currencies 𝑐1, 𝑐2, . . . , 𝑐𝑛, the weight of an edge from 𝑐𝑖 to 𝑐𝑗 is equal to −log 𝑟<sub>𝑖𝑗</sub> . There it suffices to check whether is a negative cycle in this graph. Indeed, assume that a cycle 𝑐𝑖 → 𝑐𝑗 → 𝑐𝑘 → 𝑐𝑖
has negative weight. This means that −(log 𝑐<sub>𝑖𝑗</sub> + log 𝑐<sub>𝑗𝑘</sub> + log 𝑐<sub>𝑘𝑖</sub>) < 0 and hence log 𝑐<sub>𝑖𝑗</sub> + log 𝑐<sub>𝑗𝑘</sub> + log 𝑐<sub>𝑘𝑖</sub> > 0.
This, in turn, means that<sub></sub>𝑟<sub>𝑖𝑗</sub>𝑟<sub>𝑗𝑘</sub>𝑟<sub>𝑘𝑖</sub> = 2<sup>log 𝑐<sub>𝑖𝑗</sub></sup> 2<sup>log 𝑐<sub>𝑗𝑘</sub></sup>2<sup>log 𝑐<sub>𝑘𝑖</sub></sup> = 2<sup>log 𝑐<sub>𝑖𝑗</sub>+log 𝑐<sub>𝑗𝑘</sub>+log 𝑐<sub>𝑘𝑖</sub> </sup> > 1 .

## Task:

Given an directed graph with possibly negative edge weights and with 𝑛 vertices and 𝑚 edges, check
whether it contains a cycle of negative weight.

## Input Format:

A graph is given in the standard format.

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>3</sup>, 0 ≤ 𝑚 ≤ 1010<sup>4</sup>, edge weights are integers of absolute value at most 10<sup>3</sup>.

## Output Format:

Output 1 if the graph contains a cycle of negative weight and 0 otherwise.

## Sample:

```
Input:
4 4
1 2 -5
4 1 2
2 3 2
3 1 1
Output:
1

```

The weight of the cycle 1 → 2 → 3 is equal to −2, that is, negative.
