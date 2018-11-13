package member;

import java.util.ArrayList;

public class MemberList {


    ArrayList<Member> members = new ArrayList();

    public void addToList(String name, String mail, int memberNo) {

        members.add(new Member(name, mail, memberNo));

    }

    public Member fromList (int i) {
        Member member = members.get(i);
        return member;
    }




}
