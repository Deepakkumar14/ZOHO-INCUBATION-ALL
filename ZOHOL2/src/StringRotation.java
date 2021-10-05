
import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1=input.nextLine();
        System.out.println("Enter String 2");
        String str2=input.nextLine();
        char[] array2=str2.toCharArray();
        boolean bool=rotation(str1,array2,str2);
        if(bool==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static  boolean rotation(String str1,char[] array2,String str2) {
        String str3 = "";
        for (int i = 0; i < str1.length(); i++) {
            char last = array2[str2.length() - 1];
            for (int j = str2.length() - 2; j >= 0; j--) {
                array2[j + 1] = array2[j];
            }
            array2[0] = last;
            for (int k = 0; k < array2.length; k++)
                str3 += array2[k];

            if (str1.equals(str3)) {
               return  true;
            }
            str3 = "";
        }
        return false;
    }
}
