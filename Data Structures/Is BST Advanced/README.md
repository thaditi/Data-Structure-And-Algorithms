# Is it a binary search tree? Hard version.

## Problem Introduction:

In this problem you are going to solve the same problem as the previous one, but for a more general case, when binary search tree may contain equal keys.

## Task:

You are given a binary tree with integers as its keys. You need to test whether it is a correct binary
search tree. There can be duplicate integers in the tree, and this is allowed. The definition of the binary search tree in such case is the following: for any node of the tree, if its key is 𝑥, then for any node in its left subtree its key must be strictly less than 𝑥, and for any node in its right subtree its key must be greater than or equal to 𝑥. In other words, smaller elements are to the left, bigger elements
are to the right, and duplicates are always to the right. You need to check whether the given binary
tree structure satisfies this condition.You are guaranteed that the input contains a valid binary tree.
That is, it is a tree, and each node has at most two children.

## Input Format:

The first line contains the number of vertices 𝑛. The vertices of the tree are numbered
from 0 to 𝑛 − 1. Vertex 0 is the root.
The next 𝑛 lines contain information about vertices 0, 1, ..., 𝑛−1 in order. Each of these lines contains three integers 𝑘𝑒𝑦𝑖, 𝑙𝑒𝑓𝑡𝑖 and 𝑟𝑖𝑔ℎ𝑡𝑖 — 𝑘𝑒𝑦𝑖 is the key of the 𝑖-th vertex, 𝑙𝑒𝑓𝑡𝑖 is the index of the left child of the 𝑖-th vertex, and 𝑟𝑖𝑔ℎ𝑡𝑖 is the index of the right child of the 𝑖-th vertex. If 𝑖 doesn’t have left or right child (or both), the corresponding 𝑙𝑒𝑓𝑡𝑖 or 𝑟𝑖𝑔ℎ𝑡𝑖 (or both) will be equal to −1.

## Constraints:

0 ≤ 𝑛 ≤ 10<sup>5</sup>; −2<sup>31</sup> ≤ 𝑘𝑒𝑦𝑖 ≤ 2<sup>31</sup> − 1; −1 ≤ 𝑙𝑒𝑓𝑡𝑖, 𝑟𝑖𝑔ℎ𝑡𝑖 ≤ 𝑛 − 1. It is guaranteed that the input represents a valid binary tree. In particular, if 𝑙𝑒𝑓𝑡𝑖 ̸= −1 and 𝑟𝑖𝑔ℎ𝑡𝑖 ̸= −1, then 𝑙𝑒𝑓𝑡𝑖 ̸= 𝑟𝑖𝑔ℎ𝑡𝑖.
Also, a vertex cannot be a child of two different vertices. Also, each vertex is a descendant of the root vertex. Note that the minimum and the maximum possible values of the 32-bit integer type are allowed to be keys in the tree — beware of integer overflow!

## Output Format:

Print the result of each of the find and check queries, one result per line, in the same
order as these queries are given in the input.

## Sample:

```
Input:
3
2 1 2
1 -1 -1
3 -1 -1
Output:
CORRECT
2
1 3

```

Left child of the root has key 1, right child of the root has key 3, root has key 2, so everything to the left is smaller, everything to the right is bigger.
