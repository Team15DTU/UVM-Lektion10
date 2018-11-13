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

    public TeamController () {
        teamList = new TeamList();
    }
    
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

    public void addTeam (String teamName, String CVR) {

        Team team = new Team(teamName,CVR);

        teamList.addTeam(team);

    }

    public void addTeam (String teamName, int captainMemberID, String CVR) {

        Team team = new Team(teamName,captainMemberID,CVR);

        teamList.addTeam(team);

    }

    public void setCaptain (int memberID, int teamID) {

        for( Team t: teamList.getTeamlist()) {


            if (t.getTeamID() == teamID) {
                t.setCapID(memberID);
                break;
            }
        }

    }

    public void addMemberToTeam (int memberID, int teamID) {
        for (Team t: teamList.getTeamlist()) {

            if (t.ge)
        }
    }
    
    /*
    ---------------------- Support Methods ----------------------
     */


}
