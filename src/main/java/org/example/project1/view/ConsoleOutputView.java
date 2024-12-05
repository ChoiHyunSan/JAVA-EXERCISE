package org.example.project1.view;

public class ConsoleOutputView implements OutputView {
    @Override
    public void mainMenu() {
        System.out.println("\n===== 학생 관리 시스템 =====");
        System.out.println("1. 학생 관리");
//        System.out.println("2. 수강 과목 관리");
//        System.out.println("3. 성적 관리");
        System.out.println("0. 프로그램 종료");
        System.out.print("원하는 메뉴를 선택하세요: ");
    }

    @Override
    public void inputError() {
        System.out.println("Please enter a right number");
    }

    @Override
    public void studentMenu() {
        System.out.println("\n===== 학생 관리 메뉴 =====");
        System.out.println("1. 학생 추가");
        System.out.println("2. 전체 학생 목록");
        System.out.println("3. 학생 조회");
        System.out.println("4. 학생 정보 수정");
        System.out.println("5. 학생 삭제");
        System.out.println("0. 뒤로 가기");
        System.out.print("메뉴를 선택하세요: ");
    }

    @Override
    public void exit() {
        System.out.println("프로그램을 종료합니다.");
    }

    @Override
    public void deleteStudent() {
        System.out.println("학생 리스트에서 삭제했습니다");
    }

    @Override
    public void updateStudent() {
        System.out.println("해당 학생을 수정했습니다");
    }

    @Override
    public void findStudent() {
        System.out.println("학생을 리스트에서 찾습니다");
    }

    @Override
    public void printStudentList() {
        System.out.println("학생 리스트를 반환합니다.");
    }

    @Override
    public void insertStudent() {
        System.out.println("학생을 리스트에 추가합니다");
    }
}
