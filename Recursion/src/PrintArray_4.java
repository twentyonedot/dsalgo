public class PrintArray_4 {
    public static void main(String[] arguments){
        int[] array = {1,2,3,4,21};
        printArray(array, 0);
    }
    public static void printArray(int[] array, int iterator){
        if(iterator == array.length){
            return;
        }
        System.out.println(array[iterator]);
        printArray(array, iterator+1);
    }
}
