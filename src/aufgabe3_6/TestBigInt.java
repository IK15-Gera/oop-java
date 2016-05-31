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
        nums.add(new BigInt(45415451));
        nums.add(new BigInt("44154558841588415415842554455"));
    }

    private static void testSet() {
        BigInt num = new BigInt(0);
        num.set(145815);
        nums.add(num);

        num = new BigInt(0);
        num.set("145145481458812841565815588");
        nums.add(num);
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
