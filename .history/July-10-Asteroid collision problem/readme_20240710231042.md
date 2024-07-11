# Asteroid Collision Solution

This repository contains the solution to the asteroid collision problem. The `asteroidCollision` function simulates a scenario where asteroids move in a linear direction and collide with each other. The function determines the state of the asteroids after all collisions.

## Though process: 
   Basically when initially I was doing this problem , i understood the basic conditios but the key is to traverse through all the elements and check the conditions as per the question , in that way if a collision is possible, we can update the array , to recursively traverse i used a while loop  and necessary conditions , if the number is positive it is never going to collide, as the direction is always towards right , so i directly add them and checked the conditions for only negative ones.
    

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Explanation](#explanation)
- [License](#license)

## Installation

To run the solution, you need to have Java installed on your machine. Follow these steps to set up the project:

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/asteroid-collision-solution.git
    ```

2. Navigate to the project directory:
    ```sh
    cd asteroid-collision-solution
    ```

3. Compile the Java file:
    ```sh
    javac Solution.java
    ```

4. Run the solution:
    ```sh
    java Solution
    ```

## Usage

You can use the `asteroidCollision` function by creating an instance of the `Solution` class and calling the method with an array of integers representing the asteroids. Positive values represent asteroids moving to the right, while negative values represent asteroids moving to the left.

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] asteroids = {5, 10, -5};
        int[] result = solution.asteroidCollision(asteroids);

        System.out.println("Resulting asteroids after collision:");
        for (int asteroid : result) {
            System.out.print(asteroid + " ");
        }
    }
}