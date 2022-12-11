import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static int[] findFreq(int[] arr) {
        int[] repetation = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (var j = i + 1; j < arr.length; j++) {
                if (arr[i] != 0 && arr[i] == arr[j]) {
                    count += 1;
                    arr[j] = 0;
                }
            }
            repetation[i] = count;
        }
        return repetation;
    }

    public static void main(String[] args) {
        int boyut, eleman;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dizinizin boyutunu giriniz : ");
        boyut = input.nextInt();
        int[] list = new int[boyut];
        System.out.println("Lütfen dizinizin elemanlarını giriniz : ");
        for (int i = 0; i < boyut; i++) {
            System.out.print(i + " . Eleman : ");
            list[i] = input.nextInt();
        }
        System.out.println("Oluşturulan dizi: " + Arrays.toString(list));
        int[] repeat = new int[boyut];
        repeat = findFreq(list);
        for (int j = 0; j < list.length; j++) {
            if (repeat[j] != 0) {
                System.out.println(list[j] + " sayısı " + (repeat[j] + 1) + " kere tekrar edildi.");
            }

        }
    }
}