package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Lien;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class LienRepositoryImp implements LienRepository {


    private List<Lien> liens = new ArrayList<>( List.of(
            new Lien(1L, "iPhone 15", "https://example.com/offres/iphone15", 120, 1L),
            new Lien(2L, "Samsung Galaxy S25", "https://example.com/offres/samsung-s25", 85, 2L),
            new Lien(3L, "Nike Air Max", "https://example.com/offres/nike-air-max", 250, 3L),
            new Lien(4L, "PlayStation 5", "https://example.com/offres/ps5", 310, 1L),
            new Lien(5L, "MacBook Air", "https://example.com/offres/macbook-air", 95, 4L),
            new Lien(6L, "Casque Sony", "https://example.com/offres/casque-sony", 67, 5L),
            new Lien(7L, "Montre connectée", "https://example.com/offres/montre-connectee", 180, 6L),
            new Lien(8L, "Appareil photo Canon", "https://example.com/offres/canon-camera", 42, 7L),
            new Lien(9L, "Clavier mécanique", "https://example.com/offres/clavier-mecanique", 155, 8L),
            new Lien(10L, "Chaise gaming", "https://example.com/offres/chaise-gaming", 73, 10L)
    ));

    @Override
    public ResponseEntity<Lien> save(Long id, Lien lien) {
        Long lienId = liens.stream().max(Comparator.comparingLong(Lien::getId)).get().getId();
        lien.setId(lienId + 1L);
        lien.setPublisherId(id);
        liens.add(lien);
        return ResponseEntity.status(HttpStatus.CREATED).body(lien) ;
    }


    
}