# Hi Guys , 

# In my Interview prep , i have come up with another question today in leetcode and it uses recorsion to effectively solve the array 

# Decode String Using Recursive Descent Parsing
This Java program implements a recursive descent parser to decode a string encoded with a specific pattern involving digits and square brackets.

# Description
The Solution class contains methods to decode a given encoded string using recursive parsing. The main functionality is encapsulated in the decodeString method, which initiates the decoding process by calling the decoder method.

## Methods

decoder(String s, int[] i):

This method recursively decodes the input string s.
It uses an array i to maintain the current position in the string through its index i[0].
It handles both numeric multipliers and nested encoded substrings within square brackets.
decodeString(String s):

This public method initializes the decoding process by calling decoder with the input string s.
Usage
To decode a string encoded in the specified pattern, instantiate the Solution class and call the decodeString method with the encoded string as an argument.

## java
`
Solution solution = new Solution();
String encodedString = "3[a]2[bc]";
String decodedString = solution.decodeString(encodedString);
System.out.println("Decoded String: " + decodedString);`


## Example
Given an encoded string "3[a]2[bc]", the decodeString method will return "aaabcbc".

## Notes
### The code assumes valid input strings adhering to the encoding pattern.
### It handles nested patterns and numeric multipliers efficiently using recursive parsing.
### The import thing during this problem is ,  whay did i use the an integer array instead of an integer i , as the array holds only one value , 
 
## Explanation

Java passes objects (including arrays) by reference but passes primitives (like int) by value. This means if we pass int i directly, any changes to i within a method won't reflect outside that method. Using an array (int[] i) allows modifications to i[0] (the first element of the array) within methods, which persists outside the method scope.

