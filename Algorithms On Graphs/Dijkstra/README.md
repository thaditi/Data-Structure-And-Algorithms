# Problem: Computing the Minimum Cost of a Flight

## Problem Introduction:

We are interested in minimizing not the number of segments, but the total cost of a flight. For this
you construct a weighted graph: the weight of an edge from one city to another one is the cost of the
corresponding flight.

## Task:

Given an directed graph with positive edge weights and with 𝑛 vertices and 𝑚 edges as well as two
vertices 𝑢 and 𝑣, compute the weight of a shortest path between 𝑢 and 𝑣 (that is, the minimum total weight of a path from 𝑢 to 𝑣).

## Input Format:

A graph is given in the standard format. The next line contains two vertices 𝑢 and 𝑣.

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>4</sup>, 0 ≤ 𝑚 ≤ 10<sup>5</sup>, 𝑢 ̸= 𝑣, 1 ≤ 𝑢, 𝑣 ≤ 𝑛, edge weights are non-negative integers not exceeding 10<sup>3</sup>.

## Output Format:

Output the minimum weight of a path from 𝑢 to 𝑣, or −1 if there is no path.

## Sample:

```
Input:
4 4
1 2 1
4 1 2
2 3 2
1 3 5
1 3
Output:
3

```

There is a unique shortest path from vertex 1 to vertex 3 in this graph (1 → 2 → 3), and it has weight 3.
