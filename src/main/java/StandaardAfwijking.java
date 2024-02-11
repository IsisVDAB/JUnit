public class StandaardAfwijking {
    public static void main(String[] args) {
        try {
            // Ook hier dependency injection:
            var service = new PersoonService(new PersoonRepository());
            System.out.println(service.standaardAfwijkingWeddes());
        } catch (RepositoryException ex){
            System.err.println("Kan personen niet lezen.");
            ex.printStackTrace(System.err);
        }
    }
}
