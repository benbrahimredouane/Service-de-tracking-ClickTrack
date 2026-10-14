package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.model.Publisher;
import ma.youcode.clicktrack.repository.PublisherRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PublisherServiceImp implements PublisherService{
    private PublisherRepository publisherRepository;
    public PublisherServiceImp(PublisherRepository publisherRepository){
        this.publisherRepository = publisherRepository;
    }
    @Override
    public List<Publisher> findall() {
        return publisherRepository.findall();
    }
    @Override
    public ResponseEntity<Publisher> create(Publisher publisher){
        return publisherRepository.save(publisher);
    }

}
