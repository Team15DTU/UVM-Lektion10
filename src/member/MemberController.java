package member;

public class MemberController {

    /*
    ----------- Attributes -----------
    */
    private int noOfMembers = 0;
    Member member;
    private MemberList memberList;

    /*
   --------------- Constructor -------------
     */

    public MemberController () {

        memberList = new MemberList();

    }

    /*
    ----------- Methods -----------
    */

    public int totalNoOfMembers () {
        int result;

        result=memberList.getMemberList().size();

        return result;

    }

    public void addMember (String name, String mail, int memberNo) {

        Member member;
        member = new Member(name,mail,memberNo);

    }

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

    public MemberList getMemberList() {
        return memberList;
    }

    public void setMemberList(MemberList memberList) {
        this.memberList = memberList;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }


}
