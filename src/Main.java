import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Задача 1");
        int[] first = new int[3]; {
        first[0] = 11;
        first[1] = 21;
        first[2] = 30;
        }

        double[] second = {1.57, 7.654, 9.986};

        short[] third = new short[3];
        short red = third[0];
        third[0] = 12;
        short yellow = third[1];
        third[1] = 6;
        short green = third[2];
        third[2] = 3;

        System.out.println("Задача 2");

        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.println(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }

        for (int i = 0; i < second.length; i++) {
            if (i == second.length - 1) {
                System.out.print(second[i]);
                break;
            }
            System.out.print(second[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < third.length; i++) {
            if (i == third.length - 1) {
                System.out.print(third[i]);
                break;
            }
            System.out.print(third[i] + ", ");
        }
        System.out.println();
        System.out.println("Задача 3");

        for (int i = first.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }

        System.out.println();

        for (int i = second.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(second[i]);
                break;
            }
            System.out.print(second[i] + ", ");
        }

        System.out.println();

        for (int i = third.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.print(third[i]);
                break;
            }
            System.out.print(third[i] + ", ");
        }

        System.out.println();
        System.out.println("Задача 4");

        for (int i = 0; i < first.length; i++) {
            if (first[i]%2 != 0) {
                first[i] = first[i] + 1;
        }
            if (i == first.length - 1) {
                System.out.print(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
    }
}































