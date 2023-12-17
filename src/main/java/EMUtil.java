import com.dao.StudentDAO;
import com.entity.Student;
import com.exception.StudentEXception;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;


public class EMUtil {
    public static void main(String[] args) {
        System.out.println("Welcome to student portal.");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        StudentDAO dao = new StudentDAO();
        while (flag) {
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to get student");
            System.out.println("Press 3 to update student");
            System.out.println("Press 4 to get all students");
            System.out.println("Press 5 to delete student");
            System.out.println("Press 0 to close");
            try {
                int x = sc.nextInt();
                switch (x) {
                    case 0: {
                        flag = false;

                    }
                    break;
                    case 1: {
//                    take name from user
                        System.out.println("Enter student name");
                        String name = sc.next();
//                    create student object
                        Student student = new Student(name);
//                    call the method to store
                        String output = dao.store(student);
//                    print the output
                        System.out.println(output);
                    }
                    break;
                    case 2:{
//                        take id from user
                        System.out.println("Enter student id");
                        int id = sc.nextInt();

                        Student student = null;
                        student = dao.show(id);
                        System.out.println(student.toString());

                    }break;
                    case 3:{
//                        take id and updated info of student
                        System.out.println("Enter student id");
                        int id = sc.nextInt();
                        System.out.println("Enter name");
                        String studentName = sc.next();
                        Student student = new Student(studentName);
                        Student st = dao.update(id,student);
                        System.out.println("Student updated successfully. " + st.toString());
                    }break;
                    case 4:{
                        List<Student> students = dao.index();
                        System.out.println(students);
                    }break;
                    case 5: {
//                    take id from user
                        System.out.println("Enter student id");
                        int id = sc.nextInt();
                        String output = dao.destroy(id);
                        System.out.println(output);
                    }
                    break;
                    default:
                        System.out.println("Please enter valid number");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.next();
            }

        }sc.close();
    }
}