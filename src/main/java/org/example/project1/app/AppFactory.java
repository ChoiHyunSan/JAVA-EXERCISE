package org.example.project1.app;

import org.example.project1.controller.StudentController;
import org.example.project1.controller.StudentControllerImpl;
import org.example.project1.view.ConsoleInputView;
import org.example.project1.view.ConsoleOutputView;
import java.util.Scanner;

public class AppFactory {
    public static App CreateStudentManagementApp() {
        Scanner sc = new Scanner(System.in);
        ConsoleOutputView outputView = new ConsoleOutputView();
        ConsoleInputView inputView = new ConsoleInputView();
        StudentController controller = new StudentControllerImpl(sc, inputView, outputView);
        return new StudentManagementApp(controller);
    }
}
