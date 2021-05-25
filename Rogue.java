class Rogue extends Character implements Race {

    public Rogue(String name, int seed) {
        super(name, seed);

        //Passing The Highest Values to the specific Ability of the character
        super.setDexterity(array[0]);
        super.setIntelligence(array[1]);
        super.setStrength(array[2]);
        super.setConstitution(array[3]);
        super.setWisdom(array[4]);
        super.setCharisma(array[5]);
    }

    //Calling The Constructor
    public Rogue(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,int proficiencyMod, int health, boolean isDead, int race) {
        super(name, level, strength, dexterity, constitution, intelligence, wisdom, charisma, proficiencyMod, health, isDead, race);
    }

    public void levelUp() {
        System.out.println("Level up called");
        setLevel(getLevel()+1); //increasing the character's level by 1
        setHealth(getLevel()*5); //restoring health to maximum

        //increasing ability points for leveling Up
        setStrength(getStrength()+2);
        setDexterity(getDexterity()+3);
        setConstitution(getConstitution()+2);
        setIntelligence(getIntelligence()+2);
        setWisdom(getWisdom()+2);
        setCharisma(getCharisma()+2);
    }

    public void attack(Character c) {
        c.setHealth(c.getHealth()-(6+this.getDexterity()));
        if (c.getIsDead()==true){
            System.out.println("Cannot attack a dead character");
        }
    }

    public String toString() {
        return "Level "+ getLevel()+ " Rogue named "+ getName()+ " with " +getStrength()+ " strength, " + getDexterity()+ " dexterity, "+ getConstitution()+" constitution, "+ getIntelligence()+ " intelligence, "+ getWisdom()+ " wisdom and "+ getCharisma()+ " charisma ";
    }

}
