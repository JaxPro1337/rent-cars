package kg.mega.rentcars.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BranchesDto {
    @JsonProperty("branch_id")
    Long id;
    @JsonProperty("branch_name")
    String name;
}
