package kg.mega.rentcars.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import kg.mega.rentcars.models.entity.Branches;
import kg.mega.rentcars.models.entity.Cars;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderResponseDto {
    @JsonProperty( "customer_name")
    String customerName;
    @JsonProperty( "customer_phone")
    String phone;
    @JsonProperty( "customer_email")
    String email;
    @JsonProperty("cars_id")
    Cars carsId;
    @JsonProperty("start_branch_id")
    Branches startBranchId;
    @JsonProperty("end_branch_id")
    Branches endBranchId;
    @JsonProperty("start_date")
    LocalDate startDate;
    @JsonProperty( "end_date")
    LocalDate endDate;
}
