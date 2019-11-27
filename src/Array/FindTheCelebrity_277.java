package Array;


public class FindTheCelebrity_277 {
    public static boolean know(int a , int n){
        return true;
    }
    public int findCelebrity(int n){
        int cel = 0;
        for (int i = 1; i < n; i++){
            if (know(cel, i))
                cel = i;
        }
        for (int i = 0; i < n; i++){
            if ( i != cel && (know(cel,i) || !know(i,cel) ))
                return -1;
        }
        return cel;
    }
}
