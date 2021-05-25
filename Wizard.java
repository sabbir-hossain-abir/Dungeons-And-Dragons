class Wizard extends Character implements Race{

    public Wizard(String name, int seed) {
        super(name, seed);

        //Passing The Highest Values to the specific Ability of the character
        super.setIntelligence(array[0]);
        super.setConstitution(array[1]);
        super.setStrength(array[2]);
        super.setDexterity(array[3]);
        super.setWisdom(array[4]);
        super.setCharisma(array[5]);
    }

    //Calling The Constructor
    public Wizard(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,int proficiencyMod, int health, boolean isDead, int race) {
        super(name, level, strength, dexterity, constitution, intelligence, wisdom, charisma, proficiencyMod, health, isDead, race);
    }

    public void levelUp() {
        System.out.println("Level up called");
        setLevel(getLevel()+1); //increasing the character's level by 1
        setHealth(getLevel()*5); //restoring health to maximum

        //increasing ability points for leveling Up
        setStrength(getStrength()+1);
        setDexterity(getDexterity()+1);
        setConstitution(getConstitution()+1);
        setIntelligence(getIntelligence()+2);
        setWisdom(getWisdom()+1);
        setCharisma(getCharisma()+1);
    }

    public void attack(Character c) {
        if (c.getIsDead()==true){
            System.out.println("Cannot attack a dead character");
        }
        else {
            c.setHealth(c.getHealth()-(4+this.getIntelligence()));
        }
    }

    public void multiAttack(Character[] c){
        for (int i=0; i<c.length; i++){
            if (c[i].getIsDead()==true){
                System.out.println("Can not damage a dead character");
            }
            else {
                c[i].setHealth(c[i].getHealth()-(2+this.getIntelligence()));
            }
        }
    }

    public String toString() {
        return "Level "+ getLevel()+ " Wizard named "+ getName()+ " with " +getStrength()+ " strength, " + getDexterity()+ " dexterity, "+ getConstitution()+" constitution, "+ getIntelligence()+ " intelligence, "+ getWisdom()+ " wisdom and "+ getCharisma()+ " charisma ";
    }

}
