import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Option1 {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Выберите задание лабораторной работы: \n1- Сумма массива через цикл for. \n2- Сумма массива через цикл while. \n3- Сумма массива через цикл do while. \n4- Аргумент командной строки в цикле for. \n5- Первые 10 чисед гармонического ряда.\n6- Генерация и сортировка случайного массива. \n7- Метод вычисляющий факториал.");
        int choice = sw.nextInt();
        switch (choice){
            case 1:
                System.out.println("Вывести на экран сумму чисел массива с помощью циклов for");
                int summ=0;
                Random m = new Random();
                int mas[]= new int[10];
                System.out.println("Случайный массив=");
                for (int i=0;i<10;i++){
                    mas[i]=m.nextInt(50);
                    summ=summ+mas[i];
                    System.out.println( mas[i]);
                }
                System.out.println("Сумма чисел массива="+summ);
                break;
            case 2:
                System.out.println("Вывести на экран сумму чисел массива с помощью циклов while");
                int Sum = 0;
                Scanner s = new Scanner(System.in);
                int[]a= new int[10];
                int i=0;
                System.out.println("Введите элементы массива");
                while ( i < 10) {
                    a[i]=s.nextInt();
                    Sum=Sum+a[i];
                    i++;
                }
                System.out.println("Сумма ="+Sum);
                break;
            case 3:
                System.out.println("Вывести на экран сумму чисел массива с помощью циклов do while");
                int summa=0;
                int q = 0;
                Random mm = new Random( 100);
                int mass[]= new int[10];
                System.out.println("Случайные элементы массива=");
                do {
                    mass[q]=mm.nextInt(100 );
                    System.out.println(mass[q]);
                    summa=summa+mass[q];
                    q++;
                } while (q <10);
                System.out.println("Сумма элементов массива ="+summa);
                break;
            case 4:
                Scanner ch = new Scanner(System.in);
                for (int ii=0; ii<args.length;ii++){
                    System.out.println("Аргумент командной строки["+ii+"]="+args[ii]);}
                break;
            case 5:
                float b=1;
                float aa=1;
                float c;
                System.out.println("Первые 10 цифр гармонического ряда =");
                while (b < 10){
                    c=aa/b;
                    b++;
                    System.out.println(c+"+c"); }
                break;
            case 6:
                System.out.println("Сгенерировать массив целых чисел случайным образом ,вывести его на экран,отсортировать его,и снова вывести на экран.");
                System.out.println("Введите количество элементов массива");
                Scanner ss = new Scanner(System.in);
                int n = ss.nextInt();
                Random mmm = new Random();
                int mmas[]= new int[n];
                System.out.println("Случайный массив=");
                for (int iii=0;iii<n;iii++){
                    mmas[iii]=mmm.nextInt(101);
                    System.out.println( mmas[iii]); }
                Arrays.sort(mmas);
                System.out.println("Отсортированный массив ="+Arrays.toString(mmas));
                break;
            case 7:
                Scanner ssss = new Scanner(System.in);
                System.out.println("Введите число для рассчета факториала");
                long f=1;
                int p =1;
                int o = ssss.nextInt();
                int []massi = new int[o];
                if (o != 0 && o >0)
                {
                    while (p <= o) {
                        f=f*p;
                        p++;
                    }
                    System.out.println("Факториал="+f);
                }

                else {
                    f = 1;
                    System.out.println("Факториал =" + f);
                }
                break;
            default:
                System.out.println("Не правильное число");
                break;

        }
    }
}