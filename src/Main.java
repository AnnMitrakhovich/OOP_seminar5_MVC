import Controler.Controler;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("Петров", "Иван","Сергеевич","2010");
        controler.createStudent("Сидоров", "Павел","Сергеевич","2011");
        controler.getAllStudent();
        controler.createStudent("Антонов", "Андрей","Васильевич","2010");
        controler.createStudent("Федоров", "Иван","Петрович","2009");
        controler.getAllStudent();
    }
}