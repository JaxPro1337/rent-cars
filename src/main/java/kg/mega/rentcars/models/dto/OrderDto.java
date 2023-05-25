package kg.mega.rentcars.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.ManyToOne;
import kg.mega.rentcars.models.entity.Branches;
import kg.mega.rentcars.models.entity.Cars;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDto {
    @JsonProperty( "customer_name")
    String customerName;
    @JsonProperty( "customer_phone")
    String phone;
    @JsonProperty( "customer_email")
    String email;
    @JsonProperty( "cars_id")
    Long carsId;
    @JsonProperty( "start_branch_id")
    Long startBranchId;
    @JsonProperty("end_branch_id")
    Long endBranchId;
    @JsonProperty("start_date")
    LocalDate startDate;
    @JsonProperty( "end_date")
    LocalDate endDate;

}
