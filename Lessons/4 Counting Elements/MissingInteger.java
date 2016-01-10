/*

    ## Problem Statement :


Write a function:

    class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

For example, given:

  A[0] = 1
  A[1] = 3
  A[2] = 6
  A[3] = 4
  A[4] = 1
  A[5] = 2

the function should return 5.

Assume that:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

*/

/*
    Correctness : % 
    Performance : %
*/
class <Problem>{

    public static <ReturnType> solution(<Parameters>)
    {
    
    }
    
    // Possible return values : 1->N
// If any no in series 1->N is missing then it will return that no.. else we just have to return N+1

class Solution {
    
    public int solution(int[] A) {
        
        final int N = A.length;
        
        int cA[] = new int[N+1];
        
        for (int i=0;i<N;i++)
            if (A[i]<=N && A[i]>=0)
                cA[A[i]] = 1;
        
        for (int i=1;i<=N;i++)
            if (cA[i]==0)
                return i;
                
        return N+1;
    }
}

}
