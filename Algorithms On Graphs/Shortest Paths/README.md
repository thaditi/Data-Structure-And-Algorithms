# Problem: Exchanging Money Optimally

## Problem Introduction:

We would like to compute an optimal way of exchanging the given currency 𝑐𝑖 into all other currencies.
For this, you find shortest paths from the vertex 𝑐𝑖 to all the other vertices.

## Task:

Given an directed graph with possibly negative edge weights and with 𝑛 vertices and 𝑚 edges as well
as its vertex 𝑠, compute the length of shortest paths from 𝑠 to all other vertices of the graph.

## Input Format:

A graph is given in the standard format.

## Constraints:

1 ≤ 𝑛 ≤ 10<sub>3</sub>, 0 ≤ 𝑚 ≤ 10<sub>4</sub>, 1 ≤ 𝑠 ≤ 𝑛, edge weights are integers of absolute value at most 10<sub>9</sub>.

## Output Format:

For all vertices 𝑖 from 1 to 𝑛 output the following on a separate line:

- “\*”, if there is no path from 𝑠 to 𝑢;
- “-”, if there is a path from 𝑠 to 𝑢, but there is no shortest path from 𝑠 to 𝑢 (that is, the distance from 𝑠 to 𝑢 is −∞);
- the length of a shortest path otherwise.

## Sample:

```
Input:
6 7
1 2 10
2 3 5
1 3 100
3 5 7
5 4 10
4 3 -18
6 1 -1
1
Output:
0
10
-
-
-
*

```

The first line of the output states that the distance from 1 to 1 is equal to 0. The second
one shows that the distance from 1 to 2 is 10 (the corresponding path is 1 → 2). The next
three lines indicate that the distance from 1 to vertices 3, 4, and 5 is equal to −∞: indeed,
one first reaches the vertex 3 through edges 1 → 2 → 3 and then makes the length of a
path arbitrary small by making sufficiently many walks through the cycle 3 → 5 → 4 of negative
weight. The last line of the output shows that there is no path from 1 to 6 in this graph.
