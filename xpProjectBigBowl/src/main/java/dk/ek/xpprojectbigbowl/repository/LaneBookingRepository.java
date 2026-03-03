package dk.ek.xpprojectbigbowl.repository;

import dk.ek.xpprojectbigbowl.model.LaneBooking;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LaneBookingRepository {

    private final List<LaneBooking> bookings = new ArrayList<>();
    private Long nextId = 1L;

    public LaneBooking save(LaneBooking booking) {
        booking.setId(nextId++);
        bookings.add(booking);
        return booking;
    }

    public List<LaneBooking> findAll() {
        return bookings;
    }

    public Optional<LaneBooking> findById(Long id) {
        return bookings.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
    }
}