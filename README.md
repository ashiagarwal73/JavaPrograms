# JavaPrograms
Practice Java Problems

## Problem 1:
Given two array A and B of length n find the number of indexes "k" where Sum(A[0...k-1])=Sum(A[k...n])=Sum(B[0...k-1])=Sum(B[k...n])

#### Example 
<pre>
      A={4,-1,0,3} 
      B={-2,5,0,3}
      
      At K=1:
      Sum(A[0...k-1])=4
      Sum(A[k...n])=2
      Sum(B[0...k-1])=-2
      Sum(B[k...n])=8
      
      At K=2:
      Sum(A[0...k-1])=3
      Sum(A[k...n])=3
      Sum(B[0...k-1])=3
      Sum(B[k...n])=3
      
      At K=3:
      Sum(A[0...k-1])=3
      Sum(A[k...n])=3
      Sum(B[0...k-1])=3
      Sum(B[k...n])=3
      
      Total possible values of k=2
      Answer=2
</pre>
