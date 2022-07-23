/******************************************************

An element is called a peak element if its value is not 
smaller than the value of its adjacent elements
(if they exists).
Given an array arr[] of size N, Return the index of any 
one of its peak elements.
Note: The generated output will always be 1 if the index
that you return is correct. Otherwise output will be 0. 


Example 1:

Input: 
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0.
Example 2:

Input:
N = 2
arr[] = {3,4}
Possible Answer: 1
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.
If 2 is returned then the generated output will be 1 else 0.
 

Your Task:
You don't have to read input or print anything. Complete
the function peakElement() which takes the array arr[] 
and its size N as input parameters and return the index
of any one of its peak elements.

Can you solve the problem in expected time complexity?

 

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)



Constraints:
1 ≤ N ≤ 105
1 ≤ A[] ≤ 106
********************************************************/




class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int left = 0;
       int right = n-1;
       int mid = 0;
       int peak = -1;
       while(left <= right){
          
           mid = (left+right)/2;

        //   if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1|| arr[mid + 1] <= arr[mid])){

           if((mid == 0 || arr[mid-1] <= arr[mid]) && ( mid == n-1 || arr[mid] >= arr[mid+1] )){
               break;
           }
           else if(mid > 0 && arr[mid - 1] > arr[mid]){
               right = mid-1;

           }
           else{
               left = mid+1;
           }
       }
       return mid;
       
    }
    
    
}

// problem Link - https://practice.geeksforgeeks.org/problems/peak-element/1?page=1&difficulty%5b%5d=0&category%5b%5d=Arrays&sortBy=submissions
