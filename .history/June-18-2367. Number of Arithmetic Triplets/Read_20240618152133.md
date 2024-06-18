Problem Description

we  are given an array of integers nums and an integer diff and  our task is to find the number of unique arithmetic triplets in the array. An arithmetic triplet is a triplet of indices (i, j, k) such that nums[j] - nums[i] = diff and nums[k] - nums[j] = diff (i.e., the elements are in arithmetic progression with the given difference diff).

Approach- I have learnt this approach in my codepath training academy
UMPIRE Strategy , basically involves in 

Step 1 : Understanding  the Problem

We need to count the number of triplets in the array where each triplet forms an arithmetic sequence with a common difference diff.
The triplet indices (i, j, k) must satisfy the conditions:
nums[j] - nums[i] = diff
nums[k] - nums[j] = diff

Step2 : Match

This problem can be approached using hashing for efficient lookups, which is similar to problems involving checking pairs or sequences in arrays.
Plan

Create a HashSet to store all elements of the array.
Iterate through the array and for each element, check if there are two preceding elements that form an arithmetic sequence with the given diff.
If such elements are found, increment the count of arithmetic triplets.

Step 3 : Review

Ensure that the logic correctly identifies triplets and does not count duplicates.
Verify that the use of a HashSet allows for O(1) average-time complexity for lookups.

Step4 : Execute

Implement the function based on the plan.
Test the function with various test cases to ensure correctness and performance

Time complexity : 0(n) , since we are are not looping through the array twice at the same time. 
Space Complexity : 0(n) , as we are creating the external hastbale , but this helps in faster retrivals.

