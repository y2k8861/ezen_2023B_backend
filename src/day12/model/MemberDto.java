package day12.model;

// DTO : 데이터 이동 객체
    // - 복잡한 로직을 하는 곳이 아니라.  단순 데이터 이동 우
    // 1. 저장할 필드 선정 , 권장 private
    // 2. 생성자 ( 개발자 용도에 따라 선언), 권장 : 기본생성자 , 풀생성자
    // 3. 메소드 (형변환, 필드) , 권장 : getter/setter , toString
public class MemberDto {
    // 1. 필드
    private int no;         // 회원번호
    private String id;
    private String pw;
    private String name;
    private String phone;

    public MemberDto(){} //기본생성자
    // 풀(모든 필드의 매개변수가 존재하는) 생성자
    public MemberDto(int no, String id, String pw, String name, String phone) {
        this.no = no;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
    }

    // 3. 메소드
        // 1. setter, getter (필드가 private 이면 필수)
        // 2. toString() : 객체 필드 정보 확인차 주로 사용 목저(객체 호출시 주소값 대신 호출)

    @Override
    public String toString() {
        return "MemberDto{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
