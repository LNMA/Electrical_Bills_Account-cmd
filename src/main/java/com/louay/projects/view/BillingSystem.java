package com.louay.projects.view;

import com.louay.projects.*;
import com.louay.projects.entry.*;
import com.louay.projects.entry.electricityCostSmallIndustrialTariff;

import java.util.Scanner;

public class BillingSystem {
    Account[] billingSystem = new Account[2];
    Scanner input = new Scanner(System.in);

    public BillingSystem() {
    }

    public void setNewSpace() {
        int raw = billingSystem.length - 1;
        int lastRaw = raw + 1;
        if (billingSystem[raw] != null) {
            Account[] newArray = new Account[lastRaw * 2];
            for (int i = 0; i < billingSystem.length; i++) {
                newArray[i] = billingSystem[i];
            }
            billingSystem = newArray;
        }
    }

    public void signature(){
        System.out.println(" ______\n|      |\t\t\t\t\t\t\t          \t\t\t\t     \t\t\t  \n|      |\t\t\t\t _______________\t\t____\t     ____  \t\t\t __________ \t\t    ____\t\t ____\n|      |\t\t\t\t/\t\t\t\t\\      |    |       |\t |\t\t    /    __    \\\t\t   |    |       |    |\n|      |    \t\t   |     _______\t |     |    |       |\t |    \t   /    /  \\    \\\t\t   |    |       |    |\n|      |\t\t       |    |       |\t |     |    |       |\t |     \t  /    /    \\    \\\t\t   |    |       |    |\n|      |\t\t       |    |\t    |\t |     |    |\t    |\t |\t\t /    /______\\    \\\t\t   |    |       |    |\n|      |________       |    |\t    |\t |     |    |\t    |\t | \t\t/    __________    \\\t   |    |       |    |\n|               |      |    |_______|\t |     |    |_______|\t |     /    /          \\    \\ \t   |    |_______|    |\n|               |      |   \t\t\t\t |     |   \t\t\t\t |    /    /  \t\t    \\    \\     |                 |\n|_______________| \t\t\\_______________/\t\t\\_______________/ \t /____/\t\t\t     \\____\\    \\___________      |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|    |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |    |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |    |\n ______________________________________________________________________________________________________________/     |\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     |\n|___________________________________________________________________________________________________________________/");
    }

    public String inputYesNoChoice(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n| Would you like to perform a new operation.  | \n|                                             | \n| <Y>es, I would        <N>o, thanks          |\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        String yesNo = input.next();
        if (input.hasNextLine()) {
            yesNo += input.nextLine();
        }
        return yesNo;
    }

    public void printChoice(){
        System.out.print("\nPlease select your tariff: \n1. Residential Tariff (Home consumer)." +
                " \n2. Regular Tariff. \n3. Commercial Tariff. \n4. Telecom Companies Tariff. \n5. Small Industrial Tariff" +
                "\n6. get total bills. \n7. get all data. \nPLEASE input the choice number.");
    }

    public  int choice(){
        int choice = input.nextInt();
        while (!(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7)){
            System.out.println("You are enter invalid value...try agian:  ");
            System.out.print("\nPlease select your tariff: \n1. Residential Tariff (Home consumer)." +
                    " \n2. Regular Tariff. \n3. Commercial Tariff. \n4. Telecom Companies Tariff. \n5. Small Industrial Tariff" +
                    "\n6. get total bills. \n7. get all data. \nPLEASE input the choice number.");
            choice = input.nextInt();
        }
        return choice;
    }

    public double inputConsumption() {
        System.out.print("\nplease insert the consumption in KWh: ");
        double consumption = input.nextDouble();
        return consumption;
    }

    public int inputRegistrationNumber(){
        System.out.println("please input Registration Number ");
        int registrationNumber = input.nextInt();
        return registrationNumber;
    }

    public String inputName(){
        System.out.println("please input name: ");
        String name = input.next();
        if (input.hasNextLine())
            name += input.nextLine();
        return name;
    }

    public String inputAddress(){
        System.out.println("please input address: ");
        String address = input.next();
        if (input.hasNextLine())
            address += input.nextLine();
        return address;
    }

    public String inputPhoneNumber(){
        System.out.println("please input phone number: ");
        String phoneNumber = input.next();
        if (input.hasNextLine())
            phoneNumber += input.nextLine();
        return phoneNumber;
    }

    public void triggerMethod(){
        signature();
        String inputYesNoChoice = "null";
        do {
            setNewSpace();
            printChoice();
            int choice = choice();
            if (choice == 1) {
                for (int i = 0; i < billingSystem.length; i++) {
                    if (billingSystem[i] == null) {
                        billingSystem[i] = new electricityCostResidentialTariff(inputName(), inputAddress(), inputPhoneNumber(), inputConsumption());
                        break;
                    }
                }
            }
            if (choice == 2) {
                for (int i = 0; i < billingSystem.length; i++) {
                    if (billingSystem[i] == null) {
                        billingSystem[i] = new electricityCostRegularTariff(inputName(), inputAddress(), inputPhoneNumber(), inputConsumption());
                        break;
                    }
                }
            }
            if (choice == 3) {
                for (int i = 0; i < billingSystem.length; i++) {
                    if (billingSystem[i] == null) {
                        billingSystem[i] = new electricityCostCommercialTariff(inputName(), inputAddress(), inputPhoneNumber(), inputRegistrationNumber(), inputConsumption());
                        break;
                    }
                }
            }
            if (choice == 4) {
                for (int i = 0; i < billingSystem.length; i++) {
                    if (billingSystem[i] == null) {
                        billingSystem[i] = new electricityCostTelecomTariff(inputName(), inputAddress(), inputPhoneNumber(), inputRegistrationNumber(), inputConsumption());
                        break;
                    }
                }
            }
            if (choice == 5) {
                for (int i = 0; i < billingSystem.length; i++) {
                    if (billingSystem[i] == null) {
                        billingSystem[i] = new electricityCostSmallIndustrialTariff(inputName(), inputAddress(), inputPhoneNumber(), inputRegistrationNumber(), inputConsumption());
                        break;
                    }
                }
            }
            if (choice == 6){
                double total = 0;
                for (int i = 0; i < billingSystem.length; i++) {
                    if (billingSystem[i] != null) {
                        total += billingSystem[i].getTotalBills();
                        break;
                    }
                }
                System.out.println("total bills is: "+total);
            }
            if (choice == 7){
                double total = 0;
                for (int i = 0; i < billingSystem.length; i++) {
                    if (billingSystem[i] != null) {
                        System.out.println(billingSystem[i].toString());
                        break;
                    }
                }
            }
            inputYesNoChoice = inputYesNoChoice();
            if (inputYesNoChoice.equalsIgnoreCase("n"))
                break;
        }while (inputYesNoChoice.equalsIgnoreCase("y"));
    }


}
