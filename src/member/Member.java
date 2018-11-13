package member;

import java.util.ArrayList;

public class Member {

    /*
    ----------- Attributes -----------
    */


    private String name;
    private String mail;
    private ArrayList<teamID> adminTeams = new ArrayList();
    private int teamID;
    private int memberNo;

    /*
    ----------- Construcktor -----------
    */

    public Member(String name, String mail, ArrayList<teamID> adminTeams,int teamID,int memberNo) {

        this.name = name;
        this.mail = mail;
        this.adminTeams = adminTeams;
        this.teamID = teamID;
        this.memberNo = memberNo;

    }



    /*
    ----------- Getter and setter -----------
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList getAdminTeams() {
        return adminTeams;
    }

    public void setAdminTeams(ArrayList adminTeams) {
        this.adminTeams = adminTeams;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }
    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

}
