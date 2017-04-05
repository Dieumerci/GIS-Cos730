package test2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        String building, longitude, latitude;
        String change;
        System.out.println("Choose from 1 to 5");
        System.out.println("1 ->  Search for building:");
        System.out.println("2 ->  Create New Building:");
        System.out.println("3 ->  Edit Building:");
        System.out.println("4 ->  Delete Building:");
        System.out.println("5 ->  Display Building:");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(" Search for a building");
                System.out.println(" ");
                System.out.println("Enter building name:");
                building = input.next();
                System.out.println(" ");
                System.out.println("Enter latitude:");
                latitude = input.next();
                System.out.println(" ");
                System.out.println("Enter longitude:");
                longitude = input.next();
                System.out.println(" ");
                System.out.println("Building has been found!");
                break;

            case 2:
                System.out.println(" New Building ");
                System.out.println(" ");
                System.out.println("Enter new building:");
                building = input.next();
                System.out.println(" ");
                System.out.println("Enter latitude:");
                latitude = input.next();
                System.out.println(" ");
                System.out.println("Enter longitude:");
                longitude = input.next();
                System.out.println(" ");
                System.out.println("New building has been created!");
                break;

            case 3:
                System.out.println("Which one do you want to change? ");
                System.out.println(" ");
                System.out.println("building or coordinates?");
                change = input.next();
                if ("building".equals(change)) {
                    System.out.println("Enter the correct name of the Building");
                    building = input.next();
                    System.out.println("The building's name has been changed");
                    break;
                } else {
                    System.out.println("What do you want to change?");
                    System.out.println(" ");
                    System.out.println(" 1-> latitude");
                    System.out.println("2-> longitude ");
                    System.out.println("3 -> both");
                    int lchange = input.nextInt();
                    switch (lchange) {
                        case 1:
                            System.out.println("Enter the correct latitude:");
                            latitude = input.next();
                            System.out.println("Latitude has been changed");
                            break;
                        case 2:
                            System.out.println("Enter the correct longitude:");
                            longitude = input.next();
                            System.out.println("Longitude has been changed");
                            break;
                        case 3:
                            System.out.println("Enter the correct latitude:");
                            latitude = input.next();
                            System.out.println(" ");
                            System.out.println("Enter the correct longitude:");
                            longitude = input.next();
                            System.out.println(" ");
                            System.out.println("Latitude and Longitude has been changed");
                            break;
                        default:
                            System.out.println("Incorrect Entry");
                            break;

                    }
                    break;
                }

            case 4:
                System.out.println("Enter building:");
                building = input.next();
                System.out.println("Building has been removed!");
                break;

            case 5:
                //display():
                break;
            default:
                System.out.println("Incorrect Entry");
                break;

        }
    }

}
