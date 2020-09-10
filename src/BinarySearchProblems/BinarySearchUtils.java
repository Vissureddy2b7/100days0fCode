package BinarySearchProblems;

public class BinarySearchUtils {

    public static int mySqrt(int x) {
            if (x < 2) return x;
            long exp;
            int mid;
            int first = 2;
            int last = x/2;
            while(first<=last){
                mid = (int) Math.floor((first + last)/2);
                exp =(long) mid * mid;
                if(exp > x){
                    last = mid -1 ;
                } else if (exp < x) {
                    first = mid +1 ;
                } else{
                    return mid;
                }
            }
            return last;
     }

}



