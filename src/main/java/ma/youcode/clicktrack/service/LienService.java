package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.model.Publisher;
import org.springframework.http.ResponseEntity;

public interface LienService{

    public ResponseEntity<Lien> createLien(Long id , Lien lien);
}
//spring Ioc