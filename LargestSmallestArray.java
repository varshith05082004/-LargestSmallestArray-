import java.util.Scanner;
public class LargestSmallestArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of elements in array:");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int largest=array[0];
        int smallest=array[0];
        for(int i=0;i<n;i++){
            if(array[i]>largest){
                largest=array[i];
            }
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println("largest:"+ largest);
        System.out.println("smallest:"+ smallest);
        sc.close();
    }
}
