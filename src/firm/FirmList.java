package firm;

import java.util.ArrayList;

/**
 * @author Alfred Röttger Rydahl
 * @date 13-11-2018
 */
public class FirmList {

    /*
    ---------------------------------- Fields ----------------------------------
     */
    ArrayList<Firm> firmList;

    /*
    ------------------------------ Constructors --------------------------------
     */

    /**
     * Primary Constructor
     */
    FirmList () { }

    /*
    ------------------------------ Properties ----------------------------------
     */

    /*
    ---------------------------- Public Methods --------------------------------
     */

    /**
     * Adding a new firm to the list of firms
     * @param firm The firm to add. Type = Firm
     */
    void addFirm (Firm firm) {
        // Add the firm to the end of firmList
        firmList.add(firm);
    }

    /*
    ----------------------------- Support Methods ------------------------------
     */
}
