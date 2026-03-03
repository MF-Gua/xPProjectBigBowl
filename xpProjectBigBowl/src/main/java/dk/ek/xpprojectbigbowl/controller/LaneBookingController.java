package dk.ek.xpprojectbigbowl.controller;

import dk.ek.xpprojectbigbowl.model.LaneBooking;
import dk.ek.xpprojectbigbowl.Service.LaneBookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class LaneBookingController {

    private final LaneBookingService service;

    public LaneBookingController(LaneBookingService service) {
        this.service = service;
    }

    @PostMapping
    public LaneBooking createBooking(@RequestBody LaneBooking booking) {
        return service.createBooking(booking);
    }

    @GetMapping
    public List<LaneBooking> getAllBookings() {
        return service.getAllBookings();
    }

    @GetMapping("/{id}")
    public LaneBooking getBooking(@PathVariable Long id) {
        return service.getBookingById(id);
    }
}