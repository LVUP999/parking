package tddproject.parking.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * packageName : tddproject.parking.entity
 * fileName    : User
 * author      : hsj
 * date        : 3/16/24
 * description : 사용자 정보를 저장하는 테이블
 */

@Entity
@Table(name = "user_tb")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 이름
    @Column(length = 20, nullable = false)
    private String username;

    // 전화번호
    @Column(length = 20, nullable = false)
    private String phone;

    // 차 번호
    @Column(length = 10, nullable = false)
    private String carNumber;
}
