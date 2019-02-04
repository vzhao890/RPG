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
    public int giveDefense(String name) {
        if(name.equalsIgnoreCase("Raggity Woodplank"))
        {
            return 10;
        }
        else if(name.equalsIgnoreCase("Adequate Armor"))
        {
            return 30;
        }
        else if(name.equalsIgnoreCase("Knights Vow"))
        {
            return 30;
        }
        else if(name.equalsIgnoreCase("Ultimate Mystical Shiny Armor"))
        {
            return 100;
        }else{
            return 0;
        }
    }

    public int givemp() {
        return 0;
    }
}
