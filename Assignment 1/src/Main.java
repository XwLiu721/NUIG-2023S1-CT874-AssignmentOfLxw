import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Define some parameter
        String[] seatTypes={"A","B","C"};
        List<Seat> seatList = new LinkedList<Seat>() ;

        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        int userInputSeatSale = 0;
        double userInputSeatPrice = 0;

        for(int i=0;i<3;i++){
            System.out.println("Enter number of "+seatTypes[i]+" seats sold:");
            userInputSeatSale = Integer.parseInt(input.nextLine());
            System.out.println("Enter price of "+seatTypes[i]+" tickets:");
            userInputSeatPrice = Double.parseDouble(decimalFormat.format(Double.parseDouble(input.nextLine())));
            Seat temp = new Seat(seatTypes[i],userInputSeatSale,userInputSeatPrice);
            seatList.add(temp);
        }
        Concert concert = new Concert(seatList);

        //Show result

        System.out.println(" \t \t Tickets Sold \t Price per Ticket");
        System.out.println(" \t \t ------------ \t ----------------");
        for(int i=0;i<3;i++){
            System.out.println(seatList.get(i).getTypeName()+" Tickets: \t\t"+seatList.get(i).getSellCount()+"\t\t\t"+decimalFormat.format(seatList.get(i).getPrice()));
        }
        System.out.println("\t\t\tTotal Sales € "+concert.getSaleTotal());

    }
}