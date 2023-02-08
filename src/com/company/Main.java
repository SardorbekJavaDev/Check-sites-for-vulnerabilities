package com.company;

import com.company.container.ComponentContainer;
import com.company.controller.TasksController;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter URL or HOST: ");
        String url = ComponentContainer.scanner.nextLine();


        TasksController taskController = ComponentContainer.tasksController;
        while (true) {
            taskController.showMenu();
            try {
                switch (getAction()) {
                    case 1:
                        System.out.println("*** Injection Flaws ***");
                        taskController.showInjection(url);
                        break;
                    case 2:
                        System.out.println("*** Broken Authentication ***");
                        taskController.showBroken(url);
                        break;
                    case 3:
                        System.out.println("*** Cross-Site Scripting (XSS) ***");
                        taskController.showCross(url);
                        break;
                    case 4:
                        System.out.println("*** Insecure Direct Object References ***");
                        taskController.showInsecure(url);
                        break;
                    case 5:
                        System.out.println("*** Security Misconfiguration ***");
                        taskController.showSecurity(url);
                        break;
                    case 6:
                        System.out.println("*** Sensitive DNS data exposure ***");
                        taskController.showSensitive(url);
                        break;
                    case 7:
                        System.out.println("*** Missing Function Level Access Control ***");
                        taskController.showMissing(url);
                        break;
                    case 8:
                        System.out.println("*** Check All ***");
                        taskController.showCheck(url);
                        break;
                    case 0:
                        System.out.println("*** Thank you for attention ***");
                        return;
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }


    public static int getAction() {
        System.out.print("Enter Your Action _ ");
        return ComponentContainer.scanner.nextInt();
    }
}
