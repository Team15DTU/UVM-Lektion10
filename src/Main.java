
import controller.Controller;

/**
 * @author Alfred Röttger Rydahl
 * @date 13-11-2018
 */
public class Main {

    public static void main(String[] args) {
      
        Controller controller = new Controller();

        for (int i = 0; i < 10000; i ++) {
            int teamNumber = 100 + (i % 100);
            String teamNumberStr= Integer.toString(teamNumber);
            controller.createTeam("Team15" , teamNumberStr);
        }

        int totalNoOfTeams = controller.totalNoOfTeams();

        System.out.println("Total number of teams: " + totalNoOfTeams);

        int teamsByFirm = controller.noOfTeamsByFirm("100");

        System.out.println("Total number of teams by firm (100): " + teamsByFirm);

    }

}
