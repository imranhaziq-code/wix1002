package VIVA3.IMRANQ2;

public class V3Q2 {
    public static void main(String[] args) {
        Zoo myzoo = new Zoo(3);
        
        myzoo.addCreature("Panda", 150.0, "Mountains");
        myzoo.addCreature("Dragon", 300.0, "Cave");
        myzoo.addCreature("Master Oogway", 200.0, "Forest");
        
        myzoo.addCreature("Patrick Star", 250.0, "Rock");
        
        myzoo.displayAllCreatures();
        
        myzoo.feedCreature("Dragon", 50.0);
        
        myzoo.displayAllCreatures();
    }
}
