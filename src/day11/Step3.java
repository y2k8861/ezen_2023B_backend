package day11;

public class Step3 {    // class S
    public static void main(String[] args) {
        
        // 외부로부터 생성자를 private 했기 때문에 사용 불가능
        // Singleton singleton = new Singleton();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        
        if(obj1 == obj2){
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}   // class E
