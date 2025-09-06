import java.util.Scanner;
public class Attic {
    //safe combination numbers
    private int s1,s2,s3;
    private String character;
    private boolean lock;
    private String killerWeapon;
    //private Study sRoom;
    public Attic(String kP, int a,int b, int c,String weapon){
        character=kP;
        s1=b;
        s2=a;
        s3=c;
        killerWeapon=weapon;
    }
    public void atticDoor(boolean haveKey){
        System.out.println("You walk upstairs to the attic door. It is locked.");
        if(haveKey==false){
            System.out.println("You don't have the key.");
        } else if(haveKey==true){
            enterAttic();
        }
    }
    public void enterAttic(){
        Scanner input=new Scanner(System.in);
        System.out.println("You decide to use the key you found in the study. It works!\n");
        System.out.println("You advance into the attic.");
        System.out.println("It's "+character+". You ask why they are up here alone when there has just been a murder.");
        System.out.println("\t'I came up because I thought I saw someone leaving but I couldn't make out who it was.");
        System.out.println("You tell them they shouldn't wander off on their own and to should return to the group downstairs.");
        System.out.println("They agree to go downstairs.");
        System.out.println("What do you want to inspect: (1)The Mayfield Portrait, (2)The old wardrobe or (0)Leave.");
        int choice= input.nextInt();
        while(choice!=0) {
            switch (choice) {
                case 1: System.out.println("You approach a large, dusty portrait in the center of the wall. It is of Julius and Fiona Mayfield.");
                System.out.println("You notice that one end of the frame has dust fingerprints on it. You grab the frame and pull to reveal a safe behind the portrait.");
                System.out.println("Do you want to enter the safe combination?(enter a number):(1)YES or (2)NO");
                int enter= input.nextInt();
                if (enter==1){
                    System.out.print("Enter first number:");
                    int c1= input.nextInt();
                    System.out.print("Enter second number:");
                    int c2=input.nextInt();
                    System.out.print("Enter third number:");
                    int c3=input.nextInt();
                    openSafe(c1,c2,c3);
                } else{
                    System.out.println("You choose to leave the safe, maybe you'll come back later.");
                }
                System.out.println("What do you want to inspect next: (1)The Mayfield Portrait, (2)The old wardrobe or (0)Leave.");
                choice = input.nextInt();
                    break;
                case 2: System.out.println("You see a grand wooden wardrobe in the corner of the room.");
                System.out.println("You open the doors to see a few old coats hanging inside. You look between each hanger.");
                System.out.println("You move the coats out of the way to see there is a false back of the wardrobe and you remove the panel.");
                System.out.println("You take a closer look at the photo which shows Fiona, Miles, Julius and Ivy. Julius and Ivy look really close. Miles seems to be envious of them. ");
                System.out.println("What could this mean and why is it hidden in this wardrobe.");
                System.out.println("What do you want to inspect next: (1)The Mayfield Portrait, (2)The old wardrobe or (0)Leave.");
                choice = input.nextInt();
                break;
                default:System.out.println("Invalid interaction.");
                System.out.println("What do you want to inspect: (1)The Mayfield Portrait, (2)The old wardrobe or (0)Leave.");
                choice = input.nextInt();
                break;
            } if(choice==0){
                System.out.println("You exit the Attic.");
            }
        }

    }
    public void openSafe(int x, int y, int z){
        if(x==s1 && y==s2 && z==s3){
            System.out.println("You entered the correct combination!");
            System.out.println("You open the safe to see some gold bars, jewellery and checkbooks. An object catches your eye from the corner of the safe.");
            System.out.println("\tYou find"+killerWeapon+" Surely this must be the murder weapon, but who put it here and when?");
            System.out.println("You bag the weapon and slip out of the attic.");
        } else{
            System.out.println("You entered an incorrect combination.");
        }
    }
}
