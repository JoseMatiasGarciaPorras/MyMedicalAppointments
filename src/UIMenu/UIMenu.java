package UIMenu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class UIMenu {
    public static String[] months = {"January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"};


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
        System.out.println(selectMonths());
    }

    public static List selectMonths(){
        Calendar today = Calendar.getInstance();
        String month = Integer.toString((today.get(Calendar.MONTH)));
        System.out.println(today.get(Calendar.MONTH));
        int position = 0;
        for (int i = 0; i < months.length; i++) {
            if(i == Integer.parseInt(month)){
                position = i;
                break;
            }
        }
        String first = months[position];
        String second = months[position + 1];
        String third = months[position + 2];
        List<String> quarters = new ArrayList<String>();
        quarters.add(first);
        quarters.add(second);
        quarters.add(third);
        return quarters;


    }
}
