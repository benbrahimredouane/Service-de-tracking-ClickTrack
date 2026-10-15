package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.model.Publisher;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface LienService{

    public ResponseEntity<Lien> createLien(Long id , Lien lien);
    public ResponseEntity<List<Lien>> findliensbyid(Long id);
    public List<Map<String,Object>> findoffersbyid(Long id);
}
//spring Ioc