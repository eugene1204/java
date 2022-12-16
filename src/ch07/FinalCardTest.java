package ch07;

public class FinalCardTest {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);
        Card c = new Card("HEART" ,10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
class Card{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;
    Card(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }
    Card(){
        this("HEART",1);
    }
    @Override
    public String toString() {
        return KIND+" "+NUMBER;
    }
}
