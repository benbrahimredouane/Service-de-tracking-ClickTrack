package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.repository.LienRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class LienServiceImp implements LienService {
    private final LienRepository lienRepository;

    public LienServiceImp(LienRepository lienRepository){
        this.lienRepository = lienRepository;
    }
    @Override
    public ResponseEntity<Lien> createLien(Long id , Lien lien){
        return lienRepository.save(id,lien);
    }
    @Override
    public ResponseEntity<List<Lien>> findliensbyid(Long id){
        return lienRepository.findliensbyid(id);
    }


    
} 
