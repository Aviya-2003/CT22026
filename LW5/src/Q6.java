import java.util.Scanner;
public class Q6 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        pet[] pets= new pet[100];
        Dog[]dogs = new Dog[100];
        Cat[]cats= new Cat[100];

        int petCount = 0;
        int DogCount = 0;
        int CatCount = 0;

        while (true)
        {

            System.out.println( "\n 1. Add Cat");
            System.out.println(" 2. Add Dog");
            System.out.println(" 3. Remove Cat");
            System.out.println(" 4. Remove Dog");
            System.out.println(" 0. Quit");
            System.out.println("Enter your choice : ");

            int choice = input.nextInt();
            input.nextLine();

            if(choice == 0)
            {
                break;
            }

            switch (choice){
                case 1:
                    System.out.println("Enter Cat name : ");
                    String cname = input.nextLine();
                    System.out.println("Enter coat colour : ");
                    String coat = input.nextLine();

                    Cat cat = new Cat();
                    cat.setname(cname);
                    cat.setCoatColour(coat);

                   cats[CatCount++] = cat ;
                   pets[petCount++]= cat ;

                    break;


                case 2:
                    System.out.println("Enter Dog Name");
                    String dname = input.nextLine();

                    System.out.println("Enter Dog Weight : ");
                    double weight = input.nextDouble();

                    Dog dog = new Dog();
                    dog.setname(dname);
                    dog.setWeight(weight);

                    dogs[DogCount ++] = dog ;
                    pets[petCount++] = dog ;

                    break;

                case 3:
                    System.out.println("Enter cat name you want to remove : ");
                    String removeCAt = input.nextLine();

                    for( int i= 0; i < CatCount; i++){
                        if(cats[i].getName().equals(removeCAt))
                        {
                            for(int j =i ; j < CatCount; j++){
                                cats[j]=cats[j+1];
                            }
                            CatCount--;
                            System.out.println("Cat removed..!");
                            break;
                        }
                    }

                    break;

                case 4:
                    System.out.println("Enter Dog Name You want to remove : ");
                    String RemoveDog = input.nextLine();

                    for(int i = 0;i < DogCount; i++ )
                    {
                        if(dogs[i].getName().equals(RemoveDog))
                        {
                            for(int j = i ; j < DogCount ; j++ )
                            {
                                dogs[j]=dogs[j+1];
                            }
                            DogCount --;
                            System.out.println("Dog Removed...!");
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid Choice..!");

            }


        }
    }
}
