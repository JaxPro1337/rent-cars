package kg.mega.rentcars.service.impl;

import kg.mega.rentcars.models.dto.OrderDto;
import kg.mega.rentcars.models.dto.OrderResponseDto;
import kg.mega.rentcars.models.entity.Orders;
import kg.mega.rentcars.models.mapper.OrderMapper;
import kg.mega.rentcars.repository.OrdersRepo;
import kg.mega.rentcars.service.BranchesService;
import kg.mega.rentcars.service.CarsService;
import kg.mega.rentcars.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersServiceImpl implements OrdersService {
    private final CarsService carsService;
    private final BranchesService branchesService;
    private final OrdersRepo ordersRepo;
    private final OrderMapper orderMapper = OrderMapper.INSTANCE;


    @Override
    public Orders appendOrder(OrderDto orderDto) {
        Orders orders = Orders.builder()
                .carsId(carsService.findById(orderDto.getCarsId()))
                .customerName(orderDto.getCustomerName())
                .phone(orderDto.getPhone())
                .email(orderDto.getEmail())
                .endBranchId(branchesService.findById(orderDto.getEndBranchId()))
                .startBranchId(branchesService.findById(orderDto.getStartBranchId()))
                .endDate(orderDto.getEndDate())
                .startDate(orderDto.getStartDate())
                .build();

        return ordersRepo.save(orders);
    }

    @Override
    public Page<Orders> getOrdersList(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Orders> orders = ordersRepo.findAll(pageable);
        return orders;
    }

    @Override
    public List<Orders> getActiveOrdersList(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);

        return ordersRepo.findActiveOrders(pageable);
    }
}
