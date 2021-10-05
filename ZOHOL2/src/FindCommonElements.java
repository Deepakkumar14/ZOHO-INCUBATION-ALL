public class FindCommonElements {
    public static void main(String[] args) {
        int[] array1={1,5,10,20,40,80};
        int[] array2={6,7,20,80,100};
        int[] array3={3,4,15,20,30,70,80,120};
        for(int i=0;i<array2.length;i++){
           boolean bool= arrayOne(array1,array2[i],array3);
           if(bool)
               System.out.println(array2[i]);
        }
    }
    public static boolean arrayOne(int[] array1, int element,int[] array3){
        boolean bool=false;
        for(int i=0;i< array1.length;i++){
            if(array1[i]==element) {
                bool=arrayTwo(array3,element);
                break;
            }
        }
        return bool;
    }
    public static boolean arrayTwo(int[] array3,int element){
        for(int i=0;i< array3.length;i++){
            if(array3[i]==element) {
                return true;
            }
        }
        return false;
    }
}
