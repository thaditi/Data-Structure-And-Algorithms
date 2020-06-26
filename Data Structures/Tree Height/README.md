# Compute tree height

## Problem Introduction:

In this problem, you will need to read a description of a tree from the input, implement the tree data structure, store the tree and compute its height.

## Task:

You are given a description of a rooted tree. Your task is to compute and output its height. The height of a (rooted) tree is the maximum depth of a node, or the maximum distance from a
leaf to the root. You are given an arbitrary tree, not necessarily a binary tree.

## Input Format:

The first line contains the number of nodes 𝑛. The second line contains 𝑛 integer numbers
from −1 to 𝑛 − 1 — parents of nodes. If the 𝑖-th one of them (0 ≤ 𝑖 ≤ 𝑛 − 1) is −1, node 𝑖 is the root, otherwise it’s 0-based index of the parent of 𝑖-th node. It is guaranteed that there is exactly one root.
It is guaranteed that the input represents a tree.

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>5</sup>.

## Output Format:

Output the height of the tree.

## Sample:

```
Input:
5
-1 0 4 0 3
Output:
4

```
