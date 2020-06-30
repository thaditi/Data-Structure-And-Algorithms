# Problem: Determining an Order of Courses

## Problem Introduction:

You are sure that there are no cyclic dependencies in the given CS curriculum, you would like to find an order of all courses that is consistent with all dependencies. For this, you find a topological ordering of the corresponding directed graph.

## Task:

Compute a topological ordering of a given directed acyclic graph (DAG) with 𝑛 vertices and 𝑚 edges.

## Input Format:

A graph is given in the standard format.

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>5</sup>, 0 ≤ 𝑚 ≤ 10<sup>5</sup>. The given graph is guaranteed to be acyclic.

## Output Format:

Output any topological ordering of its vertices. (Many DAGs have more than just one
topological ordering. You may output any of them.)

## Sample:

```
Input:
4 3
1 2
4 1
3 1
Output:
4 3 1 2

```
