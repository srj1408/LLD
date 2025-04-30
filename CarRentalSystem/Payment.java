package CarRentalSystem;

public class Payment {

    private Bill bill; // payment has a bill because payment is done after bill is generated

    public void payBill(Bill bill){
        //payment process
        bill.setPaid(true);
    }
}
