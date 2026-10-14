package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Lien;
import org.springframework.http.ResponseEntity;

public interface LienRepository {

    ResponseEntity<Lien> save(Long id , Lien lien);

}
