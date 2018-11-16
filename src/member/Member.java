package member;

import java.util.ArrayList;

public class Member {

    /*
    ----------- Attributes -----------
    */

    private String name, mail;
    private ArrayList<Integer> adminTeams;
    private int teamID;
    private int memberNo = 100000;
    private String firmCVR;

    /*
    ----------- Construcktor -----------
    */

    public Member(String name, String mail) {

        this.name = name;
        this.mail = mail;
        adminTeams = new ArrayList<>();

        memberNo =+1;

    }

    public Member(String name, String mail, String firmCVR) {

        this.name = name;
        this.mail = mail;
        adminTeams = new ArrayList<>();
        this.firmCVR = firmCVR;

        memberNo =+1;

    }

    /*
    ----------- methods -----------
    */


    /*      KAN DET IKKE BARE SLETTES, SKAL VEL IKKE VÆRE HER?
    public void addAdmin(int teamID) {
        adminTeams.add(teamID);
    }

    public void addToTeam(int teamID) {
        this.teamID = teamID;
    }
    */

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
