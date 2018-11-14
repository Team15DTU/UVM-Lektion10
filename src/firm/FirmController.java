package firm;

import java.util.ArrayList;

/**
 * @author Alfred Röttger Rydahl
 * @date 13-11-2018
 */
public class FirmController {

    /*
    ---------------------------------- Fields ----------------------------------
     */
    private FirmList firmList;

    /*
    ------------------------------ Constructors --------------------------------
     */
    public FirmController () {
        firmList = new FirmList();
    }

    /*
    ------------------------------ Properties ----------------------------------
     */

    /*
    ---------------------------- Public Methods --------------------------------
     */

    /**
     * This method return an ArrayList<Integer> with the IDs of
     * all the teams associated to the firm with the corresponding
     * CVR
     * @param cvr The CVR of the firm as a String
     * @return Return an ArrayList<Integer> of Team IDs
     */
    public ArrayList<Integer> getTeamIDs (String cvr) {

        // Iterate through firmList to find the right team
        for ( Firm f : firmList.getFirmList() ) {

            // Check if it's the correct cvr
            if ( f.getCvr().equals(cvr) ) {
                // Return the list of team IDs
                return f.getTeams();
            }
        }

        // Will only return this if firms cvr wasn't found
        return new ArrayList<>();
    }

    /**
     * This method creates a new Firm and adds it to the
     * firmList
     * @param cvr The CVR of the firm as a String
     * @param name The name of the firm as a String
     */
    public void createFirm (String cvr, String name) {

        // Create the firm
        Firm firm = new Firm(cvr, name);

        // Add the firm to the firmList
        firmList.addFirm(firm);
    }

    /**
     * This method is used to get the total amount of firm
     * @return total amount of firm as an int
     */
    public int getNoOfFirms() {
        // Return the amount of teams in the firmList
        return firmList.getFirmList().size();
    }

    /*
    ----------------------------- Support Methods ------------------------------
     */
}
