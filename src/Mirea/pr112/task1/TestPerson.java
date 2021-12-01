package Mirea.pr112.task1;


public class TestPerson {

    public static void main(String[] args) {
        var p1 = new Person("Lo","Van","Hung");
        System.out.println(p1);
        p1.setSurname("Mess");
        p1.setName("Alak");
        p1.setPatronymic("Paht");
        System.out.println(p1);
    }
}