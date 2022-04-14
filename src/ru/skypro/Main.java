package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println();
        System.out.println("Zadanie 4");
        System.out.println();
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        int maxCost = -1;
        int minCost = 200_001;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("Zadanie 1");
        for(int element: arr) {
            sum += element;
        }
        System.out.println();
        System.out.println("Summa trat za mesyac = " + sum + " rublei");
        System.out.println();
        System.out.println("Zadanie 2");
        System.out.println();
        for(int i = 0; i < arr.length; i++ ) {
            if (arr[i] > maxCost) {
                maxCost = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCost) {
                minCost = arr[i];
            }
        }
        System.out.println("Maximalnya vyplata = " + maxCost);
        System.out.println("Minimalnya vyplata = " + minCost);
        System.out.println();
        System.out.println("Zadanie 3");
        System.out.println();
        System.out.println("Srednyaya summa trat v den = " + (float)sum / 30 + " rublei");


        return arr;
    }
}

