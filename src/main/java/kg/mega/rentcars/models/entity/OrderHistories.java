package kg.mega.rentcars.models.entity;

import jakarta.persistence.*;
import kg.mega.rentcars.models.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderHistories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @ManyToOne
    @JoinColumn(name = "orders_id", referencedColumnName = "id")
    Orders ordersId;
    Status status;
    @JoinColumn(name = "start_date")
    LocalDate startDate;
    @JoinColumn(name = "end_date")
    LocalDate endDate;

}
