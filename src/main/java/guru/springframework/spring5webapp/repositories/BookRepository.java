package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.doamin.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
