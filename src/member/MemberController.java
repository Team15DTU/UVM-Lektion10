package member;

public class MemberController {

    /*
    ----------- Attributes -----------
    */
    private int noOfMembers = 0;
    Member member;
    MemberList memberList;

    /*
   --------------- Constructor -------------
     */

    public MemberController () {

        memberList = new MemberList();

    }

    /*
    ----------- Methods -----------
    */

    public void createMember(String name, String mail) {

        member = new Member(name, mail, getNoOfMembers());
        memberList.addMemberToList(name, mail, getNoOfMembers());

        setNoOfMembers(getNoOfMembers()+1);
    }

    public void createMember(String name, String mail, String firmCVR) {

        member = new Member(name, mail, getNoOfMembers(), firmCVR);
        memberList.addMemberToList(name, mail, getNoOfMembers(), firmCVR);

        setNoOfMembers(getNoOfMembers()+1);
    }

    /*
    ----------- Getter and setter -----------
     */
    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }


}
