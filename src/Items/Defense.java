package Items;

public class Defense extends items {
    String[] giveDefense = {
            "Raggity Woodplank",//Starting Defense     Defense:75
            "Adequate Armor",//Drop Rate:80%           Defense:85
            "Knights Vow",//Drop Rate:50%              Defense 100
            "Ultimate Mystical Shiny Armor"};//Drop Rate:1% Defense 125

    public int giveAttack() {
        return 0;
    }
    public int giveDefense() {
        int prob1= (int)(Math.random()*10)+1;
        System.out.println(prob1);
        if(prob1!=1 && prob1!=2)
        {
            return 85;
        }
        prob1 = (int)(Math.random()*2)+1;
        if(prob1==1)
        {
            return 100;
        }
        prob1 = (int)(Math.random()*100)+1;
        if(prob1==1)
        {
            return 125;
        }
        return 0;
    }


}
