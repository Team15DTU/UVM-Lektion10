package team;

import java.util.ArrayList;

/**
 * @auther Rasmus Sander Larsen
 * @date 13-11-2018
 */
public class Team {

    /*
    -------------------------- Fields --------------------------
     */

    private String name;
    private int teamID = 10000;
    private String capID;
    private String firmID;
    private ArrayList<String> teamMembers;
    private boolean isValid = false;


    /*
    ----------------------- Constructor -------------------------
     */

    public Team (String name) {

        this.name=name;
        teamMembers = new ArrayList<>();

        teamID++;
    }

    public Team(String name, String firmID) {

        this.name=name;
        this.firmID=firmID;
        teamMembers = new ArrayList<>();

        teamID++;
    }

    public Team (String name, String capID, String firmID) {

        this.name=name;
        this.capID=capID;
        this.firmID=firmID;
        teamMembers = new ArrayList<>();

        teamID++;
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

    public String getCapID() {
        return capID;
    }

    public void setCapID(String capID) {
        this.capID = capID;
    }

    public String getFirmID() {
        return firmID;
    }

    public void setFirmID(String firmID) {
        this.firmID = firmID;
    }

    public ArrayList<String> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(ArrayList<String> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }


    /*
    ---------------------- Public Methods -----------------------
     */

    public void addMemberToTeam (String mail) {

        teamMembers.add(mail);
    }

    /*
    ---------------------- Support Methods ----------------------
     */

}
