package ch07;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }
}
interface I{
    public abstract void methodB();
}
class A{
    public void methodA(){
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());	// i로 Object의 메서드 호출
    }
}
class B implements I{
    public void methodB(){
        System.out.println("methodB in B class");
    }
    @Override
    public String toString() {
        return "class B";
    }
}
class InstanceManager {
    public static I getInstance(){
        return new B();	// 다른 인스턴스로 바꾸려면 여기만 변경
    }
}