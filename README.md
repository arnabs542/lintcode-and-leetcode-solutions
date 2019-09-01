# Solutions of Lintcode and Leetcode

Java based [Lintcode](https://www.lintcode.com) and [Leetcode](https://leetcode.com/) solutions with test case support and some handy help functions. 

# Problems Worthy of Retrying

> The list is still under heavy update.

- [0 Elementary Problems](#0-elementary-problems)
  - [0.0 Bit Operation](#00-bit-operation)
  - [0.1 Binary Search](#01-binary-search)
  - [0.2 Array Problems](#02-array-problems)
- [1 Data Structure](#1-data-structure)
- [2 Advanced Data Structure](#2-advanced-data-structure)
- [3 String](#3-string)
  - [3.0 Basic String Operations](#30-basic-string-operations)
  - [3.1 Trie](#31-trie)
  - [3.2 String Search](#32-string-search)
  - [3.3 Suffix Tree](#33-suffix-tree)
  - [3.4 AC Automaton](#34-ac-automaton)
- [4 Search Techniques](#4-search-techniques)
  - [4.0 DFS](#40-dfs)
  - [4.1 BFS](#40-bfs)
- [5 Algorithms](#5-algorithms)
  - [5.0 Greedy Algorithms](#50-greedy-algorithms)
  - [5.1 Dynamic Programming](#51-dynamic-programming)
- [6 Mathematical Problems](#6-mathematical-problems)
  - [6.1 Big Number Problems](#61-big-number-problems)
  - [6.2 Combinatorial Mathematics](#62-combinatorial-mathematics)
- [7 Graph Algorithm](#7-graph-algorithm)
- [8 Computation Geometry](#8-computation-geometry)
- [9 Rigorous and Logical Thinking](#9-rigorous-and-logical-thinking)
  - [9.0 Interval Problems](#90-interval-problems)

There are now too many problems in [Lintcode](https://www.lintcode.com) and [Leetcode](https://leetcode.com/), we don't have the time to solve and revisit each and every one of them, below are a selected subset of these problems, which, in my opinion, worthy of retrying.

## 0 Elementary Problems

### 0.0 Bit Operation

- [NumberOf1Bits](https://www.lintcode.com/problem/number-of-1-bits/description). The simplest scenario, need only consider unsigned numbers.
- [Count1InBinary](https://www.lintcode.com/problem/count-1-in-binary/description). Now take negative numbers into the consideration.
- [PrimeNumberOfSetBitsInBinaryRepresentation](https://www.lintcode.com/problem/prime-number-of-set-bits-in-binary-representation/description). Combine [Count1InBinary](https://www.lintcode.com/problem/count-1-in-binary/description) and [CountPrimes](https://www.lintcode.com/problem/count-primes/description) together.

### 0.1 Binary Search

- [ClassicalBinarySearch](https://www.lintcode.com/problem/classical-binary-search/description). For starters.
- [FirstPositionOfTarget](https://www.lintcode.com/problem/first-position-of-target/description). The simplest variation of classical binary search.
- [SearchInsertPosition](https://www.lintcode.com/problem/search-insert-position/description). Simple variation of classical binary search.
- [GuessNumberHigherOrLower](https://www.lintcode.com/problem/guess-number-higher-or-lower/description).
- [Heaters](https://www.lintcode.com/problem/heaters/description).
- [FindSmallestLetterGreaterThanTarget](https://www.lintcode.com/problem/find-smallest-letter-greater-than-target/description). Strings rather than numbers, and now we need to locate the position to insert a new character with the array kept ordered.

### 0.2 Array Problems

- [MatrixZigZagTraversal](https://www.lintcode.com/problem/matrix-zigzag-traversal/description). Need to discover the traversal pattern, interesting.
- [MultiKeywordSort](https://www.lintcode.com/problem/multi-keyword-sort/description). Use generic-programming way to implement QuickSort.
- [MaximumProductOfThreeNumbers](https://www.lintcode.com/problem/largest-number-at-least-twice-of-others/description). Try best to take all kinds of test cases into the consideration, in the end, DFS is applied.
- [ContainsDuplicate3](https://www.lintcode.com/problem/contains-duplicate-iii/description). Good questions to get to know [BucketSort](http://personal.kent.edu/~rmuhamma/Algorithms/MyAlgorithms/Sorting/bucketSort.htm).
- [SetMismatch](https://www.lintcode.com/problem/set-mismatch/description). Good questions to get to know [RadixSort](https://en.wikipedia.org/wiki/Radix_sort).
 
## 1 Data Structure

- [CloneBinaryTree](https://www.lintcode.com/problem/clone-binary-tree/description). Try recursive and non-recursive way.
- [SameTree](https://www.lintcode.com/problem/same-tree/description). Try recursive and non-recursive way.
- [BaseballGame](https://www.lintcode.com/problem/baseball-game/description). Good question for stack.

## 2 Advanced Data Structure

> To be added.

## 3 String

### 3.0 Basic String Operations

> To be added.

### 3.1 Trie

- [LongestWordInDictionary](https://www.lintcode.com/problem/longest-word-in-dictionary/description). Very good start to know trie.

### 3.2 String Search

- [ValidWordAbbreviation](https://www.lintcode.com/problem/valid-word-abbreviation/description). Good one. Relative skills including string comparison and converting string to number. 

### 3.3 Suffix Tree

> To be added.

### 3.4 AC Automaton

> To be added.

## 4 Search Techniques

### 4.0 DFS

- [LetterCasePermutation](https://www.lintcode.com/problem/letter-case-permutation/description). Good DFS question.
- [SumOfAllSubsets](https://www.lintcode.com/problem/sum-of-all-subsets/description). Another good DFS question.

### 4.1 BFS

> To be added.

## 5 Algorithms

### 5.0 Greedy Algorithms

- [CanPlaceFlowers](https://www.lintcode.com/problem/can-place-flowers/description).
- [LemonadeChange](https://www.lintcode.com/problem/lemonade-change/description).

### 5.1 Dynamic Programming 

- [PascalsTriangle](https://www.lintcode.com/problem/pascals-triangle/description). As a starter.
- [MinCostClimbingStairs](https://www.lintcode.com/problem/min-cost-climbing-stairs/description). Simple but kinda of boring.

## 6 Mathematical Problems

### 6.0 Elementary Mathematical Problems

- [NthDigit](https://www.lintcode.com/problem/nth-digit/description) and [DigitCounts](https://www.lintcode.com/problem/digit-counts/description) share some similarities.
- [CountPrimes](https://www.lintcode.com/problem/count-primes/description). Prime number.

### 6.1 Big Number Problems

> To be added.

### 6.2 Combinatorial Mathematics

> To be added.

## 7 Graph Algorithm

> To be added.

## 8 Computation Geometry

> To be added.

## 9 Rigorous and Logical Thinking

These problems need to consider some, or even many edge cases to get the correct answer. Make sure you understand the problem very clear and try to enumerate all possible test cases if possible.
 
- [NonDecreasingArray](https://www.lintcode.com/problem/non-decreasing-array/description). Test case can be tricky, yet remains simple if we analysis the problem rigorously and logically.
- [ShortestUnsortedContinuousSubArray](https://www.lintcode.com/problem/shortest-unsorted-continuous-subarray/description). Get stuck at the beginning, 😂.
- [MaximizeDistanceToClosestPerson](https://www.lintcode.com/problem/maximize-distance-to-closest-person/description). Consider the boundary conditions, rigorously. Not very hard, so it is a good problem for starter.
- [XOfAKindInADeckOfCards](https://www.lintcode.com/problem/x-of-a-kind-in-a-deck-of-cards/description). Very simple, right? Just a HashMap and everything is done. Hang on...

### 9.0 Interval Problems

- [MergeTwoSortedIntervalLists](https://www.lintcode.com/problem/merge-two-sorted-interval-lists/description).
