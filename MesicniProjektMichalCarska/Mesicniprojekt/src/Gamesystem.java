
import java.util.Random;
import java.util.Scanner;


public class Gamesystem {

    Scanner scanner = new Scanner(System.in);
    /* unused
    String[] higherenemies = {"Golem", "Cockatrice", "Viper", "Shadowlady", "Kraken", "Crocozilla", "BigParasite", "SandDemon", "LivingCoal","Grue","TallThing"};*/
    //final boss
            String theboss = "Kali";
    int choices;
    int option;
    String officialname;
    int officialstrength;
    int officialstamina;
    int officialmagika;
    int officialmaxhp;
    int officiallvl;
    int officialoption;
    //barvičky
    String boldcyan = "\033[1;36m";
    String boldred = "\033[1;31m";
    String brightgreen = "\033[0;92m";
    String brightred = "\033[0;91m";
    String boldyellow = "\033[1;33m";
    String yellow = "\033[0;33m";
    String purple = "\033[0;35m";
    String white = "\033[0;37m";
    String blue = "\033[0;34m";
    String boldblue = "\033[1;34m";
    String underlineblue = "\033[4;34m";
    String green = "\033[0;32m";
    String red = "\033[0;31m";
    String whitebold = "\033[1;97m";
    String purplebold = "\033[1;35m";
    String blackbold = "\033[1;30m";
    String yellowbright = "\033[0;93m";
    String colorreset = "\033[0m";
    int usedmagicone = 0;
    int usedmagictwo = 0;
    int usedmagicthree = 0;
    int usedmagicfour = 0;
    int usedmagicfive = 0;
    int usedmagicsix = 0;
    int usedmagicseven = 0;





///jednotlivá magic
    String[] optiononemagic = {"Prayer","Heal"/*lvl2*/,"Villager´s Help"/*lvl7*/,}; //Fanda

    String[] optiontwomagic = {"Prayer","Heal"/*lvl2*/,"Villager´s Help"/*lvl6*/,"Spirit Kill" /*lvl9*/,"Speed Dash" /*lvl15*/}; //Saska

    String[] optionthreemagic = {"Prayer","Heal"/*lvl2*/,"Villager´s Help"/*lvl2*/,"Magic Shield"/*lvl5*/,"Sun´s Hand" /*lvl6*/,"Demon´s Hand" /*lvl10*/,"Thunder" /*lvl13*/}; //Vojta

    String[] lowerenemies = {"Eye","BigSpider", "Witch", "Parasite", "Treant", "Zombie", "Bigfish", "DeadWolf", "Cockatrice", "Kali"};
    //nastaveni postavy
    int [] lowerenemiescoins = {10,15,20,5,40,10,40,50};
    public void character(String name, int strength, int stamina,  int magika, int maxhp,  int lvl, int option){
        if (lvl > 0){
        System.out.println(whitebold + "Jméno: " + name + colorreset);
        System.out.println(yellow + "Strength: " + strength + colorreset);
        System.out.println(boldyellow + "Stamina: " + stamina + colorreset);
        System.out.println(purple + "Magika: " + magika + colorreset);
        System.out.println(green + "Max hp: " + maxhp + colorreset);
        System.out.println(boldcyan + "lvl: " + lvl + colorreset);
        }
        officialmaxhp = maxhp;
        officiallvl = lvl;
        officialname = name;
        officialstamina = stamina;
        officialstrength = strength;
        officialmagika = magika;
        officialoption = option;
    }
    Random rd = new Random();
    int realrandomlowenemy = 0;
    //vygenerovani random enemy
    public void generatelowenemy(){
        int generatedlowenemy = 0;
      if (lvlbetterthanten == 0){
        generatedlowenemy = rd.nextInt(6);}
      else if (lvlbetterthanten == 1){
          generatedlowenemy = rd.nextInt(8);
      }
        realrandomlowenemy -= realrandomlowenemy;
        realrandomlowenemy += generatedlowenemy;
    }
    public void characterinfo(){
        System.out.println(whitebold + "Jméno: " + officialname + colorreset);
        System.out.println(yellow + "Strength: " + officialstrength + colorreset);
        System.out.println(boldyellow + "Stamina: " + officialstamina + colorreset);
        System.out.println(purple + "Magika: " + officialmagika + colorreset);
        System.out.println(green + "Max hp: " +  officialmaxhp + colorreset);
        System.out.println(boldcyan + "lvl: " + officiallvl + colorreset);
        System.out.println(boldyellow + "Coins: " + coins + colorreset);
        System.out.println(yellow + "Vaše momentální zbraň: " + currentlyequippedweapon + " + " + addedweapondamage + " damage" + colorreset);
        System.out.println(green + "Počet revives: " + revivenumber + colorreset);
    }
    //útoky k jednotlivým enemies
    String[][] lowattacks = {{/*Eye*/"Bouchnutí","Stare"}, {/*Bigspider*/"Venom", "Bite"}, {/*Witch*/"Hození Potionem","Vyhealovani"},{/*Parasite*/"Infestation","Venom"},
            {/*Treeant*/"Síla přířody", "Přerůstnutí"}, {/*Zombie*/"Scratch","Nakažení"}, {/*Bigfish*/"Bouchnutí", "Topení"}, {/*DeadWolf*/"Bite","Nakažení"} };
    //hp a síla enemies

    int[][] lowhpandlowstrength = {{/*eyeball*/90,30}, {/*bigspider*/150, 20}, {/*Witch*/140,50},{/*Parasite*/30,80},
            {/*Treeant*/300, 50}, {/*Zombie*/100,20}, {/*Bigfish*/200, 35}, {/*DeadWolf*/120,45} };
    int lowstrength;
    int lowmaxhp;

    String lowenemyfirstattack;
    String lowenemysecondattack;
    String lowenemythirdattack;

    int roundpoison = 0;
    int poisondmg = 0;
    int infestnum = 0;
    int nakazeninum = 0;
    int drown = 0;
    int growth = 0;
    int temporaryhp;
    int originallowmaxhp = 0;
    int temporarystrength;
    int temporarystamina;

    int temporarymagic;
    int shield;
    int magicshield;
    int nakazenimoment;
    int lvlgain;
    int officialplace;
    int villagerhere;
    int paralized;
    int revivenumber = 0;
    int haveshop = 0;
    int addedweapondamage = 0;
    int coins = 0;
    int tetanus = 0;
    int tetanuson;
    int calculateddamage = 0;
    int didaction = 0;
    int itemwasfound;
    int catsword = 0;
    public void groundlevel(int place){
        /*0 je podzemí*/
        /*1 je nadzemí*/
        officialplace = place;
    }
    //lvl up
    int lvlbetterthanten = 0;
    int lvlbetterthantwenty = 0;
    public void levelup(){
        while (lvlgain > 0) {
            System.out.println("Vyberte si co si chcete zvýšit");
            System.out.println(yellow + "1. Max.Strength" + colorreset);
            System.out.println(green + "2. Max.HP" + colorreset);
            System.out.println(purple + "3. Max Magic" + colorreset);
            int choose = 0;
            while(true){try {
                choose = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println(red + "Zadejte pouze číslo." + colorreset);
                scanner.nextLine();
            }
                }
            switch (choose) {
                case 1 -> {
                    System.out.println(yellow + "Vaše Max.Strength se zvyšuje o 2" + colorreset);
                    officialstrength += 2;
                    lvlgain--;
                }
                case 2 -> {
                    System.out.println(green + "Vaše Max.HP se zvyšuje o 10" + colorreset);
                    officialmaxhp += 10;
                    lvlgain--;
                }
                case 3 -> {
                    System.out.println(purple + "Vaše Max.Magic se zvyšuje o 2" + colorreset);
                    officialmagika += 2;
                    lvlgain--;
                }
            }
        }
    }
    int tutorial = 1;
    int kaliboss = 0;
    int obtaincoins;
    int lightningpowered;

