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
## Problem 2:
If a string is Encoded as follows-->
<pre>
'a'-->1
'b'-->2
 .
 .
 .
 .
'z'-->26
</pre>
Find the number of ways It can be decoded.
For strings starting 0 should return 0
#### Example 
<pre>
      Encoded string -->'12'
      Number of ways to decode ==> 2 (as follows)
      '12'-->'ab'
      '12'-->'l'
</pre>