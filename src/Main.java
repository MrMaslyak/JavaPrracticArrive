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

}