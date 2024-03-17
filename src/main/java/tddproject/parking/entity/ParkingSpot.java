package tddproject.parking.entity;

import jakarta.persistence.*;

/**
 * packageName : tddproject.parking.entity
 * fileName    : ParkingSpot
 * author      : hsj
 * date        : 3/16/24
 * description :
 */
@Entity
@Table(name = "parking_spot_tb")
public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1, unique = true, nullable = false)
    private String area;

    @Column(nullable = false)
    private int seq;
}