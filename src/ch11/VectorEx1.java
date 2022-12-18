package ch11;
import java.util.*;
public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5); //용량 capacity이 5인 Vector를 생성한다.
        v.add("1");
        v.add("2");
        v.add("3");

        print(v); //1,2,3

        v.trimToSize(); // 빈 공간을 없앤다. (용량과 크기가 같아진다. )
        System.out.println("=== After trimToSize() ===");
        print(v); // size : 3, capacity : 3

        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity(6) ====");
        print(v); // size : 3, capacity : 6

        v.setSize(7);
        System.out.println("==== After setSize(7)===");
        print(v); // size : 7, capacity : 12

        v.clear();
        System.out.println("====After clear ====");
        print(v); // size : 0, capacity : 6

    }
    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size: " + v.size());
        System.out.println("capacity :" + v.capacity());

    }
}
