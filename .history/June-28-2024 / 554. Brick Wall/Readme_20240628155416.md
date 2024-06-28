Hi guys , It is our Second Interesting problem for the day 

**Question**

## There is a rectangular brick wall in front of you with n rows of bricks. The ith row has some number of bricks each of the same height (i.e., one unit) but they can be of different widths. The total width of each row is the same.

Draw a vertical line from the top to the bottom and cross the least bricks. If your line goes through the edge of a brick, then the brick is not considered as crossed. You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks.

Given the 2D array wall that contains the information about the wall, return the minimum number of crossed bricks after drawing such a vertical line.

 

** Solution : **


 I clearly found this Question very Confusing  and i took me so much time to come up with this logic , basically the logic is simeple to explain but to strike this idea for me , it took some descent time, 

 To explain you the appraoch , first let us go for an  example if we have 5 items in a container and you are asked to pick the  items , such that you leave minimum amount of items in the container, so what would you do  ? take as many as possible , in this case you take out 4 and leave 1 item.
and if you are asked in the reverse manner , you were asked to leave max number in the container , you would take 1 item and leave 4 , so basically you are subtracting the number of items from max , the number of items you pick depends on the given task( min or max) . 


Similrly , In this question you were given a n number of walls , each contianing the bricks with diff lengths , you have to draw a vertical line , such that you have min number of cross cuts( cuts which pass through the brick ) .

**My idea : **

Count the number of cuts in each position , example in pos1 we have 2 , simialrt pos3 has 3 cuts , and create a map from this data . 
Now you know which positions have how many cuts in the wall , so all you need to do is , take the spot with max clean cuts ( cuts exatly cuts through the edges) and subtract it from the above total length 

min Cross-cuts = Totallength - max clean-cuts . 

and return this. 


**Technical Appraoch : **
# 
Least Bricks Algorithm

This algorithm aims to find the minimum number of bricks that a vertical line crosses through when passed through a brick wall. The wall is represented as a list of rows, where each row is a list of integers representing the width of the bricks.

**Steps:**
Initialize the Map:

java
Copy code
Map<Integer, Integer> map = new HashMap<>();
Create a HashMap to store the cumulative width (position) of brick edges and their frequencies.
Iterate Over Each Row:

java
```java
Copy code
for (int i = 0; i < wall.size(); i++) {
    int count = 0;
    for (int j = 0; j < wall.get(i).size() - 1; j++) {
        count += wall.get(i).get(j);
        System.out.println(count);
        map.put(count, map.getOrDefault(count, 0) + 1);
    }
}
```
For each row in the wall:
Initialize count to 0 to track the cumulative width of bricks.
For each brick in the row (excluding the last brick to avoid counting the edge of the wall):
Update count with the width of the current brick.
Print the current value of count for debugging purposes.
Update the map with the cumulative width (count) as the key and increment its frequency by 1.
Find the Maximum Edge Alignment:

java
```java
Copy code
int maxCut = 0;
for (int key : map.keySet()) {
    maxCut = Math.max(maxCut, map.get(key));
}
```


Initialize maxCut to 0 to store the maximum number of edges aligned at any position.
Iterate through the map's keys (cumulative widths) and update maxCut with the maximum frequency found.
Calculate and Return the Result:

java
Copy code
return wall.size() - maxCut;
The minimum number of bricks a vertical line crosses is the total number of rows minus the maximum number of edges aligned (maxCut).
Example
Suppose we have the following wall representation:

css
Example : 


[[1, 2, 2, 1],
 [3, 1, 2],
 [1, 3, 2],
 [2, 4],
 [3, 1, 2],
 [1, 3, 1, 1]]




The algorithm will compute the cumulative widths of the brick edges for each row and update the map accordingly.
The maximum alignment of edges is determined, and the result is computed by subtracting this value from the total number of rows.
Conclusion
This algorithm effectively minimizes the number of bricks a vertical line crosses through by leveraging a map to track the positions of brick edges and finding the optimal position where the most edges align.



