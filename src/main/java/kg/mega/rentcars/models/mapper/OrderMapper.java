package kg.mega.rentcars.models.mapper;

import kg.mega.rentcars.models.dto.OrderResponseDto;
import kg.mega.rentcars.models.entity.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderResponseDto entityToDto (Orders orders);

    List<OrderResponseDto> entityListToDtoList (List<Orders> orders);

}
