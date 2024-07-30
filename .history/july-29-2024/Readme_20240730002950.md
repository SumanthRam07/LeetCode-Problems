# Climbing Stairs Solution

## Introduction

This project provides a solution to the "Climbing Stairs" problem using dynamic programming. The problem is a classic example of how to solve problems involving combinations and recursive sequences efficiently.

## Problem Statement

You are climbing a staircase. It takes `n` steps to reach the top. Each time you can either climb 1 step or 2 steps. Given `n`, the number of steps in the staircase, determine how many distinct ways you can climb to the top.

## Solution

The solution employs dynamic programming to compute the number of distinct ways to reach the top of the staircase. Here is the Java implementation of the solution:

```java
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];        
    }
}