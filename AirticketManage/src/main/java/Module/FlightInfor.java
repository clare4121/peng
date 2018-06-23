package Module;

public class FlightInfor {


    private int flightId;
    private String startPlace;
private String endPlace;
private String goDate;
private  String goTime;
private  String arriveTime;
private int ticketPrice;
private int ticketNum;


    public FlightInfor() { }


    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public String getGoDate() {
        return goDate;
    }

    public void setGoDate(String goDate) {
        this.goDate = goDate;
    }

    public String getGoTime() {
        return goTime;
    }

    public void setGoTime(String goTime) {
        this.goTime = goTime;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    @Override
    public String toString() {
        return "FlightInfor{" +
                "flightId=" + flightId +
                ", startPlace='" + startPlace + '\'' +
                ", endPlace='" + endPlace + '\'' +
                ", goDate='" + goDate + '\'' +
                ", goTime='" + goTime + '\'' +
                ", arriveTime='" + arriveTime + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", ticketNum=" + ticketNum +
                '}';
    }
}
