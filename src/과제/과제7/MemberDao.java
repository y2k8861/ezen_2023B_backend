package 과제.과제7;

import java.util.ArrayList;

public class MemberDao {
    ArrayList<MemberDto> memberDtos = new ArrayList<MemberDto>();
    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){return memberDao;}

    public boolean signUp(MemberDto memberDto){
        System.out.println("[3]MemberDao.signUp");
        memberDtos.add(memberDto);
        return true; // 가입 성공
    }

    public boolean login(MemberDto memberDto){
        System.out.println("[3]MemberDao.login");
        for(MemberDto i : memberDtos){
            if(i.getId().equals(memberDto.getId()) && i.getPw().equals(memberDto.getPw())){
                return true;
            }
        }
        return false;
    }

    public String findId(MemberDto memberDto){
        System.out.println("[3]MemberDao.findId");
        for(MemberDto i : memberDtos){
            if(i.getName().equals(memberDto.getName()) && i.getPhone().equals(memberDto.getPhone())){
                return i.getId();
            }
        }
        return null;
    }

    public String findPw(MemberDto memberDto){
        System.out.println("[3]MemberDao.findPw");
        for(MemberDto i : memberDtos){
            if(i.getId().equals(memberDto.getId()) && i.getName().equals(memberDto.getName())){
                return i.getPw();
            }
        }
        return null;
    }

    public boolean idTest(String id){
        System.out.println("[3]MemberDao.idTest");
        for(MemberDto i : memberDtos){
            if(i.getId().equals(id)){
                return false;
            }
        }
        return true;
    }
}
