package day22;

public class Step5 {
    public static void main(String[] args) {
        // Applicant<T>
            // 왜 ㅆ ?? 응모자의 타입을 여러개 할려고

        // 1. 모든 사람이 신청가능
        Applicant<Person> applicant1 = new Applicant<>(new Person());

        Course.resisterCourse1(applicant1);
        Course.resisterCourse1(new Applicant<Worker>(new Worker()));
    }
}
