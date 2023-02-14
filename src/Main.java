import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[5];
        array3[1] = 8;
        array3[2] = 15;
        array3[4] = 36;
    }

    private static void task2() {
        System.out.println("");
        System.out.println("Задача №2");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        System.out.println("");
        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.print(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }
        System.out.println("");
        int[] array3 = new int[5];
        array3[1] = 8;
        array3[2] = 15;
        array3[4] = 36;
        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length - 1) {
                System.out.print(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
    }

    private static void task3() {
        System.out.println("");
        System.out.println("Задача №3");
        int[] array1 = new int[4];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        ArrayInverter.invertInt(array1);
        System.out.println(Arrays.toString(array1).replaceAll("^\\[|\\]$", ""));
        //
        double[] array2 = {3.57, 7.654, 9.986};
        ArrayInverter.invertDouble(array2);
        System.out.println(Arrays.toString(array2).replaceAll("^\\[|\\]$", ""));
        //
        int[] array3 = new int[5];
        array3[1] = 8;
        array3[2] = 15;
        array3[4] = 36;
        ArrayInverter.invertInt(array3);
        System.out.println(Arrays.toString(array3).replaceAll("^\\[|\\]$", ""));
    }

    private static void task4() {
        System.out.println("");
        System.out.println("Задача №4");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%2 != 0) {
                array1[i] = array1[i]+1;
            }
        }
        System.out.println(Arrays.toString(array1).replaceAll("^\\[|\\]$", ""));
    }

}