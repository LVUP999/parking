CREATE DATABASE IF NOT EXISTS parking;

USE parking;

CREATE TABLE IF NOT EXISTS user_tb (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(20) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    car_number VARCHAR(10) NOT NULL
    );

CREATE TABLE IF NOT EXISTS parking_spot_tb (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    area CHAR(1) NOT NULL,
    seq SMALLINT NOT NULL
    );

CREATE TABLE IF NOT EXISTS reservation_tb (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    parking_spot_id BIGINT NOT NULL,
    reservation_time TIMESTAMP NOT NULL,
    start_time TIMESTAMP NOT NULL,
    end_time TIMESTAMP NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user_tb(id),
    FOREIGN KEY (parking_spot_id) REFERENCES parking_spot_tb(id)
    );