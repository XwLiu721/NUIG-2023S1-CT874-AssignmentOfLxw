import java.util.List;

public class Concert {
    private List<Seat> seatList;
    private double saleTotal;

    public Concert(List<Seat> seatList) {
        this.seatList=seatList;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public double getSaleTotal() {
        saleTotal=0;
        for(Seat seat:this.seatList){
            saleTotal+=seat.getPrice()*seat.getSellCount();
        }
        return saleTotal;
    }

    public void setSaleTotal(double saleTotal) {
        this.saleTotal = saleTotal;
    }

}
