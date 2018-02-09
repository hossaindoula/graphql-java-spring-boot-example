package info.doula.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import info.doula.graphql.demo.entity.Author;
import info.doula.graphql.demo.entity.Book;
import info.doula.graphql.demo.repository.AuthorRepository;
import info.doula.graphql.demo.repository.BookRepository;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * </p>
 * https://github.com/hossaindoula
 */
public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
}