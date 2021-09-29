package Mirea.pr6.task3;

public class RTSstudent extends Student {

    public RTSstudent(int age, int ID, String fisrtName) {
        super(age, ID, fisrtName);
    }

    public RTSstudent(int ID, String fisrtName) {
        super(ID, fisrtName);
    }

    @Override
    String getCourse() {
        return "RTS";
    }
}

