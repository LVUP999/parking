package tddproject.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName : tddproject.parking.controller
 * fileName    : TestController
 * author      : hsj
 * date        : 3/3/24
 * description :
 */
@RestController
public class TestController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
