import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter volume arrive: ");
        int volume = scan.nextInt();
        int[] massive = new int[volume];
        System.out.print("Enter inside numbers arrive: ");
        for (int i = 0; i < volume; i++) {
            massive[i] = scan.nextInt();
        }
        System.out.println("Your arrive: " + Arrays.toString(massive));
        minVolume( massive);
        maxVolume(massive);
        AvarageVolume(massive);
        NumbersMoreThanFive(massive);
        InsertSort(massive);
        SelectSort(massive);
        BubbleSort(massive);
//        HardTask();
    }

    public static void minVolume (int[] massive){
        int min = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (min>massive[i]){
                min = massive[i];
            }
        }
        System.out.println("Minimal number in your arrive: " + min);
    }
    public static void maxVolume (int[] massive){
        int max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (max<massive[i]){
                max = massive[i];
            }
        }
        System.out.println("Maximal number in your arrive: " + max);
    }
    public static void AvarageVolume(int[] massive){
        int sum = massive[0];
        for (int i = 0; i < massive.length; i++) {
            sum =+ massive[i];
        }
        double average = (double) sum / massive.length;
        System.out.println("Average number in your arrive: " + average);
    }
    public static void NumbersMoreThanFive(int[] massive) {
        System.out.print("Numbers more than five: ");
        boolean found = false;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > 5) {
                if (found) {
                    System.out.print(", ");
                }
                System.out.print(massive[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    public static void HardTask(){
        int[] arrive = {1,2,3,4,5,6,7,8,8,10};
        for (int i = 0; i < arrive.length; i++) {
            arrive[i] = i;
        }
        System.out.println(Arrays.toString(arrive));
    }

    public static void InsertSort (int [] massive){
        for (int i = 0; i < massive.length ; i++) {
            int tmp = massive[i];
            int j = i - 1;
            while (j >= 0 && massive[j] > tmp) {
            massive[j+1] = massive[j];
            j -- ;
            }
            massive[j+1] = tmp;
        }
        System.out.println("Insert-sort your arrives: " + Arrays.toString(massive));
    }

    public static void SelectSort (int [] massive){
        for (int i = 0; i < massive.length; i++) {
            for (int j = i+1; j < massive.length ; j++) {
                if (massive[i]>massive[j]){
                    int tmp = massive[i];
                    massive[i]=massive[j];
                    massive[j] = tmp;
                }
            }
        }
        System.out.println("Select-sort your arrives: " + Arrays.toString(massive));
    }
    public static void BubbleSort (int [] massive){
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length - 1 ; j++) {
                if (massive[j]>massive[j+1]){
                    int tmp = massive[j];
                    massive[j]=massive[j+1];
                    massive[j+1] = tmp;
                }
            }
        }
        System.out.println("Bubble-sort your arrives: " + Arrays.toString(massive));
    }

}