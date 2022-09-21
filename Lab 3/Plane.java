public class Plane{
    private PlaneSeat[] seat;
    private int numEmptySeat=12;

    public Plane(){
        this.seat = new PlaneSeat[12];
    }
    public void setSeatID(){
        for(int i=0;i<12;i++){
            this.seat[i] = new PlaneSeat(i+1);
       }
    }
    public void incEmptySeat(){
        this.numEmptySeat += 1;
    }
    public void decEmptySeat(){
        this.numEmptySeat -= 1;
    }


    private PlaneSeat[] sortSeats(){
        PlaneSeat[] temp = this.seat.clone();
        for(int i=0;i<temp.length;i++){
            for(int j=i+1; j< temp.length; j++){
                PlaneSeat dummy;
                if(temp[i].getCustomerID() > temp[j].getCustomerID()){
                    dummy = temp[i];
                    temp[i] = temp[j];
                    temp[j] = dummy;
                }

            }
        }
        return temp;
    }

    public void showNumEmptySeats(){
        System.out.println("There are " + this.numEmptySeat+ " empty seats.");
    }
    public void showEmptySeats(){
        System.out.println("The following seats are empty: ");
        for (int i=0; i<12; i++){
            if(!this.seat[i].isOccupied()){
                System.out.println("SeatID "+this.seat[i].getSeatID());
            }
        }
    }
    public void showAssignedSeats(boolean bySeatId){
        System.out.println("The seat assignments are as follow:");
        if(bySeatId){
            for(int i=0;i<12;i++){
                if(this.seat[i].isOccupied()){
                    System.out.println("SeatID "+seat[i].getSeatID()+" assigned to CustomerID "+seat[i].getCustomerID());
                }
            }
        }else{
            PlaneSeat[] temp = sortSeats();
            for(int i=0;i<temp.length;i++){
                if(temp[i].isOccupied()){
                    System.out.println("SeatID "+temp[i].getSeatID()+" assigned to CustomerID "+temp[i].getCustomerID());
                }
            }

        }
    }
    public void assignSeat(int seatId, int cust_id){
        for(int i=0; i<12;i++){
            if(this.seat[i].isOccupied()){
                if(this.seat[i].getCustomerID() == cust_id){
                    System.out.println("Duplicate customer ID! Error!");
                    return;
                }
            }
        }
        if(this.seat[seatId].isOccupied()){
            System.out.println("Seat already assigned to a customer.");
        }else{
            this.seat[seatId].assign(cust_id);
            System.out.println("Seat Assigned!");            
            decEmptySeat();
        }
    }
    public void unAssignSeat(int seatId){
        if(this.seat[seatId-1].isOccupied()){
            this.seat[seatId-1].unAssign();
            System.out.println("Seat Unassigned!");
            incEmptySeat();
        }else{
            System.out.println("No one is assigned to this seat!");
        }
    }
}