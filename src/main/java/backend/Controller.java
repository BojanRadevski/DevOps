package backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class Controller {

    @Autowired
    public Service service;

    @GetMapping("/list")
    public List<Model> findAll(){
        return service.findAll();
    }


}
