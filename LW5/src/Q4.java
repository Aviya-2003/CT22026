import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        pet pets[] = new pet[100];
        int count = 0;

        while (true) {
            System.out.println("Enter the pet Name : ");
            String name = input.nextLine();

            if (name.equals("STOP")) {
                break;
            }

            if (count >= pets.length) {
                System.out.println("Array is full...!");
                break;
            }

            System.out.println("Enter pet type (dog for d cat for c) :");
            char type = input.next().charAt(0);
            input.nextLine();

            if (type == 'd') {
                System.out.println("Enter Dog weight :");
                double weight = input.nextDouble();
                input.nextLine();

                Dog d = new Dog();
                d.setname(name);
                d.setWeight(weight);

                pets[count] = d;
                count++;
            }
            else if (type == 'c')
            {

                System.out.println("Enter Cat coatColour :");
                String coatColour = input.nextLine();

                Cat c = new Cat();
                c.setname(name);
                c.setCoatColour(coatColour);

                pets[count]= c;
                count++;
            }
        }

        System.out.println("pet list");
        for(int i=0;i < count; i++){
            System.out.println(pets[i].toString());

            }
        }

    }

