package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Category;
import ma.youcode.clicktrack.model.Lien;
import ma.youcode.clicktrack.model.Publisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PublisherRepositoryImp implements PublisherRepository{

    private List<Publisher> publishers = new ArrayList<>(List.of(
            new Publisher(1, "Benali", "Ahmed", "ahmed.benali@example.com", Category.YOUTUBER),
            new Publisher(2, "Alaoui", "Sara", "sara.alaoui@example.com", Category.INFLUENCEUR),
            new Publisher(3, "Amrani", "Youssef", "youssef.amrani@example.com", Category.BLOGUEUR),
            new Publisher(4, "Idrissi", "Salma", "salma.idrissi@example.com", Category.YOUTUBER)
    ));

    @Override
    public List<Publisher> findall(){
       return publishers;
    }
    @Override
    public ResponseEntity<Publisher> save(Publisher publisher){
            int id = publishers.stream().max(Comparator.comparingInt(Publisher::getId)).get().getId();
            publisher.setId(id+1);
            publishers.add(publisher);
            System.out.println("created !");
            return ResponseEntity.status(HttpStatus.CREATED).body(publisher);

    }

}
