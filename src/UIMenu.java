import java.util.Scanner;

public class UIMenu {
    public static void showMenu(){
        System.out.println("Welcome to my Appointments");
        System.out.println("Choose your option: ");
        int response = 0;
        do {
            System.out.println("1. Doctor.");
            System.out.println("2. Patient.");
            System.out.println("0. Exit.");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    response = 0;
                    showMenuDoctor();
                    break;
                case 2:
                    response = 0;
                    showMenuPatient();
                    break;
                case 0:
                    System.out.println("Thank for watching!");
                    break;

            }
        }while(response != 0);
    }

    public static void showMenuDoctor(){
        System.out.println("Welcome to my Doctors.");
        int response = 0;

        do{
            System.out.println("1. Create a Doctor.");
            System.out.println("2. Show my Doctors.");
            System.out.println("3. Delete a Doctor.");
            System.out.println("4. Update a Doctor.");
            System.out.println("0. Return to main menu.");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    response = 0;
                    break;
                case 2:
                    response = 0;
                    break;
                case 3:
                    response = 0;
                    break;
                case 4:
                    response = 0;
                    break;
                case 0:
                    response = 0;
                    showMenu();
                    break;
            }
        }while(response != 0);
    }

    public static void showMenuPatient(){

    }
}
