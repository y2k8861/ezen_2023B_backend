package day22;

public class Person { } // 사람 클래스

class Worker extends Person{}   // 사람클래스로부터 상속받은 직장인 클래스

class Student extends Person{}  // 사람클래스로부터 상속받은 학생 클래스
class HeightStudent extends Student{}   // 학생클래스로부터 상속받은 고등학생클래스
class MiddleStudent extends Student{}   // 학생클래스로부터 상속받은 중학생클래스
/*
    1계층                 Person

    2계층    Worker                   Student

    3계층                 heightStudent       MiddelStudent

*/