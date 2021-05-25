class Cleric extends Character implements Race{

    public Cleric(String name, int seed) {
        super(name, seed);

        //Passing The Highest Values to the specific Ability of the character
        super.setWisdom(array[0]);
        super.setStrength(array[1]);
        super.setDexterity(array[2]);
        super.setConstitution(array[3]);
        super.setIntelligence(array[4]);
        super.setCharisma(array[5]);
    }

    //Calling The Constructor
    public Cleric(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,int proficiencyMod, int health, boolean isDead, int race) {
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
        setIntelligence(getIntelligence()+1);
        setWisdom(getWisdom()+2);
        setCharisma(getCharisma()+1);
    }

    public void attack(Character c) {
        if (c.getIsDead()==true){
            System.out.println("Cannot attack a dead character");
        }
        else {
            c.setHealth(c.getHealth()-(6+this.getWisdom()));
        }

    }

    public void heal(Character c){
        System.out.println("Heal method called");
        if (c.getIsDead()==true){
            System.out.println("Cannot heal a dead character");
        }
        else if (c.getHealth()< c.getLevel()*5){
            c.setHealth(c.getHealth()+(6+this.getWisdom()));
        }
    }

    public String toString() {
        return "Level "+ getLevel()+ " Cleric named "+ getName()+ " with " +getStrength()+ " strength, " + getDexterity()+ " dexterity, "+ getConstitution()+" constitution, "+ getIntelligence()+ " intelligence, "+ getWisdom()+ " wisdom and "+ getCharisma()+ " charisma ";
    }

}
