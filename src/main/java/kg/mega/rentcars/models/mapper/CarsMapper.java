package kg.mega.rentcars.models.mapper;

import kg.mega.rentcars.models.dto.CarsDto;
import kg.mega.rentcars.models.dto.OrderDto;
import kg.mega.rentcars.models.dto.OrderResponseDto;
import kg.mega.rentcars.models.entity.Cars;
import kg.mega.rentcars.models.entity.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarsMapper {
    CarsMapper INSTANCE = Mappers.getMapper(CarsMapper.class);

    CarsDto entityToDto (Cars cars);
    Cars DtoToEntity (CarsDto carsDto);

    List<CarsDto> entityListToDtoList (List<Cars> cars);
    List<Cars> DtoListToEntityList (List<CarsDto> carsDtos);
}
