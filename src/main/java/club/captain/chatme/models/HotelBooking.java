package club.captain.chatme.models;

public class HotelBooking {
    private String hotelName;
    private double pricePerNight;
    private int nbOfNight;

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNight) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNight = nbOfNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNbOfNight() {
        return nbOfNight;
    }

    public void setNbOfNight(int nbOfNight) {
        this.nbOfNight = nbOfNight;
    }

}
