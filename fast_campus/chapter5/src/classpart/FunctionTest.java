package classpart;

public class FunctionTest {
    public static int addnum(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

    public static int calcsum(){
        int sum = 0;
        for (int i = 0; i <=100 ; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        int total = addnum(n1,n2);

        System.out.println(total);
        System.out.println(calcsum());
    }
}
