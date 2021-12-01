package Mirea.pr9;


import java.util.Scanner;

import static java.lang.System.*;

public class LabClassUI {
    LabClass labClass;
    public LabClassUI() {
        labClass = new LabClass();
        LabClassDriver driver = new LabClassDriver(labClass);
        Scanner in = new Scanner(System.in);
        boolean created = false;
        out.print("Do you want to create a new list? (yes or no; if not, it will load the old one): ");

        String input = (in.nextLine()).toLowerCase();
        if (input.equals("yes")) {
            driver.createLabClass();
            created = true;
        } else if (input.equals("no")) {
            driver.fillLabClass();
        } else {
            err.print("Invalid input !!! Recording is not available, the list is being filled from memory!");
            out.println('\n');
            driver.fillLabClass();
        }

        if (created) {
            out.println("Do you want to keep the list? (Yes or no): ");
            input = (in.next()).toLowerCase();
            if (input.equals("Yes")) {
                driver.saveLabCLass();
            }
            driver.fillLabClass();
        }
    }

    public void findStudent() {
        Scanner in = new Scanner(System.in);
        out.print("Enter student name: ");
        String name;

        try {
            name = (in.nextLine()).toLowerCase();
            if (name.isEmpty()) {

                throw new EmptyStringException("You entered an empty line!");
            }
        } catch (EmptyStringException e) {
            err.println(e.getMessage());
            out.println();
            findStudent();
            return;
        }

        try {
            out.println(labClass.find(name).toString());
        } catch (StudentNotFoundException e) {
            err.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        LabClassUI app = new LabClassUI();
        app.findStudent();
    }
}