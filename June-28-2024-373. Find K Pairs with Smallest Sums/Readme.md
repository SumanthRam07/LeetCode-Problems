Hi guys , 

Today i am coming with another problem from my leet code practice , 

**Question :** 

# You are given two integer arrays nums1 and nums2 sorted in non-decreasing order and an integer k.
Define a pair (u, v) which consists of one element from the first array and one element from the second array.
Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.


```
Example 1:

Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]]
Explanation: The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
Example 2:

Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
Output: [[1,1],[1,1]]
Explanation: The first 2 pairs are returned from the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
```



#### Approach
**Thought Process**

When I saw the problem involving finding the smallest sums, I immediately thought of using a priority queue (min-heap). The continuous practice of solving similar problems helped me come to this conclusion.

Solution Explanation

Initialization:

Step 1 : I Used a priority queue to keep track of the smallest sums.
Step 2 : I Used a set to keep track of visited pairs to avoid processing the same pair multiple times.
Step3  : Start by adding the pair formed by the first elements of both arrays to the priority queue.
          Processing the Queue:

Step4 : While there are elements in the queue and we haven't found k pairs yet:**
Step5 : Remove the smallest pair from the queue.
Step6 : Add the corresponding elements to the result list.
Step7 : Add the next pair from nums1 and the same element from nums2 to the queue if it hasn't been visited.
Step 8 : Add the next pair from nums2 and the same element from nums1 to the queue if it hasn't been visited.


**Complexity Analaysis:**

The time complexity is O(k log k) because each insertion and extraction operation from the priority queue takes O(log k) time, and we perform this operation up to k times.
The space complexity is O(k) to store the pairs in the result list and the priority queue.


