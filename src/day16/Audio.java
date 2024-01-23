package day16;

import java.rmi.Remote;

public class Audio implements RemoteControl {
    private int valume;
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setValume(int valume) {
        if(valume > RemoteControl.MAX_VALUME){
            this.valume = RemoteControl.MAX_VALUME;
        } else if(valume < RemoteControl.MIN_VALUME){
            this.valume = RemoteControl.MIN_VALUME;
        } else {
            this.valume = valume;
        }
        System.out.println("현재 TV 볼륨 : " + this.valume);
    }
}

