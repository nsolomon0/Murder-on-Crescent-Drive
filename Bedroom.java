import java.util.Scanner;
public class Bedroom {
    public Bedroom(){

    }
    public void enterRoom(String book,String letter){
        Scanner input=new Scanner(System.in);
        System.out.println("You enter the master bedroom. The room looks dishevelled, as if someone left in a panic and did not have time to clean up.");
        System.out.println("Do you want to inspect the (1)Bed (2)Window (3)Desk or (0)Leave.");
        int choice = input.nextInt();
        while(choice!=0){
            switch(choice){
                case 1: System.out.println("\nYou look around the bed. The sheets are all out of place and the pillows are laid across the room. This could be a sign of a struggle.");
                System.out.println("You look under the bed to see a pair of slippers. When you look behind them, you reveal a lone book cover.");
                System.out.println("Someone left the cover of a book under the bed, the cover is for:"+book);
                System.out.println("What do you want to inspect next, the (1)Bed (2)Window (3)Desk or (0)Leave.");
                choice = input.nextInt();
                break;
                case 2: System.out.println("\nYou look around the window. The latches are undone from the inside.");
                System.out.println("You see a pair of binoculars on the windowsill. You grab them and look out the window.");
                System.out.println("As you look out the window, you notice that the room directly across from the master bedroom is the study. You can clearly see into the room.");
                System.out.println("What do you want to inspect next, the (1)Bed (2)Window (3)Desk or (0)Leave.");
                choice = input.nextInt();
                break;
                case 3: System.out.println("\nYou look around the desk across from the bed.");
                System.out.println("Pencils and pens are sprawled across the table. You notice a piece of paper.");
                System.out.println("The paper is torn at the very bottom, there is no signature. From what is left, you make out a message:");
                System.out.println(letter);
                System.out.println("What do you want to inspect next, the (1)Bed (2)Window (3)Desk or (0)Leave.");
                choice = input.nextInt();
                break;
                default: System.out.println("Invalid Interaction.");
                System.out.println("Do you want to inspect the (1)Bedroom (2)Window (3)Desk or (0)Leave.");
                break;
            }
        } if(choice==0){
            System.out.println("You exit the Bedroom.");
        }
    }
}
