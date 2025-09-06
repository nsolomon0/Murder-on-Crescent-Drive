import java.util.Scanner;
public class Study {
    private String character;
    private String book1,book2,book3,book4,book5,book6,correctbook;
    private String[] books=new String[6];
    private String killerItem;
    private boolean key1;
    public Study(String I2,String b1,String b2,String b3,String b4,String b5,String b6,String book,String item){
        key1=false;
        character=I2;
        book1=b1;
        books[0]=book1;
        book2=b2;
        books[1]=book2;
        book3=b3;
        books[2]=book3;
        book4=b4;
        books[3]=book4;
        book5=b5;
        books[4]=book5;
        book6=b6;
        books[5]=book6;
        correctbook=book;
        killerItem=item;
    }
    public void enterStudy(String col1,String col2,String col3){
        Scanner input=new Scanner(System.in);
        System.out.println("You enter the dimly lit study. There is a grand bookshelf on of the walls. You find "+character+" in the corner of the room.");
        System.out.println("You ask them what they are doing alone in here:");
        System.out.println("\t'Oh, I was walking past and noticed a candle was lit, I just came in to put it out,' they explain.");
        System.out.println("'Well you shouldn't wander around alone, it's not safe right now,' you say.");
        System.out.println("\t'Yes you're right, I'll get going now.' says "+character+", exiting the room.");
        System.out.println("What do you want to inspect (1)The bookshelf, (2)The desk or (0)Leave.");
        int choice=input.nextInt();
        while(choice!=0) {
            switch (choice) {
                case 1:
                    System.out.println("You walk up the the towering bookshelf.");
                    System.out.println("On the shelf in front of you, one of the books are missing its cover.");
                    System.out.println("Which book is missing its cover?:");
                    System.out.println("\t(1)" + books[0]);
                    System.out.println("\t(2)" + books[1]);
                    System.out.println("\t(3)" + books[2]);
                    System.out.println("\t(4)" + books[3]);
                    System.out.println("\t(5)" + books[4]);
                    System.out.println("\t(6)" + books[5]);
                    int b = input.nextInt() - 1;
                    if (books[b] == correctbook) {
                        System.out.println("You grab the book without a cover and you notice that there is a lump in the pages.");
                        System.out.println("You open the book to find a golden key.");
                        key1 = true;
                    } else {
                        System.out.println("You pull out the book and nothing happens.");
                    }
                    System.out.println("What do you want to inspect next, (1)The bookshelf, (2)The desk or (0)Leave.");
                    choice = input.nextInt();
                    break;
                case 2:
                    System.out.println("You move towards the cluttered study desk.");
                    System.out.println("Amongst the mess, you find" + killerItem);
                    System.out.println("You also find a note reading: "+col1+","+col2+","+col3+".");
                    System.out.println("What do you want to inspect next, (1)The bookshelf, (2)The desk or (0)Leave.");
                    choice = input.nextInt();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    System.out.println("What do you want to inspect (1)The bookshelf, (2)The desk or (0)Leave.");
                    choice = input.nextInt();
                    break;
            }
        }if(choice==0){
            System.out.println("You exit the study.");
        }
    }
    public boolean getKeyStatus(){
        return(key1);
    }
}
