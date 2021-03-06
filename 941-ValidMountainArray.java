/**
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[B.length - 1]
 

Example 1:

Input: [2,1]
Output: false
**/


//从两端往中间靠拢，最精髓的在于返回语句的判断
class Solution {
    public boolean validMountainArray(int[] A) 
    {
        int n = A.length,i=0,j=n-1;
        while(i+1<n && A[i] < A[i+1]) i++;
        while(j>0 && A[j-1] > A[j])   j--;
        
        return i>0 && i==j && j<n-1;
              
    }
}