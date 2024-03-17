package tddproject.parking.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * packageName : tddproject.parking.entity
 * fileName    : User
 * author      : hsj
 * date        : 3/16/24
 * description :
 */

@Entity
@Table(name = "user_tb")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(length = 20, nullable = false)
    private String phone;

    @Column(length = 10, nullable = false)
    private String carNumber;
}
