package lab02;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter month: ");
            String monthInput = scanner.nextLine().trim();

            System.out.print("Enter year: ");
            String yearInput = scanner.nextLine().trim();

            int month = getMonth(monthInput);
            int year;

            try {
                year = Integer.parseInt(yearInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter again.");
                continue;
            }

            if (month == -1 || year < 0) {
                System.out.println("Invalid month/year. Please enter again.");
                continue;
            }

            int days;

            switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
            }

            System.out.println("The month has " + days + " days.");
            break;
        }
    }

    public static int getMonth(String month) {
        switch (month.toLowerCase()) {
        case "january":
        case "jan":
        case "jan.":
        case "1":
            return 1;
        case "february":
        case "feb":
        case "feb.":
        case "2":
            return 2;
        case "march":
        case "mar":
        case "mar.":
        case "3":
            return 3;
        case "april":
        case "apr":
        case "apr.":
        case "4":
            return 4;
        case "may":
        case "5":
            return 5;
        case "june":
        case "jun":
        case "jun.":
        case "6":
            return 6;
        case "july":
        case "jul":
        case "jul.":
        case "7":
            return 7;
        case "august":
        case "aug":
        case "aug.":
        case "8":
            return 8;
        case "september":
        case "sep":
        case "sep.":
        case "9":
            return 9;
        case "october":
        case "oct":
        case "oct.":
        case "10":
            return 10;
        case "november":
        case "nov":
        case "nov.":
        case "11":
            return 11;
        case "december":
        case "dec":
        case "dec.":
        case "12":
            return 12;
        default:
            return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}