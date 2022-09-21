public class PlaneSeat{
    private int seatID;
    private boolean assigned=false;
    private int customerId;

    public PlaneSeat(int seatID){
        this.seatID = seatID;
    }
    public int getSeatID(){
        return this.seatID;
    }
    public int getCustomerID(){
        return this.customerId;
    }
    public boolean isOccupied(){
        return this.assigned;
    }
    public void assign(int cust_id){
        this.customerId = cust_id;
        this.assigned = true;
    }
    public void unAssign(){
        this.customerId = -1;
        this.assigned = false;
    }
}