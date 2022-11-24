import java.util.LinkedList;
import java.util.List;

public class Brand {

    private int id;
    private java.lang.String name;

    public Brand(int id, java.lang.String name) {
        this.id = id;
        this.name = name;
    }
    public Brand(java.lang.String name) {

        this.name = name;
    }
    public Brand() {

          }

    public static void brandList(){

        List<java.lang.String> brandList = new LinkedList<java.lang.String>();
        brandList.add("Samsung");
        brandList.add("Lenovo");
        brandList.add("Apple");
        brandList.add("Huawei");
        brandList.add("Casper");
        brandList.add("Asus");
        brandList.add("HP");
        brandList.add("Xiaomi");
        brandList.add("Monster");

       // System.out.print(brandList);

        for (java.lang.String x:brandList) {
            System.out.println(x);

        }


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getName(int n) {

        return getName(n);
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
