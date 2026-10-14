package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.repository.LienRepository;

public class LienServiceImp implements LienService {
    private final LienRepository lienRepository;

    public LienServiceImp(LienRepository lienRepository){
        this.lienRepository = lienRepository;
    }
    @Override
    public void save(Lien lien){
        lienRepository.save(lien);
    }


    
} 
