// Superclass
class HillStations{
    /* -----Method to be overridden by subclasses---*/
    public void location() {
        System.out.println("HillStation location");
    }
    /* -----Method to be overridden by subclasses-----*/
    public void famousFor() {
        System.out.println("HillStation famous for");
    }
}
// Subclass 1: Manali
class Manali extends HillStations{
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }
    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its beautiful landscapes and adventure activities.");
    }
}
// Subclass 2: Mussoorie
class Mussoorie extends HillStations{
    @Override
    public void location() {
        System.out.println("Musoorie is located in Uttarakhand.");
    }
    @Override
    public void famousFor() {
        System.out.println("Musoorie is famous for its colonial architecture.");
    }
}
// Subclass 3: Gulmarg
class Gulmarg extends HillStations{
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }
    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for its skiing and picturesque scenery.");
    }
}
public class TestHillStations{
    public static void main(String[] args) {
        // Creating objects of each subclass and referring to them using HillStations reference
        HillStations hs1 = new Manali();
        HillStations hs2 = new Mussoorie();
        HillStations hs3 = new Gulmarg();

        // Calling methods from superclass references
        System.out.println("Calling methods from HillStations reference:");
        hs1.location();
        hs1.famousFor();

        hs2.location();
        hs2.famousFor();

        hs3.location();
        hs3.famousFor();

        // Creating objects of each subclass directly and calling their methods
        System.out.println("\nCalling methods from subclass references:");
        Manali m = new Manali();
        m.location();
        m.famousFor();

        Mussoorie mus = new Mussoorie();
        mus.location();
        mus.famousFor();
        Gulmarg g = new Gulmarg();
        g.location();
    }
}
