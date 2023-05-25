package kg.mega.rentcars.models.mapper;

import kg.mega.rentcars.models.dto.BranchesDto;
import kg.mega.rentcars.models.dto.CarsDto;
import kg.mega.rentcars.models.entity.Branches;
import kg.mega.rentcars.models.entity.Cars;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BranchesMapper {
    BranchesMapper INSTANCE = Mappers.getMapper(BranchesMapper.class);

    BranchesDto entityToDto (Branches branches);
    Branches DtoToEntity (BranchesDto branchesDto);

    List<BranchesDto> entityListToDtoList (List<Branches> branches);
    List<Branches> DtoListToEntityList (List<BranchesDto> branchesDtos );



}
