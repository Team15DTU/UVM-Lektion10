package member;

public class MemberController {


    /*
    ----------- Construcktor -----------
    */
    private int noOfMembers = 0;
    Member member = new Member();
    MemberList memberList = new MemberList();



    /*
    ----------- Methods -----------
    */
    public void createMember(String mail, String name) {

        member.setMail(mail);
        member.setName(name);
        member.setMemberNo(getNoOfMembers());
        memberList.addToList();

        setNoOfMembers(getNoOfMembers()+1);
    }


    public void addMemberToTeam(int teamID) {

        member.setTeamID(teamID);

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
