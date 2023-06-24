package codingRoom.parkingSystem303_SBA;

import java.lang.invoke.StringConcatFactory;
import java.time.LocalTime;

public class HospitalParking implements ParkingSystem {
    int time;
    double surcharge = 0.20;
    double price;

    public HospitalParking(int time1) {
        this.time = time1;
        calculatePrice();
        addSurcharge();

    }
    private void calculatePrice() {
        if(time >= 6 && time <= 17){
            price = MORNING;
        } else if (time >= 18 && time <= 23) {
            price = NIGHTLY;
        } else if (time >= 24 && time <= 5) {
            price = TWENTY_FOUR;
        }
    }
    private void addSurcharge() {
        price = price * 0.02 +price;
    }

    /* if the ticket is from hospital parking and the time is between 5am - 5pm. The price would 20% * 20 + 20 = $24.00
     Price for hospital parking is $24.00*/
    @Override
    public double processTicket() {
        return price;
    }

    public String toString() {
        return String.format("Price for hospital parking is %.2f", price);
    }

}
