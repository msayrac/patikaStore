import java.util.Scanner;

public class PatikaStore {
    public static void main(String[] args) {

Brand brands = new Brand();
Notebook nb = new Notebook();
CellPhone cp = new CellPhone();

        System.out.println("Ho�geldiniz! PatikaStore �r�n Y�netim Paneli");

        System.out.println("Please choose 0-3");
        System.out.println("1 - Notebook ��lemleri");
        System.out.println("2 - Cep Telefonu ��lemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - ��k�� Yap");
        System.out.println("Selection : ");
        Scanner input = new Scanner(System.in);

        int selectCase = input.nextInt();

        boolean control =true;

        do{
            switch (selectCase){
                case 1:
                    System.out.println("1 sectiniz");
                    nb.noteBook();
                    control = false;
                    break;
                case 2:
                    System.out.println("2 sectiniz");
                    cp.cellPhone();
                    control = false;
                    break;
                case 3:
                    System.out.println("3 sectiniz");
                    System.out.println("Markalar�m�z :");
                    brands.brandList();
                    control = false;
                    break;

                case 0:
                    System.out.println("0 sectiniz");
                    control = false;
                    break;

                default:
                    System.out.println("Please Select 0-3");
                    break;
            }
        } while(control);




    }
}