package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Category;
import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.model.Publisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PublisherRepositoryImp implements PublisherRepository{

    private final List<Publisher> publishers = new ArrayList<>(List.of(
            new Publisher(1L, "Benali", "Ahmed", "ahmed.benali@example.com", Category.YOUTUBER),
            new Publisher(2L, "Alaoui", "Sara", "sara.alaoui@example.com", Category.INFLUENCEUR),
            new Publisher(3L, "Amrani", "Youssef", "youssef.amrani@example.com", Category.BLOGUEUR),
            new Publisher(4L, "Idrissi", "Salma", "salma.idrissi@example.com", Category.YOUTUBER)
    ));

    @Override
    public List<Publisher> findall(){
       return publishers;
    }
    @Override
    public ResponseEntity<Publisher> save(Publisher publisher){
            Long id = publishers.stream().max(Comparator.comparingLong(Publisher::getId)).get().getId();
            publisher.setId(id+1L);
            publishers.add(publisher);
            System.out.println("created !");
            return ResponseEntity.status(HttpStatus.CREATED).body(publisher);

    }
    @Override
    public Optional<Publisher> findByid(Long id){
        return publishers.stream().filter(publisher -> publisher.getId().equals(id)).findFirst();
    }

}
