import java.util.Scanner;

public class Q3 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the power of Ten : ");
        int power= input.nextInt();

        switch (power){

            case(6):
        System.out.println("one Million");
        break;
            case(9):
                System.out.println("one Billion");
                break;
                case(12):
                    System.out.println("one Trillion");
                    break;
                    case(15):
                        System.out.println("one Quadrillion");
                        break;
                        case(18):
                            System.out.println("one Quintilion");
                            break;
                            case(21):
                                System.out.println("one Sextillion");
                                break;
                                case(30):
                                    System.out.println(" One Nonillion");
                                    break;
                                    case(100):
                                        System.out.println(" One Googo");
                                        break;

            default:
                System.out.println("you entered invalid input ...");



        }

    }
}
