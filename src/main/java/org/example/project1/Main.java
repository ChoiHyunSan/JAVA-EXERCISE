package org.example.project1;

import org.example.project1.app.App;
import static org.example.project1.app.AppFactory.CreateStudentManagementApp;

public class Main {
    public static void main(String[] args) {
        App app = CreateStudentManagementApp();
        app.run();
    }
}