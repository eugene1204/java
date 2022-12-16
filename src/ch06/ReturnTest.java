package ch06;
public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3,5);
        System.out.println(result);

        int [] result2 = {0};   // 결과 값을 저장할 배열을 생성하고 0으로 초기화한다.
        r.add(3,5,result2);     // add 메서드의 매개변수로 참조변수인 배열을 전달한다.
        System.out.println(result2[0]);
    }
    int add(int a, int b) {
        return a+b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a+b;    // 매개변수로 넘겨받은 배열에 연산결과를 저장하므로 반환값이 없어도 상관없다.
    }
}