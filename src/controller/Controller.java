package controller;

import firm.FirmController;
import member.MemberController;
import team.TeamController;

/**
 * @author Rasmus Sander Larsen
 * @date 15-11-2018
 */

public class Controller {

    /*
    -------------------------- Fields --------------------------
     */

    TeamController teamController;
    MemberController memberController;
    FirmController firmController;


    /*
    ----------------------- Constructor -------------------------
     */

    public Controller () {

        teamController = new TeamController();
        memberController = new MemberController();
        firmController = new FirmController();

    }

    /*
    ------------------------ Properties -------------------------
     */
    
    
    
    /*
    ---------------------- Public Methods -----------------------
     */

    public  void createMember (String name, String mail) {
        memberController.createMember(name,mail);
    }

    public void createMember (String name, String mail, String firmCVR) { memberController.createMember(name, mail, firmCVR); }

    public void createFirm (String firmCVR, String firmName) {
        firmController.createFirm(firmCVR, firmName);
    }

    public int totalNoOfTeams () { return teamController.getNoOfTeams(); }

    public void membersInTeam (int teamID) { teamController.membersInTeam(teamID); }

    public void setTeamCaptain (String mail, int teamID) { teamController.setCaptain(mail,teamID); }

    public void addMemberToTeam (String mail, int teamID) { teamController.addMemberToTeam(mail,teamID); }

    public int noOfTeamsByFirm (String firmCVR) { return teamController.teamsByFirm(firmCVR); }

    public void createTeam(String teamName, String firmCVR) { teamController.addTeam(teamName,firmCVR); }

    public int noOfFirms () { return firmController.getNoOfFirms(); }
    /*
    ---------------------- Support Methods ----------------------
     */


}
