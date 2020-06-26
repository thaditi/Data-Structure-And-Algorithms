# Set with range sums

## Problem Introduction:

In this problem, your goal is to implement a data structure to store a set of integers and quickly compute range sums.

## Task:

Implement a data structure that stores a set 𝑆 of integers with the following allowed operations:

- add(𝑖) — add integer 𝑖 into the set 𝑆 (if it was there already, the set doesn’t change).
- del(𝑖) — remove integer 𝑖 from the set 𝑆 (if there was no such element, nothing happens).
- find(𝑖) — check whether 𝑖 is in the set 𝑆 or not.
- sum(𝑙, 𝑟) — output the sum of all elements 𝑣 in 𝑆 such that 𝑙 ≤ 𝑣 ≤ 𝑟.

## Input Format:

Initially the set 𝑆 is empty. The first line contains 𝑛 — the number of operations. The next
𝑛 lines contain operations. Each operation is one of the following:

- “+ i" — which means add some integer (not 𝑖, see below) to 𝑆,
- “- i" — which means del some integer (not 𝑖, see below)from 𝑆,
- “? i" — which means find some integer (not 𝑖, see below)in 𝑆,
- “s l r" — which means compute the sum of all elements of 𝑆 within some range of values (not
  from 𝑙 to 𝑟, see below).
  However, to make sure that your solution can work in an online fashion, each request will actually
  depend on the result of the last sum request. Denote 𝑀 = 1 000 000 001. At any moment, let 𝑥 be
  the result of the last sum operation, or just 0 if there were no sum operations before. Then
- “+ i" means add((𝑖 + 𝑥) mod 𝑀),
- “- i" means del((𝑖 + 𝑥) mod 𝑀),
- “? i" means find((𝑖 + 𝑥) mod 𝑀),
- “s l r" means sum((𝑙 + 𝑥) mod 𝑀, (𝑟 + 𝑥) mod 𝑀).

## Constraints:

1 ≤ 𝑛 ≤ 100 000; 0 ≤ 𝑖 ≤ 10<sup>9</sup>.

## Output Format:

For each find request, just output “Found" or “Not found" (without quotes; note that the
first letter is capital) depending on whether (𝑖+𝑥) mod 𝑀 is in 𝑆 or not. For each sum query, output the sum of all the values 𝑣 in 𝑆 such that ((𝑙+𝑥) mod 𝑀) ≤ 𝑣 ≤ ((𝑟+𝑥) mod 𝑀) (it is guaranteed that in all the tests ((𝑙 + 𝑥) mod 𝑀) ≤ ((𝑟 + 𝑥) mod 𝑀)), where 𝑥 is the result of the last sum operation or 0 if there was no previous sum operation.

## Sample:

```
Input:
15
? 1
+ 1
? 1
+ 2
s 1 2
+ 1000000000
? 1000000000
- 1000000000
? 1000000000
s 999999999 1000000000
- 2
? 2
- 0
+ 9
s 0 9
Output:
Not found
Found
3
Found
Not found
1
Not found
10

```

For the first 5 queries, 𝑥 = 0. For the next 5 queries, 𝑥 = 3. For the next 5 queries, 𝑥 = 1. The actual
list of operations is:
find(1)
add(1)
find(1)
add(2)
sum(1, 2) → 3
add(2)
find(2) → Found
del(2)
find(2) → Not found
sum(1, 2) → 1
del(3)
find(3) → Not found
del(1)
add(10)
sum(1, 10) → 10
Adding the same element twice doesn’t change the set. Attempts to remove an element which is not
in the set are ignored.
