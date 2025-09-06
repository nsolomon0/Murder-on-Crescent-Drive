import java.util.Random;
public class CharactersAndClues {
    private String[] characters=new String[5];
    private String[] cFirstName=new String[5];
    private String[] cast=new String[5];
    //character first names
    private String[] castFN = new String[5];
    private String[] books=new String[6];
    private Random rnd=new Random();
    //full names
    private String cVictim,cKiller,cInnocent1,cInnocent2,cInnocent3;
    //first names
    private String cV,cK,cI1,cI2,cI3;
    private String bookCover,letter,murderWeapon;
    private String revealDialogue;
    private String killerItemInStudy;
    //numbers on pool balls
    private int pB1,pB2,pB3;
    //color of pool balls
    private String pBC1,pBC2,pBC3;
    private boolean key;
    public CharactersAndClues(){
        key=false;
        characters[0]="Julius Mayfield";
        cFirstName[0]="Julius";
        characters[1]="Fiona Mayfield";
        cFirstName[1]="Fiona";
        characters[2]="Ivy Baxter";
        cFirstName[2]="Ivy";
        characters[3]="Miles Fairchild";
        cFirstName[3]="Miles";
        characters[4]="Charlotte Banks";
        cFirstName[4]="Charlotte";
        for(int i=0;i<5;i++){
            cast[i]="";
            castFN[i]="";
        }
        for(int i=0;i<6;i++){
            books[i]="";
        }
        cVictim=" ";
        cV="";
        cKiller=" ";
        cK="";
        cInnocent1=" ";
        cI1="";
        cInnocent2=" ";
        cI2="";
        cInnocent3=" ";
        cI3="";
        bookCover="";
        letter="";
        murderWeapon="";
        setClues();
    }
    public void setKey(boolean have){
        key=have;
    }
    public void setCast(){
        int c1, c2, c3, c4, c5;

        c1= rnd.nextInt(5);
        cVictim=characters[c1];
        cV=cFirstName[c1];
        cast[0]=cVictim;
        castFN[0]=cV;

        do {
            c2= rnd.nextInt(5);
        } while(c2 == c1);
        cKiller=characters[c2];
        cK=cFirstName[c2];
        cast[1]=cKiller;
        castFN[1]=cK;

        do {
            c3= rnd.nextInt(5);
        } while(c3 == c1 || c3 == c2);
        cInnocent1=characters[c3];
        cI1=cFirstName[c3];
        cast[2]=cInnocent1;
        castFN[2]=cI1;

        do {
            c4= rnd.nextInt(5);
        } while(c4==c1 || c4==c2 || c4==c3);
        cInnocent2=characters[c4];
        cI2=cFirstName[c4];
        cast[3]=cInnocent2;
        castFN[3]=cI2;

        do{
            c5= rnd.nextInt(5);
        } while(c5==c1 || c5==c2|| c5==c3 || c5==c4);
        cInnocent3=characters[c5];
        cI3=cFirstName[c5];
        cast[4]=cInnocent3;
        castFN[4]=cI3;
    }
    public String getCharacter(int x){
        return(characters[x]);
    }
    public String getFirstName(int y){
        return(castFN[y]);
    }
    public String getCast(int i){
        return(cast[i]);
    }
    public void setBook(){
        int book= rnd.nextInt(6);
        books[0]=" '1984' by George Orwell.";
        books[1]=" 'The Great Gatsby' by F.Scott Fitzgerald.";
        books[2]=" 'Frankenstein' by Mary Shelley.";
        books[3]=" 'The Outsiders' by S.E.Hinton.";
        books[4]=" 'Fahrenheit 451' by Ray Bradbury.";
        books[5]=" 'Pride and Predjudice' by Jane Austen.";
        bookCover=books[book];
    }
    public String getCovers(int i){
        return(books[i]);
    }
    public String getBook(){
        return(bookCover);
    }
    public void setWeaponAndItem(){
        switch(cKiller) {
            case "Julius Mayfield":
                murderWeapon = " a wooden mallet.";
                killerItemInStudy = " a smoking pipe. It's still warm.";
                break;
            case "Fiona Mayfield":
                murderWeapon = " a can of paint.";
                killerItemInStudy = " a palette knife, with what seems to be red paint on it.";
                break;
            case "Ivy Baxter":
                murderWeapon = " a glass paperweight.";
                killerItemInStudy = " a pair of sunglasses. There seems to be a few strands of red hair wrapped around them.";
                break;
            case "Miles Fairchild":
                murderWeapon = " a tire iron.";
                killerItemInStudy = " a tie clip. It is engraved with the letters 'FM'.";
                break;
            case "Charlotte Banks":
                murderWeapon = " a broken broom.";
                killerItemInStudy = " a feather duster.";
                break;
        }
    }
    public String getWeapon(){
        return(murderWeapon);
    }
    public String getkillerItem(){
        return(killerItemInStudy);
    }
    public void setPoolBalls(){
        int ballColor=rnd.nextInt(4);
        switch(ballColor) {
            case 0:
                pBC1 = "red";
                pBC2 = "blue";
                pBC3 = "orange";
                break;
            case 1:
                pBC1 = "orange";
                pBC2 = "brown";
                pBC3 = "yellow";
                break;
            case 2:
                pBC1 = "yellow";
                pBC2 = "red";
                pBC3 = "purple";
                break;
            case 3:
                pBC1 = "green";
                pBC2 = "orange";
                pBC3 = "red";
                break;
        }
        pB1=rnd.nextInt(15)+1;
        do{
            pB2=rnd.nextInt(15)+1;
        } while(pB1==pB2);
        do{
            pB3=rnd.nextInt(15)+1;
        }while (pB1==pB3);
    }
    public String getPBColor(int i){
        String ball=null;
        if(i==1){
            ball=pBC1;
        } else
        if(i==2){
            ball=pBC2;
        } else
        if(i==3){
            ball=pBC3;
        }
        return(ball);
    }
    public int getPBNum(int x){
        int y=0;
        if(x==1){
            y=pB1;
        }
        if(x==2){
            y=pB2;
        }
        if(x==3){
            y=pB3;
        }
        return(y);
    }
    public void setClues(){
        setCast();
        setBook();
        setWeaponAndItem();
        setPoolBalls();
        setDialogueAndLetter();
    }
    public void setDialogueAndLetter() {
        if (cKiller == characters[0]) {
            if (cVictim != characters[2] || cVictim != characters[1]) {
                revealDialogue = "'Oh fine, it was me, but I had no choice, " + cV + " knew about my affair with Ivy and threatened to tell Fiona. I just couldn't let that happen, my family would be destroyed.'";
                letter="\t'Oh my, I can't believe my eyes, they're having an affair, I just saw them in the study. \n\tI'm not sure if they saw me but right now they're- oh, they've left the study, I would leave in a hurry too if I was suspicious of being seen. \n\tI just can't believe it, Julius and-'\nThe note ends there.";
            } else if (cVictim == characters[2]) {
                revealDialogue = "'I guess it's time to give it up. Yes, it was me but I had no choice, she threatened to tell Fiona everything about our affair if I didn't divorce Fiona and marry her, I had to make sure she kept her mouth closed.'";
                letter="\t'He has some nerve, he still pretends to love her.\n\tI can see them now in the study, all cozy together.\n\tHow will she feel when she knows the truth. I'm telling her tonight, he-'\tThe note ends there.";
            } else if (cVictim == characters[1]) {
                revealDialogue = "'I guess it's time to give it up, I killed her. She found out about my affair with Ivy and threatened to tell the press, I had to save my image.;";
                letter="\t'I've had enough, I was fine with him seeing her off where it didn't affect me, but now he bring s her here.\n\tHe dares disrespect me in my own home, no way.\tTonight, I will show him, he-'\tThe note ends there.";
            }
        } else if (cKiller == characters[1]) {
            if (cVictim != characters[0]) {
                revealDialogue = "'Oh Fine! Yes ok, it was me, " + cV + " overheard me and " + cI3 + " talking about how I stole money from ,my family's company and I had to make sure they wouldn't tell anyone.'";
                letter="\t'Oh no, I fear my secret is out, I'm sure they know now. I can see them talking in the study now.\n\tWhat will my family say, I simply cannot let them tell anyone-'\tThe note ends suddenly there.";
            } else {
                revealDialogue = "'Fine, I admit I killed him, but he was cheating on me! I was not going to let him leave me, I gave him everything and this is how he treated me!'";
                letter="\t'I don't believe him, after all I've given him, he does this.\n\tI've just seen them in the study. An affair!\n\tHe will not get away with this-'\tThe not ends abruptly there.";
            }
        } else if (cKiller == characters[2]) {
            if (cVictim == characters[0]) {
                revealDialogue = "'Okay, I killed " + cV + " but what was I supposed to do after he threatened to spill the details of our affair to the press, my career would be ruined. You all would have done the same!'";
                letter="\t'I cannot believe this, him and her, together, how could she do this to me, I thought we were in love.\n\tI've just seen them in the study through the window.\n\tShe will not get away with this, Ivy and-'\nThe note ends there";
            } else {
                revealDialogue = "'Okay, I killed " + cV + " but what was I supposed to do after they threatened to spill the details of my affair with Julius to the press, my career would be ruined. You all would have done the same!'";
                letter="\t'Great heavens, I can't believe my eyes, they're having an affair! I just saw them in the study. \n\tHow could he do this, all those years of marriage, down the drain; and her! \n\tI just can't believe it, Julius and-'\nThe note ends there.";

            }
        } else if (cKiller == characters[3]) {
            if(cVictim!=characters[0]) {
                revealDialogue = "'It was me, fine I'll admit it. "+cV+" found out about my and "+cI3+"'s less than legal business practices and I tried to talk them down from exposing us but they refused. I did what I had to!'";
                letter="\t'I don't believe it, I thought he was above this.\nI'm so close I can hear them, their corruption, their immorality, they cannot get away with what they are doing.\n\tOh dear, I think he saw me- they're gone from the study, I need to-'\tThe not ends abruptly there.";
            } else{
                revealDialogue="'Fine, I killed him. When I found out he was having an affair with Ivy my heart broke. Not only was he cheating on my dear cousin, but I loved Ivy and Julius knew that. He got what he deserved.'";
                letter="\tMy heart is broken.\n\tHow could he do this, I can see them now in the study. He knows I love her, but he doesn't care, he never did. I won't let him step all over me again, he'll know-'\tThe note cuts off there.";
            }
        } else if (cKiller==characters[4]){
            if(cVictim==characters[0]){
                revealDialogue= "'Oh alright, I killed him. For five years I've been his maid and I've never gotten so much as a thank you. He was ungrateful and spoiled. When "+cI3+" told me he was planning on firing me, I had to do something.'";
                letter="\t'I've decided to get rid of her, I know it's been many years but she has gotten lazy, I can see her lounging in the study now.\n\tThis has been a long time coming, it's time for me to part ways with-'.\nThe note ends there.";
            }
            else if(cVictim==characters[1]){
                revealDialogue="'Fine, fine, It was me, I killed Fiona. I have been in love with Julius since I've worked for him but he refuses to leave her, I had to get her out of the picture.'";
                letter="\t'I can see them in the study now, pretending their happy, he would be so much happier with me.\n\tI've got to get rid of-'\nThe note ends there.";
            } else {
                revealDialogue="'Alright, alright, I killed "+cV+". They caught me going through the Mayfield safe and threatened to tell. I love this job and didn't want to lose it, what was I to do?'";
                letter="\t'Honestly, it's so good to find good help these days.\n\tJulius, Fiona, I though you might like to know what I've just seen in the attic.\n\tI think your gonna need to talk to-'\nThe note stops there.";
            }
        }
    }
    public String getRevealDialogue(){
        return(revealDialogue);
    }
    public String getLetter(){
        return(letter);
    }
}
