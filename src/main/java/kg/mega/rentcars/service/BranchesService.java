package kg.mega.rentcars.service;

import kg.mega.rentcars.models.dto.BranchesDto;
import kg.mega.rentcars.models.entity.Branches;

import java.util.List;

public interface BranchesService {
    List<BranchesDto> findAllByIsActiveTrue();

    Branches findById(Long endBranchId);
}
