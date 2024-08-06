# Pascal's Triangle Generator

This project provides a solution to generate Pascal's Triangle up to a specified number of rows using a Java program.

## Function Explanation

### Function: `generate`

**Purpose**: 
The `generate` function creates Pascal's Triangle up to a given number of rows.

**Parameters**:
- `int numRows`: The number of rows of Pascal's Triangle to generate.

**Returns**:
- `List<List<Integer>>`: A list of lists, where each inner list represents a row in Pascal's Triangle.

### Idea Behind the Code

1. **Initialization**:
   - Start with the first row, `[1]`, and add it to the `solution` list.
   - Use a `while` loop to generate the rest of the rows until `numRows` is reached.

2. **Generating Rows**:
   - For each row, reference the previous row to calculate the current row.
   - Initialize the current row with the first element as `1`.

3. **Filling the Current Row**:
   - Use a nested loop to sum adjacent elements from the previous row and add the results to the current row.

4. **Completing the Current Row**:
   - Add `1` as the last element of the current row.

5. **Adding the Current Row to the Solution**:
   - Append the completed current row to the `solution` list.

6. **Return the Solution**:
   - After generating all rows, return the `solution` list containing the Pascal's Triangle rows.