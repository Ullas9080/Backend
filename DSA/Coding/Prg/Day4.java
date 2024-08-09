
package Backend.DSA.Coding.Prg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Day4
 */
public class Day4 {

    public static void main(String[] args) {

        int n, pos, i, extend;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of array to be inserted");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter number of block u want to extend for new  array");
        extend = sc.nextInt();


        int b[] = new int[n + extend];
        
        System.out.println("Enter the Index to be change");
        pos = sc.nextInt();

        System.out.println("Enter the value to be change at " + pos + "Index");
        int value = sc.nextInt();
        for (i = 0; i < n + extend; i++) {

            if (i < pos) {
                b[i] = a[i];
            } else if (i == pos) {

                b[i] = value;
            } else {
                b[i] = a[i - 1];
            }
        }
        System.out.println("So the final output is");
       for(i=0;i<n+1;i++)
       {
        System.out.println(Arrays.deepToString(b[i]));
       }
    }
}