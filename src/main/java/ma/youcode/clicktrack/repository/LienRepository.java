package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Lien;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface LienRepository {

    ResponseEntity<Lien> save(Long id , Lien lien);
    ResponseEntity<List<Lien>> findliensbyid(Long id);
    List<Lien> findoffersbyid(Long id);
    Optional<Lien> findById(Long id);

}
