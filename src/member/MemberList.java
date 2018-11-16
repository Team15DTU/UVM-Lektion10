package member;

import java.util.ArrayList;

public class MemberList {

    // -------------- Field --------------

    ArrayList<Member> memberList;

    // -------------- Constructor ----------

    public MemberList () {

        memberList = new ArrayList();

    }

    // ----------------- Methods -----------------


    public void addMemberToList (Member member) {
        memberList.add(member);
    }

    /*

    public void addMemberToList(String name, String mail, int memberNo) {

        memberList.add(new Member(name, mail, memberNo));

    }

    public void addMemberToList(String name, String mail, int memberNo, String firmCVR) {

        memberList.add(new Member(name, mail, memberNo, firmCVR));

    } */

    // ------------------------ Properties -------------------------

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

}
