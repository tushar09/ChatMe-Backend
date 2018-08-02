package club.captain.chatme.controllers;

import club.captain.chatme.models.HotelBooking;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/booking")
public class BookingController {
    private List<HotelBooking> hotelBookingList;

    public BookingController() {
        hotelBookingList = new ArrayList<>();
        for (int t = 0; t < 100; t++) {
            HotelBooking hotelBooking = new HotelBooking("asdf", t, t);
            hotelBookingList.add(hotelBooking);
        }
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getHotelBookingList() {
        return hotelBookingList;
    }

    @RequestMapping(value = "affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        return hotelBookingList.stream().filter(x -> x.getPricePerNight() <= price).collect(Collectors.toList());
    }

}
