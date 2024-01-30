package day21;

import java.awt.*;

public class Step5 {
    public static void main(String[] args) {

        // 1. [우리가 만든]버튼 객체 생성
        Button button = new Button();

        // 2. [우리가 만든]버튼 추상메소드 정의
        button.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼을 클릭했습니다.");
            }
        });

        button.click();

        // -- 만일 익명구현체가 미 사용시.
            // 1. 구현클래스가 선언
        Button.ClickListener cl = new Click();
            // 2. 구현객체 만들어서 사용.
        button.setClickListener(cl);
        button.click();
    }
}
