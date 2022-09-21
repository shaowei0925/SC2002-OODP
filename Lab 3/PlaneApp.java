import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args){
        Plane plane1 = new Plane();
        plane1.setSeatID();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("(1) Show the number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of customers together with their seat number in the order of the seat numbers");
            System.out.println("(4) Show the list of customers together with their seat number in the order of the customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");

            int option;
            int seatId;
            System.out.print("Enter the number of your choice: ");
            option = scanner.nextInt();
            System.out.println();

            switch (option){
                case 1:
                    plane1.showNumEmptySeats();
                    break;
                case 2:
                    plane1.showEmptySeats();
                    break;
                case 3:
                    plane1.showAssignedSeats(true);
                    break;
                case 4:
                    plane1.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Assigning Seat ..");
                    System.out.print("Please enter SeatID: ");
                    seatId = scanner.nextInt();
                    System.out.print("Please enter Customer ID: ");
                    int cust_id = scanner.nextInt();
                    plane1.assignSeat(seatId-1, cust_id);
                    break;
                case 6:
                    System.out.print("Enter SeatID to unassign customer from: ");
                    seatId = scanner.nextInt();
                    plane1.unAssignSeat(seatId);
                    break;
                case 7:
                    loop = false;
                    break;

            }
            System.out.println();

        }


    }
}
