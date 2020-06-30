# Problem: Checking Consistency of CS Curriculum

## Problem Introduction:

A Computer Science curriculum specifies the prerequisites for each course as a list of courses that should be taken before taking this course. You would like to perform a consistency check of the curriculum, that is, to check that there are no cyclic dependencies. For this, you construct the following directed graph: vertices correspond to courses, there is a directed edge (𝑢, 𝑣) is the course 𝑢 should be taken before the course 𝑣. Then, it is enough to check whether the resulting graph contains a cycle.

## Task:

Check whether a given directed graph with 𝑛 vertices and 𝑚 edges contains a cycle.

## Input Format:

A graph is given in the standard format.

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>3</sup>; 1 ≤ 𝑚 ≤ 10<sup>3</sup>;

## Output Format:

Output 1 if the graph contains a cycle and 0 otherwise.

## Sample:

```
Input:
4 4
1 2
4 1
2 3
3 1
Output:
1

```
