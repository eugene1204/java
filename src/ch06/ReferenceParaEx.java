package ch06;
class Data {int x;}

public class ReferenceParaEx {
    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x); //main() : x = 10

        change(d);

        System.out.println("Afater change(d)");
        System.out.println("main() : x = " + d.x); // main() : x = 1000

    }
    static void change( Data d ) {
        d.x = 1000;
        System.out.println("change() : x = "+d.x  ); // change() : x = 1000
    }
}
