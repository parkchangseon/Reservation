package hotelmanage;

public class Reserved extends AbstractEvent {

    private Integer reservationNumber;
    private String customerName;
    private Integer customerId;
    private String reserveStatus;
    private Integer roomNumber;

    public Integer getPaymentPrice() {
        return PaymentPrice;
    }

    public void setPaymentPrice(Integer paymentPrice) {
        PaymentPrice = paymentPrice;
    }

    private Integer PaymentPrice;

    public Reserved(){
        super();
    }

    public Integer getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(Integer reservationNumber) {
        this.reservationNumber = reservationNumber;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public String getReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
}
