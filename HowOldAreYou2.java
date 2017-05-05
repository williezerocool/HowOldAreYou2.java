/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howoldareyou2;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class HowOldAreYou2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        String name;
        
        System.out.print("Hey, what's your name? Sorry I keep forgetting? ");
        name = keyboard.next();
        
        System.out.print("Ok " + name + " How old are? ");
        age = keyboard.nextInt();
        
        if(age < 16){
            System.out.println("You can't drive");
        }else if(age == 16 || age == 17){
            System.out.println("You can drive, but not vote");
        }else if(age >= 18 && age <= 24){
            System.out.println("You can vote but not rent a car");
        }else{
            System.out.println("You can pretty much do anything");
        }
    }
    
}
