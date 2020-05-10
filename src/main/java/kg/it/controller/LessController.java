package kg.it.controller;

import kg.it.entity.less;
import kg.it.service.LessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class LessController {
    @Autowired
    private LessService lessService;

    @PostMapping
    public less create(@RequestBody less less){
        return lessService.create(less);
    }

    @PutMapping
    public less update(@RequestBody less less){
        return lessService.update(less);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<less> getById(@PathVariable Long id){
        less less =  lessService.getById(id);
        HttpHeaders headers = new HttpHeaders();

        if (less == null){
            headers.add("Message","No find"+ id);
            return new ResponseEntity<>(null,headers, HttpStatus.NOT_FOUND);
        }
        headers.add("Message","Ok");
        return new ResponseEntity<>(less,headers,HttpStatus.OK);
    }

    @GetMapping
    public List<less> getAll(){
        return lessService.getAll();
    }

    @DeleteMapping
    public less deleteById (@RequestParam(name = "id") Long id){
        return lessService.deleteById(id);

    }
    @GetMapping("/title ")
    public List<less> getByTitle(@RequestHeader String title){
        return lessService.searchByTitle(title);
    }

    @GetMapping("/text")
    public List<less> getByText(String text){
        return lessService.searchByText(text);
    }

    @GetMapping("/api/check-user")
    public String getHelloU(){
        return "Hello User";
    }

    @GetMapping("/api/check-moder")
    public String getHelloM(){
        return "Hello Moderator";
    }

    @GetMapping("/api/check-admin")
    public String getHelloA(){
        return "Hello Adminsdy";
    }


}
