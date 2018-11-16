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

    public void createFirm () {

        String firnCVR, firmName;
        System.out.println("Create a firm");
        System.out.print("Enter firn CVR: ");
        firnCVR = input.next();
        System.out.print("Enter firm Name: ");
        firmName = input.next();

        control.createFirm(firnCVR,firmName);

        System.out.println("Your created the firm: " + firmName + " with the CVR: " + firmName);
    }
    
    
    /*
    ---------------------- Support Methods ----------------------
     */


}
