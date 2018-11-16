package controller;

import firm.FirmController;
import member.MemberController;
import team.TeamController;

/**
 * @auther Rasmus Sander Larsen
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

    public int totalNoOfTeams () {

        int totalNoOfTeams=teamController.getNoOfTeams();

        return totalNoOfTeams;
    }

    public void setTeamCaptain (int memberID, int teamID) {

        teamController.setCaptain(memberID,teamID);

    }

    public int noOfTeamsByFirm (String firmCVR) {

        int result = teamController.teamsByFirm(firmCVR);

        return result;
    }

    public void createTeam(String teamName, String firmCVR) {

        teamController.addTeam(teamName,firmCVR);

    }
    /*
    ---------------------- Support Methods ----------------------
     */


}
