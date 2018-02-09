package info.doula.graphql.demo.repository;

import info.doula.graphql.demo.entity.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * </p>
 * https://github.com/hossaindoula
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {
}