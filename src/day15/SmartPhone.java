package day15;

public class SmartPhone extends Phone {
    SmartPhone(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}

/*
    클래스 : 객체를 만들기 위한 설계도

    클래스             vs              추상 클래스
    new가능                            new불가능
    객체생성 O                          객체생성 X
*/
