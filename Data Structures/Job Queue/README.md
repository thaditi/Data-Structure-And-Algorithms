# Parallel processing

## Problem Introduction:

In this problem you will simulate a program that processes a list of jobs in parallel. Operating systems such as Linux, MacOS or Windows all have special programs in them called schedulers which do exactly this with the programs on your computer.

## Task:

You have a program which is parallelized and uses 𝑛 independent threads to process the given list of 𝑚 jobs. Threads take jobs in the order they are given in the input. If there is a free thread, it immediately takes the next job from the list.
If a thread has started processing a job, it doesn’t interrupt or stop until it finishes processing the job. If several threads try to take jobs from the list simultaneously, the thread with smaller index takes the job.
For each job you know exactly how long will it take any thread to process this job, and this time is the same for all the threads. You need to determine for each job which thread will process it and when will it start processing.

## Input Format:

The first line of the input contains integers 𝑛 and 𝑚.
The second line contains 𝑚 integers 𝑡𝑖 — the times in seconds it takes any thread to process 𝑖-th job.
The times are given in the same order as they are in the list from which threads take jobs.
Threads are indexed starting from 0.

## Constraints:

1 ≤ 𝑛 ≤ 10<sup>5</sup>; 1 ≤ 𝑚 ≤ 10<sup>5</sup>; 0 ≤ 𝑡𝑖 ≤ 10<sup>9</sup>.

## Output Format:

Output exactly 𝑚 lines. 𝑖-th line (0-based index is used) should contain two spaceseparated
integers — the 0-based index of the thread which will process the 𝑖-th job and the time
in seconds when it will start processing that job.

## Sample:

```
Input:
2 5
1 2 3 4 5
Output:
0 0
1 0
0 1
1 2
0 4

```

1. The two threads try to simultaneously take jobs from the list, so thread with index 0 actually
   takes the first job and starts working on it at the moment 0.
2. The thread with index 1 takes the second job and starts working on it also at the moment 0.
3. After 1 second, thread 0 is done with the first job and takes the third job from the list, and starts
   processing it immediately at time 1.
4. One second later, thread 1 is done with the second job and takes the fourth job from the list, and
   starts processing it immediately at time 2.
5. Finally, after 2 more seconds, thread 0 is done with the third job and takes the fifth job from the
   list, and starts processing it immediately at time 4.
