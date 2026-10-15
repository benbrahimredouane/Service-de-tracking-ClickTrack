package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.repository.LienRepository;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    @Override
    public List<Map<String,Object>> findoffersbyid (Long id){

        List<Map<String,Object>> result = new ArrayList<>();
        Map<String ,Map<String,Object>> stats = new HashMap<>();
        for (Lien lien : lienRepository.findoffersbyid(id)){
            String offer = lien.getOffer();
            if(!stats.containsKey(offer)){
               Map<String,Object> stat = new HashMap<>();
               stat.put("offer",offer);
               stat.put("nomberLiens",1);
               stat.put("clicks",lien.getClicks());
               stats.put(offer,stat);
            }
            else {
                Map<String,Object> stat = stats.get(offer);
                stat.put("nomberLiens",(int)stat.get("nomberLiens") + 1);
                stat.put("clicks",(long)stat.get("clicks") + lien.getClicks());
            }
        }
        result.addAll(stats.values());
        return result;
    }
} 
