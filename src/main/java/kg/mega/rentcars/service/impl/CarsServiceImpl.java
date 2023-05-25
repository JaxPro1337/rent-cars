package kg.mega.rentcars.service.impl;

import kg.mega.rentcars.models.dto.CarsDto;
import kg.mega.rentcars.models.entity.Cars;
import kg.mega.rentcars.models.mapper.CarsMapper;
import kg.mega.rentcars.repository.CarsRepo;
import kg.mega.rentcars.service.CarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarsServiceImpl implements CarsService {
    private final CarsRepo carsRepo;
    private final CarsMapper carsMapper = CarsMapper.INSTANCE;



    @Override
    public List<CarsDto> findAllByIsActiveTrue() {
        List<Cars> cars = carsRepo.findAllByIsActiveTrue();

        return carsMapper.entityListToDtoList(cars);
    }

    @Override
    public Cars findById(Long carsId) {


        return carsRepo.findById(carsId).get();
    }
}
