import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        pet[] pets = new pet[100];
        int count = 0;

        while (true) {

            System.out.println("Enter Pet Name : ");
            String name = input.nextLine();

            if (name.equals("STOP")) {
                break;
            }

            if (count >= pets.length) {
                System.out.println("Cant add more pets .. !");
                break;
            }

            System.out.println("Enter the pet type (dog for d and cat for c): ");
            char type = input.next().charAt(0);
            input.nextLine();

            if (type == 'd') {
                pets[count] = new Dog();
            } else if (type == 'c') {
                pets[count] = new Cat();
            } else {
                System.out.println("Invalid type ..! ");
                continue;
            }

            pets[count].setname(name);
            count++;
        }

        System.out.println("...... The pet list is ..... ");
        for (int i = 0; i < count; i++) {
            String type;
            if (pets[i] instanceof Dog) {
                type = "Dog";

                System.out.println("name: "+pets[i].getName() + "\t\t" + "Type : "+type);
            }
        }

            for (int i = 0; i < count; i++) {
                String type;
                if (pets[i] instanceof Cat) {
                    type = "Cat";

                    System.out.println("name: "+ pets[i].getName() + "\t\t" + "Type : "+type);
                }
        }
    }
}
