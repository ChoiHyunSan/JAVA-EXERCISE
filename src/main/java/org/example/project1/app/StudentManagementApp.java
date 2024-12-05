package org.example.project1.app;

import org.example.project1.controller.AppController;

public class StudentManagementApp implements App{

    public StudentManagementApp(AppController controller) {
        this.controller = controller;
    }

    private final AppController controller;

    @Override
    public void run() {
        while(controller.mainLoop()){
        }
    }
}
