package aufgabe3_6;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBigInt {
    private static ArrayList<BigInt> nums = new ArrayList<>();

    public static void main(String[] args) {
        testConstruction();
        testSet();
        testAdd();
        testGet();
    }

    private static void testConstruction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib eine normale Ganzzahl ein:");
        nums.add(new BigInt(sc.nextInt()));
        System.out.println("Gib eine weitere große Ganzzahl ein:");
        nums.add(new BigInt(sc.next()));

        System.out.println("Die Zahlen wurde eingelesen.");
    }

    private static void testSet() {
        Scanner sc = new Scanner(System.in);

        BigInt num = new BigInt(0);
        System.out.println("Gib eine normale Ganzzahl ein:");
        num.set(sc.nextInt());
        nums.add(num);

        num = new BigInt(0);
        System.out.println("Gib eine weitere große Ganzzahl ein:");
        num.set(sc.next());
        nums.add(num);

        System.out.println("Die Zahlen wurde eingelesen.");
    }

    private static void testAdd() {
        BigInt num = nums.get(0).add(nums.get(1));
        nums.add(num);
    }

    private static void testGet() {
        System.out.println("Alle eingelesenen und berechneten Zahlen lauten:");
        for (BigInt item: nums) {
            System.out.println("\t" + item.get());
        }
    }
}
