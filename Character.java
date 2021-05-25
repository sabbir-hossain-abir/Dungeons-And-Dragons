import java.util.Random;

public abstract class Character implements Race{
    private String name;
    private int level;
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;
    private int strengthMod, dexterityMod, constitutionMod, intelligenceMod, wisdomMod, charismaMod;
    private int strengthInc, dexterityInc, constitutionInc, intelligenceInc, wisdomInc, charismaInc;
    private int proficiencyMod;
    private int health;
    private boolean isDead = false;
    public int[] array=new int[6];

    public Character(String name, int seed) {
        this.level = 1;
        this.health = 5;
        this.name = name;

        int[] maxsum=new int[6];
        int[] arr = new int[4];
        int maxsum1=maxsum[0], maxsum2=maxsum[0], maxsum3=maxsum[0], maxsum4=maxsum[0], maxsum5=maxsum[0], maxsum6=maxsum[0];

        Random random = new Random(seed);

        //Generating Random Values of Sum for 6 times
        for (int j = 0; j < maxsum.length; j++) {
            int max1 = 0, max2 = 0, max3 = 0, sum = 0;

            //Generating 4 Random Number Adding 3 Maximum values
            System.out.print("\nRandom Numbers: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(6) + 1;
                System.out.print(" "+arr[i]);

                if (arr[i] > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = arr[i];
                } else if (arr[i] > max2) {
                    max3 = max2;
                    max2 = arr[i];
                } else if (arr[i] > max3) {
                    max3 = arr[i];
                }
                sum = max1 + max2 + max3;
            }

            maxsum[j]=sum; //storing the values of sum
            System.out.println("\nSum of max 3 values: "+maxsum[j]);
            //sorting 6 sum values

            if (maxsum[j]>maxsum1){
                maxsum6=maxsum5;
                maxsum5=maxsum4;
                maxsum4=maxsum3;
                maxsum3=maxsum2;
                maxsum2=maxsum1;
                maxsum1=maxsum[j];
            }
            else if (maxsum[j]>maxsum2){
                maxsum6=maxsum5;
                maxsum5=maxsum4;
                maxsum4=maxsum3;
                maxsum3=maxsum2;
                maxsum2=maxsum[j];
            }
            else if (maxsum[j]>maxsum3){
                maxsum6=maxsum5;
                maxsum5=maxsum4;
                maxsum4=maxsum3;
                maxsum3=maxsum[j];
            }
            else if (maxsum[j]>maxsum4){
                maxsum6=maxsum5;
                maxsum5=maxsum4;
                maxsum4=maxsum[j];
            }
            else if (maxsum[j]>maxsum5){
                maxsum6=maxsum5;
                maxsum5=maxsum[j];
            }
            else if (maxsum[j]>maxsum6){
                maxsum6=maxsum[j];
            }

        }
        System.out.println("\nFirst Highest Score: "+maxsum1+"\nSecond Highest Score: "+maxsum2+"\nThird Highest Score: "+maxsum3+"\nFourth Highest Score: "+maxsum4+"\nFifth Highest Score: "+maxsum5+"\nSixth Highest Score: "+maxsum6+ "\n");
        array[0]=maxsum1;
        array[1]=maxsum2;
        array[2]=maxsum3;
        array[3]=maxsum4;
        array[4]=maxsum5;
        array[5]=maxsum6;
    }


