public class App
{
    public static void main(String[] args)
    {
        Planes avion_simplu = new Planes("001", 3);
        Planes avion_de_pasageri = new PassengerPlanes(300,"002",500);
        Planes avion_concorde = new ConcordePassengerPlanes(400, "003", 1000);
        Planes avion_de_lupta = new FighterPlanes("004", 10000);
        Planes avion_tomcat = new FighterPlanes("005", 3000);
        Planes avion_mig = new FighterPlanes("006", 6879);
        
    }
}
