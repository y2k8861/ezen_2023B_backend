package day22;

public class HomeAgency implements Rentalbe<Home>{
    @Override
    public Home rent() {
        return new Home();
    }
}
