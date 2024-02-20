import java.util.Scanner;


class Conditional{

	public static void main(String[] args) {

		//Q: find largest of 5 numbers using if case only

		int n1 = 35,n2 = 76,n3 = 56 ,n4 = 96 ,n5 = 25;
		int max = n1;

		if(max < n2){
			max = n2;
		}
		if(max < n3){
			max = n3;
		}
		if(max < n4){
			max = n4;
		}
		if(max < n5){
			max = n5;
		}

		System.out.println(max);



		//Q: smallest among 4 numbers using if case only
		int m1 = 35,m2 = 76,m3 = 56 ,m4 = 96 ,m5 = 25;
		int min = m1;

		if(min > n2){
			min = n2;
		}
		if(min > n3){
			min = n3;
		}
		if(min > n4){
			min = n4;
		}
		if(min > n5){
			min = n5;
		}

		System.out.println(min);



		//accept marks,gender and percentage and comment on admission

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter paper1 marks : ");
		int marks1 = sc.nextInt();

		System.out.println("Enter paper2 marks : ");
		int marks2 = sc.nextInt();

		System.out.println("Enter gender (m/f) : ");
		char gender = sc.next().charAt(0);

		int percent = ((marks1 + marks2)*100)/200;

		System.out.println("\n");
		System.out.println(marks1);
		System.out.println(marks2);
		System.out.println(gender);
		System.out.println(percent);

		if(marks1 < 35 || marks2 < 35){
			System.out.println("You failed in either of the paper");
		}

		if((percent) > 35){
			System.out.println("Your percentage is : " + percent);

			if((percent >= 62) && (gender == 'f')){
				System.out.println("\nFemale can take admission");
			}
			else{
				System.out.println("You cannot take admission");
			}

		}
		else{
			System.out.println("\nYou failed the exam, percentage less than passing criteria");
		}



		//accept day and comment on weekday and weekend
		System.out.println("\n\nEnter a day : ");
		String day = sc.next();

		if(day.equals("sat") ||  day.equals("sun")){
			System.out.println("Its a weekend :)");
		}
		else{
			System.out.println("Its a weekday :( ");
		}



		//leap year based on centurian
		System.out.println("\n\nEnter a year : ");
		int year = sc.nextInt();

		if((year % 100) != 0)
		{
			if((year % 4) == 0){
				System.out.println("Its not a centuary leap year");
			}
			else{
				System.out.println("Its not a leap year");
			}
		}

		else{
			if((year % 400) == 0){
				System.out.println("Its a centurian leap year");
			}
			else{
				System.out.println("Its not a leap year");
			}
		}


		//calculate number of notes for the given amount
		System.out.println("\n\nEnter an amount : ");
		int amt = sc.nextInt();

		System.out.println("\n\nEnter an range of notes : ");
		int range = sc.nextInt();

	}
}