package dk.ek.xpprojectbigbowl.service;

import dk.ek.xpprojectbigbowl.model.LaneReservation;
import dk.ek.xpprojectbigbowl.model.LaneReservationSortComparator;
import dk.ek.xpprojectbigbowl.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService (ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<LaneReservation> getAllReservationsSorted() {

        List<LaneReservation> listForSort = new ArrayList<>();

        listForSort = reservationRepository.getAllReservations();

        listForSort.sort(new LaneReservationSortComparator());

        return listForSort;

    }


}
