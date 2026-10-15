package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.model.Publisher;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LienService{

    public ResponseEntity<Lien> createLien(Long id , Lien lien);
    public ResponseEntity<List<Lien>> findliensbyid(Long id);
}
//spring Ioc