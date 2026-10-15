package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Lien;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LienRepository {

    ResponseEntity<Lien> save(Long id , Lien lien);
    ResponseEntity<List<Lien>> findliensbyid(Long id);
    List<Lien> findoffersbyid(Long id);

}
