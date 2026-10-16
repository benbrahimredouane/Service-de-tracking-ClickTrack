package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.model.Publisher;
import ma.youcode.clicktrack.repository.LienRepository;
import ma.youcode.clicktrack.repository.PublisherRepository;
import org.springframework.http.ResponseEntity;

import java.util.*;
import java.util.stream.Collectors;

public class LienServiceImp implements LienService {
    private final LienRepository lienRepository;
    private final PublisherRepository publisherRepository;

    public LienServiceImp(LienRepository lienRepository, PublisherRepository publisherRepository) {
        this.lienRepository = lienRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public ResponseEntity<Lien> createLien(Long id, Lien lien) {
        return lienRepository.save(id, lien);
    }

    @Override
    public ResponseEntity<List<Lien>> findliensbyid(Long id) {
        return lienRepository.findliensbyid(id);
    }

    @Override
    public List<Map<String, Object>> findoffersbyid(Long id) {

        List<Map<String, Object>> result = new ArrayList<>();
        Map<String, Map<String, Object>> stats = new HashMap<>();
        for (Lien lien : lienRepository.findoffersbyid(id)) {
            String offer = lien.getOffer();
            if (!stats.containsKey(offer)) {
                Map<String, Object> stat = new HashMap<>();
                stat.put("offer", offer);
                stat.put("nomberLiens", 1);
                stat.put("clicks", lien.getClicks());
                stats.put(offer, stat);
            } else {
                Map<String, Object> stat = stats.get(offer);
                stat.put("nomberLiens", (int) stat.get("nomberLiens") + 1);
                stat.put("clicks", (long) stat.get("clicks") + lien.getClicks());
            }
        }
        result.addAll(stats.values());
        return result;
    }

    @Override
    public Map<String, Object> findLienById(Long id) {
        Optional<Lien> lien = lienRepository.findById(id);

        Lien ourLien = lien.get();
        Optional<Publisher> publisher = publisherRepository.findByid(ourLien.getPublisherId());
        Publisher ourpublisher = publisher.get();

        Map<String, Object> t = new HashMap<>();
        t.put("url", ourLien.getUrlDestination());
        t.put("publisher", ourpublisher.getNom() +"  " + ourpublisher.getPrenom());
        t.put("offer", ourLien.getOffer());
        t.put("clicks", ourLien.getClicks());

        return t;

    }
}
