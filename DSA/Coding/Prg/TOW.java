// package DSA;

// /**
//  * InnerTOW
//  */
// class InnerTOW {

//     public static void Honai(int disc,String a,String b,String c)
//     {
// if (disc==1) {
//  System.err.println("Transfer disc "+disc+" from "+a+" to "+c);
//  return;

// }

// Honai(disc-1, b, a, c);
// System.out.println("Transfer disc "+disc+" from "+a+" to "+b);

// Honai(disc-1, b, c, a);
//     }

// }

// public class TOW{
//     public static void main(String[] args) {

// int disc=3;
// InnerTOW.Honai(disc, "A", "B", "C");

//     }
// }

// package DSA;

// /**
//  * InnerTOW
//  */
// class InnerTOW {

//     public static void SingleChar(int n, String str) {
//         if (n == 0) {
//             System.out.println(str.charAt(n));
//             return;
//         }
//         System.out.print(str.charAt(n));
//         SingleChar(n - 1, str);

//     }

// }

// /**
//  * TOW
//  */
// public class TOW {

//     public static void main(String[] args) {
// InnerTOW.SingleChar(4-1, "ABCD");

//     }
// }

// package DSA;

// /**
//  * InnerTOW
//  */
// class InnerTOW {

//     public static void Count(int n, String str, int count) {
//         // int count=0;
//         if (n == 0) {
//             System.out.println(count);
//             return;
//         }

//         if (str.charAt(n-1) == 'd') {
//             count ++;

//         }
       
//         Count(n - 1, str, count);

//     }

// }

// /**
//  * TOW
//  */
// public class TOW {

//     public static void main(String[] args) {

//         String str = "anbdcnaajankada";

//         InnerTOW.Count(str.length(), str, 0);

//     }
// }


package Backend.DSA.Coding.Prg;

/**
 * InnerTOW
 */
 class InnerTOW {

    public static void Swap(int n,String str,int count,String newString)
    {

        if (n==str.length()) {
            for (int i = 0; i < count; i++) {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }

        if (str.charAt(n)=='x') {
            count++;

        }else{
            newString+=str.charAt(n);

        }
Swap(n+1, str, count, newString);
    }
     
}
/**
 * TOW
 */
public class TOW {

    public static void main(String[] args) {
String string="abxxcdxxefxx";
InnerTOW.Swap(0, string, 0, "");
    }
}
