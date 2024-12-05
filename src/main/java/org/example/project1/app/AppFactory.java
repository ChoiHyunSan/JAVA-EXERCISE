package org.example.project1.app;

import org.example.project1.controller.AppController;
import org.example.project1.controller.AppControllerImpl;
import org.example.project1.controller.StudentController;
import org.example.project1.controller.StudentControllerImpl;
import org.example.project1.view.ConsoleOutputView;
import java.util.Scanner;

public class AppFactory {
    public static App CreateStudentManagementApp() {
        // Resource
        Scanner sc = new Scanner(System.in);
        ConsoleOutputView outputView = new ConsoleOutputView();

        // Controller
        StudentController studentController = new StudentControllerImpl(sc, outputView);
        AppController controller = new AppControllerImpl(sc, outputView, studentController);

        // Return
        return new StudentManagementApp(controller);
    }
}
