package ch06;
class ReferenceParaEx2 {
    public static void main(String[] args) {

        int[] x = {10};
        System.out.println("main() : x = " + x[0]); //main() : x = 10

        change(x);
        System.out.println("Afater change(x)");
        System.out.println("main() : x = " + x[0]); // main() : x = 1000

    }
    static void change( int [] x ) {
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]); // change() : x = 1000
    }
}
