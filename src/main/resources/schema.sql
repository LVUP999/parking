CREATE DATABASE IF NOT EXISTS parking;

USE parking;

DROP TABLE IF EXISTS reservation_tb;
DROP TABLE IF EXISTS user_tb;
DROP TABLE IF EXISTS parking_spot_tb;

CREATE TABLE user_tb (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(20) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    car_number VARCHAR(10) NOT NULL
    );

CREATE TABLE parking_spot_tb (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    area CHAR NOT NULL,
    seq INTEGER NOT NULL
    );


CREATE TABLE reservation_tb (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    parking_spot_id BIGINT NOT NULL,
    reservation_time TIMESTAMP NOT NULL,
    start_time TIMESTAMP NOT NULL,
    end_time TIMESTAMP NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user_tb(id),
    FOREIGN KEY (parking_spot_id) REFERENCES parking_spot_tb(id)
    );