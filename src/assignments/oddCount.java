package assignments;

//import java.math.*;

public class oddCount{
    public static int loopBasedCount(int a, int b) {
        int i, count = 0, x = Math.max(a, b), y = Math.min(a, b);
        if(x == y) {
            if( x % 2 == 0) return 0;
            else return 1;
        }
        else{
            for(i = y; i < x; i++) {
                if(i % 2 == 1) count++;
                else continue;
                return count;
            }
        }
        return 0;
    }

    public static int mathBasedCount(int a, int b) {
        int x = Math.max(a, b), y = Math.min(a, b), count = (x - y) / 2;
 
        if (x % 2 != 0 || y % 2 != 0)
            count++;

        return count;
    }
    public static void main(String[] args) {
        int i;
        int a[] = {20, 50, 1, -20, 583, 333, 0, -88, 9876543, -192};
        int b[] = {100, 25, 99, -50, -583, 333, 0, -88, -87654, -235};

        for(i = 0; i < 10; i++){
            System.out.printf("Loop-based solution: The number of odds in range [%d, %d] = %d", Math.max(a[i], b[i]), Math.min(a[i], b[i]), loopBasedCount(a[i], b[i]));
            System.out.printf("Math-based solution: The number of odds in range [%d, %d] = %d", Math.max(a[i], b[i]), Math.min(a[i], b[i]), mathBasedCount(a[i], b[i]));
        }
    }
}