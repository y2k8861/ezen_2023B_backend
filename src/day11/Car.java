package day11;

public class Car {  // class S

    // 멤버
    // 1. (public,private,default)(정적/인스턴스,final)필드
    private int speed;      // private 인스턴스 필드
    private boolean stop;   // private 인스턴스 필드

    // 2. (public,private,default)생성자

    // 3. (public,private,default)(정적/인스턴스,final)메소드
        // 1. 외부로부터 필드값을 반환해주는 메소드
    public int getSpeed(){return this.speed;}

        // 2. 외부로부터 매개값을 대입해주는 메소드
    public void setSpeed(int speed){
        // 매개변수의 유효성 검사를 통한 필드 값 변경
        if(speed < 0){  // 만약에 매개변수 값이 0보다 작으면
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

        // 3. 외부로부터 필드값을 반환해주는 메소드
    public boolean isStop(){return this.stop;};

    // 4. 외부로부터 필드값을 반환해주는 메소드
    public void setStop(boolean stop){
        this.stop = stop;
        if(stop == true) this.speed = 0;
    }

}   // class E
