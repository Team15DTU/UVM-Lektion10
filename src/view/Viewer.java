package view;

import controller.Controller;

import java.util.Scanner;

/**
 * @author Rasmus Sander Larsen
 * @date 16-11-2018
 */
public class Viewer {

    /*
    -------------------------- Fields --------------------------
     */

    Controller control;
    Scanner input;
    
    /*
    ----------------------- Constructor -------------------------
     */

    public Viewer () {
        control = new Controller();
        input = new Scanner(System.in);
    }
    
    /*
    ------------------------ Properties -------------------------
     */
    
    
    
    /*
    ---------------------- Public Methods -----------------------
     */

    public String  menu () {

        String selected;
        System.out.println("Welcome to administation!");
        System.out.println("You have the following options:");
        System.out.println("1 - Create a firm (from: firm name and firm CVR)");
        System.out.println("2 - Create a team (from: team name and firm CVR)");
        System.out.println("3 - Create a member (from: member name, member e-mail)");
        System.out.println("4 - Create a member (from: member name, member e-mail and firm CVR)");

        selected = input.next();

        return selected;

    }

    public void createMemberNameMail () {

        String memberName, memberMail;
        System.out.println("Create a member");
        System.out.println("Enter member name: ");
        memberName = input.next();
        System.out.println("Enter member e-mail: ");
        memberMail = input.next();

        control.createFirm(memberName,memberMail);

        System.out.println("Your created a member named: " + memberMail + "\nWith the e-mail: " + memberMail);

    }

    public void createMemberNameMailCVR () {

        String memberName, memberMail, firmCVR;
        System.out.println("Create a member");
        System.out.println("Enter member name: ");
        memberName = input.next();
        System.out.println("Enter member e-mail: ");
        memberMail = input.next();
        System.out.println("Enter firm CVR: ");
        firmCVR = input.next();

        control.createFirm(memberName,memberMail);

        System.out.println("Your created a member named: " + memberMail + "\nWith the e-mail: " + memberMail +
        "\nFrom firm with CVR: " + firmCVR);

    }

    public void createTeam () {

        String teamName, firmCVR;
        System.out.println("Create a team");
        System.out.println("Enter team name: ");
        teamName = input.next();
        System.out.println("Enter firm CVR: ");
        firmCVR = input.next();

        control.createFirm(teamName,firmCVR);

        System.out.println("Your created the team: " + teamName + "\nWith the CVR: " + firmCVR);
    }

    public void createFirm () {

        String firnCVR, firmName;
        System.out.println("Create a firm");
        System.out.println("Enter firn CVR: ");
        firnCVR = input.next();
        System.out.println("Enter firm Name: ");
        firmName = input.next();

        control.createFirm(firnCVR,firmName);

        System.out.println("Your created the firm: " + firmName + "\nWith the CVR: " + firmName);
    }
    
    
    /*
    ---------------------- Support Methods ----------------------
     */

    public void menuSwitch (String input) {
        switch (input) {
            case "1":
                createFirm();
                break;
            case "2":
                createTeam();
                break;
            case "3":
                createMemberNameMail();
                break;
            case "4":
                createMemberNameMailCVR();
            default:
                break;
        }
    }

}
