package com.sphoorthi;

public class DayOfTheWeekChallenge {
    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }
    }


    public static void main(String[] args) {

            printDayOfTheWeek(77);

    }
}
