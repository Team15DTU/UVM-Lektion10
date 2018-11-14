package firm;

import java.util.ArrayList;

/**
 * @author Alfred Röttger Rydahl
 * @date 13-11-2018
 */
public class Firm {

    /*
    ---------------------------------- Fields ----------------------------------
     */
    private String name, cvr;
    private ArrayList<Integer> teams;

    /*
    ------------------------------- Constructors -------------------------------
     */

    /**
     * Primary Constructor
     * @param cvr The CVR associated with the firm as a String
     * @param name The name of the firm as a String
     */
    Firm (String cvr, String name) {
        // Initialize variables
        this.name = name;
        this.cvr = cvr;
        teams = new ArrayList<>();
    }

    /*
    ------------------------------ Properties ----------------------------------
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public ArrayList<Integer> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Integer> teams) {
        this.teams = teams;
    }

    /*
    ---------------------------- Public Methods --------------------------------
     */

    /**
     * This methods adds a teams ID to the list of associated teams
     * @param teamID The Team ID as an int
     */
    public void addTeam (int teamID) {

        // Add the teamID to the teams List
        teams.add(teamID);
    }

    /*
    ----------------------------- Support Methods ------------------------------
     */
}
