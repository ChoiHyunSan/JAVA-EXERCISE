package org.example.project1.app;

import org.example.project1.controller.StudentController;

public class StudentManagementApp implements App{

    public StudentManagementApp(StudentController controller) {
        this.controller = controller;
    }

    private final StudentController controller;

    @Override
    public void run() {
        while(controller.mainLoop()){}
    }
}
