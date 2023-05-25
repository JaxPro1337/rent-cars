package kg.mega.rentcars.controllers;

import kg.mega.rentcars.service.CarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarsController {
    private final CarsService carsService;

    @GetMapping("/car_list")
    public ResponseEntity<?> findAllCars (){
        return ResponseEntity.ok(carsService.findAllByIsActiveTrue());
    }
}
