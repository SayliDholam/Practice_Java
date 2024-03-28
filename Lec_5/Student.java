import java.util.*;

class Stud {

    int sid[] = new int[10];
    String sname[] = new String[10];
    String city[] = new String[10];
    long mob[] = new long[10];

    int i = 0;
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Student Id : ");
        sid[i] = sc.nextInt();
        sc.nextLine();
        System.out.println("Student Name : ");
        sname[i] = sc.nextLine();
        System.out.println("Student City : ");
        city[i] = sc.nextLine();
        System.out.println("Student Mobile Number : ");
        mob[i] = sc.nextLong();

        i++;
    }

    public void updateStudent() {
        int n1,j,id;
        System.out.print("\nEnter the ID: ");
        id = sc.nextInt();
        System.out.println("\nID \t"+"Name \t"+"City\t"+"Mobile no.");

        for (j = 0;j<i;++j)
        {
            if(id == sid[j])
            {

                System.out.print(sid[j]+"\t"+sname[j]+"\t"+city[j]+"\t"+mob[j]);
                System.out.println("\nChoose the Option");
                System.out.println("1.Edit Name.");
                System.out.println("2.Edit City.");
                System.out.println("3.Edit Mobile No.");
                System.out.print("\nEnter:");
                n1 = sc.nextInt();
                sc.nextLine();

                switch(n1){
                case 1:
                    System.out.print("\nEnter New Name: ");
                    String new_name = sc.next();
                    sname[j] = new_name;
                    System.out.println("Name Updated\n");
                    break;

                case 2:
                    System.out.print("\nEnter New City Name: ");
                    String new_city = sc.nextLine();
                    city[j] = new_city;
                    System.out.println("City Updated\n");
                    break;

                case 3:
                    System.out.print("\nEnter New Mobile no.: ");
                    long new_mob = sc.nextLong();
                    mob[j] = new_mob;
                    System.out.println("Mobile number Updated\n");
                    break;
                }
                break;
            }     
        }   
    }

    public void deleteStudent() {
        int id, j , k ;
        System.out.println("\nEnter Student Id : ");
        id = sc.nextInt();
        for(j = 0; j < i ; j++)
        {
            if(id == sid[j])
            {
                for(k = j; k < i-1; ++k)
                {
                    sid[k] = sid[k+1];
                    sname[k] = sname[k+1];
                    city[k] = city[k+1];
                    mob[k] = mob[k+1];
                }
                --i;
                break;
            }
        }
    }

    public void showStudent() {
        System.out.println("sid\t\tsname\t\tcity\t\tmobile");

        for (int j = 0; j < i; j++) {
            System.out.println(sid[j] + "\t\t" + sname[j] + "\t\t" + city[j] + "\t\t" + mob[j]);
        }
    }
}

public class Student {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        Stud s = new Stud();

        while (true) {
            System.out.println("\nSelect Options : ");
            System.out.println("1. Add Student : ");
            System.out.println("2. Edit Student : ");
            System.out.println("3. Delete Student : ");
            System.out.println("4. Show Student : ");
            System.out.println("5. Exit ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    s.addStudent();
                    break;

                case 2:
                    s.updateStudent();
                    break;

                case 3:
                    s.deleteStudent();
                    break;

                case 4:
                    s.showStudent();
                    break;

                case 5:
                    System.exit(0);
            }
        }

    }
}
