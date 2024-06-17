Hi Guys , 

Please find the below question and approach for the following java file . 

Question )  You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.


output requirement : 

Return the length of the longest substring containing the same letter you can get after performing the above operations.



TestCases :

Although there are some common easy test casees provided by the leet code , i am assuming my own testcase : 

String s = "ABCAAAAAAAAAAAACEDFFGGH"   k = 1 ; 

Output : 13   =  " CAAAAAAAAAAAA  "


For any given problem , i follow a stratergy that i have learnt in the codepath training session : 

UMPIRE stratergy , 

U-Understand the problem - before You proceed to think for a solution , have clear understanding of the questiona and what is expected. 
M-Match - Match the problem type with a known problem type that you have already done or  common problem types likes  Sliding window, two pointer , Dynamic Programming.
P- plan -  plan the structure and how you want to excute and consider all the possible edge cases .
R- Review - After having a intial psudo code , review your code , make sure it aligns with the given code  output requirements 
E- Esxecute - Finally After solving all the problems Execute your code . 



So as discussed above my problem matching type for the given problem is Sliding Window Technique . 

Step 1 ) As i decided that my problem can be solved easily with sliding window , now i have set the conditions i need to move my window and update it in as move along the string 
Step2  ) I have decided that ,Store the count of every index and updated it accordingly and  if you take out the max_ length  - max_count , you get the remaining characters of th
         -e subString , now  you know how many different characters you have left with and you can compare those with the given k . 

         -> Basicaaly if we have a the different char length = k , then fine we can replace them with allowed k times and we are goof
         -> If our difference Cross the k value, that means we are over , so we cannot form a sub string with this by usin k replacement, so we take out the character from the window and move along 
         -> we check this conditions , for all possible sub strings and contunesly update the Max_length and Max_Count 

step 3 ) Finally we return the difference between the end_pointer and start_pointer



Time Complexity : Since we are going through the String  only once , out time complexity would be O(n) 
Space Complexity : Since we are creating a fixed sized array of size 26 , this stays the same even how much our String length varies , the space complexity is O(1) ; 



