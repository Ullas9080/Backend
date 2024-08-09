package Backend.DSA.Coding.Prg;
import  java.util.*;
class QuickSort
{
    public static int Quick(int a[],int low,int high)
    {
        int pivot=a[high];
        int i= low - 1;
        
        for (int j = low; j < high ; j++) {
            
if (a[i]<=pivot) {
    i++;
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;    
}
}

int temp=a[i+1];
a[i+1]=a[high];
a[high]=temp;

return  i+1;

    }


public static  void qs(int a[],int low,int high){
if (low < high) {
    int pivot = Quick(a, low, high);
     qs(a, low, pivot-1);
     qs(a, pivot+1,high );

}

}



}

public class day9 {

    public static void main(String[] args) {
        
int arr[]={10,30,78,-1,80,50,1,70};
System.out.println("Before soting");
for (int i = 0; i < arr.length; i++) {
   System.out.print(arr[i]+"  ");
}

System.out.println("After sorting");

QuickSort.qs(arr,0,arr.length - 1);

    }
}
