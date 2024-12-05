package org.example.project1.controller;

import org.example.project1.define.StudentMenu;
import org.example.project1.view.InputView;
import org.example.project1.view.OutputView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentControllerImpl implements StudentController {
    public StudentControllerImpl(Scanner sc, InputView inputView, OutputView outputView) {
        this.sc = sc;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    private final Scanner sc;
    private final InputView inputView;
    private final OutputView outputView;

    @Override
    public boolean mainLoop() {
        outputView.mainMenu();
        return handleMenu();
    }

    private boolean handleMenu(){
        Integer input = null;
        try{
            input = inputView.mainMenu();
            if(input == StudentMenu.EXIT) return false;

            switch (input) {
                case StudentMenu.STUDENT -> handleStudentMenu();
                case StudentMenu.SUBJECT -> handleSubjectMenu();
                case StudentMenu.SCORE -> handleScoreMenu();
                default -> throw new InputMismatchException();
            }
        }catch (InputMismatchException e){
            outputView.inputError();
            e.printStackTrace();
        }
        return true;
    }

    private void handleScoreMenu() {
        outputView.scoreMenu();
    }

    private void handleSubjectMenu() {
        outputView.subjectMenu();
    }

    private void handleStudentMenu() {
        outputView.studentMenu();
    }
}
