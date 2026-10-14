package ma.youcode.clicktrack.controller;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.service.LienService;
import ma.youcode.clicktrack.service.LienServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/liens")
    List<Lien> findall(){

    return List.of(new Lien(5,"laptop","www.laptop.com",5,1));
    }




}