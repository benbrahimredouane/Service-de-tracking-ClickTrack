package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Lien;

import java.util.List;
import java.util.ArrayList;
public class LienRepositoryImp implements LienRepository {

    private final List<Lien> liens = new ArrayList<>();

    @Override
    public void save(Lien lien){
        liens.add(lien);
    }


    
}