package Tdd;

import java.util.Scanner;

public class AtmNewMain {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        AtmNew myNewCard = new AtmNew();
        for(int i = 1; i < 3; i++){
        System.out.println("Create your pin");
        String pin = userInput.nextLine();
        myNewCard.setPin(pin);

        System.out.println("please confirm your pin");
        String comfirmPin = userInput.nextLine();
        myNewCard.setPin(comfirmPin);

            if(pin.equals(comfirmPin)){
            System.out.println("pin created succesfully");
            break;
            }else
                System.out.println("pin mismatch, Try again!!!");
        }

        }



    }

