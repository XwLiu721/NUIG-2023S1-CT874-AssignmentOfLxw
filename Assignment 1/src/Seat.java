public class Seat {
    private String typeName;
    private Double price;
    private Integer sellCount;

    public Seat(String typeName,Integer userInputSeatSale, Double userInputSeatPrice) {
        this.setTypeName(typeName);
        this.setSellCount(userInputSeatSale);
        this.setPrice(userInputSeatPrice);
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSellCount() {
        return sellCount;
    }

    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }
}
