package tddproject.parking.entity;

import jakarta.persistence.*;

/**
 * packageName : tddproject.parking.entity
 * fileName    : ParkingSpot
 * author      : hsj
 * date        : 3/16/24
 * description : 주차 공간 정보를 저장하는 테이블
 */
@Entity
@Table(name = "parking_spot_tb")
public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 구역 ex. A, B
    @Column(unique = true, nullable = false)
    private Character area;

    // 구역 내 번호
    @Column(nullable = false)
    private Integer seq;
}
