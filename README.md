# LeetCode OJ
===============

All Questions are from [oj.leetcode.com](oj.leetcode.com)
:ok_hand: pass

:star: star

##Task List
-------------
###1.	Two Sum :ok_hand:
>	* make use the buildin data structure
>	* store the integer array into hashmap(`value, index`) to make the search fast
>	* Hashtable search O(n)
>	* return array `return new int[]{a,b}`
>	* only search one cycle, from the start to end of the array. (2-cycle is not the best solution)

###2.	Add Two Numbers	:ok_hand:
>	* left node is the Least Significant Digit
>	* use dummy head

###3.	Longest Substring Without Repeating Characters :ok_hand:
>	* traverse string from left, update the last occurs index for each character.
> * use two pointer indicate the substrings, move the head pointer only if the tail meet some repeated char in the substring.

###4.	Median of Two Sorted Arrays
###5.	Longest Palindromic Substring
###6.	ZigZag Conversion	`Finish`
>	* list several example (e.g. `nRows = 3,4`), obverse the regulation of the index increament
>	* build the substring for each row.
>	* notice the edge case when `nRows=1`

###7.	Reverse Integer	`Finish`
>	* in order to avoid overflow, a double check should be conducted after muplication
>	* edge case: `x = Integer.MIN_VALUE`

###8.	String to Integer (atoi) `Finish`
>	* For this kind of problem, the condition of overflow is: `Integer.MAX_VALUE/10 < original||(Integer.MAX_VALUE/10 == original && ch-'0'>Integer.MAX_VALUE%10)`   (only for absolute value)

###9.	Palindrome Number `Finish`
>	* get the length of integer
>	* compare front and real digits of integer
>	* then, remove the front and real digits
>	* `Math.pow(int)` return a `double` value

###10.	Regular Expression Matching
###11.	Container With Most Water
###12.	Integer to Roman
###13.	Roman to Integer
###14.	Longest Common Prefix	`finish`
>	* compare String one by one.
>	* for the method who return String, normally return "" (empty String) when edge case.

###15.	3Sum
###16.	3Sum Closest
###17.	Letter Combinations of a Phone Number
###18.	4Sum
###19.	Remove Nth Node From End of List `finish`
>	* create a gap between two pointers, which distance is `n`.
>	* careful with the situation that remove the first node in the list.

###20.	Valid Parentheses
###21.	Merge Two Sorted Lists
###22.	Generate Parentheses
###23.	Merge k Sorted Lists
###24.	Swap Nodes in Pairs
###25.	Reverse Nodes in k-Group
###26.	Remove Duplicates from Sorted Array
###27.	Remove Element
###28.	Implement strStr()
###29.	Divide Two Integers `finish`
>	* `>>1` => `/2`
>	* `<<1` => `*2`

###30.	Substring with Concatenation of All Words
###31.	Next Permutation
###32.	Longest Valid Parentheses
###33.	Search in Rotated Sorted Array `finish`
>	* Based on binary search
>	* each time, detect which side is sorted (there is at least one part is sorted)

###34.	Search for a Range	`finish`
>	* a helper method that use binary search to find first element which greater or equal to target
>	* use `target` and `target+1` to get the two bounds

###35.	Search Insert Position `finish`
>	* binary search

###36.	Valid Sudoku
###37.	Sudoku Solver
###38.	Count and Say
###39.	Combination Sum
###40.	Combination Sum II
###41.	First Missing Positive
###42.	Trapping Rain Water
###43.	Multiply Strings	`finish`
>	* calculate the result by digits
>	* outter loop track the digits and track the carry
>	* inner loop calculate the sum for one digits
>	* care about leading '0';

###44.	Wildcard Matching
###45.	Jump Game II
###46.	Permutations
###47.	Permutations II
###48.	Rotate Image	`finish`
>	* two loop
>	* outer : layer
>	* inner : node on each side

