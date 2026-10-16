package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Lien;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class LienRepositoryImp implements LienRepository {


    private final List<Lien> liens = new ArrayList<>( List.of(
            new Lien(1L, "iPhone 15", "https://example.com/offres/iphone15", 120L, 1L),
            new Lien(2L, "Samsung Galaxy S25", "https://example.com/offres/samsung-s25", 85L, 2L),
            new Lien(3L, "Nike Air Max", "https://example.com/offres/nike-air-max", 250L, 3L),
            new Lien(4L, "PlayStation 5", "https://example.com/offres/ps5", 310L, 1L),
            new Lien(5L, "MacBook Air", "https://example.com/offres/macbook-air", 95L, 4L)
    ));

    @Override
    public ResponseEntity<Lien> save(Long id, Lien lien) {
        Long lienId = liens.stream().max(Comparator.comparingLong(Lien::getId)).get().getId();
        lien.setId(lienId + 1L);
        lien.setPublisherId(id);
        liens.add(lien);
        return ResponseEntity.status(HttpStatus.CREATED).body(lien) ;
    }

    @Override
    public ResponseEntity<List<Lien>> findliensbyid(Long id){
        List<Lien> links = liens.stream().filter(e->e.getPublisherId().equals(id)).toList();
        return ResponseEntity.status(HttpStatus.OK).body(links);
    }

    @Override
    public List<Lien> findoffersbyid(Long id){
        List<Lien> links = liens.stream().filter(e->e.getPublisherId().equals(id)).toList();
        return links;

    }
    @Override
    public Optional<Lien> findById(Long id){

        Optional<Lien> lien = liens.stream().filter(lien1 ->  lien1.getId().equals(id)).findFirst();

//        if(lien.isPresent()){
//            lien.map(lien1 -> {
//                lien1.setClicks(lien1.getClicks()+ 1L);
//                return lien1;
//            }
//            );
//        }
        return lien;
    }


    
}