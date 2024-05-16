import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray1 = {2,1,2,3,4};
        int[] myArray2 = {2,2,0};
        int[] myArray3 = {1,3,5};
        int[] myArray4 = {1,0,0,2,8};
        System.out.println("Кол-во чётных элементов в массиве => " + countEvens(myArray1));
        System.out.println("Кол-во чётных элементов в массиве => " + countEvens(myArray2));
        System.out.println("Кол-во чётных элементов в массиве => " + countEvens(myArray3));
        System.out.println("Разница между MAX и MIN в массиве => " + getDifference(myArray1));
        System.out.println("Разница между MAX и MIN в массиве => " + getDifference(myArray2));
        System.out.println("Разница между MAX и MIN в массиве => " + getDifference(myArray3));
        System.out.println("В массиве есть два соседних нуля => " + checkIfNull(myArray1));
        System.out.println("В массиве есть два соседних нуля => " + checkIfNull(myArray4));
    }
    /**
     * 1. Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
     * countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0;
     */
    public static int countEvens(int[] array){
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || array[i] % 2 == 0){
                n++;
            }
        }
        return n;
    }
    /**
     * 2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного
     * непустого массива.
     */
    public static int getDifference(int[] array){
        return Arrays.stream(array).max().getAsInt() - Arrays.stream(array).min().getAsInt();
    }
    /**
     *  3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних 
     *  элемента с нулевым значением.
     */
    public static boolean checkIfNull(int[] array){
        boolean flag = false;
        int i = 0;
        while (flag == false && i < array.length - 1){
            if (array[i] == 0 && array[i+1] == 0){
                flag = true;
            }
            i++;
        }
        return flag;
    }
}
