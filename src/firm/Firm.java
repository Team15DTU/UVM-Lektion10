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
    String name, cvr;
    ArrayList<Team> teams;

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
        teams = new ArrayList<Team>();
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

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
    /*
    ---------------------------- Public Methods --------------------------------
     */

    /*
    ----------------------------- Support Methods ------------------------------
     */
}
