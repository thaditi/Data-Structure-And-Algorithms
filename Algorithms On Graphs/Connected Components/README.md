# Problem: Adding Exits to a Maze

## Problem Introduction:

For this maze make sure that there are no dead zones, that is, that at least one exit is
reachable from each cell. For this, you find connected components of the corresponding undirected graph and ensure that each component contains an exit cell.

## Task:

Given an undirected graph with 𝑛 vertices and 𝑚 edges, compute the number of connected components
in it.

## Input Format:

A graph is given in the standard format.

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>3</sup>; 1 ≤ 𝑚 ≤ 10<sup>3</sup>;

## Output Format:

Output the number of connected components.

## Sample:

```
Input:
4 2
1 2
3 2
Output:
2

```
