package com.company;

public class Main {

    public static void main(String[] args) {
        String result1 = getResult(30, 27);
        String result2 = getResult(24, 2);
        String result3 = getResult(53, 28);
        String result4 = getResult(23, -8);
        String result5 = getResult(12, 25);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }

    public static String getResult(int age, int temp) {
        if (20 < age && 45 > age && -20 < temp && 30 > temp) {
            return "вы можете гулять";
        } else if (20 > age && 0 < temp && 28 > temp){
            return "вы можете идти гулять";

        } else if (45 < age && -10 < temp && 25 > temp){
            return "пора идти гулять, и подышать свежым воздухом";

        } else {
            return "оставайтесь дома";
        }
    }
}