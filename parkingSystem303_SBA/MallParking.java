package codingRoom.parkingSystem303_SBA;

public class MallParking implements ParkingSystem {
    int time;
    double surcharge = 0.10;
    double price;

    public MallParking(int time1) {
        this.time = time1;
        calculatePrice();
        addSurcharge();

    }

    private void calculatePrice() {
        if (time >= 6 && time <= 17) {
            price = MORNING;
        } else if (time >= 18 && time <= 23) {
            price = NIGHTLY;
        } else if (time >= 24 && time <= 5) {
            price = TWENTY_FOUR;
        }

    }

    private void addSurcharge() {
        price += price * surcharge;
    }

    @Override
    public double processTicket() {
        return price;
    }

    public String toString() {
        return String.format("Price for mall parking is %.2f", price);
    }
}
