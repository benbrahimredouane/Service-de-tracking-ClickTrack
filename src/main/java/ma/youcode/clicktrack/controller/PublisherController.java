package ma.youcode.clicktrack.controller;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.model.Publisher;
import ma.youcode.clicktrack.service.PublisherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PublisherController {

    private final  PublisherService publisherService;

    public PublisherController(PublisherService publisherservice){
        this.publisherService = publisherservice;
    }
    @GetMapping("/publishers")
    public List<Publisher> findall(){
        return publisherService.findall();
    }
    @PostMapping("/publishers")
    public ResponseEntity<Publisher> create(@RequestBody Publisher publisher){
        return publisherService.create(publisher);
    }


}
