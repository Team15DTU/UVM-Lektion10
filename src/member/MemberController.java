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

    public String nameOnMember (String mail) {
        String name=null;

        for (Member m : memberList.getMemberList()) {

            if (m.getMail().equals(mail)) {
                name = m.getName();
            }
        }

        return name;
    }

    public int totalNoOfMembers () {
        int result;

        result=memberList.getMemberList().size();

        return result;

    }

    public void createMember(String name, String mail) {

        member = new Member(name,mail);

        memberList.addMemberToList(member);

    }

    public void createMember(String name, String mail, String firmCVR) {

        member = new Member (name, mail, firmCVR);

        memberList.addMemberToList(member);
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
