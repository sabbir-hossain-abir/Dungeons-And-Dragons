class Fighter extends Character implements Race {

    public Fighter(String name, int seed) {
        super(name, seed);
        super.setStrength(array[0]);
        super.setDexterity(array[1]);
        super.setConstitution(array[2]);
        super.setIntelligence(array[3]);
        super.setWisdom(array[4]);
        super.setCharisma(array[5]);
    }

    public Fighter(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,int proficiencyMod, int health, boolean isDead, int race) {
        super(name, level, strength, dexterity, constitution, intelligence, wisdom, charisma, proficiencyMod, health, isDead, race);
    }

    public void levelUp() {
        System.out.println("Level up called");
        setLevel(getLevel()+1); //increasing the character's level by 1
        setHealth(getLevel()*5); //restoring health to maximum

        //increasing ability points for leveling Up
        setStrength(getStrength()+2);
        setDexterity(getDexterity()+1);
        setConstitution(getConstitution()+1);
        setIntelligence(getIntelligence()+1);
        setWisdom(getWisdom()+1);
        setCharisma(getCharisma()+1);
    }

    //Attack method
    public void attack(Character c) {
        if (c.getIsDead()==true){
            System.out.println("Cannot attack a dead character");
        }
        else {
            c.setHealth(c.getHealth()-(10+getStrength()));
        }
    }

    public String toString() {
        return "Level "+ getLevel()+ " fighter named "+ getName()+ " with " +getStrength()+ " strength, " + getDexterity()+ " dexterity, "+ getConstitution()+" constitution, "+ getIntelligence()+ " intelligence, "+ getWisdom()+ " wisdom and "+ getCharisma()+ " charisma ";
    }

}
