//switch case 


import java.util.*;

class Demo4
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
        //wap to abbreviate your name 
		System.out.println("Enter a Character of your name : ");
		char word = sc.next().charAt(0);

		switch(word)
		{
		case 's':
			System.out.println("smart");
			break;
		case 'a':
			System.out.println("ambitious");
			break;
		case 'y':
			System.out.println("young");
			break;
		case 'l':
			System.out.println("lovely");
			break;
		case 'i':
			System.out.println("incredible");
			break;
		default:
			System.out.println("enter properly");

		
        

        //wap to present restaurant menu
        char choice;

        do {
            System.out.println("Welcome to our restaurant");
            System.out.println("What would you like to have? ");

            System.out.println("1. Vada Pav");
            System.out.println("2. Masala Dosa");
            System.out.println("3. Medu Vada");
            System.out.println("4. Coffee");
            System.out.println("5. Aloo Paratha");
            System.out.println("6. Upma");
            System.out.println("7. Pohe");
            System.out.println("8. Veg Thali");
            System.out.println("9. Punjabi Thali");
            System.out.println("10. Pasta");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("1. Vada Pav");
                    break;
                case 2:
                    System.out.println("2. Masala Dosa");
                    break;
                case 3:
                    System.out.println("3. Medu Vada");
                    break;
                case 4:
                    System.out.println("4. Coffee");
                    break;
                case 5:
                    System.out.println("5. Aloo Paratha");
                    break;
                case 6:
                    System.out.println("6. Upma");
                    break;
                case 7:
                    System.out.println("7. Pohe");
                    break;
                case 8:
                    System.out.println("8. Veg Thali");
                    break;
                case 9:
                    System.out.println("9. Punjabi Thali");
                    break;
                case 10:
                    System.out.println("10. Pasta");
                    break;
                case 11:
                    System.out.println("Thank you, we were glad to serve you");
                    break;
                default:
                    System.out.println("Enter a proper choice");
            }

            if (num == 11) {
                break;
            }

            System.out.print("Would you like to have something else? Y/N: ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for visiting our restaurant!");
	}
}