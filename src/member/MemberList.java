package member;

import java.util.ArrayList;

public class MemberList {

    // -------------- Field --------------
    ArrayList<Member> members;

    // -------------- Constructor ----------

    public MemberList () {

        members = new ArrayList();

    }

    // ----------------- Methods -----------------

    public void addToList(String name, String mail, int memberNo) {

        members.add(new Member(name, mail, memberNo));

    }


    public void addToList(String name, String mail, int memberNo, int firmCVR) {

        members.add(new Member(name, mail, memberNo, firmCVR));

    }


    public ArrayList getMembers() {
        return members;
    }

    public void setMembers(ArrayList members) {
        this.members = members;
    }




}
