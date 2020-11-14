package module.fourth.task13;


public class RunMain {
    public static void main(String[] args) {


        City aMinsk = new City("Minsk");
        City aBrest = new City("Brest");
        City aMogilev = new City("Mogilev");
        City aVitebsk = new City("Vitebsk");
        City aGomel = new City("Gomel");
        City aGrodno = new City("Grodno");

        District minskiy = new District("Minsky", 25.2);
       // minskiy.addlist(aMinsk);

        Region minsky = new Region("Minsky", aMinsk, 1255.27);


        Region brestsky = new Region("Brestky", aBrest, 1155.27);
        Region mogilessky = new Region("Mogilevsky", aMogilev, 1225.27);
        Region vitebsky = new Region("Vitebsky", aVitebsk, 1355.27);
        Region gomelsky = new Region("Gomelsky", aGomel, 1285.27);
        Region grodnensky = new Region("Grodnensky", aGrodno, 1445.27);


        State belarus = new State(aMinsk, new Region[]{minsky, brestsky, mogilessky, vitebsky, gomelsky, grodnensky});
        System.out.println("Area country " + belarus.areaCountry(belarus.getRegions()));

        System.out.println("Capital "+belarus.getCapital().toString());
        belarus.regionCapital();
        System.out.println("Number of regions "+belarus.getRegions().length);


    }

}
