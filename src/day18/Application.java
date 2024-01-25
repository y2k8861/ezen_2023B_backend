package day18;

import day18.view.MainView;

public class Application {  // class S
    public static void main(String[] args) {    // main S

        // 1. 인스턴스 메소드
        // MainView mainView = new MainView();
        // mainView.run();

        // 2. 인스턴스 메소드
        // new MainView().run();

        // 3. 인스턴스 메소드(싱글톤)
        MainView.getInstance().run();

        // 4. 정적 메소드
        // MainView.run();

    }   // main E
}   // class E

/*
    -- 다른 클래스내 메소드를 호출하는 방법
    -- 외부 클래스에서 메소드를 호출하는 방범
*/