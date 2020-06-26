# Extending stack interface

## Problem Introduction:

Stack is an abstract data type supporting the operations Push() and Pop(). It is not difficult to implement it in a way that both these operations work in constant time. In this problem, you goal will be to implement a stack that also supports finding the maximum value and to ensure that all operations still work in constant time.

## Task:

Implement a stack supporting the operations Push(), Pop(), and Max().

## Input Format:

The first line of the input contains the number 𝑞 of queries. Each of the following 𝑞 lines
specifies a query of one of the following formats: push v, pop, or max.

## Constraints:

1 ≤ 𝑞 ≤ 400 000, 0 ≤ 𝑣 ≤ 10<sup>5</sup>.

## Output Format:

For each max query, output (on a separate line) the maximum value of the stack.

## Sample:

```
Input:
5
push 1
push 2
max
pop
max
Output:
2
1

```
