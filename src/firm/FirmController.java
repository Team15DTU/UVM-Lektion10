package firm;

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

        // Get the size of the firmList
        int total = firmList.getFirmList().size();

        // Return the amount of teams in the firmList
        return total;
    }

    /*
    ----------------------------- Support Methods ------------------------------
     */
}