    //souboj
    public void lowFight(){
        //reset status moves a přiřazeni temp. stats
        lightningpowered = 0;
        villagerhere = 0;
        shield = 0;
        magicshield = 0;
        temporaryhp = 0;
        temporaryhp += officialmaxhp;
        temporarymagic = 0;
        temporarymagic += officialmagika;
        temporarystamina = 0;
        temporarystamina += officialstamina;
        paralized = 0;
        int potentialcrit;
        roundpoison = 0;
        poisondmg = 0;
        infestnum = 0;
        nakazeninum = 0;
        nakazenimoment = 0;
        drown = 0;
        growth =  0;
        lvlgain = 1;
        tetanuson = 0;
        //finalboss
        if (kaliboss == 0) {
            System.out.println("Vběhl/a do tebe " + whitebold + lowerenemies[realrandomlowenemy] + colorreset);
            lowmaxhp = lowhpandlowstrength[realrandomlowenemy][0];
            originallowmaxhp += lowmaxhp;
            lowstrength = lowhpandlowstrength[realrandomlowenemy][1];
            lowenemyfirstattack = lowattacks[realrandomlowenemy][0];
            lowenemysecondattack = lowattacks[realrandomlowenemy][1];
            obtaincoins = lowerenemiescoins[realrandomlowenemy];
            System.out.println("Strength: " + lowstrength);
            System.out.println("HP: " + lowmaxhp);
            System.out.println("Attacks: " + lowenemyfirstattack + " a " + lowenemysecondattack + colorreset);
            System.out.println(" ");
        }
        else if (kaliboss == 1){
            realrandomlowenemy = 9;
            System.out.println("Přistoupil k tobě " + boldred + theboss + colorreset);
            lowmaxhp = 1000;
            originallowmaxhp += lowmaxhp;
            lowstrength = 120;
            lowenemyfirstattack = "Po sobě jdoucí pěsti";
            lowenemysecondattack = "Kaliho Magie";
            lowenemythirdattack = lowattacks[1][0];
            System.out.println("Strength: " + lowstrength);
            System.out.println("HP: " + lowmaxhp);
            System.out.println("Attacks: " + lowenemyfirstattack + " , " + lowenemysecondattack + " a " + lowenemythirdattack + colorreset);
            System.out.println(" ");
        }
        temporarystrength = 0;
        temporarystrength += officialstrength;
        calculateddamage = temporarystrength += addedweapondamage;
        //loopovani souboje
        while (lowmaxhp > 0 || temporaryhp > 0){
            if (lightningpowered == 0){
            temporarystrength = 0;
            temporarystrength += officialstrength;
            calculateddamage = temporarystrength += addedweapondamage;}
            else if (lightningpowered == 1){
                temporarystrength = 0;
                temporarystrength += officialstrength;
                temporarystrength += 20;
                calculateddamage = temporarystrength += addedweapondamage;
            }
            int critvalue = rd.nextInt(3);

           int generatedattack = 0;
           if (kaliboss == 0){
               generatedattack = rd.nextInt(2);}
           else if (kaliboss == 1){
               generatedattack = rd.nextInt(3);}
            if (lowmaxhp <= 0) {
                if (kaliboss == 0) {
                    System.out.println("Porazil jsi " + whitebold + lowerenemies[realrandomlowenemy] + colorreset);
                    coins += obtaincoins;
                    System.out.println(boldyellow + "+ " + obtaincoins + " coinů" + colorreset);
                    officiallvl += lvlgain;
                    System.out.println(boldcyan + "Váš level je teď " + officiallvl + colorreset);
                    if (officiallvl >= 10){
                        if (lvlbetterthanten == 0){
                        System.out.println(purple + "Odemkl jste 2 nové enemies."  + colorreset);
                            System.out.println(purple + "Deadwolf."  + colorreset);
                            System.out.println(purple + "Bigfish" + colorreset);
                            System.out.println(purple + "Můžete do nich vběhnout při farmění nebo při normal fightu."  + colorreset);

                            lvlbetterthanten = 1;}
                    }
                    break;
                }
                else {
                    for (int i = 0; i < 7; i++) {
                        switch (i) {
                            case 0 -> System.out.println(boldred + "Kali " + colorreset + "padnul.");
                            case 1 -> System.out.println(boldred + "Promiň.. já nechtěl.." + colorreset);
                            case 2 -> System.out.println("Začalo se uzavírat podzemí");
                            case 3 -> System.out.println("Rozběhl jsi se plnou silou a..");
                            case 4 ->System.out.println("Stihl jsi to, jsi na povrchu");
                            case 5 -> System.out.println(brightgreen + "GOOD-ENDING" + colorreset);
                            case 6 -> System.out.println(boldcyan + "1/4 ENDING" + colorreset);
                        }
                        continuethis = scanner.nextLine();
                    }

                    System.exit(0);
                }
            }
           if (paralized == 0) {
               if (magicshield == 0) {
                   if (shield == 0) {

                           switch (realrandomlowenemy) {
                               case 0 -> {
                                   if (generatedattack == 0) {
                                       bouchnuti();
                                   } else {
                                       stare();
                                   }
                               }
                               case 1 -> {
                                   if (generatedattack == 0) {
                                       venom();
                                   } else {
                                       bite();
                                   }
                               }
                               case 2 -> {
                                   if (generatedattack == 0) {
                                       hozenipotionem();
                                   } else {
                                       vyhealovani();
                                   }

                               }
                               case 3 -> {
                                   if (generatedattack == 0) {
                                       infestation();
                                       infestnum += 3;
                                   } else venom();
                               }
                               case 4 -> {
                                   if (generatedattack == 0) {
                                       silaprirody();

                                   } else {
                                       prerustnuti();
                                   }
                               }
                               case 5 -> {
                                   if (generatedattack == 0) {
                                       scratch();
                                   } else {
                                      nakazeni();
                                   }
                               }
                               case 6 -> {
                                   if (generatedattack == 0) {
                                       bouchnuti();
                                   } else {
                                       topeni();
                                   }
                               }
                               case 7 -> {
                                   if (generatedattack == 0) {
                                       bite();
                                   } else {
                                       nakazeni();
                                   }

                               }
                               case 9 -> {
                                   if (generatedattack == 0) {
                                       kalibouchnuti();
                                   }
                                   else if (generatedattack == 1){
                                       eternaldream();
                                   }
                                   else{
                                       venom();
                                   }
                               }
                           }

                   }




                 //status moves
                    if (roundpoison > 0) {
                       System.out.println("Máš v sobě jed.");
                       temporaryhp -= poisondmg;
                       System.out.println(purple + "- " + poisondmg + " HP" + colorreset);
                       roundpoison--;
                   }
                   if (infestnum > 0) {
                       System.out.println("Jí tě zaživa.");
                       temporaryhp -= 5;
                       System.out.println(boldred + "- " + 5 + " HP" + colorreset);
                       infestnum--;
                   }
                   if (nakazenimoment >= 1) {
                       nakazeninum++;
                       System.out.println("Death Countdown " + boldred + nakazeninum + " - 15" + colorreset);

                   }
                   if (nakazeninum == 15) {
                       temporaryhp -= temporaryhp;
                   }
                   if (drown > 0) {
                       System.out.println(boldblue + lowerenemies[realrandomlowenemy] + " vás topí");
                       System.out.println(boldred + "- " + 25 + " HP" + colorreset);
                       temporaryhp -= 25;
                   } else {
                       shield = 0;
                   }
               } else {
                   magicshield = 0;
               }
           }
           else if (paralized == 1){
               System.out.println(yellow + lowerenemies[realrandomlowenemy] + " se nemůže hýbat." + colorreset);
               paralized = 2;
           } else if (paralized == 2) {
               System.out.println(yellow + lowerenemies[realrandomlowenemy] + " se nemůže skoro hýbat." + colorreset);
               paralized = 3;
           } else if (paralized == 3) {
               System.out.println(yellow + lowerenemies[realrandomlowenemy] + " se bude brzy hýbat..." + colorreset);
               paralized = 0;
           }
            if (temporaryhp <= 0){
                if (revivenumber > 0){
                    System.out.println(yellow + "Použil jste jednu revive." + colorreset);
                    System.out.println(green + "+ " + 50 + " HP" + colorreset);
                    temporaryhp = 0;
                    temporaryhp += 50;
                    revivenumber--;
                     roundpoison = 0;
                     poisondmg = 0;
                     infestnum = 0;
                     nakazeninum = 0;
                     drown = 0;
                     growth = 0;

                }
                else if (revivenumber == 0) {
                    if (kaliboss == 0) {
                        System.out.println("Zemřel jste.");
                        System.out.println("Víc šancí nemáte.");
                        System.out.println("Pokud chcete hrát znovu, runněte Main.");
                        System.exit(0);
                    }
                    else {
                        for (int i = 0; i < 7; i++) {
                            switch (i) {
                             case 0 -> System.out.println(boldred + "Padnul jsi." + colorreset);
                             case 1 -> System.out.println("Z Fedrie se stalo místo chaosu," + boldred + " Kali" + colorreset + " zabijí každého koho jen vidí");
                             case 2 -> System.out.println("Ti co zbyli, neztratili naději a snaží se mu postavit");
                             case 3 -> System.out.println("Třeba se to někomu jednomu dne povede");
                             case 4 -> System.out.println(boldred + "Ty už to ale nebudeš." + colorreset);
                             case 5 -> System.out.println(boldred + "WORST-ENDING" + colorreset);
                             case 6 -> System.out.println(boldcyan + "2/4 ENDING");
                            }
                            continuethis = scanner.nextLine();
                        }

                        System.exit(0);
                    }
                }

            }       //villageractive
                    if (villagerhere > 0){
                        int villagerdamage = 4;
                        if (villagerhere == 1){
                            System.out.println(purple + "Vesníčan zaútočil." + colorreset);
                            System.out.println(purple + lowerenemies[realrandomlowenemy] +  " - " + villagerdamage + " HP" + colorreset);
                            lowmaxhp -= villagerdamage;
                            villagerhere++;
                        }
                        else if (villagerhere == 2) {
                            System.out.println(purple + "Vesníčan zaútočil." + colorreset);
                            System.out.println(purple + lowerenemies[realrandomlowenemy] +  " - " + 2*villagerdamage + " HP" + colorreset);
                            lowmaxhp -= 2*villagerdamage;
                            villagerhere++;
                        } else if (villagerhere == 3) {
                            System.out.println(purple + "Vesníčan zaútočil." + colorreset);
                            System.out.println(purple + lowerenemies[realrandomlowenemy] +  " - " + 4*villagerdamage + " HP" + colorreset);
                            lowmaxhp -= 4*villagerdamage;
                            villagerhere = 0;

                        }
                    }
                    //tetanus
                    if (tetanuson == 1){
                        System.out.println(boldred + "Tetanus" + colorreset);
                        System.out.println(yellow + lowerenemies[realrandomlowenemy] + " - " + 15 + " HP" + colorreset);
                        lowmaxhp -= 15;
                    }
            System.out.println(" ");
                    if (temporaryhp > 0){
            System.out.println(green + "Vaše HP: " + temporaryhp + colorreset);}
                    else {
                        System.out.println("Vaše HP: " + 0);
                    }
                    if (lowmaxhp >= 0) {
                        System.out.println(red + lowerenemies[realrandomlowenemy] + " HP: " + lowmaxhp + colorreset);
                    }
                    else {
                        System.out.println(boldcyan + lowerenemies[realrandomlowenemy] + " HP: " + 0 + colorreset);
                    }
                    if (tutorial == 1){
            System.out.println("Pokud si chcete zvýšit damage na toto kolo, musíte uhodnout správně číslo od " + boldcyan + "1-3" + colorreset);
            System.out.println("Pokud ne, zadejte " + whitebold + "0" + colorreset);
            System.out.println("Hádání stojí " + yellowbright  + 1 + " Stamina" + colorreset + ", ale pokud uhádnete správně, " + yellowbright + "Stamina" + colorreset + " vám nebude odebrána.");
            System.out.println("Takhle to bude pokaždé, napíšete 1-3 a budete mít šanci ubrat více");
                    tutorial--;}
                    else {
                        System.out.println(".");
                    }
                    while(true){
                    try{potentialcrit = scanner.nextInt();
                        potentialcrit--;
                        break;
                    }catch (Exception e){
                        System.out.println(red + "Pište pouze čísla." + colorreset);
                        scanner.nextLine();
                    }
                    }


        //možný crit
                    if (potentialcrit == critvalue){
                        System.out.println(underlineblue + "Uhodl jste to správně." + colorreset);
                        System.out.println(blue + "2 * Physical Dmg na toto kolo." + colorreset);
                        calculateddamage += calculateddamage;

                    }
                    else if (potentialcrit != critvalue & potentialcrit >= 0){
                        System.out.println("Too bad.");
                        System.out.println(boldyellow + " - 1" + " Stamina" + colorreset);
                        temporarystamina -= 1;
                        if (temporarystamina < 0){
                            temporarystamina = 0;
                        }

                    }
                    else if (potentialcrit < 0) {
                        System.out.println("Saveuješ si staminu.");
                    }

            int madechoice = 0;
            int innerchoices = 0;
            if (temporarymagic < officialmagika){
                temporarymagic += 2;
                if (temporarymagic >= officialmagika){
                    temporarymagic -= temporarymagic;
                    temporarymagic += officialmagika;
                    System.out.println(purple + "Vaše magic je teď na max." + colorreset);
                    scanner.nextLine();
                    line = scanner.nextLine();
                }
                else {
                    System.out.println(purple + "Magic + "  + 2 + colorreset);
                    scanner.nextLine();
                    line = scanner.nextLine();
                }
            }
                    while(madechoice == 0) {
                        System.out.println(boldyellow + "Your turn!" + colorreset);
                        if (potentialcrit == critvalue){
                            System.out.println(boldcyan + "Strength: " + boldcyan + calculateddamage + colorreset);
                        }
                        else{
                            System.out.println(whitebold + "Strength: " + calculateddamage + colorreset);
                        }
                        System.out.println(whitebold + "Magic: " + temporarymagic + colorreset + whitebold + "\nStamina: " + temporarystamina + colorreset);
                        if (revivenumber > 0){
                        System.out.println(white +"Revives: " + brightgreen +  revivenumber + colorreset);}
                        else{
                            System.out.println(whitebold +"Revives: " + revivenumber + colorreset);
                        }
                        System.out.println(boldyellow + "Co budete dělat?" + colorreset);
                        System.out.println(whitebold + "1. Fight" + purplebold + "\n2. Magic" +  brightgreen + "\n3. Act" + colorreset);
                            try{
                        choices = scanner.nextInt();
                        if (choices == 1) {
                            System.out.println("1. Seknutí." + " - 5 Stamina");
                            System.out.println("2. Bránit se shieldem.");
                            System.out.println(boldyellow + "Stamina: " + temporarystamina + colorreset);
                            innerchoices = scanner.nextInt();
                            if (innerchoices == 1 && temporarystamina >= 5) {
                                seknutimecem();
                                madechoice++;
                            } else if (innerchoices == 1 & temporarystamina < 5) {
                                System.out.println("Nemáte dostatek staminy");
                                continue;
                            }
                            if (innerchoices == 2) {
                                shield();
                                madechoice++;
                            }


                        } else if (choices == 2) {
                            //používání magie
                            switch (officialoption) {
                                //Fanda
                                case 1 -> {
                                    if (officiallvl >= 1) {
                                        newMagic(usedmagicone);
                                        System.out.println("1. " + optiononemagic[0] + purple + " - 2 magic" + colorreset);
                                    }
                                    if (officiallvl >= 2) {
                                        newMagic(usedmagictwo);
                                        System.out.println("2. " + optiononemagic[1] + purple + " - 3 magic" + colorreset);
                                    }
                                    if (officiallvl >= 7) {
                                        newMagic(usedmagicthree);
                                        System.out.println("3. " + optiononemagic[2] + purple + " - 4 magic" + colorreset);
                                    }
                                    int x = scanner.nextInt();
                                    if (x == 1 & temporarymagic >= 2 & officiallvl >= 1) {
                                        prayer();
                                        usedmagicone = 1;
                                        madechoice++;
                                    } else if (x == 2 & temporarymagic >= 3 & officiallvl >= 2) {
                                        heal();
                                        usedmagictwo = 1;
                                        madechoice++;
                                    } else if (x == 3 & temporarymagic >= 4 & officiallvl >= 7) {
                                        villagershelp();
                                        usedmagicthree = 1;
                                        madechoice++;
                                    } else {
                                        System.out.println("Nedostatek magie");
                                    }
                                }
                                //Saska
                                case 2 -> {
                                    if (officiallvl >= 1) {
                                        newMagic(usedmagicone);
                                        System.out.println("1. " + optiontwomagic[0] + purple + " - 2 magic" + colorreset);
                                    }
                                    if (officiallvl >= 2) {
                                        newMagic(usedmagictwo);
                                        System.out.println("2. " + optiontwomagic[1] + purple + " - 3 magic" + colorreset);
                                    }
                                    if (officiallvl >= 6) {
                                        newMagic(usedmagicthree);
                                        System.out.println("3. " + optiontwomagic[2] + purple + " - 4 magic" + colorreset);
                                    }
                                    if (officiallvl >= 9) {
                                        newMagic(usedmagicfour);
                                        System.out.println("4. " + optiontwomagic[3] + purple + " - 5 magic" + colorreset);
                                    }
                                    if (officiallvl >= 15) {
                                        newMagic(usedmagicfive);
                                        System.out.println("5. " + optiontwomagic[4] + purple + " - 10 magic" + colorreset);
                                    }
                                    int x = scanner.nextInt();
                                    if (x == 1 & temporarymagic >= 2 & officiallvl >= 1) {
                                        prayer();
                                        usedmagicone = 1;
                                        madechoice++;
                                    } else if (x == 2 & temporarymagic >= 3 & officiallvl >= 2) {
                                        heal();
                                        usedmagictwo = 1;
                                        madechoice++;
                                    } else if (x == 3 & temporarymagic >= 4 & officiallvl >= 6) {
                                        villagershelp();
                                        usedmagicthree = 1;
                                        madechoice++;
                                    } else if (x == 4 & temporarymagic >= 5 & officiallvl >= 9) {
                                        spiritkill();
                                        usedmagicfour = 1;
                                        madechoice++;
                                    } else if (x == 5 & temporarymagic >= 10 & officiallvl >= 15) {
                                        speeddash();
                                        usedmagicfive = 1;
                                        madechoice++;
                                    } else {
                                        System.out.println("Nedostatek magie");
                                    }

                                }
                                //Vojta
                                case 3 -> {
                                    if (officiallvl >= 1) {
                                        newMagic(usedmagicone);
                                        System.out.println("1. " + optionthreemagic[0] + purple + " - 2 magic" + colorreset);
                                    }
                                    if (officiallvl >= 2) {
                                        newMagic(usedmagictwo);
                                        System.out.println("2. " + optionthreemagic[1] + purple + " - 3 magic" + colorreset);
                                    }
                                    if (officiallvl >= 2) {
                                        newMagic(usedmagicthree);
                                        System.out.println("3. " + optionthreemagic[2] + purple + " - 4 magic" + colorreset);
                                    }
                                    if (officiallvl >= 5) {
                                        newMagic(usedmagicfour);
                                        System.out.println("4.  " + optionthreemagic[3] + purple + " - 5 magic " + colorreset);
                                    }
                                    if (officiallvl >= 6) {
                                        newMagic(usedmagicfive);
                                        System.out.println("5. " + optionthreemagic[4] + purple + " - max magic " + colorreset);
                                    }
                                    if (officiallvl >= 10) {
                                        newMagic(usedmagicsix);
                                        System.out.println("6. " + optionthreemagic[5] + purple + " - 7 magic" + colorreset);
                                    }
                                    if (officiallvl >= 13) {
                                        newMagic(usedmagicseven);
                                        System.out.println("7. " + optionthreemagic[6] + purple + " - 5 magic " + colorreset);
                                    }
                                    int x = scanner.nextInt();
                                    if (x == 1 & temporarymagic >= 2 & officiallvl >= 1) {
                                        prayer();
                                        usedmagicone = 1;
                                        madechoice++;
                                    } else if (x == 2 & temporarymagic >= 3 & officiallvl >= 2) {
                                        heal();
                                        usedmagictwo = 1;
                                        madechoice++;
                                    } else if (x == 3 & temporarymagic >= 4 & officiallvl >= 2) {
                                        villagershelp();
                                        usedmagicthree = 1;
                                        madechoice++;
                                    } else if (x == 4 & temporarymagic >= 5 & officiallvl >= 5) {
                                        magicshield();
                                        usedmagicfour = 1;
                                        madechoice++;
                                    } else if (x == 5 & temporarymagic == officialmagika & officiallvl >= 6) {
                                        sunshand();
                                        usedmagicfive = 1;
                                        madechoice++;
                                    } else if (x == 6 & temporarymagic >= 7 & officiallvl >= 10) {
                                        demonshand();
                                        usedmagicsix = 1;
                                        madechoice++;
                                    } else if (x == 7 & temporarymagic >= 5 & officiallvl >= 13) {
                                        thunder();
                                        usedmagicseven = 1;
                                        madechoice++;
                                    } else {
                                        System.out.println("Nedostatek magie");
                                    }
                                }

                            }
                            //act
                        } else if (choices == 3) {
                            int talkchoice = 0;
                            while (talkchoice == 0) {
                                System.out.println(green + "1. Promluvit" + colorreset);
                                System.out.println(green + "2. Dotek" + colorreset);
                                int innerchoice = scanner.nextInt();
                                switch (innerchoice) {
                                    case 1 -> {
                                        promluveni();
                                        talkchoice++;
                                        madechoice++;
                                    }
                                    case 2 -> {
                                        dotek();
                                        talkchoice++;
                                        madechoice++;
                                    }
                                }
                            }
                        }
                        }catch (Exception e){
                                System.out.println(red + "Zadejte pouze čísla." + colorreset);
                                scanner.nextLine();
                            }


                    }
        //doplnovani staminy
             if (innerchoices == 2) {
                 if (temporarystamina <= 2 * officialstamina) {
                     System.out.println(yellow + "Stamina + " + 3 + colorreset);
                     temporarystamina += 3;
                     if (temporarystamina >= 2 * officialstamina) {
                         System.out.println("Vaše " + yellow + "Stamina" + colorreset + " nemůže být víc jak 2 krát vetší než na začátku souboje.");
                         temporarystamina = 0;
                         temporarystamina += 2 * officialstamina;
                     }
                 }


                 innerchoices = 0;
             }
        }

     }






