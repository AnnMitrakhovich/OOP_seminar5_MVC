package Controler;

import Data.*;
import Service.DataService;
import Service.StudentGroupService;
import View.StudentView;
import View.TeacherView;

import javax.xml.transform.Templates;
import java.util.ArrayList;
import java.util.List;

import static Data.Type.STUDENT;
import static Data.Type.TEACHER;

public class Controler {
    private final DataService service = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, TEACHER);
    }

    public void getAllTeachers() {
        List<User> userList = service.getAllTeachers();
        for (User user : userList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }

    public void createStudentsGroup(int idTeacher, int idStudent1, int idStudent2) {
        List<Student> studentList = new ArrayList<>();
        List<Student> allstudents = service.getStudent();
        for (Student student : allstudents) {
            if (student.getStudentId() == idStudent1) {
                studentList.add(student);

            } else if (student.getStudentId() == idStudent2) {
                studentList.add(student);
            }
        }
        List<Teacher> teachers = service.getTeachers();
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == idTeacher) {
                studentGroupService.createStudentGroup(teacher, studentList);
                System.out.printf("Группа учителя %s: ", teacher);
            } else {
                System.out.println("Неверный номер учителя");
            }
        }
        System.out.println(studentList);



    }
}
