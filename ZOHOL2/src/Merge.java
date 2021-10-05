import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array1={1,5,10,20,40};
        int[] array2={6,7,20,80,100};
//        System.out.println("Enter array1 size");
//        int size1= input.nextInt();
//        System.out.println("Enter array elements");
//        int[] array1=new int[size1];
//        for(int i=0;i<size1;i++)
//            array1[i]=input.nextInt();
//
//        System.out.println("Enter array2 size");
//        int size2= input.nextInt();
//        System.out.println("Enter array2 elements");
//        int[] array2=new int[size2];
//        for(int i=0;i<size2;i++)
//            array2[i]=input.nextInt();

        int[] array3=new int[array1.length+ array2.length];

        for(int i=0;i< array1.length;i++){
            if(array1[i]>array2[0]){
                int temp=array1[i];
                array1[i]=array2[0];
                array2[0]=temp;
                int key=array2[0];
                int k;
                for(k=1;k<array2.length && array2[k]<key;k++){
                    array2[k-1]=array2[k];
                }
                array2[k-1]=key;
            }
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int k=0;
        for(int i=0;i<array1.length;i++){
            array3[k++]=array1[i];
            array3[k++]=array2[array2.length-i-1];
        }
        System.out.println(Arrays.toString(array3));
    }
}
