package hotelmanage.external;

public class Payment {
    private int ReservationNumber; // 받아야 되고
    private int PaymentPrice; // 받아야되고
    private String ReservationStatus; //받아야되고

    public int getReservationNumber() {
        return ReservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        ReservationNumber = reservationNumber;
    }

    public int getPaymentPrice() {
        return PaymentPrice;
    }

    public void setPaymentPrice(int paymentPrice) {
        PaymentPrice = paymentPrice;
    }

    public String getReservationStatus() {
        return ReservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        ReservationStatus = reservationStatus;
    }
}

