package tddproject.parking.entity;

import jakarta.persistence.*;
import tddproject.parking.common.code.CancelStatus;

import java.time.LocalDateTime;

/**
 * packageName : tddproject.parking.entity
 * fileName    : Reservation
 * author      : hsj
 * date        : 3/16/24
 * description : 예약 정보를 저장하는 테이블
 */

@Entity
@Table(name = "reservation_tb")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 예약한 사용자
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // 예약한 주차 공간
    @ManyToOne
    @JoinColumn(name = "parking_spot_id", nullable = false)
    private ParkingSpot parkingSpot;

    // 예약을 생성한 시간
    @Column(nullable = false)
    private LocalDateTime reservationTime;

    // 주차 예약 시작 시간
    @Column(nullable = false)
    private LocalDateTime startTime;

    // 주차 예약 종료 시간
    @Column(nullable = false)
    private LocalDateTime endTime;

    // 주차 예약 취소 여부
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CancelStatus cancel;

}
