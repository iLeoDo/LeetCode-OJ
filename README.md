# LeetCode OJ
===============

All Questions are from [oj.leetcode.com](oj.leetcode.com)
:ok_hand: pass

:star: star

##Task List
-------------
###1.	Two Sum :ok_hand:
> * make use the buildin data structure
> * store the integer array into hashmap(`value, index`) to make the search fast
> * Hashtable search O(n)
> * return array `return new int[]{a,b}`
> * only search one cycle, from the start to end of the array. (2-cycle is not the best solution)

###2.	Add Two Numbers	:ok_hand:
> * left node is the Least Significant Digit
> * use dummy head

###3.	Longest Substring Without Repeating Characters :ok_hand:
> * traverse string from left, update the last occurs index for each character.
> * use two pointer indicate the substrings, move the head pointer only if the tail meet some repeated char in the substring.

###4.	Median of Two Sorted Arrays
###5.	Longest Palindromic Substring :ok_hand:
> * extendly check the palindromic substring with a middle point 0..length
> * odd or even.

###6.	ZigZag Conversion :ok_hand:
>	* list several example (e.g. `nRows = 3,4`), obverse the regulation of the index increament
>	* build the substring for each row.
>	* notice the edge case when `nRows=1`

###7.	Reverse Integer :ok_hand:
>	* in order to avoid overflow, a double check should be conducted after muplication
>	* edge case: `x = Integer.MIN_VALUE`

###8.	String to Integer (atoi) `Finish`
>	* For this kind of problem, the condition of overflow is: `Integer.MAX_VALUE/10 < original||(Integer.MAX_VALUE/10 == original && ch-'0'>Integer.MAX_VALUE%10)`   (only for absolute value)

###9.	Palindrome Number :ok_hand:
>	* get the length of integer
>	* compare front and real digits of integer
>	* then, remove the front and real digits
>	* `Math.pow(int)` return a `double` value

###10.	Regular Expression Matching
###11.	Container With Most Water :ok_hand:
> * two pointers

###12.	Integer to Roman
###13.	Roman to Integer
###14.	Longest Common Prefix :ok_hand:
>	* compare String one by one.
>	* for the method who return String, normally return "" (empty String) when edge case.

###15.	3Sum :ok_hand:
> * constrain the smallest number
> * use two pointers to find the second and third one
> * note: duplicate numbers

###16.	3Sum Closest :ok_hand:
> * similar to #15

###17.	Letter Combinations of a Phone Number
###18.	4Sum
###19.	Remove Nth Node From End of List :ok_hand:
> * create a gap between two pointers, which distance is `n`.
> * careful with the situation that remove the first node in the list. (dummyHead can be adopted)

###20.	Valid Parentheses :ok_hand:
> * use stack to check the pair
> * use integer instand of the char to siplify the code.

###21.	Merge Two Sorted Lists
###22.	Generate Parentheses
###23.	Merge k Sorted Lists
###24.	Swap Nodes in Pairs :ok_hand:
> * use dummy node

###25.	Reverse Nodes in k-Group
###26.	Remove Duplicates from Sorted Array :ok_hand:
>   * use a counter to count the number of duplications
>   * a[i-counter] = a[i]

###27.	Remove Element :ok_hand:
> * O(n)

###28.	Implement strStr()
###29.	Divide Two Integers :ok_hand:
>	* `>>1` => `/2`
>	* `<<1` => `*2`

###30.	Substring with Concatenation of All Words
###31.	Next Permutation
###32.	Longest Valid Parentheses
###33.	Search in Rotated Sorted Array :ok_hand:
>	* Based on binary search
>	* each time, detect which side is sorted (there is at least one part is sorted)

###34.	Search for a Range	:ok_hand:
>	* a helper method that use binary search to find first element which greater or equal to target
>	* use `target` and `target+1` to get the two bounds

###35.	Search Insert Position `finish`
>	* binary search

###36.	Valid Sudoku
###37.	Sudoku Solver
###38.	Count and Say
###39.	Combination Sum :ok_hand:
> * dp problem
> * miss test case: duplicate element in candidates[].

