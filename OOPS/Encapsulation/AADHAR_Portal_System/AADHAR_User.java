package OOPS.Encapsulation.AADHAR_Portal_System;

import java.util.Scanner;

public class AADHAR_User {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\t\tWelcome To AADHAR Portal");
        System.out.println("\n\t\tGovernment Of India");
        System.out.println("\n\tRegistration Page");
        System.out.println("Enter Below Details - ");

        System.out.print("Name : ");
        String name=sc.nextLine();

        System.out.print("Date Of Birth : ");
        String dob=sc.next();

        System.out.print("Gender (M OR F): ");
        char gender=sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Address : ");
        String address=sc.nextLine();

        System.out.print("Phone Number : ");
        long phoneNumber=sc.nextLong();

        AADHAR_Portal ap=new AADHAR_Portal(name,dob,gender,address,phoneNumber);

        int choice1 =0;
        do{
            System.out.println("1. Get Information \n2. Set Information \n3. Exit");
            System.out.println("Enter your Choice ");
            choice1=sc.nextInt();

            if(choice1==1){
                System.out.println("Get Information Page");
                int choice2=0;
                do{
                    System.out.println("1. Name\n2. DOB\n3. Gender\n4. Address\n5. PhoneNumber\n6. AADHAR Number\n7. Exist");
                    System.out.println("Enter your Choice : ");
                    choice2= sc.nextInt();

                    switch(choice2)
                    {
                        case 1:
                            System.out.println("Name : "+ap.getName());
                        break;
                        case 2:
                            System.out.println("Date Of Birth : "+ap.getDob()); 
                        break;
                        case 3:
                            System.out.println("Gender : "+ap.getGender());
                        break;
                        case 4:
                            System.out.println("Address : "+ap.getAddress());
                        break;
                        case 5:
                            System.out.println("Phone Number : "+ap.getPhoneNumber());
                        break;
                        case 6:
                            System.out.println("AADHAR Number : "+ap.getAadharNumber());
                        break;
                        case 7:
                            System.out.println("Redirecting .... To Home Page");
                        break;
                        default:
                            System.out.println("Please Select a Valid Option");
                    }

                }while(choice2!=7);
            }
            else if(choice1==2)
            {
                System.out.println("Set Information Page");
                int choice3=0;
                do{
                    System.out.println("1. Name\n2. Address\n3. PhoneNumber\n4. Exist");
                    System.out.println("Enter your Choice : ");
                    choice3=sc.nextInt();
                    switch(choice3){
                        case 1:
                            System.out.print("Enter new Name : ");
                            sc.nextLine(); // clear buffer if needed
                             String newName=sc.nextLine();
                             ap.setName(newName);
                        break;

                        case 2:
                            System.out.print("Enter new Address : ");
                            sc.nextLine(); // clear buffer if needed
                             String newAddress=sc.nextLine();
                             ap.setAddress(newAddress);
                        break;

                        case 3:
                            System.out.print("Enter new PhoneNumber : ");
                             long newPhoneNumber=sc.nextLong();
                             ap.setPhoneNumber(newPhoneNumber);
                        break;
                        case 4:
                            System.out.println("Redirecting .... To Home Page");
                        break;
                        default:
                            System.out.println("Please Select a Valid Option");
                    }
                }while(choice3!=4);
            }
            else
            {
                System.out.println("Thank You Using Our Services");
            }
        }while(choice1!=3);
    }
}
