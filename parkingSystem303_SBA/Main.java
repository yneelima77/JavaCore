package codingRoom.parkingSystem303_SBA;

public class Main {
    public static void main(String[] args) {
        HospitalParking hospitalParking = new HospitalParking(10);
        //System.out.println(hospitalParking.processTicket());
        System.out.println(hospitalParking.toString());

        MallParking mallParking = new MallParking(7);
        System.out.println(mallParking.toString());
    }
}
