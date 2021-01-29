public class PrintDec_2 {
    public static void main(String[] arguments){
        printDecreasing(5);
    }
    public static void printDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
