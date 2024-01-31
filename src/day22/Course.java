package day22;

public class Course {
    // 1. 모든 사람이면 등록가능  ?
    public static void resisterCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
    }

    // 2. 학생만 등록 가능         : ? extends student : 본인타입 포합 하위타입 가능.
    public static void resisterCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
    }

    // 3. 직장인 및 등록가능       : ? super worker
    public static void resisterCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
    }
}
