import Controller.Controller;

/**
 * @author Alfred Röttger Rydahl
 * @date 13-11-2018
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.creatTeam("TEAM15", "123123");
        controller.creatTeam("TeamEasyOn", "321321");

        int totalNoOfTeams = controller.totalNoOfTeams();

        System.out.println("Total number of teams: " + totalNoOfTeams);

        int teamsByFirm = controller.noOfTeamsByFirm("123123");

        System.out.println("Total number of teams by firm (123123: " + teamsByFirm);
    }
}
