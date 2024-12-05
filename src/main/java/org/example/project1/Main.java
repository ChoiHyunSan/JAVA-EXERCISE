package org.example.project1;

import org.example.project1.app.App;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import static org.example.project1.app.AppFactory.CreateStudentManagementApp;

public class Main {
    public static void main(String[] args) {
        App app = CreateStudentManagementApp();
        app.run();
    }
}