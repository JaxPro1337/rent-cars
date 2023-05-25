package kg.mega.rentcars.service;


import kg.mega.rentcars.models.dto.CarsDto;
import kg.mega.rentcars.models.entity.Cars;

import java.util.List;

public interface CarsService {

    List<CarsDto> findAllByIsActiveTrue();

    Cars findById(Long carsId);
}
