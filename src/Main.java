import Controler.Controler;
import Data.StudentGroup;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("Петров", "Иван","Сергеевич","2010");
        controler.createStudent("Сидоров", "Павел","Сергеевич","2011");
        controler.getAllStudent();
        System.out.println("___");
        controler.createStudent("Антонов", "Андрей","Васильевич","2010");
        controler.createStudent("Федоров", "Иван","Петрович","2009");
        controler.getAllStudent();
        System.out.println("___");
        controler.createTeacher("Садченко", "Сава", "Игнатьевич", "1981");
        controler.getAllTeachers();
        System.out.println("___");
        controler.createStudentsGroup(1, 1, 3);



    }
}