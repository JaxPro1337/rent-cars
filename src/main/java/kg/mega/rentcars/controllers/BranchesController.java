package kg.mega.rentcars.controllers;

import kg.mega.rentcars.service.BranchesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/branches")
public class BranchesController {
    private final BranchesService branchesService;

    @GetMapping("/active_branch_list")
    public ResponseEntity<?> findActiveBranches(){
        return ResponseEntity.ok(branchesService.findAllByIsActiveTrue());
    }
}
