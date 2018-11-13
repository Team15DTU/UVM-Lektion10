package team;

/**
 * @auther Rasmus Sander Larsen
 * @date 13-11-2018
 */
public class Team {

    /*
    -------------------------- Fields --------------------------
     */

    private String name;
    private int teamID;
    private int capID;
    private String firmID;
    private static int teamCounter = 1;


    /*
    ----------------------- Constructor -------------------------
     */

    public Team (String name, int capID, String firmID) {

        this.name=name;
        teamID=teamCounter;
        this.capID=capID;
        this.firmID=firmID;

        teamCounter++;
    }

    /*
    ------------------------ Properties -------------------------
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public int getCapID() {
        return capID;
    }

    public void setCapID(int capID) {
        this.capID = capID;
    }

    public String getFirmID() {
        return firmID;
    }

    public void setFirmID(String firmID) {
        this.firmID = firmID;
    }

/*
    ---------------------- Public Methods -----------------------
     */



    /*
    ---------------------- Support Methods ----------------------
     */




}
