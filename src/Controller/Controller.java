package Controller;

import team.Team;
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


    /*
    ----------------------- Constructor -------------------------
     */

    public Controller () {

        teamController = new TeamController();

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
