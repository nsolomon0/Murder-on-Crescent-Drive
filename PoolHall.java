import java.util.Scanner;
public class PoolHall {
    private String c1,c2,c3,c4,ball1C,ball2C,ball3C;
    private int ball1,ball2,ball3;

    public PoolHall(String v,String k,String I1,String kP, int a,int b, int d,String a1,String b1, String d1){
        c1=I1;
        c2=k;
        c3=kP;
        c4=v;
        ball1C=a1;
        ball2C=b1;
        ball3C=d1;
        ball1=a;
        ball2=b;
        ball3=d;

    }
    public void enterHall(){
        Scanner input=new Scanner(System.in);
        System.out.println("You enter the pool hall. This is where the murder took place, or at least where the body ended up.");
        System.out.println(c1+" and "+c2+" are also in the room, maybe they've seen something that will help you solve the case.");
        System.out.println("Do you want to talk to (1)"+c1+" ,(2)"+ c2+" or inspect (3)The Body, (4)The Pool Table or (0)Leave.");
        int choice = input.nextInt();
        while(choice!=0){
            switch(choice){
                case 1: System.out.println("\nYou try talking to "+c1+".");
                    System.out.println("\t'What do you want?'");
                    System.out.println("You ask if they have seen anyone acting strangely or out of the ordinary.");
                    System.out.println("\t'Well, this might be nothing, but I did see "+c2+" and "+c3+" in a heated argument about an hour or so before the incident. Could be nothing, but you never know.'");
                    System.out.println("\t'You didn't hear it from me though.', they ended.");
                    System.out.println("Do you want to talk to (1)"+c1+" ,(2)"+ c2+" or inspect (3)The Body, (4)The Pool Table or (0)Leave.");
                    choice = input.nextInt();
                    break;
                case 2: System.out.println("\nYou try talking to "+c2+", they are sobbing uncontrollably.");
                    System.out.println("\t'Are you alright?', you ask.");
                    System.out.println("Once they manage to compose themselves, "+c2+" explains to you:");
                    System.out.println("\tYou may not have known this, but we were very close, we've known each other for as long as I can remember, how could this happen!");
                    System.out.println("Their words seem genuine, and so do their tears.");
                    System.out.println("Do you want to talk to (1)"+c1+" ,(2)"+ c2+" or inspect (3)The Body, (4)The Pool Table or (0)Leave.");
                    choice = input.nextInt();
                    break;
                case 3: System.out.println("\nYou approach the body.");
                    System.out.println("You didn't know "+c4+" that well but, it's weird to see them like this.");
                    System.out.println("Upon further inspection of the body, you notice a fountain pen in their hand.");
                    System.out.println("You determine that a hit to the head is likely the cause of death, a blunt object perhaps.");
                    System.out.println("Do you want to talk to (1)"+c1+" ,(2)"+ c2+" or inspect (3)The Body, (4)The Pool Table or (0)Leave.");
                    choice = input.nextInt();
                    break;
                case 4: System.out.println("You take a look at the pool table. All but three of the pool balls are missing.");
                    System.out.println("On the table, you find: a "+ball1C+" "+ball1+" ball, a "+ball2C+" "+ball2+" ball and a "+ball3C+" "+ball3+" ball.");
                    System.out.println("Do you want to talk to (1)"+c1+" ,(2)"+ c2+" or inspect (3)The Body, (4)The Pool Table or (0)Leave.");
                    choice=input.nextInt();
                    break;
                default: System.out.println("Invalid Interaction.");
                    System.out.println("Do you want to talk to (1)"+c1+" ,(2)"+ c2+" or inspect (3)The Body, (4)The Pool Table or (0)Leave.");
                    break;
            } if(choice==0){
                System.out.println("You exit the pool hall.");
            }
        }
    }
}
