package ExecutionMain;
import java.util.Scanner;
import IMPLinterface.Implementation;
import Information.PassengerDetail;

public class Execution extends Implementation {
    public static void main(String[] args) {
        PassengerDetail pd = new PassengerDetail();
        Implementation ie=new Implementation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number To start");
        sc.nextInt();
        while (true) {
            System.out.println("1. TO ENTER PERSONAL DEATILS");
            System.out.println("2 .TO SELECT SEAT");
            System.out.println("3. Display Details");
            System.out.println("4. PAYMENT METHOD");
            System.out.println("5 .TO EXIT");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    ie.PersonalDetail();
                    break;

                case 2:
                    ie.SeatSelection();
                    break;

                case 3:
                    ie.DisplayTempselection();
                    break;

                case 4:
                    ie.paymentmethod();
                    break;

                case 5:
                    sc.close();
                    System.out.println("EXITING");
                    return;
            }
        }

    }
}