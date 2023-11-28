package Data;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Integer> getStudentsId(){
        List<Integer> studentsId = new ArrayList<>();
        for (Student student: studentList) {
            studentsId.add(student.getStudentId());
        }
        return studentsId;
    }
    public int getTeacherId() {
        return teacher.getTeacherId();
    }

    @Override
    public String toString() {
        return String.format("Группа учителя: %s,\nСтуденты: %s",teacher,studentList);
    }
}
