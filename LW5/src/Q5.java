import java.util.Scanner;

public class Q5 {
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
            } else if (type == 'c') {

                System.out.println("Enter Cat coatColour :");
                String coatColour = input.nextLine();

                Cat c = new Cat();
                c.setname(name);
                c.setCoatColour(coatColour);

                pets[count] = c;
                count++;
            }
        }

        Dog[] dogs = new Dog[count];
        int dogCount = 0;

        for(int i = 0; i < count; i++){

            if(pets[i] instanceof Dog){
                dogs[dogCount]= (Dog) pets[i];
                dogCount++;

            }
        }

        double sum = 0;
        double min = dogs[0].getWeight();
        double max = dogs[0].getWeight();

        for(int i = 0; i < dogCount; i++){
            double w = dogs[i].getWeight();

            sum += w ;

            if(w < min)
            {
                min = w;
            }
            if(w>max)
            {
                max = w;
            }
        }

        double average = sum / dogCount;

        System.out.println("Average Weight : "+average);
        System.out.println("Maximum weight : "+max);
        System.out.println("Minimum Weight : "+min);
    }
}