package dk.ek.xpprojectbigbowl.Service;

import dk.ek.xpprojectbigbowl.model.LaneBooking;
import dk.ek.xpprojectbigbowl.repository.LaneBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaneBookingService {

    private final LaneBookingRepository repository;

    public LaneBookingService(LaneBookingRepository repository) {
        this.repository = repository;
    }

    public LaneBooking createBooking(LaneBooking booking) {
        return repository.save(booking);
    }

    public List<LaneBooking> getAllBookings() {
        return repository.findAll();
    }

    public LaneBooking getBookingById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
    }
}