###40.	Combination Sum II :ok_hand:
> * similar to #39
> * select the candidate only once per ** sub solution **

###41.	First Missing Positive
###42.	Trapping Rain Water
###43.	Multiply Strings :ok_hand:
>	* calculate the result by digits
>	* outter loop track the digits and track the carry
>	* inner loop calculate the sum for one digits
>	* care about leading '0';

###44.	Wildcard Matching
###45.	Jump Game II
###46.	Permutations
###47.	Permutations II
###48.	Rotate Image :ok_hand:
>	* two loop
>	* outer : layer
>	* inner : node on each side
> * tips: keep original index.

###49.	Group Anagrams :ok_hand:
> * sort the strings array.
> * use hashmap

###50.	Pow(x, n) :ok_hand:
> * n<0
> * n = Integer.MIN_VALUE
> * n%2==0
> * n%2==1

###51.	N-Queens
###52.	N-Queens II
###53.	Maximum Subarray :ok_hand:
> * maxSumEndingHere, maxSumSoFar

###54.	Spiral Matrix :ok_hand:
> * careful about the cases that number of cols or rows is odd.(depends on the shape)
> * use `LinkedList` to imporve the performance when adding elements to list.

###55.	Jump Game
###56.	Merge Intervals :ok_hand:
> * Sort (Comparator -> compare(T,T))
> *

###57.	Insert Interval
###58.	Length of Last Word
###59.	Spiral Matrix II
###60.	Permutation Sequence
###61.	Rotate List :ok_hand:
> * Count the full list and make it to be a circle
> * use `n mod count` to calculate how many elements should be left.
> * traverse again and split circle at appropriate point.

###62.	Unique Paths :ok_hand:
> * DP, create a table

###63.	Unique Paths II :ok_hand:
> * in-place
> * or an one-dimension array.

###64.	Minimum Path Sum :ok_hand:
> * dynamic programming
> * special case: first row and first column

###65.	Valid Number
###66.	Plus One :ok_hand:
>	*   start from the rightest digit, if `digits[i]==9` change it to 0, when finding one element is not 9, return.

###67.	Add Binary `finish`
>	* use helper method to get target digit of a String

###68.	Text Justification
###69.	Sqrt(x) :ok_hand:
>	* Apply the thinking of binary search

###70.	Climbing Stairs :ok_hand:

###71.	Simplify Path
###72.	Edit Distance
###73.	Set Matrix Zeroes :ok_hand:

###74.	Search a 2D Matrix :ok_hand:

###75.	Sort Colors
###76.	Minimum Window Substring
###77.	Combinations
###78.	Subsets	:ok_hand:
> * use several bits of a integer as the indicators, who indicates whether S[i] included int the subset
> * 2^n = 1<<n

###79.	Word Search :ok_hand:
> * modify the visited point before and after the recursion.
> * xor is a good way

###80.	Remove Duplicates from Sorted Array II :ok_hand:
> * count the time of duplicates
> * reset the counter when meet a new element

###81.	Search in Rotated Sorted Array II :ok_hand:
> * similar to #033

###82.	Remove Duplicates from Sorted List II :ok_hand:
> * dummyHead
> * move current until its not a duplicate element.

###83.	Remove Duplicates from Sorted List :ok_hand:
> * dummyHead

###84.	Largest Rectangle in Histogram
###85.	Maximal Rectangle
###86.	Partition List
###87.	Scramble String
###88.	Merge Sorted Array :ok_hand:
> * merge two array from end to start.
> * after the traversal on both nums1 and nums2, only the number bigger than nums1 will left in nums2

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
###100. Same Tree :ok_hand:
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

###105. Construct Binary Tree from Preorder and Inorder Traversal :ok_hand:
> * first elment in preorder traversal of a tree is the root
> * find the index of the root in the inorder traversal, then split it into inorder traversal of left and right substree
> * recursive.

###106. Construct Binary Tree from Inorder and Postorder Traversal :ok_hand:
> * similar to #105

###107. Binary Tree Level Order Traversal II :ok_hand:
>	* BFS
>	* LinkedList addFirst();