###49.	Anagrams
###50.	Pow(x, n)
###51.	N-Queens
###52.	N-Queens II
###53.	Maximum Subarray
###54.	Spiral Matrix	`finish`
>	* careful about the cases that number of cols or rows is odd
>	* use `LinkedList` to imporve the performance when adding elements to list.

###55.	Jump Game
###56.	Merge Intervals
###57.	Insert Interval
###58.	Length of Last Word
###59.	Spiral Matrix II
###60.	Permutation Sequence
###61.	Rotate List	`finish`
>	* Count the full list and make it to be a circle
>	* use `n mod count` to calculate how many elements should be left.
>	* traverse again and split circle at appropriate point.

###62.	Unique Paths
###63.	Unique Paths II
###64.	Minimum Path Sum
###65.	Valid Number
###66.	Plus One	 `finish`
>	*   start from the rightest digit, if `digits[i]==9` change it to 0, when finding one element is not 9, return.

###67.	Add Binary `finish`
>	* use helper method to get target digit of a String

###68.	Text Justification
###69.	Sqrt(x) `finish`
>	* Apply the thinking of binary search

###70.	Climbing Stairs
###71.	Simplify Path
###72.	Edit Distance
###73.	Set Matrix Zeroes
###74.	Search a 2D Matrix
###75.	Sort Colors
###76.	Minimum Window Substring
###77.	Combinations
###78.	Subsets	`finish`
>	* use several bits of a integer as the indicators, who indicates whether S[i] included int the subset
>	* 2^n = 1<<n

###79.	Word Search
###80.	Remove Duplicates from Sorted Array II
###81.	Search in Rotated Sorted Array II
###82.	Remove Duplicates from Sorted List II `finish`
>	* Two pointers

###83.	Remove Duplicates from Sorted List `finish`
>	* Two pointers

###84.	Largest Rectangle in Histogram
###85.	Maximal Rectangle
###86.	Partition List
###87.	Scramble String
###88.	Merge Sorted Array
###89.	Gray Code
###90.	Subsets II
###91.	Decode Ways
###92.	Reverse Linked List II
###93.	Restore IP Addresses
###94.	Binary Tree Inorder Traversal :ok_hand:
>	* make use of stack and queue when traverse the tree

###95.	Unique Binary Search Trees II :ok_hand:
> * dynamic programming
> * use a table to record all structures for `n = 1..n`
> * for each case, select the target root from 1 to n.

###96.	Unique Binary Search Trees :ok_hand:
> * refer to #95

###97.	Interleaving String
###98.	Validate Binary Search Tree :ok_hand:
>	* use Long to avoid the case that `Integer.MAX_VALUE` and `Integer.MIN_VALUE` included in the tree

###99. Recover Binary Search Tree
###100. Same Tree
> * similar to #101

###101. Symmetric Tree :ok_hand:
> * check inorder traversal is not working. e.g. [1,2,3,3,null,2,null]
> * use a queue to track the left and right branches, compare pair by pair.
> * BFS

###102. Binary Tree Level Order Traversal :ok_hand:
>	* BFS

###103. Binary Tree Zigzag Level Order Traversal :ok_hand:
> * BFS with a order flag

###104. Maximum Depth of Binary Tree :ok_hand:
>	* BFS iterative is easy as #102
> * DFS iterative use two stack track the traversal node and depth.
> * DFS recursive is another way.

###105. Construct Binary Tree from Preorder and Inorder Traversal
###106. Construct Binary Tree from Inorder and Postorder Traversal
###107. Binary Tree Level Order Traversal II `finish`
>	* BFS
>	* LinkedList addFirst();

###108. Convert Sorted Array to Binary Search Tree `finish`
>	* recursive
>	* careful with the situation array is null or has only one element.

###109. Convert Sorted List to Binary Search Tree `finish`
>	* count the length of linked list firstly
>	* do not access the list randomly
>	* so use inorder traverse.
>	* use a holder datastructure(e.g. ArrayList) to keep the current node to insert

