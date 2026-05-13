import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean run = true;
        int[] OIDs = new int[1000];
        int index=0;
        int[] Ocounts = new int[1000];

        do {
            boolean order = true;

            System.out.println("Select a Menu category : ");
            System.out.println("1. Entree");
            System.out.println("2. Side Dish");
            System.out.println("3. Drink");
            System.out.println("4. Exit");


            int menu = input.nextInt();



            switch (menu) {
                case 1:

                    System.out.println("Entree");
                    System.out.println("1.Tofu Burger       $3.49");
                    System.out.println("2.Cajun Chicken     $4.59");
                    System.out.println("3.Buffalo Wings     $3.99");
                    System.out.println("4.Rainbow Fillet    $2.99");
                    break;

                case 2:
                    System.out.println("Side Dish");
                    System.out.println("5.Rice Cracker     $0.79");
                    System.out.println("6.No-Salt Fries    $0.69");
                    System.out.println("7.Zucchini         $1.09");
                    System.out.println("8.Brown Rice       $0.59");
                    break;


                case 3:
                    System.out.println("Drink");
                    System.out.println("9.Cafe Mocha       $1.99");
                    System.out.println("10.Cafe Latte       $1.90");
                    System.out.println("11.Espresso         $2.49");
                    System.out.println("12.Oolong Tea       $0.99");
                    break;
                    case 4:
                        run = false;
                        order = false;
                        break;

                default:
                    System.out.println("Invalid Selection..");
                    return;


            }
            while (order) {
                System.out.println("Select an option ");
                System.out.println("1.order an new item : ");
                System.out.println("2.exit : ");
                int option = input.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Enter the id of the food you choose : ");
                        OIDs[index] = input.nextInt();
                        System.out.println("Enter the Quantity of an item : ");
                        Ocounts[index] = input.nextInt();
                        index++;
                        break;

                    case 2:
                        order = false;
                        break;
                    default:
                        System.out.println("Invalid Selection..");


                }
            }
        }while(run);


        double total = 0;

        for(int i=0;i<index;i++) {
            int id=OIDs[i];
            int qty=Ocounts[i];
            double price=0;
            String name="";

            switch (id) {
                case 1: price = 3.49;
                name = "Tofu Burger";
                break;
                case 2:
                    price = 4.59;
                    name = "Cajun Chicken";
                    break;
                case 3:
                    price = 3.99;
                    name = "Buffalo Wings";
                    break;
                case 4:
                    price = 2.99;
                name = "Rainbow Fillet";
                break;
                case 5:
                    price = 0.79;
                    name = "Rice Cracker";
                    break;
                case 6:
                    price = 0.69;
                    name = "No-Salt Fries";
                    break;
                case 7:
                    price = 1.09;
                    name = "Zucchini";
                    break;
                case 8:
                    price = 0.59;
                    name = "Brown Rice";
                    break;
                case 9:
                    price = 1.99;
                    name = "Cafe Mocha";
                    break;
                case 10:
                    price = 1.90;
                    name = "Cafe Latte";
                    break;
                case 11:
                    price = 2.49;
                    name = "Espresso";
                    break;
                case 12:
                    price = 0.99;
                    name = "Oolong Tea";
                    break;
                default:
                    System.out.println("Invalid item ID: " + id);
                    name = "Unknown Item";
                    price = 0;

            }
            System.out.println(name + "|QTY : " +qty + "| Price $ :" + (price * qty));
            total += price * qty;
        }
        System.out.println("Total Price : $" + total);

    }
}
