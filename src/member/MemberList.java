package member;

import java.util.ArrayList;

public class MemberList {


    ArrayList members = new ArrayList();

    public void addToList(String name, String mail, int memberNo) {

        members.add(new Member(name, mail, memberNo));

    }


    public ArrayList getMembers() {
        return members;
    }

    public void setMembers(ArrayList members) {
        this.members = members;
    }




}
