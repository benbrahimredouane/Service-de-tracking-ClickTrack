package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.model.Publisher;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PublisherService {
    public List<Publisher> findall();
    public ResponseEntity<Publisher> create(Publisher publisher);

}
