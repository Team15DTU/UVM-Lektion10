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
    private int capID;
    private String firmID;
    private ArrayList<Integer> teamMembers;
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

    public Team (String name, int capID, String firmID) {

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

    public ArrayList<Integer> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(ArrayList<Integer> teamMembers) {
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

    public void addMemberToTeam (int memberID) {

        teamMembers.add(memberID);
    }

    /*
    ---------------------- Support Methods ----------------------
     */



}
