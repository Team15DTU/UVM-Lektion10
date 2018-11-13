package firm;

/**
 * @author Alfred Röttger Rydahl
 * @date 13-11-2018
 */
public class Firm {

    /*
    ---------------------------------- Fields ----------------------------------
     */
    String name, cvr;

    /*
    ------------------------------- Constructors -------------------------------
     */

    /**
     * Primary Constructor
     * @param cvr The CVR associated with the firm as a String
     * @param name The name of the firm as a String
     */
    Firm (String cvr, String name) {
        this.name = name;
        this.cvr = cvr;
    }

    /*
    ------------------------------ Properties ----------------------------------
     */

    /*
    ---------------------------- Public Methods --------------------------------
     */

    /*
    ----------------------------- Support Methods ------------------------------
     */
}
