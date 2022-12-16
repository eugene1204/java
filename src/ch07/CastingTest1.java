package ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        fe.water();
        car = fe;	// 형변환 생략
//      car.water();
        fe2 = (FireEngine) car;
        fe2.water();
    }
}
class Car {
    String color;
    void drive(){
        System.out.println("drive : Brrrrr~");
    }
    void stop(){
        System.out.println("stop");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("water");
    }
}
class Ambulance extends Car{
    void water(){
        System.out.println("Ambulance");
    }
}
