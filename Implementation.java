package IMPLinterface;

import Information.PassengerDetail;
import Interfaces.Fields;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Implementation implements Fields {
    PassengerDetail pd=new PassengerDetail();
    Scanner sc=new Scanner(System.in);
    List< PassengerDetail> pss=new ArrayList<>();
    @Override
    public void PersonalDetail() {
        System.out.println("WELCOME TO PRATHAM TRAVELS ");
        System.out.println("Enter Your First Name");
        pd.setFirstName(sc.next());
        System.out.println("Enter Your Middle Name");
        pd.setMiddleName(sc.next());
        System.out.println("Enter Your Last Name");
        pd.setLastName(sc.next());
        System.out.println("Enter Your Gender");
        pd.setGender(sc.next());
        System.out.println("Enter Your Mobile Number");
        pd.setMobileNo(sc.nextDouble());
        System.out.println("Enter Your Aadhar card Number");
        pd.setAadharcardNo(sc.nextDouble());
        System.out.println("Enter Your Pincode");
        pd.setPincode(sc.nextInt());
        System.out.println("Enter Your Pickup place");
        pd.setFrom(sc.next());
        System.out.println("Enter Your Drop Destinaation");
        pd.setWhere(sc.next());


    }

    @Override
    public void SeatSelection() {

        for (int i=1 ;i<=10;i++){
            System.out.println(i);
        } System.out.println("Enter The Number of set to book ");
        sc.next();

    }

    @Override
    public void DisplayTempselection() {
        System.out.println(" Your Entered Details");
        {
            System.out.println("Here Are Your Personal Details");
            System.out.println(pd.getFirstName());
            System.out.println(pd.getMiddleName());
            System.out.println(pd.getLastName());
            System.out.println(pd.getGender());
            System.out.println(pd.getMobileNo());
            System.out.println(pd.getPincode());
            System.out.println(pd.getAadharcardNo());
            System.out.println(pd.getAddress());
            System.out.println(pd.getFrom());
            System.out.println(pd.getWhere());
        }


    }

    @Override
    public void paymentmethod() {
        System.out.println("Select Your Payment Method");
        System.out.println(" ONLINE / UPI");
        System.out.println(" Debit Card ");
        System.out.println("Credit Card");
        System.out.println("Net Banking");
        System.out.println(sc.next());
        System.out.println("Enter Amount");
        System.out.println(sc.nextInt());
        System.out.println("Thank You");


    }


}
