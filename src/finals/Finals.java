/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;
import java.util.*;
/**
 *
 * @author janke
 */
public class Finals extends user_side {
static user_side s1 = new user_side();
static Scanner s = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("[1]Login\n[2]Register\n\nEnter choice: ");
        int choice = s.nextInt();
        if(choice == 1)
            registerMain();
        else if(choice == 2)
            loginMain();
    }
    
    public static void registerMain(){
        System.out.print("\nEnter Username: ");
        String username = s.next();
        System.out.print("\nEnter Password: ");
        String password = s.next();
        System.out.print("\nEnter Password Again: ");
        String confirmation = s.next();
        System.out.print("\nEnter Choice: ");
        int choice = s.nextInt();
      
        if(s1.register(username, password, confirmation, choice))
            loginMain();
    }
    
    public static void loginMain(){
        System.out.print("\nEnter Username: ");
        String username = s.next();
        System.out.print("\nEnter Password: ");
        String password = s.next();
        if(s1.login(username, password) == true)
            menu();
        else
            loginMain();

    }
    
    public static int menu(){
        System.out.println("1");
        int choice = s.nextInt();
        return choice;
    }
    public void home(){
           while(true){
            switch(menu()){
                case 1:
                    System.out.println("Hihi");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Grats");
                                
            }
        }
    }
    
    //admin side
    //admin functionalities sorting,checking logs,all user history, active and inactive users, sending warning messages to late users
    //terminate accounts SECURITY THIRD RATE ENCRYPTION(wag mo nang gawin keen kapag tinatamad ka)
    
    
}
