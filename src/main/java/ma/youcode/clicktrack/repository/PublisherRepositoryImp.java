package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.model.Category;
import ma.youcode.clicktrack.model.Publisher;

import java.util.List;

public class PublisherRepositoryImp implements PublisherRepository{

    private List<Publisher> publishers = List.of(
            new Publisher(1, "Benali", "Ahmed", "ahmed.benali@example.com", Category.YOUTUBER),
            new Publisher(2, "Alaoui", "Sara", "sara.alaoui@example.com", Category.INFLUENCEUR),
            new Publisher(3, "Amrani", "Youssef", "youssef.amrani@example.com", Category.BLOGUEUR),
            new Publisher(4, "Idrissi", "Salma", "salma.idrissi@example.com", Category.YOUTUBER),
            new Publisher(5, "Tazi", "Omar", "omar.tazi@example.com", Category.INFLUENCEUR),
            new Publisher(6, "Fassi", "Nadia", "nadia.fassi@example.com", Category.BLOGUEUR),
            new Publisher(7, "Bennani", "Mehdi", "mehdi.bennani@example.com", Category.YOUTUBER),
            new Publisher(8, "Lahlou", "Imane", "imane.lahlou@example.com", Category.INFLUENCEUR),
            new Publisher(9, "Chraibi", "Hamza", "hamza.chraibi@example.com", Category.BLOGUEUR),
            new Publisher(10, "Mansouri", "Lina", "lina.mansouri@example.com", Category.YOUTUBER)
    );
    public List<Publisher> findall(){
       return publishers;
    }
}
