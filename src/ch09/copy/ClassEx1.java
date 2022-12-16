package ch09.copy;

class Card {
    String kind;
    int number;
    Card(){ this("SPADE",1); }
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
    @Override
    public String toString() {
        return "kind : "+kind+", number : "+number;
    }
}
public class ClassEx1 {
    public static void main(String[] args) {
        Card c1 = new Card("HEART",3);
//        Card c2 = Card.class.newInstance();
//        Class cObj = c.getClass();
//        System.out.println(c1);	// kind : HEART, number : 3
//        System.out.println(c2); // kind : SPADE, number : 1
//        System.out.println(cObj.getName()); // Card
//        System.out.println(cObj.toGenericString()); // final class Card
//        System.out.println(cObj.toString()); // class Card
    }
}
