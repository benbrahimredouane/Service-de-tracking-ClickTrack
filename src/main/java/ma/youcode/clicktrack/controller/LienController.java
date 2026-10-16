package ma.youcode.clicktrack.controller;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.service.LienService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
//private int id;
//private String offre;
//private String urlDestination;
//private long clicks;
//private int publisherId;

@RestController
@RequestMapping("/api")
public class LienController {

    private final LienService lienService;

    public LienController(LienService lienService){
        this.lienService = lienService;
    }

@PostMapping("/publishers/{id}/liens")
public ResponseEntity<Lien> createLien(@PathVariable("id") Long id , @RequestBody Lien lien){
    return lienService.createLien(id , lien);
}
///api/publishers/{id}/liens

    @GetMapping("/publishers/{id}/liens")
    public ResponseEntity<List<Lien>> findliensbyid(@PathVariable("id") Long id){
        return lienService.findliensbyid(id);
    }

    @GetMapping("/publishers/{id}/offers")
    public ResponseEntity<List<Map<String,Object>>> offers(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(lienService.findoffersbyid(id)) ;
    }
    @GetMapping("t/{id}")
    public ResponseEntity<Map<String,Object>> links(@PathVariable("id") Long id){
        Map <String,Object > clicks = lienService.findLienById(id);


        if(clicks.isEmpty()){
            clicks.put("message","lien not found");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(clicks);
        }
        else {
            return ResponseEntity.status(HttpStatus.OK).body(clicks);
        }


    }

}