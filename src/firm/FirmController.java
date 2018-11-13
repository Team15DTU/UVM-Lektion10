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
     *
     * @return
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