###110. Balanced Binary Tree
###111. Minimum Depth of Binary Tree `finish`
>	* care about the definition of minimum Depth of BTree

###112. Path Sum
###113. Path Sum II
###114. Flatten Binary Tree to Linked List
###115. Distinct Subsequences
###116. Populating Next Right Pointers in Each Node
###117. Populating Next Right Pointers in Each Node II
###118. Pascal's Triangle
###119. Pascal's Triangle II
###120. Triangle
###121. Best Time to Buy and Sell Stock
###122. Best Time to Buy and Sell Stock II
###123. Best Time to Buy and Sell Stock III
###124. Binary Tree Maximum Path Sum
###125. Valid Palindrome	`finish`
>	* Two Pointer from start and end seperately
>	* Character.isLetterOrDigit(char)
>	* Character.toLowerCase(char)
>	* Character.isLetter(char)

###126. Word Ladder II
###127. Word Ladder
###128. Longest Consecutive Sequence
###129. Sum Root to Leaf Numbers
###130. Surrounded Regions
###131. Palindrome Partitioning
###132. Palindrome Partitioning II
###133. Clone Graph
###134. Gas Station
###135. Candy
###136. Single Number
###137. Single Number II
###138. Copy List with Random Pointer
###139. Word Break	`finish`
>	* DP, use boolean array record whether current index is achievable.
>	* one addition space in array make it more readable.

###140. Word Break II
###141. Linked List Cycle	`finish`
>	* use two pointers, fast one jump by two elemnts, slow one jump by one element.
>	* deal with "null" pointers

###142. Linked List Cycle II
###143. Reorder List
###144. Binary Tree Preorder Traversal :ok_hand:
>	* make use of stack and queue when traverse the tree

###145. Binary Tree Postorder Traversal `finish`
>	* track the number of access of each nodes
>	* when 2nd time, push right node into stack
>	* when 3rd time, add current Node to list.

###146. LRU Cache
###147. Insertion Sort List
###148. Sort List
###149. Max Points on a Line
###150. Evaluate Reverse Polish Notation
###151. Reverse Words in a String `finish`
>	* finish in one pass
>	* two StringBuilder, one for current word, the other for final result

###152. Maximum Product Subarray
###153. Find Minimum in Rotated Sorted Array
###154. Find Minimum in Rotated Sorted Array II
###155. Min Stack	`finish`
>	* trade-off between time and space.
>	* use one more stack store the min-value
>	* only update the "minStack" when a new min value come
>	* one more space at the bottom of stack (with value `Integer.MAX_VALUE`)

###156. Binary Tree Upside Down
###157. Read N Characters Given Read4
###158. Read N Characters Given Read4 II - Call multiple times
###159. Longest Substring with At Most Two Distinct Characters
###160. Intersection of Two Linked Lists `finish`
>	* get length for tow linked lists
>	* if two linked lists have intersection, they will have same end

###161. One Edit Distance
###162. Find Peak Element
>	* Use binary search tree thinking
>	* Compare num[mid] and num[mid+1], the peak must be on left or right half side.
>	* note that the peak might be 1st or last one element due to that
>	* num[-1] = num[size] = \infinity

###163. Missing Ranges
###164. Maximum Gap
###165. Compare Version Numbers
###166. Fraction to Recurring Decimal
###167. Two Sum II - Input array is sorted
###168. Excel Sheet Column Title
###169. Majority Element	`finish`
>	* Basic Concept: remove pair of different elements from the list, the majority element will not change.
>	* use stack to implement.

###170. Two Sum III - Data structure design
###171. Excel Sheet Column Number
###172. Factorial Trailing Zeroes
###173. Binary Search Tree Iterator
>	* Application of Inorder traverse of a tree in iterative.

###174. Dungeon Game
###179. Largest Number	`finish`
>	* self-define Comparator
>	* two different comparators are given in code
