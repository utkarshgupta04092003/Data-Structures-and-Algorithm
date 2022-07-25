/****************************************************************


Given an array A of size N. The contents of A are copied into 
another array B and numbers are shuffled. Also, one element is 
removed from B. The task is to find the missing element.

 
Example 1:
Input : 
A[] = {4, 8, 1, 3, 7}
B[] = {7, 4, 3, 1}
Output : 8
Explanation:
8 is the only element missing from B.
 
Example 2:
Input : 
A[] = {12, 10, 15, 23, 11, 30}
B[] = {15, 12, 23, 11, 30}
Output : 10
 

Your Task:  
You don't need to read input or print anything. Your task is to 
complete the function findMissing() which takes the array A[], B[] 
and its size N and N-1, respectively as inputs and returns the
missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
2 <= N <= 106
1 <= A, B <= 1018
Array may also contain duplicates.

 
 
 
*****************************************************************/


/***************************************************************

An efficient solution is based on XOR. The combined occurrence 
of each element is twice, one in ‘arr1’ and other in ‘arr2’, 
except one element which only has a single occurrence in ‘arr1’.
We know that (a Xor a) = 0. So, simply XOR the elements of 
both the arrays. The result will be the missing number.

***************************************************************/







class Solution {

    public long findMissing(long a[], long b[], int n) {
        
        long res = a[n-1];
        for(int i=0;i<n-1;i++){
            res = res^a[i];
            res = res^b[i];
        }
        
        return res;
    }
}


// Problem Link - https://practice.geeksforgeeks.org/problems/missing-number-in-shuffled-array0938/1?page=1&difficulty%5b%5d=-1&category%5b%5d=Arrays&sortBy=latest