    public Character(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,int proficiencyMod,int health, boolean isDead, int race) {
        //implement this constructor
        this.name = name;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.proficiencyMod = 2;
        this.health = this.level*5;
        this.isDead=isDead;

        //Increasing values based on Character increase value
        if(race==HUMAN){
            strengthInc++;
            dexterityInc++;
            constitutionInc++;
            intelligenceInc++;
            wisdomInc++;
            charismaInc++;

            this.strength=strength+strengthInc;
            this.dexterity=dexterity+dexterityInc;
            this.constitution=constitution+constitutionInc;
            this.intelligence=intelligence+intelligenceInc;
            this.wisdom=wisdom+wisdomInc;
            this.charisma=charisma+charismaInc;
        }
        else if (race==HALFLING){
            dexterityInc=dexterityInc+2;
            this.dexterity=dexterity+dexterityInc;
        }
        else if (race==ELF){
            dexterityInc=dexterityInc+2;
            this.dexterity=dexterity+dexterityInc;
        }
        else if (race==DWARF){
            constitutionInc=constitutionInc+2;
            this.constitution=constitution+constitutionInc;
        }

        //Modified values of Abilities
        if (strength>=2 && strength<=3){
            this.strengthMod=-4;
        }
        else if (strength>=4 && strength<=5){
            this.strengthMod=-3;
        }
        else if (strength>=6 && strength<=7){
            this.strengthMod=-2;
        }
        else if (strength>=8 && strength<=9){
            this.strengthMod=-1;
        }
        else if (strength>=10 && strength<=11){
            this.strengthMod=0;
        }
        else if (strength>=12 && strength<=13){
            this.strengthMod=1;
        }
        else if (strength>=14 && strength<=15){
            this.strengthMod=2;
        }
        else if (strength>=16 && strength<=17){
            this.strengthMod=3;
        }
        else if (strength>=18 && strength<=19){
            this.strengthMod=4;
        }
        else if (strength>=20 && strength<=21){
            this.strengthMod=5;
        }

        if (dexterity>=2 && dexterity<=3){
            this.dexterityMod=-4;
        }
        else if (dexterity>=4 && dexterity<=5){
            this.dexterityMod=-3;
        }
        else if (dexterity>=6 && dexterity<=7){
            this.dexterityMod=-2;
        }
        else if (dexterity>=8 && dexterity<=9){
            this.dexterityMod=-1;
        }
        else if (dexterity>=10 && dexterity<=11){
            this.dexterityMod=0;
        }
        else if (dexterity>=12 && dexterity<=13){
            this.dexterityMod=1;
        }
        else if (dexterity>=14 && dexterity<=15){
            this.dexterityMod=2;
        }
        else if (dexterity>=16 && dexterity<=17){
            this.dexterityMod=3;
        }
        else if (dexterity>=18 && dexterity<=19){
            this.dexterityMod=4;
        }
        else if (dexterity>=20 && dexterity<=21){
            this.dexterityMod=5;
        }

        if (constitution>=2 && constitution<=3){
            this.constitutionMod=-4;
        }
        else if (constitution>=4 && constitution<=5){
            this.constitutionMod=-3;
        }
        else if (constitution>=6 && constitution<=7){
            this.constitutionMod=-2;
        }
        else if (constitution>=8 && constitution<=9){
            this.constitutionMod=-1;
        }
        else if (constitution>=10 && constitution<=11){
            this.constitutionMod=0;
        }
        else if (constitution>=12 && constitution<=13){
            this.constitutionMod=1;
        }
        else if (constitution>=14 && constitution<=15){
            this.constitutionMod=2;
        }
        else if (constitution>=16 && constitution<=17){
            this.constitutionMod=3;
        }
        else if (constitution>=18 && constitution<=19){
            this.constitutionMod=4;
        }
        else if (constitution>=20 && constitution<=21){
            this.constitutionMod=5;
        }

        if (intelligence>=2 && intelligence<=3){
            this.intelligenceMod=-4;
        }
        else if (intelligence>=4 && intelligence<=5){
            this.intelligenceMod=-3;
        }
        else if (intelligence>=6 && intelligence<=7){
            this.intelligenceMod=-2;
        }
        else if (intelligence>=8 && intelligence<=9){
            this.intelligenceMod=-1;
        }
        else if (intelligence>=10 && intelligence<=11){
            this.intelligenceMod=0;
        }
        else if (intelligence>=12 && intelligence<=13){
            this.intelligenceMod=1;
        }
        else if (intelligence>=14 && intelligence<=15){
            this.intelligenceMod=2;
        }
        else if (intelligence>=16 && intelligence<=17){
            this.intelligenceMod=3;
        }
        else if (intelligence>=18 && intelligence<=19){
            this.intelligenceMod=4;
        }
        else if (intelligence>=20 && intelligence<=21){
            this.intelligenceMod=5;
        }

        if (wisdom>=2 && wisdom<=3){
            this.wisdomMod=-4;
        }
        else if (wisdom>=4 && wisdom<=5){
            this.wisdomMod=-3;
        }
        else if (wisdom>=6 && wisdom<=7){
            this.wisdomMod=-2;
        }
        else if (wisdom>=8 && wisdom<=9){
            this.wisdomMod=-1;
        }
        else if (wisdom>=10 && wisdom<=11){
            this.wisdomMod=0;
        }
        else if (wisdom>=12 && wisdom<=13){
            this.wisdomMod=1;
        }
        else if (wisdom>=14 && wisdom<=15){
            this.wisdomMod=2;
        }
        else if (wisdom>=16 && wisdom<=17){
            this.wisdomMod=3;
        }
        else if (wisdom>=18 && wisdom<=19){
            this.wisdomMod=4;
        }
        else if (wisdom>=20 && wisdom<=21){
            this.wisdomMod=5;
        }

        if (charisma>=2 && charisma<=3){
            this.charismaMod=-4;
        }
        else if (charisma>=4 && charisma<=5){
            this.charismaMod=-3;
        }
        else if (charisma>=6 && charisma<=7){
            this.charismaMod=-2;
        }
        else if (charisma>=8 && charisma<=9){
            this.charismaMod=-1;
        }
        else if (charisma>=10 && charisma<=11){
            this.charismaMod=0;
        }
        else if (charisma>=12 && charisma<=13){
            this.charismaMod=1;
        }
        else if (charisma>=14 && charisma<=15){
            this.charismaMod=2;
        }
        else if (charisma>=16 && charisma<=17){
            this.charismaMod=3;
        }
        else if (charisma>=18 && charisma<=19){
            this.charismaMod=4;
        }
        else if (charisma>=20 && charisma<=21){
            this.charismaMod=5;
        }
    }



    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level=level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength=strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity=dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence=intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom=wisdom;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution=constitution;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma=charisma;
    }

    public void setProficiencyMod(int proficiencyMod) {
        this.proficiencyMod = proficiencyMod;
    }

    public int getProficiencyMod() {
        return proficiencyMod;
    }

    public int getHealth() {
        if (this.health<0){
            return 0;
        }
        return health;
    }

    public void setHealth(int health) {
        this.health=health;
    }


    public boolean getIsDead() {
        if (health<=0){
            this.isDead=true;
        }
        else {
            this.isDead=false;
        }
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead=isDead;
    }

    public int getStrengthMod() {
        return strengthMod;
    }

    public int getDexterityMod() {
        return dexterityMod;
    }

    public int getConstitutionMod() {
        return constitutionMod;
    }

    public int getIntelligenceMod() {
        return intelligenceMod;
    }

    public int getWisdomMod() {
        return wisdomMod;
    }

    public int getCharismaMod() {
        return charismaMod;
    }

    public abstract void levelUp();

    public abstract void attack(Character c);

    public abstract String toString();

}
