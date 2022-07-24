/*********************************************************

Given a sorted array arr containing n elements with
possibly duplicate elements, the task is to find indexes 
of first and last occurrences of an element x in the
given array.

Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
Explanation: First occurrence of 5 is at index 2 and last
             occurrence of 5 is at index 5. 
 

Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  6 6 

Your Task:
Since, this is a function problem. You don't need to take any
input, as it is already accomplished by the driver code. You
just need to complete the function find() that takes array 
arr, integer n and integer x as parameters and returns the 
required answer.
Note: If the number x is not found in the array just 
return both index as -1.

 
Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 107

***********************************************************/




class GFG
{
    long findFirst(long arr[],int n,int x){
        int left = 0;
        int right = n-1;
        
        while(left <= right){
            int mid = (left+right)/2;
            
            if((mid == 0 || arr[mid-1] != arr[mid]) && arr[mid] == x )
                return mid;
                
            else if(arr[mid] >= x){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        
        return -1;
    }
    
    long findLast(long arr[],int n,int x){
        int left = 0;
        int right = n-1;
        
        while(left <= right){
            int mid = (left+right)/2;
            
            if((mid == n-1 || arr[mid] != arr[mid+1]) && arr[mid] == x )
                return mid;
                
            else if(arr[mid] > x){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        
        return -1;
    }
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        
        int key = x;
        long firstOccr = (long)findFirst(arr,n,key);
        long lastOccr = (long)findLast(arr,n,key);
        
        ArrayList<Long> res = new ArrayList<Long>();
        
        res.add(firstOccr);
        res.add(lastOccr);
        return res;
        
    }
}





// Problem link - https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?page=1&difficulty%5b%5d=-1&category%5b%5d=Arrays&sortBy=latest