###108. Convert Sorted Array to Binary Search Tree :ok_hand:
>	* recursive
>	* careful with the situation array is null or has only one element.

###109. Convert Sorted List to Binary Search Tree :ok_hand:
>	* count the length of linked list firstly
>	* do not access the list randomly
>	* so use inorder traverse.
>	* use a holder datastructure(e.g. ArrayList) to keep the current node to insert

###110. Balanced Binary Tree :ok_hand:
> * defination of balanced binary tree:
> * a binary tree in which the depth of the two subtrees of **every node** never differ by more than 1.
> * use special value as the return value of the recursion to represent the unbalanced status.
> * avoid recursion twice.

###111. Minimum Depth of Binary Tree `finish`
>	* care about the definition of minimum Depth of BTree

###112. Path Sum :ok_hand:
> * simple recursive

###113. Path Sum II :ok_hand:
> * use a list to track the traversal
> * recursive

###114. Flatten Binary Tree to Linked List
###115. Distinct Subsequences
###116. Populating Next Right Pointers in Each Node  :ok_hand:
> * traversal level by level
> * queue is useless because of the `next` pointer

###117. Populating Next Right Pointers in Each Node II :ok_hand:

###118. Pascal's Triangle :ok_hand:
###119. Pascal's Triangle II :ok_hand:
###120. Triangle
###121. Best Time to Buy and Sell Stock :ok_hand:
> * Maximum subarray problem

###122. Best Time to Buy and Sell Stock II :ok_hand:
> * Maximum subarray problem

###123. Best Time to Buy and Sell Stock III :ok_hand:
> * similar to #122 #188


###124. Binary Tree Maximum Path Sum
###125. Valid Palindrome :ok_hand:
>	* Two Pointer from start and end seperately
>	* Character.isLetterOrDigit(char)
>	* Character.toLowerCase(char)
>	* Character.isLetter(char)

###126. Word Ladder II
###127. Word Ladder
###128. Longest Consecutive Sequence
###129. Sum Root to Leaf Numbers
###130. Surrounded Regions
###131. Palindrome Partitioning :ok_hand:
> * implement a function to check whether s[a,b] is palindromic
> * dfs from from the fist char ( s[0,0] => s[0,1] => s[0,2] ) with recursions.

###132. Palindrome Partitioning II
###133. Clone Graph
###134. Gas Station
###135. Candy
###136. Single Number :ok_hand:

###137. Single Number II

###138. Copy List with Random Pointer :ok_hand:
> * step 1. insert copy after each original
> * step 2. assign random
> * step 3. split two lists.
> * Another solution: `HashMap<RandomListNode,RandomListNode>`;

###139. Word Break :ok_hand:
>	* DP, use boolean array record whether current index is achievable.
>	* one addition space in array make it more readable.

###140. Word Break II
###141. Linked List Cycle :ok_hand:
>	* use two pointers, fast one jump by two elements, slow one jump by one element.
>	* deal with "null" pointers

###142. Linked List Cycle II :ok_hand:
> ```
> ~~~~~~~~~~=======
>          |      ||
>           ---x===
> ```
> * assume `len(~) = s`, `len(=) = p`,`len(-) = q`
> * similar to #141, after two pointers meet in x, we have
> * `2*(s+p+m*(p+q)) - (s+p+n*(p+q)) = k*(p+q)`, where `m,n,k` in `1...MAX`
> * then, `s=r(p+q)-p`, according to this relationship, we can:
> * move slow pointer to head.

###143. Reorder List
###144. Binary Tree Preorder Traversal :ok_hand:
> * make use of stack and queue when traverse the tree

###145. Binary Tree Postorder Traversal :ok_hand:
> * track the number of access of each nodes
> * when 2nd time, push right node into stack
> * when 3rd time, add current Node to list.

###146. LRU Cache :ok_hand:
> * LinkedHashMap

###147. Insertion Sort List
###148. Sort List
###149. Max Points on a Line
###150. Evaluate Reverse Polish Notation
###151. Reverse Words in a String :ok_hand:
> * finish in one pass
> * two StringBuilder, one for current word, the other for final result
> * pseudo-in-place.

