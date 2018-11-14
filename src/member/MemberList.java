package member;

import java.util.ArrayList;

public class MemberList {


    ArrayList members = new ArrayList();

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
