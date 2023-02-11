package backend;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;



@Data
@NoArgsConstructor
@Builder
public class Model {
    @Id
    private String Id;

    private String name;

    private String Description;

    public Model(String id, String description) {
        Id = id;
        Description = description;
    }
}