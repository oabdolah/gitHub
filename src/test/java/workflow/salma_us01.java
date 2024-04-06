package workflow;

public class salma_us01 {

    public static void main(String[] args) {

        System.out.println("addNums(10,11) = " + addNums(10, 11));
        System.out.println("addNums(10,11) = " + addNums(10, 11,20));
    }


    public static int addNums(int a, int b){
        return a + b;
    }

    public static int addNums(int a, int b, int c){
        return a + b +c;
    }
}
