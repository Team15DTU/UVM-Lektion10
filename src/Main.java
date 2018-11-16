
import controller.Controller;
import view.Viewer;

/**
 * @author Alfred Röttger Rydahl
 * @date 13-11-2018
 */
public class Main {

    public static void main(String[] args) {
      
        Controller controller = new Controller();
        Viewer viewer = new Viewer();

        for (int i = 0; i < 10000; i ++) {
            int teamNumber = 100 + (i % 100);
            String teamNumberStr= Integer.toString(teamNumber);
            controller.createTeam("Team15" , teamNumberStr);
        }

        int totalNoOfTeams = controller.totalNoOfTeams();

        System.out.println("Total number of teams: " + totalNoOfTeams);

        int teamsByFirm = controller.noOfTeamsByFirm("100");

        System.out.println("Total number of teams by firm (100): " + teamsByFirm);

        controller.createMember("Alfred","Alfred@dtu.dk","200"); // This member has memberID 10001

        controller.membersInTeam(10001);

        controller.addMemberToTeam("Alfred@dtu.dk",10001);

        controller.membersInTeam(10001);
        controller.createFirm("200", "JYSK");

        System.out.println("TotalNoOfFirms: " + controller.noOfFirms());




    }

}
