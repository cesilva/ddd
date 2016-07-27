package ldevpp.webinar.ddd.appointments;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findAllByOrderByDateDescTimeAsc();
}
