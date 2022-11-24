import java.util.LinkedList;
import java.util.List;

public class Notebook extends Products{

    public Notebook(int id, String name, double unitPrice, int dicsountRate, int stockAmount, String brand, int memorySize, int screenSize, int ramMemory) {
        super(id, name, unitPrice, dicsountRate, stockAmount, brand, memorySize, screenSize, ramMemory);
    }

    public Notebook() {
    }

    public static void noteBook(){
       // Notebook notebook = new Notebook(1,"HUAWEI Matebook 14",7000.0,10,3,"Huawei",512,14,16);
        List<Notebook> notebooksList = new LinkedList<Notebook>();
        notebooksList.add(new Notebook(1, "HUAWEI Matebook 14",7000.0,10,3,"Huawei",512,14,16));
        notebooksList.add(new Notebook(2, "LENOVO V14 IGL",3600.0,15,6,"Lenovo",1024,13,8));
        notebooksList.add(new Notebook(3, "ASUS Tuf Gaming",8000.0,13,9,"Asus",2048,16,32));

        System.out.println("*****************");
        System.out.println("ID"+"  "+"Name          "+"   "+"   Fiyat"+"     "+ "Marka"+"        "+ "   Depolama"+"    "+ "    Ekran"+ "      " + "RAM" );

        for (Notebook x:notebooksList) {
            System.out.println(x.getId() + " | "+ x.getName()+ " | "+ x.getUnitPrice()+ " | "+ x.getBrand()+x.getMemorySize()+ " | "+ x.getScreenSize()+ " | "+ x.getRamMemory());
        }
        System.out.println("*****************");
    }





}
