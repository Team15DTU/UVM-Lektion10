package team;

/**
 * @author Rasmus Sander Larsen
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

    public int teamsByFirm (String CVR) {

        int teamsByFirmCounter=0;

        for (Team t : teamList.getTeamlist()) {
            if (t.getFirmID().equals(CVR)) {
                teamsByFirmCounter++;
            }
        }
        return teamsByFirmCounter;
    }

    public void addTeam (String teamName) {

        Team team = new Team(teamName);

        teamList.addTeam(team);

    }

    public void addTeam (String teamName, String CVR) {

        Team team = new Team(teamName,CVR);

        teamList.addTeam(team);

    }

    public void addTeam (String teamName, String captainMemberID, String CVR) {

        Team team = new Team(teamName,captainMemberID,CVR);

        teamList.addTeam(team);

    }

    public void setCaptain (String mail, int teamID) {

        for( Team t: teamList.getTeamlist()) {


            if (t.getTeamID() == teamID) {
                t.setCapID(mail);
                break;
            }
        }

    }

    public void membersInTeam (int teamID) {
        for (Team t: teamList.getTeamlist()) {

            if (t.getTeamID()== teamID) {
                System.out.println(t.getTeamMembers());
                break;
            }
        }
    }

    public void addMemberToTeam (String mail, int teamID) {
        for (Team t: teamList.getTeamlist()) {

            if (t.getTeamID() == (teamID)) {
                t.addMemberToTeam(mail);
            }
        }
    }

    public void isTeamValid (int teamID) {

        updateTeamValidation(teamID);

        for (Team t : teamList.getTeamlist()) {
            if (t.getTeamID() == teamID && t.isValid()) {
                if (t.isValid()) {
                    System.out.println("This team is valid");
                } else {
                    System.out.println("This team is not valid");
                }
            }
        }
    }
    
    /*
    ---------------------- Support Methods ----------------------
     */

    public void updateTeamValidation (int teamID) {

        for (Team t: teamList.getTeamlist()) {
            int numberOfTeammembers = t.getTeamMembers().size();
            if (t.getTeamID() == teamID) {
                if (numberOfTeammembers>=4 && numberOfTeammembers<=12) {
                    t.setValid(true);

                } else {
                    t.setValid(false);
                }
            }
        }
    }


}
