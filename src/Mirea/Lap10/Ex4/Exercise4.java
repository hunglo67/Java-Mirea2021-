package Mirea.Lap10.Ex4;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise4 {
    public static ArrayList<File> readDir(String path){
        File f = new File(path);

        if (!f.exists() || !f.isDirectory())
            throw new IllegalArgumentException("Not correct path!");

        ArrayList<File> lf = new ArrayList<File>();

        Collections.addAll(lf, f.listFiles());
        try {
            for (int i = 0; i < 5; i++)
                System.out.println(lf.get(i).getName());
        } catch (Exception e) {
            System.out.println("Files in the directory is less than 5!");
        }
        return lf;
    }
    public static void main(String[] args) {
        ArrayList<File> lf = readDir(Paths.get("C:\\MinGW\\").toAbsolutePath().toString());
        System.out.println();
        System.out.println(lf);
        System.out.println();
    }
}

