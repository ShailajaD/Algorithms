# Algorithms
/**
 * Given an array of integers arr:

Write a function flip(arr, k) that reverses the order of the first k elements in the array arr.
Write a function pancakeSort(arr) that sorts and returns the input array. 
You are allowed to use only the function flip you wrote in the first step in order to make changes in the array.
Example:

input:  arr = [1, 5, 4, 3, 2]

output: [1, 2, 3, 4, 5] 

Solution: 
setup: count keeps track of the length of the array to be flipped.count = arr.length-1;
1. Find the index of the maxElement in the array
2. flip the array till the maxElement index filp(arr,maxElementIndex)
3. Now that the maxElement is at the beginning of the array, flip the whole array to put the max element at the end. -> flip(arr,count); 
4. Decrement the count and look for the max element between 0 and count;
5. repeat placing the max element to the end and decrementing count;
 * @author shail
 *
 */
