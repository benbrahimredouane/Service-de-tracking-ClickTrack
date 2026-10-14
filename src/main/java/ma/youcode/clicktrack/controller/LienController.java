package ma.youcode.clicktrack.controller;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.service.LienService;
import ma.youcode.clicktrack.service.LienServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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











}