/*

    ## Problem Statement :

*/

/*
    Correctness : 100% 
    Performance : 100%
*/
class <Problem>{

        public int solution(int X, int[] A) {
        
        final int N = A.length;
        
        int cA[] = new int[X+1];
        int count = 0;
        
        for (int i=0;i<N;i++)
        {
            if (cA[A[i]]==0)
            {
                cA[A[i]]=1;
                count++;
            }
            
            if (count==X)
                return i;
        }
        
        return -1;
            
    }

}
