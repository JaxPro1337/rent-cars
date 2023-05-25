package kg.mega.rentcars.models.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @JoinColumn(name = "customer_name")
    String customerName;
    String phone;
    String email;
    @JoinColumn(name = "start_date")
    LocalDate startDate;
    @JoinColumn(name = "end_date")
    LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "cars_id",referencedColumnName = "id")
    Cars carsId;
    @ManyToOne
    @JoinColumn(name = "start_branch_id", referencedColumnName = "id")
    Branches startBranchId;
    @ManyToOne
    @JoinColumn(name = "end_branch_id", referencedColumnName = "id")
    Branches endBranchId;

}
