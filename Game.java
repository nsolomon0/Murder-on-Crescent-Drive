import java.util.Scanner;
public class Game {
    private CharactersAndClues cc;
    private Accusation charge;
    private Bedroom bRoom;
    private Attic aRoom;
    private Study sRoom;
    private PoolHall phRoom;
    private boolean end;
    public Game(){
        end=false;
        cc = new CharactersAndClues();
        System.out.println("*");
        bRoom= new Bedroom();
        sRoom=new Study(cc.getFirstName(3),cc.getCovers(0),cc.getCovers(1),cc.getCovers(2),cc.getCovers(3),cc.getCovers(4),cc.getCovers(5),cc.getBook(),cc.getkillerItem());
        aRoom=new Attic(cc.getCast(4),cc.getPBNum(1),cc.getPBNum(2),cc.getPBNum(3),cc.getWeapon());
        phRoom=new PoolHall(cc.getFirstName(0),cc.getFirstName(1),cc.getFirstName(2),cc.getFirstName(4),cc.getPBNum(1),cc.getPBNum(2),cc.getPBNum(3),cc.getPBColor(1),cc.getPBColor(2),cc.getPBColor(3));
        charge=new Accusation(cc.getFirstName(0),cc.getFirstName(1),cc.getFirstName(2),cc.getFirstName(3),cc.getFirstName(4));
    }
    public void displayRules(){
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t\tThe Murder on Crescent Drive");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tIt's a cold evening in February. You are a detective with the Chicago PD who is taking some time off. You are attending a dinner party at the big house on Crescent Drive, the Mayfield estate.");
        System.out.println("You don't know the hosts all that well and you were only invited because you used to be roommates with Miles Fairchild in college, he is good friends with Mr.Mayfield.");
        System.out.println("The night is moving slowly, you make small conversation here and there but you have very little in common with the other guests.");
        System.out.println("While you are enjoying a drink in the living room, you hear a voice approaching, screaming.");
        System.out.println("When they enter the room you see the voice belongs to "+cc.getCast(2)+" and they are screaming bloody murder.");
        System.out.println("\t'Dead! Th-they're dead! There's been a murder! Someone killed "+cc.getCast(0)+"!'");
        System.out.println("You don't believe it, this seemingly boring dinner party has just presented the grandest twist of events.");
        System.out.println("There's been a murder. Everyone seems to be in shock over the news.");
        System.out.println("You call the police but there is a massive snowstorm and they cannot reach the house until morning. They tell you to work the case and gather what you can until they arrive.");
        System.out.println("This is what you know about the house's inhabitants:");
        System.out.println("\tJulius Mayfield(29 yrs): The owner of house. Husband to Fiona Mayfield and a well-known philanthropist. Julius attended Harvard Law and is known as an exceptional lawyer.");
        System.out.println("\tFiona Mayfield(27 yrs): The wife of Julius Mayfield for 3 years. She is rather shy and spends her time painting and writing poetry.");
        System.out.println("\tIvy Baxter(24 yrs): The cousin to Fiona Mayfield. Attended college with Miles Fairchild. She is a well-established film star who is known for her bright red hair and has just landed a major part in a Hollywood Blockbuster.");
        System.out.println("\tMiles Fairchild(32 yrs): One of Julius's closest friends. Miles runs his family's automotive company and is always in a suit. He was recently ranked amongst the 10 wealthiest CEO's in a distinguished financial publication.");
        System.out.println("\tCharlotte Banks(28 yrs): The long-standing maid at the Mayfield residence. She has worked for Mr.MayField for 5 years now and often keeps to herself.");
        System.out.println("\nYou determine that the rooms of interest are the master bedroom, the study, the pool hall and the attic.");
        System.out.println("Using clues and items you discover in the house, determine who the killer is and accuse the right person to solve the case.");
        System.out.println("But be cautious, make too many false accusations and the killer might catch on");
        System.out.println("**{Good Luck and Begin}**");
    }
    public void playGame(){
        Scanner input=new Scanner(System.in);
        displayRules();
        System.out.println("What do you want to investigate: (1)The Bedroom, (2)The Study, (3)The PoolHall, (4)The Attic, or (5)Make an Accusation.");
        int choice= input.nextInt();
        while(end==false) {
            switch (choice) {
                case 1:
                    bRoom.enterRoom(cc.getBook(),cc.getLetter());
                    System.out.println("What do you want to investigate: (1)The Bedroom, (2)The Study, (3)The PoolHall, (4)The Attic, or (5)Make an Accusation.");
                    choice= input.nextInt();
                    break;
                case 2:
                    sRoom.enterStudy(cc.getPBColor(2),cc.getPBColor(1),cc.getPBColor(3));
                    System.out.println("What do you want to investigate: (1)The Bedroom, (2)The Study, (3)The PoolHall, (4)The Attic, or (5)Make an Accusation.");
                    choice = input.nextInt();
                    break;
                case 3:
                    phRoom.enterHall();
                    System.out.println("What do you want to investigate: (1)The Bedroom, (2)The Study, (3)The PoolHall, (4)The Attic, or (5)Make an Accusation.");
                    choice = input.nextInt();
                    break;
                case 4:
                    aRoom.atticDoor(sRoom.getKeyStatus());
                    System.out.println("What do you want to investigate: (1)The Bedroom, (2)The Study, (3)The PoolHall, (4)The Attic, or (5)Make an Accusation.");
                    choice = input.nextInt();
                    break;
                case 5:
                    String reveal=cc.getRevealDialogue();
                    if(charge.makeAccusation(reveal)){
                        setEnd();
                        gameEnd();
                    } else {
                        System.out.println("What do you want to investigate: (1)The Bedroom, (2)The Study, (3)The PoolHall, (4)The Attic, or (5)Make an Accusation.");
                        choice = input.nextInt();
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("What do you want to investigate: (1)The Bedroom, (2)The Study, (3)The PoolHall, (4)The Attic, or (5)Make an Accusation.");
                    choice = input.nextInt();
                    break;
            }
        }
    }
    public void setEnd(){
        end=true;
    }
    public void gameEnd(){
        System.out.println("\n\t\tThank You For Playing!");
        System.out.println("\n\tCredits:\nWritten and Designed by Nardos Solomon\nProgrammed by Nardos Solomon");
    }

}
