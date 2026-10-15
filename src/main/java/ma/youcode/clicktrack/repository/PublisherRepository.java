package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Publisher;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PublisherRepository {

    public List<Publisher> findall();
    ResponseEntity<Publisher> save(Publisher publisher);

}
