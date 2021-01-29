public class PrintArrayReverse_5 {
    public static void main(String[] arguments){
        int[] array = {1,2,3,4,21};
        printArrayInReverse(array, 0);
    }
    public static void printArrayInReverse(int[] array, int iterator){
        if(iterator == array.length){
            return;
        }
        printArrayInReverse(array, iterator+1);
        System.out.println(array[iterator]);
    }
}
