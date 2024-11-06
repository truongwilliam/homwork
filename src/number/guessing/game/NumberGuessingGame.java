import java.util.Random;  
import java.util.Scanner;

package number.guessing.game;


public class NumberGuessingGame { 
    public static void main(String[] args) {
         Random random = new Random();  
        int numberToGuess = random.nextInt(50) + 1;
        int userGuess = 0;  
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Chao mung den voi tro choi doan so!");  
        System.out.println("Hay doan mot so tu 1 den 50:");  
        while (userGuess != numberToGuess) {  
            System.out.print("Nhap so cua ban: ");  
            userGuess = scanner.nextInt();  

            if (userGuess < numberToGuess) {  
                System.out.println("So cua ban thap hon. Hay thu lai!");  
            } else if (userGuess > numberToGuess) {  
                System.out.println("So cua ban cao hon. Hay thu lai!");  
            } else {  
                System.out.println("Chuc mung! Ban da doan dung5: " + numberToGuess);  
            }  
        }  

        scanner.close();
 
    }
    
}
