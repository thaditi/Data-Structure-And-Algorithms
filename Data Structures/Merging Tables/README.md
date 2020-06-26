# Merging tables

## Problem Introduction:

In this problem, your goal is to simulate a sequence of merge operations with tables in a database.

## Task:

There are 𝑛 tables stored in some database. The tables are numbered from 1 to 𝑛. All tables share
the same set of columns. Each table contains either several rows with real data or a symbolic link to
another table. Initially, all tables contain data, and 𝑖-th table has 𝑟𝑖 rows. You need to perform 𝑚 of the following operations:

1. Consider table number 𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖. Traverse the path of symbolic links to get to the data. That is,
   while 𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖 contains a symbolic link instead of real data do
   𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖 ← symlink(𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖)
2. Consider the table number 𝑠𝑜𝑢𝑟𝑐𝑒𝑖 and traverse the path of symbolic links from it in the same manner as for 𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖.
3. Now, 𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖 and 𝑠𝑜𝑢𝑟𝑐𝑒𝑖 are the numbers of two tables with real data. If 𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖 ̸= 𝑠𝑜𝑢𝑟𝑐𝑒𝑖, copy all the rows from table 𝑠𝑜𝑢𝑟𝑐𝑒𝑖 to table d𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖, then clear the table 𝑠𝑜𝑢𝑟𝑐𝑒𝑖 and instead of real data put a symbolic link to 𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖 into it.
4. Print the maximum size among all 𝑛 tables (recall that size is the number of rows in the table).
   If the table contains only a symbolic link, its size is considered to be 0.

## Input Format:

The first line of the input contains two integers 𝑛 and 𝑚 — the number of tables in the
database and the number of merge queries to perform, respectively.
The second line of the input contains 𝑛 integers 𝑟𝑖 — the number of rows in the 𝑖-th table.
Then follow 𝑚 lines describing merge queries. Each of them contains two integers 𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖 and 𝑠𝑜𝑢𝑟𝑐𝑒𝑖 — the numbers of the tables to merge.

## Constraints:

1 ≤ 𝑛,𝑚 ≤ 100 000; 0 ≤ 𝑟𝑖 ≤ 10 000; 1 ≤ 𝑑𝑒𝑠𝑡𝑖𝑛𝑎𝑡𝑖𝑜𝑛𝑖, 𝑠𝑜𝑢𝑟𝑐𝑒𝑖 ≤ 𝑛.

## Output Format:

For each query print a line containing a single integer — the maximum of the sizes of all
tables (in terms of the number of rows) after the corresponding operation.

## Sample:

```
Input:
6 4
10 0 5 0 3 3
6 6
6 5
5 4
4 3
Output:
10
10
10
11


```

In this tables have different sizes. Let us consider the operations:

- Merging the table number 6 with itself doesn’t change anything, and the maximum size is 10
  (table number 1).
  7
- After merging the table number 5 into the table number 6, the table number 5 is cleared and has
  size 0, while the table number 6 has size 6. Still, the maximum size is 10.
- By merging the table number 4 into the table number 5, we actually merge the table number 4
  into the table number 6 (table 5 now contains just a symbolic link to table 6), so the table number
  4 is cleared and has size 0, while the table number 6 has size 6. Still, the maximum size is 10.
- By merging the table number 3 into the table number 4, we actually merge the table number 3
  into the table number 6 (table 4 now contains just a symbolic link to table 6), so the table number
  3 is cleared and has size 0, while the table number 6 has size 11, which is the new maximum size.
