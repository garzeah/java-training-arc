package garzeah.spring5webapp.repositories;

import garzeah.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

// Gives us access to CRUD methods
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
