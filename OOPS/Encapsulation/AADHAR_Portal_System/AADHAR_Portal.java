package OOPS.Encapsulation.AADHAR_Portal_System;

import java.util.Random;
import java.util.Scanner;

public class AADHAR_Portal {
    static Scanner sc=new Scanner(System.in);
    
    private String name;
    private String dob;
    private char gender;
    private String address;
    private long phoneNumber;
    private long aadharNumber;

    public AADHAR_Portal( String name,String dob,char gender,String address,long phoneNumber)
    {
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.address=address;
        this.phoneNumber=phoneNumber;
        generateAadharNumber();
    }

    private void generateAadharNumber(){
        Random r=new Random();
        aadharNumber=100000000000L + (long)(r.nextDouble() *900000000000L);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(doVerification()){
            this.name=name;
            System.out.println("Name Updated Successfully");
        }
        else{
            System.out.println("Verification Failed");
        }
        
    }
    //dob and gender are permanent
    public String getDob(){
        return dob;
    }

    public char getGender(){
        return gender;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address)
    {
        if(doVerification()){
            this.address=address;
            System.out.println("Address Updated Successfully");
        }
        else{
            System.out.println("Verification Failed");
        }
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber)
    {
        if(doVerification()){
            this.phoneNumber=phoneNumber;
            System.out.println("PhoneNumber Updated Successfully");
        }
        else{
            System.out.println("Verification Failed");
        }
    }

    public long getAadharNumber(){
        return aadharNumber;
    }

    public boolean doVerification()
    {
        System.out.println("Enter your Aadhar Number : ");
        long aadharNo= sc.nextLong();
        if(aadharNo==aadharNumber)
        {
            int count=3;
            do{
                System.out.println("you have received an OTP an - "+phoneNumber);
                Random r2=new Random();
                int otp=1000 + r2.nextInt(9000);
                System.out.println("OTP - "+otp);
                System.out.print("Enter OTP - ");
                int user_otp=sc.nextInt();
                sc.nextLine();// to clear buffer
                if(otp==user_otp)
                {
                    return true;
                }
                else{
                    System.out.println("Please Try Again");
                    System.out.println("Remaining Attempt - "+ --count);
                }
            }while(count !=0);
        }
        return false;
    }
}
