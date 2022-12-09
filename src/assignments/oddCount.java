package assignments;

public class oddCount{
    public static long loopBasedCount(long a, long b) {
        long i, count = 0, x = Math.max(a, b), y = Math.min(a, b), temp;
        if(x == y) { // if two numbers are equal return 0
            if( x % 2 == 0) return 0;
            else return 1;
        } // end if
        else {
            for(i = y; i <= x; i++) { //from min to max
                if(i < 0) { // if i is negative get a copy of it and make it positive
                    temp = i * -1;
                    if(temp % 2 == 1) // if the copy is odd
                        count++; // increment count by 1
                    else continue;
                }
                else { // if i is not negative
                    if(i % 2 == 1) // if i is odd
                        count++; // increment count by 1
                    else //else continue
                        continue;
                }// end else
            } // end for
        } // end else
        return count;
    }

    public static long mathBasedCount(long a, long b) {
        long x = Math.max(a, b), y = Math.min(a, b), count = (x - y) / 2;
        
        if (x % 2 != 0 || y % 2 != 0) // if one or more range limit is odd
            count++; // increment count by 1

        return count;
    }
    public static void main(String[] args) {
        int i;
        long time1 , time2, a[] = {20, 50, 1, -20, 583, 333, 0, -88, 9876543, -192}, b[] = {100, 25, 99, -50, -583, 333, 0, -88, -87654, -235}; 

        // test cases
        for(i = 0; i < a.length; i++){
            System.out.printf("Loop-based solution: The number of odds in range [%d, %d] = %d\n", Math.min(a[i], b[i]), Math.max(a[i], b[i]), loopBasedCount(a[i], b[i]));
            System.out.printf("Math-based solution: The number of odds in range [%d, %d] = %d\n\n", Math.min(a[i], b[i]), Math.max(a[i], b[i]), mathBasedCount(a[i], b[i]));
        }

        // comparing the running time of two functions using range [-999999999, 999999999]
        time1 = System.currentTimeMillis(); // get time before calculation
        loopBasedCount(-999999999, 999999999);
        time2 = System.currentTimeMillis(); // get time after calculation
        System.out.printf("Running time of loop-based solution: the number of odds in range [-999999999, 999999999] = %d miliseconds\n", time2 - time1);
        
        time1 = System.currentTimeMillis(); // get time before calculation
        mathBasedCount(-999999999, 999999999);
        time2 = System.currentTimeMillis(); // get time after calculation
        System.out.printf("Running time of math-based solution: the number of odds in range [-999999999, 999999999] = %d miliseconds\n", time2 - time1);
    } // end of main
}