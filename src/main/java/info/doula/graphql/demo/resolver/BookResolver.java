package info.doula.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import info.doula.graphql.demo.entity.Author;
import info.doula.graphql.demo.entity.Book;
import info.doula.graphql.demo.repository.AuthorRepository;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * </p>
 * https://github.com/hossaindoula
 */
public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getAuthor().getId());
    }
}
