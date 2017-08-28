Write a function called flip(arr, k) that reverses the order of the first k elements in the array arr.
Write a function pancakeSort(arr) that sorts and returns the input array. 
You are allowed to use only the function flip you wrote in the first step in order to make changes in the array.
Example:

input:  arr = [1, 5, 4, 3, 2]

output: [1, 2, 3, 4, 5] 

Solution: 
We start by determining the index, say maxElementIndex, of max element in the array. We call flip(arr, maxElementIndex) so that the max element comes to starting position. Another flip with flip(arr, arr.length - 1) will move it to the end. Now that max element has landed in its correct place, we can focus on the subarray that contains everything but last element and continue in the same manner. Here are the steps.
 
0. count = arr.length-1 # count keeps track of the length of the array to be flipped
1. Find the index of the maxElement in the arr[0...count] 
2. Flip the subarray till the maxElement index using flip(arr,maxElementIndex)
3. Now that the maxElement is at the beginning of the array, flip the whole array to put the max element at the end by calling flip(arr,count) 
4. Decrement the count by one and look for the max element between 0 and count
5. repeat placing the max element to the end and decrementing count
