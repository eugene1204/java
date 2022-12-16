package ch08;

public class Exception13 {
    public static void main(String[] args) throws Exception{
        method1();
    }
    static void method1(){
        try{
            throw new Exception();
        } catch(Exception e){
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
