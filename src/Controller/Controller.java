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

    TeamController teamController = new TeamController();


    /*
    ----------------------- Constructor -------------------------
     */
    
    
    
    /*
    ------------------------ Properties -------------------------
     */
    
    
    
    /*
    ---------------------- Public Methods -----------------------
     */

    public void setTeamCaptain (int memberID, int teamID) {

        teamController.setCaptain(memberID,teamID);

    }
    
    /*
    ---------------------- Support Methods ----------------------
     */


}
