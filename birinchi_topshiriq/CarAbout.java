package birinchi_topshiriq;

public class CarAbout {
    public static void main(String[] args) {
        Car nexia = new Car();
        nexia.getColor("Oq ");
        nexia.getModel("Nexia3");
        System.out.print("Narxi: ");
        nexia.getNarx(10000);
        nexia.getTuzilma("Avtomat");

        System.out.println();

        Car cobalt = new Car();
        cobalt.getColor("Qora ");
        cobalt.getModel("Cobalt midnight");
        System.out.print("Narxi: ");
        cobalt.getNarx(14000);
        cobalt.getTuzilma("Avtomat");

    }
}
