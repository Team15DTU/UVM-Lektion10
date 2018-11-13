package team;

/**
 * @auther Rasmus Sander Larsen
 * @date 13-11-2018
 */
public class TeamController {

    /*
    -------------------------- Fields --------------------------
     */

    private TeamList teamList;
    
    /*
    ----------------------- Constructor -------------------------
     */
    
    
    
    /*
    ------------------------ Properties -------------------------
     */



    /*
    ---------------------- Public Methods -----------------------
     */

    public int getNoOfTeams () {

        // Gets size of TeamList.
        return teamList.getTeamlist().size();
    }

    public void addTeam (String teamName) {

        Team team = new Team(teamName);

        teamList.addTeam(team);

    }

    public void addTeam () {

    }
    
    /*
    ---------------------- Support Methods ----------------------
     */


}
