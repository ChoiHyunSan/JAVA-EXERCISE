package org.example.project1.controller;

import org.example.project1.view.OutputView;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface DefaultController{
    default int Input(Scanner sc, OutputView outputView){
        try{
            return sc.nextInt();
        }catch (InputMismatchException e){
            outputView.inputError();
            return -1;
        }
    }
}
