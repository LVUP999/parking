CREATE DATABASE IF NOT EXISTS parking;

USE parking;

DROP TABLE IF EXISTS reservation_tb;
DROP TABLE IF EXISTS user_tb;
DROP TABLE IF EXISTS parking_spot_tb;

CREATE TABLE user_tb (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '사용자ID',
    username VARCHAR(20) NOT NULL COMMENT '이름',
    phone VARCHAR(20) NOT NULL COMMENT '전화번호',
    car_number VARCHAR(10) NOT NULL COMMENT '차 번호'
    ) COMMENT = '사용자';


CREATE TABLE parking_spot_tb (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '주차공간ID',
    area CHAR NOT NULL COMMENT '구역',
    seq INTEGER NOT NULL COMMENT '구역 내 번호'
    ) COMMENT = '주차공간';

CREATE TABLE reservation_tb (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '예약ID',
    user_id BIGINT NOT NULL COMMENT '예약한 사용자ID',
    parking_spot_id BIGINT NOT NULL COMMENT '예약한 주차공간ID',
    reservation_time TIMESTAMP NOT NULL COMMENT '예약 생성 시간',
    start_time TIMESTAMP NOT NULL COMMENT '주차 예약 시작 시간',
    end_time TIMESTAMP NOT NULL COMMENT '주차 예약 종료 시간',
	cancel CHAR(1) NOT NULL COMMENT '주차 예약 취소 여부',
    FOREIGN KEY (user_id) REFERENCES user_tb(id),
    FOREIGN KEY (parking_spot_id) REFERENCES parking_spot_tb(id)
    ) COMMENT = '예약';