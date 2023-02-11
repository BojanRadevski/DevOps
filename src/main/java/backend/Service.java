package backend;

import lombok.AllArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {

    private final Repository repository;

    public List<Model> findAll(){
        return repository.findAll();
    }
}
