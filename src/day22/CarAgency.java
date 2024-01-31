package day22;

public class CarAgency implements Rentalbe<Car2>{
    @Override
    public Car2 rent() {
        return new Car2();
    }
}
