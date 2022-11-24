import java.util.Scanner;

public class PatikaStore {
    public static void main(String[] args) {

Brand brands = new Brand();
Notebook nb = new Notebook();
CellPhone cp = new CellPhone();

        System.out.println("Hoþgeldiniz! PatikaStore Ürün Yönetim Paneli");

        System.out.println("Please choose 0-3");
        System.out.println("1 - Notebook Ýþlemleri");
        System.out.println("2 - Cep Telefonu Ýþlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çýkýþ Yap");
        System.out.println("Selection : ");
        Scanner input = new Scanner(System.in);

        int selectCase = input.nextInt();


        boolean control =false;
        do{

            switch (selectCase){
                case 1:
                    System.out.println("1 sectiniz");
                    nb.noteBook();
                    control = true;
                    break;
                case 2:
                    System.out.println("2 sectiniz");
                    cp.cellPhone();
                    control = true;
                    break;
                case 3:
                    System.out.println("3 sectiniz");
                    System.out.println("Markalarýmýz :");
                    brands.brandList();
                    control = true;
                    break;

                case 0:
                    System.out.println("Çýkýþ Yaptýnýz.");
                    control = true;
                    break;

                default:
                    System.out.println("Please Select 0-3");
                    break;
            }
        } while(control==false);




    }
}