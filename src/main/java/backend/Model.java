package backend;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Model {
    @Id
    private String Id;

    private String name;

    private String Description;


}