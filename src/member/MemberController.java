package member;

public class MemberController {


    //construcktor
    private int noOfMembers = 0;
    Member member = new Member();
    MemberList memberList = new MemberList();


    //methods
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


    //getter and setter
    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }


}
