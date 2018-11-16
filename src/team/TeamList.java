package team;

import java.util.ArrayList;

/**
 * @auther Rasmus Sander Larsen
 * @date 13-11-2018
 */
public class TeamList {

    /*
    -------------------------- Fields --------------------------
     */
    
    ArrayList<Team> teamlist;
    
    /*
    ----------------------- Constructor -------------------------
     */
    
    public TeamList () {

        teamlist = new ArrayList<>();

    }
    
    /*
    ------------------------ Properties -------------------------
     */

    public ArrayList<Team> getTeamlist() {
        return teamlist;
    }


    
    /*
    ---------------------- Public Methods -----------------------
     */

    void addTeam(Team team) {

        teamlist.add(team);

    }
    
    /*
    ---------------------- Support Methods ----------------------
     */


}
