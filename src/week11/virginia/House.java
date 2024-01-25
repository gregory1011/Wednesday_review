package week11.virginia;

public class House {

    public String address;
    protected  double price;
    String neighborhoodName;
    private String ownerName;


    public static void main(String[] args) {

        House obj = new House();
        obj.address = "1040 N Lane";
        obj.price = 100_000;
        obj.neighborhoodName =" Berry Hills";
        obj.ownerName = "Jora Calicu";


    }




}
