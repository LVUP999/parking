package tddproject.parking.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * packageName : tddproject.parking.entity
 * fileName    : Reservation
 * author      : hsj
 * date        : 3/16/24
 * description :
 */

@Entity
@Table(name = "reservation_tb")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "parking_spot_id", nullable = false)
    private ParkingSpot parkingSpot;

    @Column(nullable = false)
    private LocalDateTime reservationTime;

    @Column(nullable = false)
    private LocalDateTime startTime;
    @Column(nullable = false)
    private LocalDateTime endTime;
}
