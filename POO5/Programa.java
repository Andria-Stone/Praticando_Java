public class Programa {
    public static void main(String[] args) {
        
        //Lutador l = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, "Cateregoria", 11,2,1);
        
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11,2,1);

        l[0].status();

        l[1] = new Lutador("Matador", "Brasil", 18, 90.3, 100.54, 4, 2, 1);
    }
}
