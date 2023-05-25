package kg.mega.rentcars.service.impl;

import kg.mega.rentcars.models.dto.BranchesDto;
import kg.mega.rentcars.models.dto.CarsDto;
import kg.mega.rentcars.models.entity.Branches;
import kg.mega.rentcars.models.entity.Cars;
import kg.mega.rentcars.models.mapper.BranchesMapper;
import kg.mega.rentcars.repository.BranchesRepo;
import kg.mega.rentcars.service.BranchesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BranchesServiceImpl implements BranchesService {
    private final BranchesRepo branchesRepo;
    private final BranchesMapper branchesMapper = BranchesMapper.INSTANCE;

    @Override
    public List<BranchesDto> findAllByIsActiveTrue() {
        List<Branches> branches = branchesRepo.findAllByIsActiveTrue();

        return branchesMapper.entityListToDtoList(branches);
    }

    @Override
    public Branches findById(Long branchId) {


        return branchesRepo.findById(branchId).get();
    }
}
