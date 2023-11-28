package Service;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;
import Data.User;
import View.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList) {
        StudentGroup studentGroup = new StudentGroup(teacher, studentList);
        return studentGroup;
    }



}
