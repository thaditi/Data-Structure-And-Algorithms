# Problem: Building Roads to Connect Cities

## Problem Introduction:

The goal is to build roads between some pairs of the given cities such that there is a path between any two cities and the total length of the roads is minimized.

## Task:

Given 𝑛 points on a plane, connect them with segments of minimum total length such that there is a
path between any two points. Recall that the length of a segment with endpoints (𝑥1, 𝑦1) and (𝑥2, 𝑦2) is equal to √︀ (𝑥1 − 𝑥2)<sup>2</sup> + (𝑦1 − 𝑦2)<sup>2</sup>.

## Input Format:

The first line contains the number 𝑛 of points. Each of the following 𝑛 lines defines a point
(𝑥𝑖, 𝑦𝑖).

## Constraints:

1 ≤ 𝑛 ≤ 200; −10 ≤ 𝑥𝑖, 𝑦𝑖 ≤ 10<sup>3</sup> are integers. All points are pairwise different, no three points lie on the same line.

## Output Format:

Output the minimum total length of segments. The absolute value of the difference
between the answer of your program and the optimal value should be at most 10−6. Output your answer with at least seven digits after the decimal point

## Sample:

```
Input:
4
0 0
0 1
1 0
1 1
Output:
3.000000000

```

An optimal way to connect these four points is shown below. Note that there exists other ways of
connecting these points by segments of total weight 3.
