package org.example.project1.controller;
import org.example.project1.view.OutputView;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.example.project1.define.StudentMenu.*;

public class AppControllerImpl implements AppController {
    public AppControllerImpl(Scanner sc, OutputView outputView, StudentController studentController) {
        this.sc = sc;
        this.outputView = outputView;
        this.studentController = studentController;
    }

    private final Scanner sc;
    private final OutputView outputView;
    private final StudentController studentController;

    @Override
    public boolean mainLoop() {
        outputView.mainMenu();
        return handleMenu();
    }

    private boolean handleMenu(){
        switch (Input(sc, outputView)) {
            case MAIN_STUDENT -> handleStudentMenu();
            case MAIN_EXIT -> { outputView.exit(); return false; }
            default -> { return true; }
        }
        return true;
    }

    private void handleStudentMenu() {
        studentController.handleMenu();
    }
}
