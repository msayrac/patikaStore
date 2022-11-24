public class Products {

    private int id;
    private String name;
    private double unitPrice;
    private int dicsountRate;
    private int stockAmount;
    private String brand;
    private int memorySize;
    private int screenSize;
    private int ramMemory;

    public Products(int id, String name, double unitPrice, int dicsountRate, int stockAmount, String brand, int memorySize, int screenSize, int ramMemory) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.dicsountRate = dicsountRate;
        this.stockAmount = stockAmount;
        this.brand = brand;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
        this.ramMemory = ramMemory;
    }

    public Products() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDicsountRate() {
        return dicsountRate;
    }

    public void setDicsountRate(int dicsountRate) {
        this.dicsountRate = dicsountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }
}