###152. Maximum Product Subarray :ok_hand:
> * similar to #053, but track minEndingHere, too.

###153. Find Minimum in Rotated Sorted Array
###154. Find Minimum in Rotated Sorted Array II
###155. Min Stack :ok_hand:
> * trade-off between time and space.
> * use one more stack store the min-value
> * only update the "minStack" when a new min value come (new <= curentMin)
> * one more space at the bottom of stack (with value `Integer.MAX_VALUE`)

###156. Binary Tree Upside Down
###157. Read N Characters Given Read4
###158. Read N Characters Given Read4 II - Call multiple times
###159. Longest Substring with At Most Two Distinct Characters
###160. Intersection of Two Linked Lists :ok_hand:
>	* get length for tow linked lists
>	* if two linked lists have intersection, they will have same end

###161. One Edit Distance
###162. Find Peak Element :ok_hand:
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
###169. Majority Element :ok_hand:
> * Sol1: Basic Concept: remove pair of different elements from the list, the majority element will not change. use stack to implement.
> * Sol2: Sort, get the middle one
> * Sol3: Moore voting

###170. Two Sum III - Data structure design
###171. Excel Sheet Column Number
###172. Factorial Trailing Zeroes :ok_hand:
> * return n/5 + n/25 + n/125 + n/625 + n/3125+...;

###173. Binary Search Tree Iterator
>	* Application of Inorder traverse of a tree in iterative.

###174. Dungeon Game
###179. Largest Number :ok_hand:
>	* self-define Comparator
>	* two different comparators are given in code

###186. Reverse Words in a String II  :ok_hand:
> * reverse the whole sentence
> * reverse word by word
> * remove leading or trailing space if necessary.

###187. Repeated DNA Sequences
###188. Best Time to Buy and Sell Stock IV :ok_hand:
> * DP


###189. Rotate Array :ok_hand:
> * `1,2,3,4,5` inverse
> * `5,4,3,2,1` inverse
> * `4,5,3,2,1` inverse
> * `4,5,1,2,3`

###190. Reverse Bits
###191. Number of 1 Bits

###198. House Robber :ok_hand:

###199. Binary Tree Right Side View :ok_hand:

###200. Number of Islands
###201. Bitwise AND of Numbers Range
###202. Happy Number
###203. Remove Linked List Elements :ok_hand:
> * dummyHead

###204. Count Primes
###205. Isomorphic Strings
###206. Reverse Linked List :ok_hand:
> * keep log on the new head and traversal pointer.
> ```
> ListNode current=head;
> ListNode newHead=null;
> while(current!=null){
>     ListNode next = current.next;
>     current.next = newHead;
>     newHead = current;
>     current = next;
> }
> ```

###207. Course Schedule
###208. Implement Trie (Prefix Tree) :ok_hand:
> * TrieNode(isWord,TrieNode[])

###209. Minimum Size Subarray Sum
###210. Course Schedule II
###211. Add and Search Word - Data structure design
###212. Word Search II
###213. House Robber II
###214. Shortest Palindrome
###215. Kth Largest Element in an Array
###216. Combination Sum III :ok_hand:
> * similar to 39
> * structure.add / recursive / structure.remove is a good way to make use of a track structure
> * in base case of recursive, structure should be cloned.

###217. Contains Duplicate
###218. The Skyline Problem
###219. Contains Duplicate II
###220. Contains Duplicate III
###221. Maximal Square
###222. Count Complete Tree Nodes
###223. Rectangle Area
###224. Basic Calculator
###225. Implement Stack using Queues :ok_hand:
> * cyclise the queue.

###226. Invert Binary Tree
###227. Basic Calculator II
###228. Summary Ranges
###229. Majority Element II
###230. Kth Smallest Element in a BST :ok_hand:
> * Inorder traversal

###231. Power of Two :ok_hand:

###232. Implement Queue using Stacks
###233. Number of Digit One
###234. Palindrome Linked List  :ok_hand:
> * similar to #206
> * find the mid point with reversing the first half
> * compare them
> * note: odd LinkedList

