
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Toto je TextRPG hra vytvořena Michalem Carskou, tato hra je pouze a schválně jen v hardcore difficulty, pokud zemřete tak musíte runnout Main znova a začít úplně od začátku.");
        System.out.println("Gameplay elementy a systémy jsou vysvětlené v dodatečném poznámkovém bloku.");
        System.out.println("Pokud chcete hrát hru jak byla určena tak se na info nedívejte.");
        System.out.println("PS: Dávejte si pozor na to kdy se zadávaji čísla a kdy text, neni tu použito try/catch.");
        System.out.println("Napište cokoliv pro start hry");
        Gamesystem obj = new Gamesystem();
        Scanner scanner = new Scanner(System.in);
        String y;
        Gamesystem.pushConsole();

        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0 -> System.out.println("V tomto krásnem království jménem Fedria se z ničeho nic začali objevovat monstra, které ještě nikdy nikdo neviděl, jsou agresivní a vylézají z podzemí");
                case 1 -> System.out.println("Ty jako jeden z nováčků jsi vyslán společně ostatními rytíři aby jsi prozkoumal jeskyně ze které ůdajně vychází.");
                case 2 -> System.out.println("A při nejlepším najít cestu jak podzemí uzavřít.");
                case 3 -> System.out.println("Je slyšet divný rachot...");
                case 4 -> System.out.println("Ostatní se vypařili, nikdo kolem tebe není");
                case 5 -> System.out.println("Zbyl jsi jen ty");
            }
            y = scanner.nextLine();
            Gamesystem.pushConsole();
        }
        int b = -1;
        int gotochoices = 1;
        while (b < 0) {

            obj.option = 0;
            System.out.println("Kdo vlastně jsi?");
            System.out.println("1. " + obj.red + "Fanda" + obj.colorreset);
            System.out.println("2. " + obj.yellow + "Saska" + obj.colorreset);
            System.out.println("3. " + obj.purple + "Vojta" + obj.colorreset);
                obj.option = scanner.nextInt();
            switch (obj.option) {
                case 1 -> obj.character("Fanda", 11, 5, 3, 170, 1, 1);
                case 2 -> obj.character("Saska ", 6, 8, 5, 160, 1, 2);
                case 3 -> obj.character("Vojta ", 5, 6, 9, 150, 1, 3);
            }
            if (obj.option == 1 || obj.option == 2 || obj.option == 3) {


                System.out.println("Opravdu to jsi ty?");
                System.out.println("Ano");
                System.out.println("Ne");
                scanner.nextLine();
                String anone = scanner.nextLine();
                anone = anone.toLowerCase(Locale.ROOT);
                if (anone.equals("ano")) {
                    b++;
                }
            }
        }
        obj.groundlevel(0);
        obj.generatelowenemy();
        obj.lowFight();
        obj.levelup();
        y = scanner.nextLine();
        obj.obtainShopandStatsandFarm();
        y = scanner.nextLine();
        obj.checkforMenu(y);
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0 -> System.out.println("Slyšíš něco za tebou");
                case 1 -> System.out.println("Přišel k tobě neznámý muž, má na sobě společensky vkusný oblek a vypadá velmi slušně");
                case 2 -> System.out.println(obj.red + "Jsem Kali" + obj.colorreset);
                case 3 -> System.out.println(obj.red + "Viděl jsem jak jsi to porazil" + obj.colorreset);
                case 4 -> System.out.println(obj.red + "Zajímám se o silné lidi jako jsi ty." + obj.colorreset);
                case 5 -> System.out.println("Připojil se k tobě " + obj.red + "Kali" + obj.colorreset);
                case 6 -> System.out.println(obj.red + "Hele za námi" + obj.colorreset);
            }
            y = scanner.nextLine();
            obj.checkforMenu(y);
        }
        obj.generatelowenemy();
        obj.lowFight();
        obj.levelup();
        obj.FindItem();
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0 -> System.out.println(obj.red + "Uf uf" + obj.colorreset);
                case 1 -> System.out.println(obj.red + "Přišel si ty monstra zastavit co?" + obj.colorreset);
                case 2 -> System.out.println(obj.red + "Znám někoho kdo by ti mohl pomoci" + obj.colorreset);
                case 3 -> System.out.println("Jdeš s " + obj.red + "Kalim" + obj.colorreset);
            }
            y = scanner.nextLine();
            obj.checkforMenu(y);
        }
        obj.groundlevel(1);
        obj.generatelowenemy();
        obj.lowFight();
        obj.levelup();
        obj.chancetoFindItem();
        System.out.println(" ");
        System.out.println(obj.red + "Hele je tu další" + obj.colorreset);
        y = scanner.nextLine();
        obj.checkforMenu(y);
        obj.generatelowenemy();
        obj.lowFight();
        obj.levelup();
        obj.chancetoFindItem();
        for (int i = 0; i < 19; i++) {
            switch (i) {
                case 0 -> System.out.println(obj.red + "Hele támhle je" + obj.colorreset);
                case 1 -> System.out.println(obj.red + "Ten nám může poradit" + obj.colorreset);
                case 2 -> System.out.println(obj.yellow + "Ahojte kluci, co potřebujete?" + obj.colorreset);
                case 3 -> System.out.println(obj.red + "Ah no vy víte něco o tom jak uzavřít podzemí, že ano?" + obj.colorreset);
                case 4 -> System.out.println("...");
                case 5 -> System.out.println(obj.yellow + "Um" + obj.colorreset);
                case 6 -> System.out.println(obj.yellow + "Jo" + obj.colorreset);
                case 7 -> System.out.println(obj.yellow + "Musíte najít jeden artefakt, takový " + obj.boldred + "červený " + obj.colorreset + obj.yellow + "krystal." + obj.colorreset);
                case 8 -> System.out.println(obj.yellow + "Je na povrchu, ale v lese plném monster" + obj.colorreset);
                case 9 -> System.out.println(obj.yellow + "Proto tam ještě nikdo nebyl" + obj.colorreset);
                case 10 -> System.out.println(obj.red + "Ah, kudy to je?" + obj.colorreset);
                case 11 -> System.out.println(obj.yellow + "Tímhle směrem a pak kousek doleva, potom co se otevřelo celé podzemí, tam všechny monstra šli aby artefakt uhlídali, snad ho dostanete zpět" + obj.colorreset);
                case 12 -> System.out.println(obj.yellow + "Hodně štěstí" + obj.colorreset);
                case 13 -> System.out.println(obj.red + "Děkujeme" + obj.colorreset);
                case 14 -> System.out.println("Už nějakou chvíli jdete, už jste i vyšli na povrch a náhle-");
                case 15 -> System.out.println("Pomoc pomocc!!!");
                case 16 -> System.out.println("Zachraňte mě!");
                case 17 -> System.out.println("(v dálce vidíš utíkat dívku před monstrem.");
                case 18 -> System.out.println(obj.red + "Hele běž ji pomoct, ne?" + obj.colorreset);
            }
            y = scanner.nextLine();
            obj.checkforMenu(y);
        }

        obj.generatelowenemy();
        obj.lowFight();
        obj.levelup();
        obj.chancetoFindItem();
        System.out.println("Děkuji Vám moc!");
        System.out.println(obj.boldyellow + "+ " + 100 + " coins" + obj.colorreset);
        obj.coins += 100;
        y = scanner.nextLine();
        obj.checkforMenu(y);
        System.out.println(obj.red + "Ah už je pryč" + obj.colorreset);
        y = scanner.nextLine();
        obj.checkforMenu(y);
        System.out.println(obj.red + "ani jsme neslyšeli její jméno..");
        y = scanner.nextLine();
        obj.checkforMenu(y);
        System.out.println(obj.red + "Jujdaa!" + obj.colorreset);
        for (int i = 0; i < 2; i++) {
            obj.generatelowenemy();
            obj.lowFight();
            obj.levelup();
            obj.chancetoFindItem();
        }
        for (int i = 0; i < 20; i++) {
            switch (i) {
                case 0 -> System.out.println(obj.red + "Tady to je" + obj.colorreset);
                case 1 -> System.out.println(obj.red + "To je ten artefakt" + obj.colorreset);
                case 2 -> System.out.println("*vzali jste artefakt*");
                case 3 -> System.out.println(obj.red + "Tak jdeme." + obj.colorreset);
                case 4 -> System.out.println("*vrátili jste se zpátky k dědovi*");
                case 5 -> System.out.println(obj.yellow + "Ah.. " + obj.colorreset);
                case 6 -> System.out.println(obj.yellow + "Já se vám to snažil říct" + obj.colorreset);
                case 7 -> System.out.println(obj.yellow + "Musím to udělat.." + obj.colorreset);
                default -> System.out.println(obj.yellow + "..." + obj.colorreset);
            }
            y = scanner.nextLine();
            obj.checkforMenu(y);
        }
        obj.groundlevel(0);
        y = scanner.nextLine();
        obj.generatelowenemy();
        System.out.println(obj.boldred + "Děda se změnil na " + obj.lowerenemies[obj.realrandomlowenemy] + obj.colorreset);
        obj.lowFight();
        obj.levelup();
        obj.chancetoFindItem();
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0 -> System.out.println(obj.red + "Hmm..." + obj.colorreset);
                case 1 -> System.out.println("Pokračujete dál v cestě..");
                case 2 -> System.out.println(obj.red + "Kali" + obj.colorreset + " je hrozně potichu celou dobu..");
                case 3 -> System.out.println(obj.red + "Jsme tady." + obj.colorreset);
                case 4 -> System.out.println("(jaktože ví kam máme jít..?)");
                case 5 -> System.out.println("Před vámi je velký oltář a na něm trubice ve tvaru toho artefaktu.");
                case 6 -> System.out.println(obj.red + "Pujč mi ho." + obj.colorreset);
                case 7 -> System.out.println("Teď je poslední šance si zajít do menu.");
            }
            y = scanner.nextLine();
            obj.checkforMenu(y);
        }
        System.out.println("Podáš " + obj.red + "Kalimu" + obj.colorreset + " artefakt?");
        System.out.println("Ano/Ne");
        int madefinalchoice = 0;
        while (madefinalchoice == 0) {
            String yourchoice = scanner.nextLine();
                if (yourchoice.equalsIgnoreCase("ano") || yourchoice.equalsIgnoreCase("ne")) {
                    obj.thechoice(yourchoice);
                    madefinalchoice++;

            }

        }
    }}