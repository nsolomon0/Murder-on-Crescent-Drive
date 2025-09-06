import java.util.Scanner;
public class Accusation {
    private int guesses;
    private String victim,killer,innocent1,innocent2,innocent3;
    public Accusation(String v,String k,String I1,String I2,String I3){
        guesses=0;
        //game=new Game();
        victim=v;
        killer=k;
        innocent1=I1;
        innocent2=I2;
        innocent3=I3;
    }
    public boolean makeAccusation(String reveal) {
        String suspect = null;
        Scanner input=new Scanner(System.in);
        System.out.println("You are making an accusation!");
        System.out.println("Who do you want to accuse?:");
        System.out.println("(1)"+killer);
        System.out.println("(2)"+innocent1);
        System.out.println("(3)"+innocent2);
        System.out.println("(4)"+innocent3);

        int accuse=input.nextInt();
        if(accuse==1) {
            System.out.println("You are accusing: "+killer);
            suspect=killer;
        }
        if(accuse==2){
            System.out.println("You are accusing: "+innocent1);
            suspect=innocent1;
        }
        if(accuse==3){
            System.out.println("You are accusing: "+innocent2);
            suspect=innocent2;
        }
        if(accuse==4){
            System.out.println("You are accusing: "+innocent3);
            suspect=innocent3;
        }
        System.out.println("Are you sure about your choice?(enter number):(1)Yes or (2)No");
        int confirm=input.nextInt();
        if(confirm==1){
            System.out.println("You have accused "+suspect+" of killing "+victim);
            if(suspect==killer){
                correctGuess(reveal);
                return(true);
            } else {
                incorrectGuess(suspect);
                if (guesses == 1) {
                    return (false);
                } else if(guesses==2){
                    return (true);
                }
            }
        } else{
            System.out.println("You take back your accusation.");
        }
        return(false);
    }
    public void correctGuess(String reveal){
        System.out.println("You caught the Killer!");
        if(guesses>0){
            System.out.println(killer+"'s eyes darts around the room.");
            System.out.println("You can't seriously trust them, we can't expect an accurate investigation after that false accusation.");
        }
        System.out.println("\t'Me?! Why would I kill "+victim+", you've lost your mind!', exclaims "+killer+ " before breaking down and confessing:");
        System.out.println(reveal);
        System.out.println("\nCONGRATULATIONS!, YOU HAVE SUCCESSFULLY UNMASKED THE KILLER! THE OCCUPANTS OF THE FAIRCHILD ESTATE ARE FOREVER GRATEFUL FOR YOUR HELP!");
        if(guesses==0){
            System.out.println("\nYOU EARNED THE 'TRUE DETECTIVE' ENDING!: you've been doing this for years- reveal the killer on your first guess.");
        } else if(guesses>0){
            System.out.println("\nYOU EARNED THE 'FOOL ME ONCE' ENDING!: second time's the charm- reveal the killer on your second attempt.");
        }
    }
    public void incorrectGuess(String suspect){
        System.out.println("You have accused an innocent person!");
        if(guesses==0){
            System.out.println("\t'Seriously, are you just guessing?' says "+suspect+", 'How could I have killed "+victim+", I was with "+innocent1+" when the murder happened and we found the body together.'");
            System.out.println(innocent1+" confirms "+suspect+"'s story and everyone expresses their annoyance at your false accusation.");
            System.out.println("Be careful who you accuse next, the killer might be getting suspicious of your investigation.");
            guesses++;
        } else if(guesses==1){
            System.out.println("\t'Unbelievable! You have some nerve throwing out another half-baked accusation!', "+suspect+" yells at you.");
            System.out.println("\t'"+innocent2+" can verify that we were chatting in the foyer when "+innocent1+" came in yelling about the murder.");
            guesses++;
            System.out.println("You are stumped, you thought it was "+suspect+" for sure.");
            System.out.println("Once everyone is finished yelling at you and insulting your investigative skills, you head down the main hall alone.");
            System.out.println("You go to the restroom to rinse your face and reassess the case.");
            System.out.println("Just then, it hits you: 'of course, it's so obvious now, the signs were all there; it was-");
            System.out.println("\t'Me!', you turn to see "+killer+" standing in the doorway.");
            System.out.println("\t'Sorry Detective, you've been a real pain today and I fear your luck has run out-'");
            System.out.println(killer+" lunges at you and everything fades to black.");
            System.out.println("XXXX\t\t\tGAME OVER\t\t\tXXXX");
            System.out.println("YOU EARNED THE 'SO CLOSE YET SO FAR' ENDING!: you nearly had them but it was too little too late- fail to catch the killer before they kill you.");
            //game.setEnd(1);
        }

    }
}
