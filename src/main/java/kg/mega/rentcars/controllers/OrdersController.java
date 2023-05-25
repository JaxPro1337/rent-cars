package kg.mega.rentcars.controllers;

import kg.mega.rentcars.models.dto.OrderDto;
import kg.mega.rentcars.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders/")
public class OrdersController {
    private final OrdersService ordersService;

    @PostMapping("append_order")
    public ResponseEntity<?> appendOrder (@RequestBody OrderDto orderDto){
        return ResponseEntity.ok(ordersService.appendOrder(orderDto));
    }

    @GetMapping("list")
    public ResponseEntity<?> getOrdersList (
            @RequestParam (defaultValue = "0") Integer pageNo,
            @RequestParam (defaultValue = "100") Integer pageSize){
        return ResponseEntity.ok(ordersService.getOrdersList(pageNo, pageSize));
    }

    @GetMapping("active_list")
    public ResponseEntity<?> getActiveOrdersList (
            @RequestParam (defaultValue = "0") Integer pageNo,
            @RequestParam (defaultValue = "20") Integer pageSize){
        return ResponseEntity.ok(ordersService.getActiveOrdersList(pageNo, pageSize));
    }

}
