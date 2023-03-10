package ch06;
public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);
        // int result = FactorialTest.factorial(4)

        System.out.println(result);
    }

    static int factorial(int n) {
        int result = 0;

        if(n==1) {
            result = 1;
        } else {
            result = n * factorial(n-1);    // 다시 메서드 자신을 호출한다.
            // 4*factorial(3)
            // = 4*3*factorial(2)
            // = 4*3*2*factorial(1)
            // = 4*3*2*1
        }

        return result;
    }
}