    public static void pushConsole (){ //dělá mezeru mezi interakcemi
        for (int i = 0; i < 100; i++) {
            System.out.println();


        }


    }

    //enemy utoky
    public void bouchnuti(){

        System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " tě bouchl/a");
        int lowrealdamage = rd.nextInt(31);
        int damagetaken;
        if (lowrealdamage <= 20) {
            damagetaken = lowhpandlowstrength[realrandomlowenemy][1];
            temporaryhp -= damagetaken;
        }
        else {
            damagetaken = 2 * lowhpandlowstrength[realrandomlowenemy][1];
            temporaryhp -= damagetaken;
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + red + " critnul/a" + colorreset);

        }
        System.out.println(boldred + "- " + damagetaken + " HP" + colorreset);

    }
    public void stare(){
        System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " se na tebe dívá");
        System.out.println("Je to divné, ale nic se neděje.");
    }
    public void venom(){
        System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + purple + " do tebe vstříkl/a jed." + colorreset);
        if (roundpoison == 0) {
            roundpoison += 3;
            poisondmg = 15;
        }
        else {

            System.out.println(purple + "Už v sobě jed máš, takže se tvá HP snížuje ještě víc" + colorreset);
            poisondmg += 2;
        }
    }

    public void bite(){
        System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " tě kousl/a");
        int lowrealdamage = rd.nextInt(31);
        int damagetaken;
        if (lowrealdamage <= 20) {
            damagetaken = lowhpandlowstrength[realrandomlowenemy][1];
            temporaryhp -= damagetaken;
            System.out.println(boldred + "- " + damagetaken + " HP" + colorreset);

        }
        else {
            damagetaken = 2 * lowhpandlowstrength[realrandomlowenemy][1];
            temporaryhp -= damagetaken;
            System.out.println(boldred + "- " + damagetaken + " HP" + colorreset);
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + red + " critnul/a"+colorreset);


        }

    }
    public void hozenipotionem(){
        System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " po tobě hodil/a lektvarem");
        int randompotion = rd.nextInt(6);
        if (randompotion == 0){
            System.out.println("Je to ten nejhorší potion");
            temporaryhp -= 50;
            System.out.println(boldred + "- " + 50 + " HP" + colorreset);

        }
        else if (randompotion == 1){
            temporaryhp -= 20;
            System.out.println(boldred + "- " + 20 + " HP" + colorreset);

        }
        else if (randompotion == 2){
            temporaryhp -= 5;
            System.out.println(boldred + "- " + 5 + " HP" + colorreset);

        }
        else if (randompotion == 3){
            temporaryhp -= 1;
            System.out.println("Je to ten nejslabší potion");
            System.out.println(boldred + "- " + 1 + " HP" + colorreset);

        }
        else if (randompotion == 4){
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " na tebe hodil/a jedovatý potion");
            if (roundpoison == 0) {
                roundpoison += 3;
                poisondmg = 15;
            }
            else {
                System.out.println("Už v sobě jed máš, takže se tvé HP snížuje ještě víc");
                poisondmg += 2;

        }}
        else if(randompotion == 5){
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " si spletl/a lektvar a hodil/a na tebe healing potion");
            temporaryhp += 40;
            System.out.println(brightgreen + "+ " + 40 + " HP");

        }
    }
    public void vyhealovani(){
        if (lowmaxhp < originallowmaxhp) {
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " se vyhealoval/a");
            lowmaxhp += 40;
            System.out.println(lowerenemies[realrandomlowenemy] + " + " + 40 + " HP");
            if (lowmaxhp > originallowmaxhp){
                lowmaxhp = 0;
                lowmaxhp += originallowmaxhp;
            }
        }
        else {
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " se pokusil/a vyhealovat");
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " se nemůže už více healovat.");
        }

    }
    public void infestation(){
        if (infestnum == 0) {
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " do tebe vlezl/a");
        }
        else {
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " tě prožírá zevnitř");
            temporaryhp -= 10;
            lowmaxhp += 10;
            System.out.println(lowerenemies[realrandomlowenemy] + " + " + 10 + " HP");
        }
    }
    public void nakazeni(){
        if (nakazenimoment == 0) {
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " vás nakazil/a");
            System.out.println("Pokud si neodpočinete, brzy umřete.");
            nakazenimoment++;
        }
        else {
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " čeká");
        }
    }
    public void scratch(){
        System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset +  " vás škrábl/a");
        temporaryhp -= 20;
        System.out.println(boldred + "- " + 20 + " HP" + colorreset);
    }
    public void topeni(){
        System.out.println(blue + lowerenemies[realrandomlowenemy] + " vás začal/a topit.");
        drown ++;

    }
    public static void growthmoment(){
        for (int i = 0; i < 99; i++) {
            System.out.println("Ů̸̡̫͍̗̦̜̜̻̝͔̐̓̇̈̍́̔͒̓̉̄̈͛͘͝ž̷͓̙̹͓̲͋̈́͂̍̚ ̸̛͚̹̍͒̈́̄̽̍̇j̸̡̧͕͉̗̬͈̪̄͋̄͜ͅs̴̖̓̂́̋̎t̶͖͉̬̺̦͓̟̭͔̋̓͛e̴̛͕̰̼̣͆̄̋̂̉͂̈́́̃̈́́͘͘ ̵̞̙̠̖̘̣̫̈́̀̆́̊̓̽̑̆͜͠s̵̡̛̹͓̪̝͇̝̮̠͚̙̠͓̰͆̈́̒͒́̄̑̓͋̃̎̚͝ṍ̵̪͌̾͑̍͝͝ů̶̙͉͍̗̖͙̟̼̼̩̱́͒̈́̆͗̈́̄͂͠č̵̨̡͚̗̼̤̝̝͍̑͑̾̀͊̀̾̒̐͌á̵͓̥̞͇̱̙̓̇̂̍̎̉͆̄͆ṥ̶̨̱̣̟̗̖̝̥͕͓̤͜ͅͅṫ̶̙̖̟̺̼̙̗̝̠̣́͂͗̌́͛í̴̘͚̳̖̻͓̹̣͆ͅͅ ̴̺̬͉̗͈̩̺͚͉̼̊̈̄̋̈́̏̀̈́͐͒̐̀̚͠ź̸͍̤̩͇͇̬͈̥̙͙̺́̈́́͋̒̀̓̉͗̀̕e̷̙̝̖̮͔̟̐͛̅̀̊̂͆̍̈́̒̋̚͘͝m̶̡̻̬̜̣̗͍̦̬̫̹͇͐͂̓́̍̀̇̈͛̉̈͘ͅě̵͚̭͕̲̞̼̹̱̙̝̀͋͗ͅ ̶̧̛̻͓̙͕͔̻̀͐̾̓̓̀̀͑͜s̴̩̼͈̜̥̝͚̑̑̌͆̋͆̉̽̂͝͝ͅa̶̯͕͎̼͍̼̣̳͆̋̓̓͠ḿ̷͇̤͚̹̋̔̂͝ͅò̸̧̡̝͎̦̖͍̠͙̣̥͕̜͔̎̂̂̑̔́̅̀͆̉͋͘t̵͕̋͊̕n̷̢̫͉̳̪̼̬͖̰̙̺̤̯̈́̒̂͋̂͑̿̕ͅé̵͖̟̯͚̥̪̠͉͙̩̆̈́̕͜.̷̪̂");
            System.out.println("Ů̴̥̫̣͓̭̳͖͍̒̆̌͆̋͌̎̃͐͂̓̓̆͛̀̈̑̂͑̉̑̓̄̈́̈́̄̊̂͒͛͘̕̕̕͝͝͠͝ž̶̛̛̖̻̙̝͓̜̟͙͉̥̅͗͑͐̒͐̎̈́͒͂̾̑̄̅̉̍͐̅͗̾̽̄̀̇̍̊̎͗̽́̎͂̔͆̐̅̕̚̚̚̕͠͝͝͝͠͠ ̵̡̰̺͖̮͇͔̲̰͈̦̟̮̭͔̺̫͎͖̌̇̑̉̌͂͗̾̀̏̓͆̓̃̓̄̎̓́͘͝ͅj̷̨̛̳͓̟̼̝̺̖̙͖̖͕̀̅̃̑͆͛̓̉̋̐̽͗̂̋͂͛̈́̇̀̈́̌̾͑̅́͒̃͛̆͋͒͗̿̈̏̏̚͘̚͝͝s̷̢̢̧̯͖̬͈͔̺͖͇͓̗̺̯̞̤͇̝̻̥̮̩͈̝͈͓̙͕͍̗̜̲͑̔͋̅͂̆̀̌́͆͊̋́́̄̈͋͋̃̓̓̈́̀͐̍̆̊͋̃̾̓̈́̅́̊̀̌̊́̊̐̚͘̕͜͜͠͠͠͝ͅͅt̵̢̡̢̧̡̛̛̬͇̖̘̖̲͓̙̞̗̜̠̝̠̖̠͇̺͚̠̩̝͈̙̖͓̖͖̹̝̭̣̗̖̝̼͇̺̣̙̩̎͊̀͂̆́̌̾͐͗̾̓͆̈̂͋̓̽̃̌͛͑̓̾͋̾̀͘̚͘̚͜͝ͅͅȩ̸̧̯̺͇͍̣̲̖͖̯͙̩̞̓͗͊̊̈̈́͂͗̔͐̌̌̽̐̐͂̂̄͒͒͑̍̃̿͆͊͗̏̃́̒̏̀̓̽͒̕̚̚͝͝͠ ̵̧̢̛̛̦̣̦̼̱͇̬͚͔͚̫̖͈͖̺̳̠̘̜̻̗̗̫̫̞̦́̏̊͗̎̎̈̓͊̃̍̋͊̂̑̈́̽̅̈́̅͘̕͘͝͝ͅs̸̨̝̈́͛̄̑̌̒̃̐͗̆̂̿̈́̿́̆͒͝͠o̴̢̡̧̯̯̺̪̤͈̯̦͓̯͉̞̬̝͚͔͕̖̹̜̯͕̯̞̯̣̠̬͕̞͚̍͜ͅͅͅư̵̡̨̨̛̛̬͇̳̱̲̻̘̜̩͓̝̭̖̞̪̞͍͙͇̭̙̳̳̫̈͗̇̒̀̆̀̂̆̍̀̊̄̒̾̈́̀̈̏̾̓͌̄́͆̈̔̀̿̽́̇̓͒̊̄̌͂̚̕̕̚̕͠č̸̛̩̩͎̗̤̲̙̩̬̯̘̣̼̱̪̟̑̐̓̏̀̾̊͛̌͌̆̔̅̑͐̈́͗͌͂͘͝á̵̡̛̺̻̲̥̝͍̮̘̭̭͑̈́̌͌͒͛̒͂̈̊͐͗̿̾͗̓̀͘s̵̙̳̦͉͇͎̳̈́̄̈̄̿̈́̀̿̽͑͌̔̃̃̀̐̀́̇̌͋̌̊̓͒̃͊̔̈̇̾̀̇͗̈́͊͝͝͝͝t̶̩̿̎í̵̡̨̨̢̨̬̰̺͍̜̩̣̻̭̜͕͎̗͈̻̻̻̣͖͕̮͎̦̾̉̋̔̐̓̉̽̉̄̾̒͋͒̄̇̍̀̑̀͋͘ ̸̨̢̨̧̹̝͖͉̝̻͙̺͎͍̠̥̙̰̬̭̙̮̖̻̫̝͍͇̲̞̗̰̼̰͈͖͇̗̜̜͓̳͎̤̦̣̦͉̲͇̒̑͒̀͆̅͛̔̈͋̂̏̊͌̓́́̒̆͌͆̀̾́̓͐̒͒̊̎̚͝͝ż̶̨̛̛͈̟̤̯͖̠̱̜̝̥̩̦͉̝̲̬̰̤̲͒̿͐̃̄̾̃̒̾̀̋͌͆̊̃̈̋̈̓̉̈̑̒̂̽̿̈́͋̚̚̕͝e̵͖̻̜͇̖̖̮͇͉̗̗̫̼̬̟̍̆̆̆̊̐̂͐̐̐̂̀̂̃̒̒̒͒̾̄̓̎̒͆̄̕̚̕͜͝͠ͅm̷̧̨̖̭̭̜̗̤̯͖̖̟̰̜̗͎̼̘̥̭̪̯̲̝̺̜̅͒̍̊͗͛́̌̌͐̀̄̿͌́͆̂̏́͆̊͋́̀͘͝ȩ̶͖̞̫̌̐͗̑͗̈́̔͂̇̑̐̈́̇̚͝͝͝͠ ̵̧̨̨̢̧̩̣̰̳̺̩̪̮͔̗̗̻̗̩͇͍̬̟͙̮͈̠̜̼͔̰͇̥͖̟̤͍̮̩̞̽͑͆̌͒̐̏̋͊͑͊̅̓̀̾̂̋̒͂͐͂̀͊̈́͛̑͒̄̀̆̚͘̕͠͠͠ͅͅs̴̨̧̨̢̰͕̲͇͚͎͕̜̲̰̟̬͇͚͎̼̓͊̽̂̍̑̓̆̔͑̇̏̂̆̿̈́̎́̈̈́̃̏̌̾̈́͗̾̆̇̔̍́́̂̔̿͐̅̊̀͂͘͜͝͝͠ͅą̴̧͖̺̹̪͚̲̞̤̦̮̖͎̗̫̺͙̲̦͕̜͎͓͈̹̣͓͙̌̉̀͋͆̏̂̀̇̾̌̀͗͐́͑̎̈́̔͐̉̎̂̿̊͒̏͘̚͘͜͠ͅm̵̧̡̡̙̬̭̒͊̉̿̾̌̌̅̽̊͝ǫ̵̨̛̘̻̩͚͇̺̝͓̗͉̤̘͈͓̘̦̤̲̰̫̩̤̀̊́͋͛͆͛̾̄͘͘͝͝t̸̡̛̯͍̘̥̦͚̰̫̲̺̜̹̞̖̻͖͒̈́͂̂͗̍͛̓́̓̽͆̒͊̔̈̏́́͒̔̆͂͐͋̀̚̕̚͜͠͝͠n̸̯̞͔͚̮̹̫̬̿ę̸̧̢̢̧̠̺̘̮̻͈̰͈̜͚̝̘͕̲͍̹̲̟̼̼͍̙̠̙̱̜̹͇͍̝́͆̊̊̂̔̽͗͋͊͑̓̅̍̿͜͜͜͠.̶̢̢͚̼͍̝͚͔͚̘͕̞̦̱̬̣̱̦̭̰̤̣͔̳̪̙̳̳̹̞̜̰́͑̊̌̅̐̎͜");


        }
        System.out.println("Stal se z tebe strom.");
        System.exit(0);
    }
    public void silaprirody() {
        if (growth == 0) {
            System.out.println("Náhle vámi prorůstaji květiny");

        } else if (growth == 1) {
            System.out.println("Začínají vámi prorůstat malé stromečky");

        }
        else if (growth == 2){
            System.out.println("Prorůstají vámi růže");
        }
        else if (growth > 2){
            System.out.println("Ů̸̡̫͍̗̦̜̜̻̝͔̐̓̇̈̍́̔͒̓̉̄̈͛͘͝ž̷͓̙̹͓̲͋̈́͂̍̚ ̸̛͚̹̍͒̈́̄̽̍̇j̸̡̧͕͉̗̬͈̪̄͋̄͜ͅs̴̖̓̂́̋̎t̶͖͉̬̺̦͓̟̭͔̋̓͛e̴̛͕̰̼̣͆̄̋̂̉͂̈́́̃̈́́͘͘ ̵̞̙̠̖̘̣̫̈́̀̆́̊̓̽̑̆͜͠s̵̡̛̹͓̪̝͇̝̮̠͚̙̠͓̰͆̈́̒͒́̄̑̓͋̃̎̚͝ṍ̵̪͌̾͑̍͝͝ů̶̙͉͍̗̖͙̟̼̼̩̱́͒̈́̆͗̈́̄͂͠č̵̨̡͚̗̼̤̝̝͍̑͑̾̀͊̀̾̒̐͌á̵͓̥̞͇̱̙̓̇̂̍̎̉͆̄͆ṥ̶̨̱̣̟̗̖̝̥͕͓̤͜ͅͅṫ̶̙̖̟̺̼̙̗̝̠̣́͂͗̌́͛í̴̘͚̳̖̻͓̹̣͆ͅͅ ̴̺̬͉̗͈̩̺͚͉̼̊̈̄̋̈́̏̀̈́͐͒̐̀̚͠ź̸͍̤̩͇͇̬͈̥̙͙̺́̈́́͋̒̀̓̉͗̀̕e̷̙̝̖̮͔̟̐͛̅̀̊̂͆̍̈́̒̋̚͘͝m̶̡̻̬̜̣̗͍̦̬̫̹͇͐͂̓́̍̀̇̈͛̉̈͘ͅě̵͚̭͕̲̞̼̹̱̙̝̀͋͗ͅ ̶̧̛̻͓̙͕͔̻̀͐̾̓̓̀̀͑͜s̴̩̼͈̜̥̝͚̑̑̌͆̋͆̉̽̂͝͝ͅa̶̯͕͎̼͍̼̣̳͆̋̓̓͠ḿ̷͇̤͚̹̋̔̂͝ͅò̸̧̡̝͎̦̖͍̠͙̣̥͕̜͔̎̂̂̑̔́̅̀͆̉͋͘t̵͕̋͊̕n̷̢̫͉̳̪̼̬͖̰̙̺̤̯̈́̒̂͋̂͑̿̕ͅé̵͖̟̯͚̥̪̠͉͙̩̆̈́̕͜.̷̪̂");
            growthmoment();
            temporaryhp -= temporaryhp;
        }
        growth++;

    }
    public void prerustnuti(){
        if (lowmaxhp <= 400) {
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " vyrostl/a");
            lowmaxhp += 20;
            System.out.println(white + lowerenemies[realrandomlowenemy] + colorreset + " HP je teď o 20 větší");
        }
        else {
            System.out.println(whitebold + lowerenemies[realrandomlowenemy] + colorreset + " už nemůže více růst.");
        }
    }
    //ůtoky postav
    public void seknutimecem (){
        System.out.println(boldyellow + "Seknul jsi mečem." + colorreset);
        System.out.println(yellowbright + " - " + 5 + " Stamina" + colorreset);
        temporarystamina -= 5;
        System.out.println(yellow + lowerenemies[realrandomlowenemy] + " - " + calculateddamage + " HP" + colorreset);
        catswordmoment();
        if (tetanus == 1){
            tetanuson = 1;
        }
        lowmaxhp -= calculateddamage;
    }
    public void shield(){
        System.out.println(boldblue + "Bráníš se štítem." + colorreset);
        shield = 1;

    }
    public void catswordmoment(){
        if (catsword == 1){
            int catswordoffandon = rd.nextInt(2);
            if (catswordoffandon == 1){
            int catswordchance = rd.nextInt(9);
                System.out.println(purple + "Nwela ti pwomáhá :3");
                scanner.nextLine();
                line = scanner.nextLine();
            if (catswordchance == 0){
                System.out.println(yellow + "+ " + 1 + " revives" + colorreset);
                line = scanner.nextLine();
                revivenumber ++;
            }
            else if (catswordchance == 1){
                System.out.println(green + " + " + 40 + " HP");
                line = scanner.nextLine();
                temporaryhp += 40;
                if (temporaryhp > officialmaxhp){
                    System.out.println("Tvoje HP je teď na maxu.");
                    line = scanner.nextLine();
                    temporaryhp = 0;
                    temporaryhp += officialmaxhp;
                }
            }
            else if (catswordchance == 2){
                lvlgain = 4;
                System.out.println(yellow + "Na konci souboje o 3 levely navíc" + colorreset);
                line = scanner.nextLine();

            }
            else if (catswordchance == 3){
                System.out.println(purple + "Nwela hitla " + lowerenemies[realrandomlowenemy] + colorreset);
                System.out.println(yellow + lowerenemies[realrandomlowenemy] + " - " + "30 HP" + colorreset);
                line = scanner.nextLine();
                lowmaxhp -= 30;
            }
            else if (catswordchance == 4){
                System.out.println(purple + "Nwela bouchla " + lowerenemies[realrandomlowenemy] + " pánvičkou. :3" +  colorreset );
                System.out.println(yellow + lowerenemies[realrandomlowenemy] + " - " + "10 HP" + colorreset);
                System.out.println(yellow + lowerenemies[realrandomlowenemy]  + " je paralizovaný/á" + colorreset);
                line = scanner.nextLine();
                lowmaxhp -= 10;
                paralized ++;
                }
            else if (catswordchance == 5){
                System.out.println(purple + "Nwela řízla "  + lowerenemies[realrandomlowenemy] + " kusem zrezivělé plechovky (od kočičího žrádla :33)" + colorreset);
                System.out.println(yellow + lowerenemies[realrandomlowenemy]  + " - 5 HP" + colorreset);
                lowmaxhp -= 5;
                line = scanner.nextLine();
                System.out.println(lowerenemies[realrandomlowenemy] + " dostal/a tetanus :0");
                line = scanner.nextLine();
                tetanuson = 1;
            }
            else if (catswordchance == 6){
                System.out.println(purple + "Nwela se soustředí..." + colorreset);
                line = scanner.nextLine();
                int instakillchance = rd.nextInt(3);
                if (instakillchance == 2){
                    System.out.println("Nic si neviděl, bylo to moc rychlé ale enemy leží na zemi ???");
                    line = scanner.nextLine();
                    lowmaxhp -= lowmaxhp;
                }
                else {
                    System.out.println("Nic se nestalo..");
                    line = scanner.nextLine();
                    System.out.println(purple + "Pwomiň :C" + colorreset);
                    line = scanner.nextLine();
                }
            }
            else if (catswordchance == 7){
                System.out.println(purple + "Nwa!" + colorreset);
                line = scanner.nextLine();
                System.out.println(yellowbright + "+ 200" + " coins");
                line = scanner.nextLine();
                coins += 200;
            }
            else if (catswordchance == 8){
                System.out.println(purple + "Nwela čaruje.." + colorreset);
                System.out.println(yellow + lowerenemies[realrandomlowenemy]  + " - 50% HP" + colorreset);
                line = scanner.nextLine();
                int fiftypercentdown = lowmaxhp/2;
                lowmaxhp -= fiftypercentdown;

            }
            }
        }
    }
    //magic
    public void prayer(){ /*hodně procent*/
        System.out.println(whitebold + "Modlíte se..." + colorreset);
        temporarymagic -= 2;
        int randomprayer = rd.nextInt(100);
        if (randomprayer < 30){
            int randomgood = rd.nextInt(3);
            switch (randomgood){
                case 0 -> {
                    System.out.println(brightgreen + "Je vám přáno." + colorreset);
                    System.out.println(brightgreen + "+ " + 30 + " HP" + colorreset);
                    if (temporaryhp <= officialmaxhp){
                    temporaryhp += 30;
                    if (temporaryhp > officialmaxhp){
                        temporaryhp = 0;
                        temporaryhp += officialmaxhp;
                    }
                    }
                }
                case 1 -> {
                    System.out.println(brightgreen + "Magie je doplněna." + colorreset);
                    temporarymagic = 0;
                    temporarymagic += officialmagika;
                }
                case 2 -> {
                    System.out.println(brightgreen + "Pokud vyhrajete souboj, váš level se zvýší o jeden navíc." + colorreset);
                    lvlgain += 1;
                }

            }
        }
        else if (randomprayer < 65 + 30) {
            int randombad = rd.nextInt(3);
            switch (randombad){
                case 0 -> {
                    System.out.println(brightred + "Jste trestán za Vaše hříchy." + colorreset);
                    System.out.println(brightred + "- " +  20 + " HP");
                    temporaryhp -= 20;
                    if (temporaryhp <= 0){
                        System.out.println(brightred + "Máte ještě šanci své hříchy odpykat." + colorreset);
                        temporaryhp = 1;
                    }

                }
                case 1 -> {
                    System.out.println(brightred + "Bylo popřáno tvé enemy" + colorreset);
                    System.out.println(brightred + lowerenemies[realrandomlowenemy] + " + " + 10 + " HP" + colorreset);
                    lowmaxhp += 10;
                }
                case 2 -> {
                    System.out.println(whitebold + "Nic se neděje" + colorreset);
                }
            }

        }/*sectu vsechny a pak odectu vsechny první kromě poslední*/
        else if (randomprayer < 65 + 30 + 3){
            System.out.println(blackbold + "Nedostanete žádné levely na konci souboje, pokud se nezkusíte pomodlit znovu." + colorreset);
            lvlgain = 0;

        }
        else {/*1%*/
            System.out.println("Dostal jste infarkt.");
            continuethis = scanner.nextLine();
            System.out.println(boldcyan + "Secret Ending" + colorreset);
            continuethis = scanner.nextLine();
            System.out.println(boldcyan + "5/4 ENDING" + colorreset);
            System.exit(0);
        }

    }
    public void heal(){
        temporarymagic -= 3;
        if (temporaryhp == officialmaxhp){
            System.out.println("Pokus byl marný, už se více vyhealovat nemůžete");
            System.out.println("Zbytečně ztrácíte " + purple + 3 + " Magic" + colorreset);
            temporarymagic -= 3;
            if (temporarymagic < 0){
                temporarymagic = 0;
            }
        }
        else {
            System.out.println(brightgreen + "Healujete se" + colorreset);
            System.out.println(brightgreen + "+ " + 30 + " HP" + colorreset);
            temporaryhp += 30;
        }

    }
    public void magicshield(){
        System.out.println(boldblue + "Použil jste magický štíť" + "\ndalší kolo se bráníte i proti statusovým útokům." + colorreset);
        magicshield = 1;
        temporarymagic -= 4;

    }
    public void sunshand() {
        if (officialplace == 0) {
            System.out.println("Jsi v podzemí, zde ti Slunce nepomůže.");
        } else if (officialplace == 1){
            System.out.println(boldyellow + "Síla paprsků vyřazujících ze Slunce se zvětšuje" + colorreset);
            System.out.println("Na chvíli je" + yellowbright + " záblesk " + colorreset + "a pak.." );
            lowmaxhp -= lowmaxhp;
            temporarymagic -= temporarymagic;
        }
    }
    public void demonshand(){
        System.out.println("Z hlouby tvé duše se zformovala jaká si démonní ruka a teď ti vylézá ze břicha.");
        int demonchance = rd.nextInt(2);
        temporarymagic -= 7;
        switch (demonchance){
            case 0 -> {
                System.out.println(yellow + "Enemy - 1/3 HP" + colorreset);

                int damage = lowmaxhp/3;
                lowmaxhp -= damage;
                System.out.println(yellow + "1/3 Enemy HP je " + damage + colorreset);
            }
            case 1 -> {
                System.out.println(yellow + "Enemy - 2/3 HP" + colorreset);
                int damage = lowmaxhp/3;
                lowmaxhp -= 2*damage;
                System.out.println(yellow + "2/3 Enemy HP je " + 2*damage + colorreset);


            }

        }
    }
    public void villagershelp (){
        System.out.println("Poslal jsi signál na blízkou vesnici.");
        int villagerchance = rd.nextInt(2);
        if (villagerhere == 0){
        switch (villagerchance){
            case 0 -> {
                System.out.println("Nikdo nepřišel.");
                temporarymagic -= 4;
            }
            case 1 -> {
                System.out.println("Přišel vesníčan.");
                villagerhere = 1;
            }
        }
        }
        else {
            System.out.println("Už u tebe vesníčan je.");
        }
        temporarymagic -= 4;
    }
    public void thunder(){
        System.out.println("Nad vámi se ztmavilo nebe.");
        int thunderchance = rd.nextInt(3);
        switch (thunderchance) {
            case 0 -> {
                System.out.println(yellowbright + "Někde v dálce trefil blesk." + colorreset);
            }
            case 1 -> {
                System.out.println(yellowbright + lowerenemies[realrandomlowenemy] + " trefil blesk." + colorreset);
                System.out.println(yellowbright + lowerenemies[realrandomlowenemy] + " je paralizovaný/á" + colorreset);
                System.out.println(yellowbright + lowerenemies[realrandomlowenemy] + " - " + 50 + " HP");
                lowmaxhp -= 50;
                paralized++;
            }
            case 2 -> {
                System.out.println(yellowbright + "Dělá se vedle tebe kulový blesk." + colorreset);
                if (lightningpowered == 0) {
                    System.out.println(yellowbright + "Pohltil jsi sílu z blesku" + colorreset);
                    System.out.println(purple + "Strength " + " + " + 20 + colorreset);
                    lightningpowered = 1;
                }
                else  {
                    System.out.println(yellowbright + "Více síly pohltit už nemůžeš." + colorreset);
                }
            }
        }

    }
    public void spiritkill(){
        temporarymagic -= 5;
        if (lowerenemies[realrandomlowenemy].equals(lowerenemies[0])){
            System.out.println("Koukáš se Eye do jeho velkého oka.");
            System.out.println("Eye se tě začal bát a utiká");
            lowmaxhp=0;
        } else if (lowerenemies[realrandomlowenemy].equals(lowerenemies[3])) {
            System.out.println("Oddáváš dobrovolně Parazitovi své tělo.");
            System.out.println(boldred + " - " + 10 + " Celkové HP" + colorreset);
            System.out.println(yellow + " + " + 10 + " Celková Síla" + colorreset);
            lowmaxhp=0;
            officialmaxhp -= 10;
            officialstrength += 10;
            if (officialmaxhp <= 0){
                officialmaxhp = 1;
            }
        }
        else if (lowerenemies[realrandomlowenemy].equals(lowerenemies[7])){
            System.out.println("Pohladil jsi DeadWolfa.");
            System.out.println("Začal vrťet ocasem.");
            System.out.println("Urval si kus své kůže a dal ti ji jako ochranu");
            System.out.println(green + " + " + 10 + " Celkové HP" + colorreset);
            officialmaxhp += 10;
            lowmaxhp=0;
        }
        else if (lowerenemies[realrandomlowenemy].equals(lowerenemies[6])){
            System.out.println("Dal jsi BigFish krmení pro ryby.");
            System.out.println("BigFish se najedla a odplavala.");
            lowmaxhp=0;
        }
        else {
            System.out.println("Zkus si s " + whitebold +  lowerenemies[realrandomlowenemy] + colorreset + " promluvit");
        }

    }
    public void speeddash(){
        temporarymagic -= 10;
        System.out.println(purple + "Necháváš magii proudit tvými žílami.." + colorreset);
        System.out.println(yellow + "Co chceš udělat?" + colorreset);
        System.out.println(green + "1. " + "Nechat energii proudit dál." + colorreset);
        System.out.println(yellowbright + "2. " + "Rozběhnout se na " + lowerenemies[realrandomlowenemy] + "." + yellowbright);
        int choose = 0;
        while(true){
        try{
            choose = scanner.nextInt();
        break;}
        catch (Exception e){
            System.out.println(red + "Zadejte pouze čísla.");
            scanner.nextLine();
        }}
        switch (choose) {
            case 1 -> {
                System.out.println(green + "Necháváš sebou proudit energii" + colorreset);
                System.out.println(green + " + " + 50 + " HP" + colorreset + "  (ignoruje limit)");
                temporaryhp += 50;


            }
            case 2 -> {
                System.out.println(yellowbright + "Narazil si do " + lowerenemies[realrandomlowenemy] + " rychlostí zvuku" + colorreset);
                System.out.println(yellow + lowerenemies[realrandomlowenemy] + " - " + 100 + " HP" + colorreset);
                lowmaxhp -= 100;
            }
        }
    }
    //act
    public void promluveni(){
        if (lowerenemies[realrandomlowenemy].equals(lowerenemies[2])){
            System.out.println("Promluvil jsi s " + white +  "Witch" + colorreset);
            System.out.println("Řekl jsi že jsi na ní pyšný, protože je velmi dobrá v dělání lektvarů");
            System.out.println(green + "Witch se blushuje..." + colorreset);
            lvlgain = 0;
            lowmaxhp -= lowmaxhp;
            didaction = 1;

        }
        if (lowerenemies[realrandomlowenemy].equals(lowerenemies[5])){
            System.out.println("Poklepal jsi" + white + " Zombie" + colorreset + " na zádech");
            System.out.println("Řekl jsi že je v pohodě že se té závislosti jezení mozků může zbavit.");
            System.out.println("Dal jsi mu kontakt na anti-braineating organizaci.");
            System.out.println(green + "Zombie ti děkuje" + colorreset);
            lvlgain = 0;
            lowmaxhp -= lowmaxhp;
            didaction = 1;
        }

        if (lowerenemies[realrandomlowenemy].equals(lowerenemies[4])){
            System.out.println("Řekl jsi" + white + " Treantovi " + colorreset  +"že máš rád přírodu, a že se doma staráš o kytky");
            System.out.println(green + "Treant" + colorreset + " odešel.");
            lvlgain = 0;
            lowmaxhp -= lowmaxhp;
            didaction = 1;
        }
        else{
            if (didaction == 0){
            System.out.println(lowerenemies[realrandomlowenemy] + " tě ignoruje.");}
            else if (didaction == 1){
                didaction = 0;
            }
        }
    }
    public void dotek(){
        if (lowerenemies[realrandomlowenemy].equals(lowerenemies[1])){
            System.out.println("Pohladil jsi " + white + " Big Spidera." + colorreset);
            System.out.println("Zavrťel sebou");
            System.out.println(green + "Vylezl zpět na svoji pavučinu a usnul." + colorreset);
            lvlgain = 0;
            lowmaxhp -= lowmaxhp;
        }
        else {
            System.out.println(lowerenemies[realrandomlowenemy] + " tě ignoruje.");
        }

    }
