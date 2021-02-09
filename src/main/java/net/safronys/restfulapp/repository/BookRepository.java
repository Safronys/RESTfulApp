package net.safronys.restfulapp.repository;

import net.safronys.restfulapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
