package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.model.Publisher;
import ma.youcode.clicktrack.repository.PublisherRepository;

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
}
