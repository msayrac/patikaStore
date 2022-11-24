import java.util.ArrayList;
import java.util.List;

public class CellPhone extends Products{
    private int battery;
    private String color;
    private  int camera;

    public CellPhone(int id, String name, double unitPrice, int dicsountRate, int stockAmount, String brand, int memorySize, int screenSize, int ramMemory, int battery, String color, int camera) {
        super(id, name, unitPrice, dicsountRate, stockAmount, brand, memorySize, screenSize, ramMemory);
        this.battery = battery;
        this.color = color;
        this.camera = camera;
    }
    public CellPhone() {
    }

    public static void cellPhone(){

        List<CellPhone> cellPhoneArrayList = new ArrayList<CellPhone>();

        cellPhoneArrayList.add(new CellPhone(1,"SAMSUNG GALAXY A51",3199.0,20,4,"Samsung",128,6,8,4000,"Siyah",32));
        cellPhoneArrayList.add(new CellPhone(2,"iPhone 11 64 GB",7399.0,12,8,"Apple",64,7,16,5000,"Beyaz",22));
        cellPhoneArrayList.add(new CellPhone(3,"Redmi Note 10 Pro 8GB",5199.0,20,4,"Xiaomi",16,9,32,3800,"Kýrmýzý",12));
        System.out.println("*****************");
        System.out.println("ID"+"  "+"Name          "+"   "+"   Fiyat"+"     "+ "Marka"+"        "+ "   Depolama"+"    "+ "    Ekran"+ "      " + "RAM" );

        for (CellPhone x:cellPhoneArrayList) {
            System.out.println(x.getId() + " | "+ x.getName()+ " | "+ x.getUnitPrice()+ " | "+ x.getBrand()+x.getMemorySize()+ " | "+ x.getScreenSize()+ " | "+ " | "+ x.getCamera() + " | "+ x.getBattery()+ " | "+x.getRamMemory() + " | "+ x.getColor() );
        }
        System.out.println("*****************");
    }








    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
