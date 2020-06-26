# Hashing with chains

## Problem Introduction:

In this problem you will implement a hash table using the chaining scheme. Chaining is one of the most
popular ways of implementing hash tables in practice. The hash table you will implement can be used to
implement a phone book on your phone or to store the password table of your computer or web service.

## Task:

In this task your goal is to implement a hash table with lists chaining. You are already given the
number of buckets 𝑚 and the hash function. It is a polynomial hash function
ℎ(𝑆) =
       ⎛<sup>|𝑆|−1</sup>Σ︁<sub>𝑖=0</sub> 𝑆[𝑖]𝑥<sub>𝑖</sub> mod 𝑝 ⎞ mod 𝑚 ,
       ⎝                                                       ⎠

where 𝑆[𝑖] is the ASCII code of the 𝑖-th symbol of 𝑆, 𝑝 = 1 000 000 007 and 𝑥 = 263. Your program should support the following kinds of queries:

- add string — insert string into the table. If there is already such string in the hash table, then
  just ignore the query.
- del string — remove string from the table. If there is no such string in the hash table, then
  just ignore the query.
- find string — output “yes" or “no" (without quotes) depending on whether the table contains
  string or not.
- check 𝑖 — output the content of the 𝑖-th list in the table. Use spaces to separate the elements of
  the list. If 𝑖-th list is empty, output a blank line.
  When inserting a new string into a hash chain, you must insert it in the beginning of the chain.

## Input Format:

There is a single integer 𝑚 in the first line — the number of buckets you should have. The
next line contains the number of queries 𝑁. It’s followed by 𝑁 lines, each of them contains one query.

## Constraints:

1 ≤ 𝑁 ≤ 10<sup>5</sup>. 𝑁
5 ≤ 𝑚 ≤ 𝑁. All the strings consist of latin letters. Each of them is non-empty
and has length at most 15.

## Output Format:

Print the result of each of the find and check queries, one result per line, in the same
order as these queries are given in the input.

## Sample:

```
Input:
4
8
add test
add test
find test
del test
find test
find Test
add Test
find Test
Output:
yes
no
no
yes

```
