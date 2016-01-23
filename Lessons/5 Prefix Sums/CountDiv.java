/*

    ## Problem Statement :
    
    

Write a function:

    class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

    { i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Assume that:

        A and B are integers within the range [0..2,000,000,000];
        K is an integer within the range [1..2,000,000,000];
        A ≤ B.

Complexity:

        expected worst-case time complexity is O(1);
        expected worst-case space complexity is O(1).



*/

/*
    Correctness : 100% 
    Performance : 75%
    
     The following issues have been detected: wrong answers.

For the input [101, 123456789, 10000] the solution returned a wrong answer (got 12346 expected 12345). 

*/
class Solution{

    public int solution(int A, int B, int K) 
    {
        if (A==B)
        {
            if (A%K==0)
                return 1;
            else
                return 0;
        }
        else
        {
            int divisibles = (B-A)/K;
            if (A<K || B%K==0 || A%K==0)
                divisibles++;
                
            return divisibles;
        }   
    }
}
