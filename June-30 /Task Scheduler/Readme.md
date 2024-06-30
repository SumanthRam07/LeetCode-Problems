 Least Interval Problem

## Overview
This repository contains a solution to the "Least Interval" problem on LeetCode. The problem requires determining the minimum time required to execute all given tasks with a specified cooling period between identical tasks.

## Problem Statement
we  are given an array of tasks where each task is represented by a character. Tasks are of different types, and each task takes one unit of time to execute. You are also given an integer `n` representing the cooling period between two identical tasks. Your goal is to find the minimum time required to execute all tasks without violating the cooling period constraint.

## Solution

The solution uses a priority queue (max-heap) to manage task frequencies and simulate the scheduling process.

### Approach
1. **Count Frequencies:**
   - Count the frequency of each task and store it in an array `charCount`.
2. **Initialize Max-Heap:**
   - Use a priority queue to store the task frequencies in descending order.
3. **Process Tasks in Cycles:**
   - Process tasks in cycles of length `n + 1`.
   - Execute tasks from the priority queue until the cycle length or the priority queue is exhausted.
   - Decrease the frequency of executed tasks and add them back to the priority queue if they have remaining instances.
   - Add idle time if necessary to maintain the cooling period constraint.

**
**My Thought Process:****
   This is very tricky problem and i did not get this all by my self , i have used several references and the idea is to not weather we can solve the problem or not , rather it is about how much did you understand it and how can you implement this methodology in upcoming problems, so i belive if you dont know the solution , look out for help. 

   I have taken a array and priority ,this is selft explanatory , and to ensure the outer bounderies are not chekced or count as a cycle , i used the priority queue and taskcount to count the last ocuurence and with this all tasks are scheduled and hence the outerboundry is not needed to calculate , so i used taskCounts to keep a track of this . and when the pq is empty ( all tasks are scheduled and hence no cooling time required) , i add the these steps to my time , hence giving me the total counts. 

**   Example 1:**

`Input: tasks = ["A","A","A","B","B","B"], n = 2

Output: 8

Explanation: A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.

Ideas to think ? how can we make sure ,we have min number of idle perioids  ?  so basically filling out the larger frequencies first would help us to easily accomidate others ? you can try out your self, chnaging the inputs and frequencies and debug the code .


A -> B -> idle -> A -> B -> idle -> A -> B.
==============    ==============   =======
Cycle1            cycle 2          last set are scheduled, hence we dont need ideal time after this( explained above) .



After completing task A, you must wait two cycles before doing A again. The same applies to task B. In the 3rd interval, neither A nor B can be done, so you idle. By the 4th cycle, you can do A again as 2 intervals have passed.`


**Complexity**
Time Complexity: O(N * log K), where N is the number of tasks and K is the number of unique tasks.
Space Complexity: O(K), where K is the number of unique tasks.


**Contributing**
If you have any suggestions or improvements, feel free to open an issue or submit a pull request. Contributions are welcome!

**Contact**
For any questions or feedback, please contact @SumanthRam07