//shop
    public void obtainShopandStatsandFarm(){
        System.out.println("Získal jste přístup k shopu.");
        System.out.println("Kdykoli (mimo souboj a eventy) zadáte " + boldcyan + "menu" + colorreset + " tak se přesunete do menu a odsud můžete vybírat.");
        System.out.println("Pro shop napište " + boldcyan + 1 + colorreset);
        System.out.println("Pro checknuti character stats napište " + boldcyan + 2 + colorreset);
        System.out.println("Pro farmení (fight challenge) napište  " + boldcyan + 3 + colorreset);
        haveshop++;
    }
    int[] shopprices = {35, 80, 20, 40,};
    String[] shopexclusiveitems = {"Zázvor","Kočičí Meč :3"};
    int beentoshop = 0;
    int obtaineditemone = 0;
    int obtaineditemtwo = 0;
    String shoporchar;
    public void checkforMenu(String y){
        int iamhere = 1;
        while (y.equalsIgnoreCase("menu")) {
                System.out.println("1. Shop");
                System.out.println("2. Stats");
                System.out.println("3. Farmení");
                System.out.println("4. Odejít");
                if (iamhere == 1){
                scanner.nextLine();
                iamhere = 0;}
                shoporchar = scanner.nextLine();
                if (shoporchar.equals("4")){
                    break;
                }try{
                checkShoporCharorFight();}
                catch (Exception e){
                    System.out.println(red + "Zadejte pouze čísla." + colorreset);
                    scanner.nextLine();
                }
            }

        }


    public void checkShoporCharorFight(){
        String progress;
        if (shoporchar.equals("1")){
            if (beentoshop == 0) {
                System.out.println("Meow");
                progress = scanner.nextLine();
                System.out.println("Meooow??");
                progress = scanner.nextLine();
                System.out.println("MEOWOWOWOWOWO!??");
                progress = scanner.nextLine();
                System.out.println("Vítejte v košiším obchůdku! *mává tlapkou nadšeně* Jsem " + purple + "Nwela" + colorreset + ", milá kočička a hrdá majitelka tohoto kouzelného krámečku.");
                progress = scanner.nextLine();
                System.out.println("(jsi zmaten, proč na tebe mluví kočka ???)");
                progress = scanner.nextLine();
                System.out.println(purple + "Nwela" + colorreset + " je moc ráda že jste přišel! Jak vám mohu pomoci?");
                progress = scanner.nextLine();
                beentoshop++;
            }

          else if (beentoshop == 1){
              System.out.println("Meow!");
            progress = scanner.nextLine();
            System.out.println("Vítejte zpět v košiším obchůdku! *mávne tlapkou nadšeně*" + purple +  " Nwela" + colorreset + " je mwoc wáda že jste se sem zase vrátil");
            progress = scanner.nextLine();
            System.out.println("Jak Vám mohu pomoci dnes?");
          }
          int buyitem;
          int stillinshop = 0;
          while (stillinshop == 0) {
              if (obtaineditemone == 0) {
                  System.out.println("1. Dřevěný meč: " + boldyellow + shopprices[0] + " coins" + colorreset);
              } else {
                  System.out.println(white + "1. vykoupeno" + colorreset);
              }
              if (obtaineditemtwo == 0) {
                  System.out.println("2. Železný meč: " + boldyellow + shopprices[1] + " coins" + colorreset);
              } else {
                  System.out.println(white + "2. vykoupeno" + colorreset);
              }

              System.out.println("3. Revive: " + boldyellow + shopprices[2] + " coins" + colorreset);
              System.out.println("4. Modrý zázvor: " + boldyellow + shopprices[3] + " coins" + colorreset);
              System.out.println(whitebold + "5. Info" + colorreset);
              System.out.println("6. Odejít.");
              System.out.println(boldyellow + "Máte " + coins + " coins" + colorreset);
              buyitem = scanner.nextInt();
              //drevenymec
              if (buyitem == 1 && obtaineditemone == 0 && coins >= shopprices[0]) {
                  System.out.println("Opravdu si to chcete koupit?" + " Ano/Ne nebo 1/2");
                  scanner.nextLine();
                  line = scanner.nextLine();
                  if (line.equalsIgnoreCase("ano") || line.equals("1")) {
                      System.out.println("Koupil jsi si " + items[2] + "...");
                      line = scanner.nextLine();
                      System.out.println(green + "Dřevěný meč +3 damage" + colorreset);
                      coins -= shopprices[0];
                      addedweapondamage = 3;
                      currentlyequippedweapon = items[2];
                      tetanus = 0;

                  }
              } else if (buyitem == 1 && obtaineditemone != 0) {
                  System.out.println("Už jste tento item vykoupil.");
              } else if (buyitem == 1 && coins < shopprices[0]) {
                  System.out.println("Nemáte dostatek coinu.");
              }

              //zeleznymec
              if (buyitem == 2 && obtaineditemtwo == 0 && coins >= shopprices[1]) {
                  System.out.println("Opravdu si to chcete koupit?" + " Ano/Ne nebo 1/2");
                  scanner.nextLine();
                  line = scanner.nextLine();
                  if (line.equalsIgnoreCase("ano") || line.equals("1")) {
                      System.out.println("Koupil jsi si " + items[1] + "...");
                      line = scanner.nextLine();
                      System.out.println(green + "Tento meč je hodně dobrý, budete ubírat o 10 damage více." + colorreset);
                      coins -= shopprices[1];
                      addedweapondamage = 10;
                      currentlyequippedweapon = items[1];
                      tetanus = 0;

                  }
              } else if (buyitem == 2 && obtaineditemtwo != 0) {
                  System.out.println("Už jste tento item vykoupil.");
              } else if (buyitem == 2 && coins < shopprices[1]) {
                  System.out.println("Nemáte dostatek coinu.");
              }
              //revive
              if (buyitem == 3 && coins >= shopprices[2]) {
                  System.out.println("Opravdu si to chcete koupit?" + " Ano/Ne nebo 1/2");
                  scanner.nextLine();
                  line = scanner.nextLine();
                  if (line.equalsIgnoreCase("ano") || line.equals("1")) {
                      System.out.println("Koupil jsi si " + items[4] + "...");
                      revivenumber++;
                      coins -= shopprices[2];
                      System.out.println(green + "Počet vašich revives: " + revivenumber + colorreset);
                      line = scanner.nextLine();
                  }
              } else if (buyitem == 3 && coins < shopprices[2]) {
                  System.out.println("Nemáte dostatek coinu.");
              }
              //zázvor
              if (buyitem == 4 && coins >= shopprices[3]) {
                  System.out.println("Opravdu si to chcete koupit?" + " Ano/Ne nebo 1/2");
                  scanner.nextLine();
                  line = scanner.nextLine();
                  if (line.equalsIgnoreCase("ano") || line.equals("1")) {
                      System.out.println("Koupil jsi si " + shopexclusiveitems[0] + "...");
                      coins -= shopprices[3];
                      System.out.println(green + "Snědl si zázvor..");
                      System.out.println("+ " + 40 + " Max.HP");
                      officialmaxhp += 40;
                      line = scanner.nextLine();
                      System.out.println("Vaše Max.HP teď: " + officialmaxhp + colorreset);
                  }
              } else if (buyitem == 4 && coins < shopprices[3]) {
                  System.out.println("Nemáte dostatek coinu.");
              }
              if (buyitem == 6) {
                  System.out.println("Chcete jít farmit, nebo checknout stats");
                  shoporchar = scanner.nextLine();
                  stillinshop = 1;
              }
              if (buyitem == 5) {
                  System.out.println(yellow + "Želežný meč + " + 5 + " dmg" + colorreset);
                  System.out.println(yellow + "Dřevěný meč + " + 3 + " dmg" + colorreset);
                  System.out.println(green + "Revive" + " - oživí tě na 50 HP ve chvíli kdyby jsi měl umřít." + colorreset);
                  System.out.println(green + "Modrý zázvor" + " neznámé učinky.." + colorreset);
                  line = scanner.nextLine();
                  line = scanner.nextLine();
              }
              if (buyitem == 7 && coins >= 150){
                  System.out.println("Opravdu si to chcete koupit ? :3" + " Ano/Ne nebo 1/2");
                  scanner.nextLine();
                  line = scanner.nextLine();
                  System.out.println(purple + "Fwakt??" + colorreset);
                  line = scanner.nextLine();
                  if (line.equalsIgnoreCase("ano") || line.equals("1")) {
                      System.out.println("Koupil jsi si " + purple +  shopexclusiveitems[1]  + colorreset + "...");
                      coins -= 150;
                      System.out.println(purple + "Kwoupwil jsi jswi Kočičí Mweč, tvoje damage +30 a při útoku mwáš šanci přivolat Nwelu (+1 revive, +40 HP, +3 levely na konci souboje, +30dmg, paralizování enemy, šance na instakill, +200 coins, ubrat 50% enemy HP, dát na enemy tetanus.)" + colorreset);
                      addedweapondamage = 0;
                      addedweapondamage +=30;
                      tetanus = 0;
                      currentlyequippedweapon = shopexclusiveitems[1];
                      catsword = 1;
                      line = scanner.nextLine();

                  }
              }

          }}
        if (shoporchar.equals("2")){
            characterinfo();
            line = scanner.nextLine();
        }
        if (shoporchar.equals("3")) {
            String farmmore = "ano";
            while (farmmore.equalsIgnoreCase("ano")) {
                generatelowenemy();
                lowFight();
                levelup();
                chancetoFindItem();
                System.out.println("Zadejte |ano| pro pokračování ve fightění");
                if (itemwasfound == 1) {
                    farmmore = scanner.nextLine();
                    itemwasfound = 0;
                }
                else if (itemwasfound == 0){
                    farmmore = scanner.nextLine();
                    farmmore = scanner.nextLine();
                }


            }

        }
    }
    String line = scanner.nextLine();
    String currentlyequippedweapon = "Pěsti";
    public void willyoutakeit(){
        System.out.println("Vezmeš si to ? " + "Ano/Ne nebo 1/2");
        line = scanner.nextLine();
    }
    //itemy k naleznutí
    String[] items = {"Hezky vypadající meč", "Železný meč", "Dřevěný meč", "Zrezivělý meč","Revive", "Coins"};
    public void FindItem() {
        itemwasfound = 1;
        System.out.println("Něco si našel na zemi..");
        line = scanner.nextLine();
        int randomitem = rd.nextInt(6);
        switch (randomitem) {
            case 0 -> {
                System.out.println("Našel jsi " + red + items[0] + colorreset);
                willyoutakeit();
                if (line.equalsIgnoreCase("ano") || line.equals("1")) {
                    System.out.println("Vzal jsi si " + items[0] + "...");
                    line = scanner.nextLine();
                    System.out.println("Jujda");
                    System.out.println(red + "Tento meč je na nic :(" + " budeš ubírat o 2 damage méně" + colorreset);
                    line = scanner.nextLine();
                    pushConsole();
                    addedweapondamage = -2;
                    currentlyequippedweapon = items[0];
                    tetanus = 0;

                }
            }
            case 1 -> {
                System.out.println("Našel jsi " + yellow + items[1] + colorreset);
                willyoutakeit();
                if (line.equalsIgnoreCase("ano") || line.equals("1")) {
                    System.out.println("Vzal jsi si " + items[1] + "...");
                    line = scanner.nextLine();
                    System.out.println(green + "Tento meč je hodně dobrý, budete ubírat o 10 damage více." + colorreset);
                    line = scanner.nextLine();
                    pushConsole();
                    addedweapondamage = 10;
                    currentlyequippedweapon = items[1];
                    tetanus = 0;
                }

            }
            case 2 -> {
                System.out.println("Našel jsi " + yellow + items[2] + colorreset);
                willyoutakeit();
                if (line.equalsIgnoreCase("ano") || line.equals("1")) {
                    System.out.println("Vzal jsi si " + items[2] + "...");
                    line = scanner.nextLine();
                    System.out.println(green + "Dřevěný meč +3 damage" + colorreset);
                    line = scanner.nextLine();
                    pushConsole();
                    addedweapondamage = 3;
                    currentlyequippedweapon = items[2];
                    tetanus = 0;
                    //trisky
                }
            }
            case 3 -> {
                System.out.println("Našel jsi " + yellow + items[3] + colorreset);
                willyoutakeit();
                if (line.equalsIgnoreCase("ano") || line.equals("1")) {
                    System.out.println("Vzal jsi si " + items[3] + "...");
                    line = scanner.nextLine();
                    System.out.println(yellowbright + "Zřezivělý meč ti zvyšuje damage +6 a zároveň dá na opponenta tetanus (ubíra 15 damage každé kolo)" + colorreset);
                    line = scanner.nextLine();
                    pushConsole();
                    addedweapondamage = 6;
                    tetanus =1;


                }


            }
            case 4 -> {
                int randomcoinvalue = rd.nextInt(51);
                if (randomcoinvalue == 0){
                    randomcoinvalue++;
                }
                System.out.println("Našel jsi " + boldyellow + randomcoinvalue + " coinů");
                line = scanner.nextLine();
                System.out.println(boldyellow + "+ " + randomcoinvalue + " coinů" + colorreset);
                line = scanner.nextLine();
                coins += randomcoinvalue;
                System.out.println(boldyellow + "Vaše coins teď: " + coins + colorreset);
                line = scanner.nextLine();
            }
            case 5 ->{
                System.out.println("Našel jsi " + green + "Revive" + colorreset);
                line = scanner.nextLine();
                revivenumber++;

            }
        }


    }
    //šance na item že se najde
    public void chancetoFindItem(){
        int founditem = rd.nextInt(10);
        if (founditem == 0){
            FindItem();
        }

    }
    //ziskani nové magie
    public void newMagic(int usedmagic){
        if (usedmagic == 0){
            System.out.println(yellow + "Nová magie!" + colorreset);
        }
    }
    //tvé poslední rozhodnutí
    public void thechoice(String yourfinalchoice){
        if (yourfinalchoice.equalsIgnoreCase("ano")){
            for (int i = 0; i < 5; i++) {
                switch (i) {
                 case 0 ->   System.out.println(boldred + "Kali artefakt strčil do trubice" + colorreset);
                 case 1 ->   System.out.println(boldred + "AHH" + colorreset);
                 case 2 ->   System.out.println(boldred + "AHHHH" + colorreset);
                 case 3 ->   System.out.println(boldred + "Kali " + colorreset + "se změnil na gigantické monstrum, narostlí mu desítky rukou a očí, vyrostl, je vysoký asi 10 metrů");
                 case 4 ->   System.out.println(boldred + "Potrestám tě za své sestry a bratry!" + colorreset);
                }
                continuethis = scanner.nextLine();
            }
            kaliboss = 1;
            lowFight();

        }
        else if (yourfinalchoice.equalsIgnoreCase("ne")){
            for (int i = 0; i < 9; i++) {
                switch (i) {
                   case 0 -> System.out.println("Strčil si artefakt do trubice sám");
                   case 1 -> System.out.println(boldred + "NEEEEEEEEEEEE!!!!!!!!" + colorreset);
                   case 2 ->  System.out.println(boldred + "Kali " + colorreset + "padl k zemi.");
                   case 3 -> System.out.println("Podzemí se okamžitě uzavřelo, ale ty tu jsi.");
                   case 4 ->   System.out.println("Dělá se ti zle..");
                   case 5 ->   System.out.println("Pomalu ztrácíš vědomí");
                   case 6 ->  System.out.println("...");
                   case 7 -> System.out.println("..");
                   case 8 ->  System.out.println(".");
                }
                continuethis = scanner.nextLine();
            }
            if (revivenumber == 0) {
                for (int i = 0; i < 5; i++) {
                    switch (i){

                 case 0 ->   System.out.println("Změnil jsi se v monstrum, ne jako ty ostatní ale narostlo ti více očí, rukou a vyrostl jsi do výšky");
                 case 1 ->   System.out.println("A přesně když se tohle stalo tak..");
                 case 2 ->  System.out.println("Ztratil jsi vědomí");
                 case 3 ->  System.out.println(boldred + "BAD-ENDING" + colorreset);
                 case 4 ->   System.out.println(boldcyan + "3/4 ENDING");}
                    continuethis = scanner.nextLine();
                }
                System.exit(0);
            }
            else {
                System.out.println(yellow + "Použil jsi jednu revive" + colorreset);
                continuethis = scanner.nextLine();
                for (int i = 0; i < 6; i++) {
                    switch (i) {
                    case 0 -> System.out.println("Vzbudila tě " + purple + "Nwela" + colorreset);
                    case 1 -> System.out.println("Nastěhoval jsi se k " + purple + "Nwele" + colorreset);
                    case 2 -> System.out.println("Žiješ teď v podzemí a společně s" + purple + " Nwelou " + colorreset + "se staráte o kočíčí krám.");
                    case 3 -> System.out.println("Chodí tu mnoho monster, a všechny ti prominuli.");
                    case 4 -> System.out.println(boldred + "BEST-ENDING" + colorreset);
                    case 5 -> System.out.println(boldcyan + "4/4 ENDING");
                    }
                    continuethis = scanner.nextLine();
                }
                System.exit(0);

            }
        }
    }
    //kali útoky
    String continuethis;
    public void kalibouchnuti(){
        System.out.println(boldred + "Kali tě bouchl jeho mnoha rukama" + colorreset);
        System.out.println(red + "- 120" + " HP" + colorreset);
        temporaryhp -= 120;
        int x = rd.nextInt(10);
        switch (x){
            case 0 -> System.out.println(boldred + "Umři pro svého kamaráda Kaliho!" + colorreset);
            case 1 -> System.out.println(boldred + "Celou dobu jsem tě pozoroval jak jsi nám ubližoval" + colorreset);
            case 2 -> System.out.println(boldred + "Všichni lidi jsou zkažený" + colorreset);
            case 3 -> System.out.println(boldred + "Až skončím s tebou tak vyhladím celý povrch!" + colorreset);
            case 4 -> System.out.println(boldred + "Podívej se na krásu!" + colorreset);
            case 5 -> System.out.println(boldred + "Konečně mám svoji sílu zpátky" + colorreset);
            case 6 -> System.out.println(boldred + "Nezasloužíš si existovat!" + colorreset);
            case 7 -> System.out.println(boldred + "Zemři." + colorreset);
            case 8 -> System.out.println(boldred + "Jsi zklamání" + colorreset);
            case 9 -> System.out.println(boldred + "Ahh jak hrozně slabý jsi!" + colorreset);
        }
        continuethis = scanner.nextLine();
    }
    public void eternaldream(){
        System.out.println(boldred + "Kali používá magii z oltáře." + colorreset);
        int eternalhp = temporaryhp/=2;
        temporaryhp -= temporaryhp;
        temporaryhp += eternalhp;
        System.out.println(red + " - " + 50 + " %" + " HP");
        int x = rd.nextInt(10);
        switch (x){
            case 0 -> System.out.println(boldred + "Umřeš stejně jako všichni ti ostatní" + colorreset);
            case 1 -> System.out.println(boldred + "Jsi slabý" + colorreset);
            case 2 -> System.out.println(boldred + "Dlouho nevydržíš" + colorreset);
            case 3 -> System.out.println(boldred + "Nechceš mi to ušetřit a zabít se sám?" + colorreset);
            case 4 -> System.out.println(boldred + "Kdo?" + colorreset);
            case 5 -> System.out.println(boldred + "Měl jsem Dědu rád, ale kdybych mu pomohl tak můj plán selže." + colorreset);
            case 6 -> System.out.println(boldred + "Za nás všechny" + colorreset);
            case 7 -> System.out.println(boldred + "Zemři." + colorreset);
            case 8 -> System.out.println(boldred + "A já si na začátku myslel že budeme kamarádi" + colorreset);
            case 9 -> System.out.println(boldred + "Díky že jsi mi ten krystal dal, Haha!" + colorreset);
        }
        continuethis = scanner.nextLine();
    }



}