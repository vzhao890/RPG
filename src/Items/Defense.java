package Items;

public class Defense extends items {
    String[] giveDefense = {
            "Raggity Woodplank",//Starting Defense          Set Defense:75
            "Adequate Armor",//Drop Rate:80%                Set Defense:85
            "Knights Vow",//Drop Rate:50%                   Set Defense 100
            "Ultimate Mystical Shiny Armor"};//Drop Rate:1% Set Defense: 125

    public int giveAttack() {
        return 0;
    }
    public int giveDefense() {
        return 0;
    }

    public int givemp() {
        return 0;
    }
}
