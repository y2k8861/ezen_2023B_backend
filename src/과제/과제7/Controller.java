package 과제.과제7;

public class Controller {
    private Controller(){}
    private static Controller controller = new Controller();
    public static Controller getInstance(){return controller;}
    public boolean signUp(MemberDto memberDto){
        System.out.println("[2]Controller.signUp");
        boolean result = MemberDao.getInstance().signUp(memberDto);
        System.out.println("[4]result = " + result);
        return result; // 가입성공
    }

    public boolean login(MemberDto memberDto){
        System.out.println("[2]Controller.login");
        boolean result = MemberDao.getInstance().login(memberDto);
        System.out.println("[4]result = " + result);
        return result;
    }

    public String findId(MemberDto memberDto){
        System.out.println("[2]Controller.findId");
        String result = MemberDao.getInstance().findId(memberDto);
        System.out.println("[4]result = " + result);
        return result;
    }

    public String findPw(MemberDto memberDto){
        System.out.println("[2]Controller.findPw");
        String result = MemberDao.getInstance().findPw(memberDto);
        System.out.println("[4]result = " + result);
        return result;
    }

    public boolean idTest(String id){
        System.out.println("[2]Controller.idTest");
        boolean result = MemberDao.getInstance().idTest(id);
        System.out.println("[4]result = " + result);
        return result;
    }
}
