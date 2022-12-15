package ch06;
public class CardTest {
    public static void main(String[] args){
        Card card1 = new Card();
        Card card2 = new Card();

        card1.kind = "heart";
        card1.number = 9;

        card2.kind = "spade";
        card2.number = 5;

        Card.width = 80; //
        card1.width = 80; // 가능 하지만 권장 x
        Card.height = 150; //
        card2.height = 150; // 가능 하지만 권장 x
        // 모두 같은 저장공간을 참조, 항상 같은 값을 얻는다


    }
}
class Card {
    String kind;
    int number;
    // 클래스 변수( 공통 속성 )
    // 모든 인스턴스가 공통적으로 같은 값을 유지해야하므로
    static int width = 100; // 폭
    static int height = 250; // 높이
}