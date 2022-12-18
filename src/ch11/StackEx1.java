package ch11;
import java.util.*;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();

        goBack();
        System.out.println("==뒤로가기 버튼을 누른 후 ==");
        printStatus();

        goBack();
        System.out.println("=='뒤로' 버튼을 누른 후==");
        printStatus();

        goForward();
        System.out.println("=='앞으로' 버튼을 누른 후==");
        printStatus(); // 앞으로 버튼을 눌러도 back stack에 네이버 저장

        goURL("codechobo.com");
        System.out.println("==새로운 주소로 이동 후==");
        printStatus(); // 새로운 주소로가면 forward 초기화

    }

    // 1) 현재 상태를 프린트 해주는 메서드
    public static void printStatus() {
        System.out.println("back:" + back);
        System.out.println("forward" + forward);
        System.out.println("현재화면은 '" + back.peek()+"'입니다.");
        System.out.println();
    }

    // 2) back push()
    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }

    // 3) goFoward()
    public static void goForward() {
        if(!forward.empty())
            back.push(forward.pop());
    }

    // 4) goBack()
    public static void goBack() {
        if(!back.empty())
            forward.push(back.pop());
    }
}