###235. Lowest Common Ancestor of a Binary Search Tree
###236. Lowest Common Ancestor of a Binary Tree
###237. Delete Node in a Linked List  :ok_hand:
> * copy the value of next node into current one.

###238. Product of Array Except Self
###239. Sliding Window Maximum
###240. Search a 2D Matrix II :ok_hand:

###241. Different Ways to Add Parentheses
###242. Valid Anagram
###243. Shortest Word Distance
###244. Shortest Word Distance II
###245. Shortest Word Distance III
###246. Strobogrammatic Number
###247. Strobogrammatic Number II
###248. Strobogrammatic Number III
###249. Group Shifted Strings
###250. Count Univalue Subtrees
###251. Flatten 2D Vector
###252. Meeting Rooms
###253. Meeting Rooms II
###254. Factor Combinations
###255. Verify Preorder Sequence in Binary Search Tree
###256. Paint House
###257. Binary Tree Paths
###258. Add Digits
###259. 3Sum Smaller
###260. Single Number III :ok_hand:
###261. Graph Valid Tree
###263. Ugly Number
###264. Ugly Number II
###265. Paint House II
###266. Palindrome Permutation
###267. Palindrome Permutation II
###268. Missing Number :ok_hand:
> * sum the sequence.
> * attention overflow of integer
> * xor operation a^i^i = a

###269. Alien Dictionary
###270. Closest Binary Search Tree Value
###271. Encode and Decode Strings
###272. Closest Binary Search Tree Value II
###273. Integer to English Words
###274. H-Index :ok_hand:
###275. H-Index II
###276. Paint Fence
###277. Find the Celebrity
###278. First Bad Version
###279. Perfect Squares
###280. Wiggle Sort
###281. Zigzag Iterator
###282. Expression Add Operators
###283. Move Zeroes :ok_hand:
> * O(n) with a counter

###284. Peeking Iterator
###285. Inorder Successor in BST
###286. Walls and Gates
###287. Find the Duplicate Number  :ok_hand:
> * two pointers, slow and fast, similiar to cycle in linkedlist

###288. Unique Word Abbreviation
###289. Game of Life
###290. Word Pattern
###291. Word Pattern II
###292. Nim Game
###293. Flip Game
###294. Flip Game II
###295. Find Median from Data Stream :ok_hand:
> * maintain two heaps(priority queues), small and large.

###296. Best Meeting Point
###297. Serialize and Deserialize Binary Tree
###298. Binary Tree Longest Consecutive Sequence
###299. Bulls and Cows
###300. Longest Increasing Subsequence
###301. Remove Invalid Parentheses
###302. Smallest Rectangle Enclosing Black Pixels
###303. Range Sum Query - Immutable
###304. Range Sum Query 2D - Immutable
###305. Number of Islands II
###306. Additive Number
###307. Range Sum Query - Mutable
###308. Range Sum Query 2D - Mutable
###309. Best Time to Buy and Sell Stock with Cooldown
###310. Minimum Height Trees
###311. Sparse Matrix Multiplication
###312. Burst Balloons
###313. Super Ugly Number
###314. Binary Tree Vertical Order Traversal
###315. Count of Smaller Numbers After Self
###316. Remove Duplicate Letters
###317. Shortest Distance from All Buildings
###318. Maximum Product of Word Lengths
###319. Bulb Switcher
###320. Generalized Abbreviation
###321. Create Maximum Number
###322. Coin Change
###323. Number of Connected Components in an Undirected Graph
###324. Wiggle Sort II
###325. Maximum Size Subarray Sum Equals k
###326. Power of Three
###327. Count of Range Sum
###328. Odd Even Linked List
###329. Longest Increasing Path in a Matrix
###330. Patching Array
###331. Verify Preorder Serialization of a Binary Tree :ok_hand:
> * use stack to reduce the string.

###332. Reconstruct Itinerary
###333. Largest BST Subtree
###334. Increasing Triplet Subsequence
###335. Self Crossing
###336. Palindrome Pairs
###337. House Robber III



