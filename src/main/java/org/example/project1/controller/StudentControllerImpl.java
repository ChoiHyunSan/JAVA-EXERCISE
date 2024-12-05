package org.example.project1.controller;

import org.example.project1.view.OutputView;

import java.util.Scanner;

import static org.example.project1.define.StudentMenu.*;
import static org.example.project1.define.StudentMenu.STUDENT_EXIT;

public class StudentControllerImpl implements StudentController {

    public StudentControllerImpl(Scanner sc, OutputView outputView) {
        this.sc = sc;
        this.outputView = outputView;
    }

    private final Scanner sc;
    private final OutputView outputView;

    @Override
    public void handleMenu() {
        while(true){
            outputView.studentMenu();
            switch (Input(sc, outputView)) {
                case STUDENT_INSERT -> insert();
                case STUDENT_LIST -> list();
                case STUDENT_FIND -> find();
                case STUDENT_UPDATE -> update();
                case STUDENT_DELETE -> delete();
                case STUDENT_EXIT -> { return; }
                default -> { }
            }
        }
    }

    private void delete() {
        outputView.deleteStudent();
    }

    private void update() {
        outputView.updateStudent();
    }

    private void find() {
        outputView.findStudent();
    }

    private void list() {
        outputView.printStudentList();
    }

    private void insert() {
        outputView.insertStudent();
    }


}
