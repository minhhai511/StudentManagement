/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;
import java.util.ArrayList;
/**
 *
 * @author SƠNPC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        CheckInput checkinput = new CheckInput();
        ls.add(new Student("1", "Pham Ngoc Hoa", "Spring", "java"));
        ls.add(new Student("2", "Do Quang Hiep", "Summer", ".net"));
        ls.add(new Student("3", "Nguyen Xuan Cuong", "Spring", "c/c++"));
        int count = 3;
        //loop until user want to exit program
        while (true) {
            //Show menu option
            StudentManager.menu();
            int choice = CheckInput.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    StudentManager.createStudent(count, ls);
                    break;
                case 2:
                    StudentManager.findAndSort(ls);
                    break;
                case 3:
                    StudentManager.updateOrDelete(count, ls);
                    break;
                case 4:
                    StudentManager.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }
    }


