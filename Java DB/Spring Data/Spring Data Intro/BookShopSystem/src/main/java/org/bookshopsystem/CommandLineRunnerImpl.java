package org.bookshopsystem;

import org.bookshopsystem.service.AuthorService;
import org.bookshopsystem.service.BookService;
import org.bookshopsystem.service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private final AuthorService authorService;
    private final CategoryService categoryService;
    private final BookService bookService;

    public CommandLineRunnerImpl(AuthorService authorService, CategoryService categoryService, BookService bookService) {
        this.authorService = authorService;
        this.categoryService = categoryService;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
//        seedData();
//        getAllBooksAfterYear2000();
//        getAuthorsFirstLastNameBeforeBooks1990();
//        getAllAuthorsByBookDesc();
//        printBooksByGeorgePowell();
    }

    private void printBooksByGeorgePowell() {
        this.bookService.findAllBooksByGeorgePowellOrdered()
                .forEach(System.out::println);
    }

    private void getAllAuthorsByBookDesc() {
        this.authorService.getAllAuthorsDescBooks()
                .forEach(System.out::println);
    }

    private void getAuthorsFirstLastNameBeforeBooks1990() {
        this.authorService.getAllAuthorsFirstAndLastNameForBooksBeforeYear1990()
                .forEach(System.out::println);
    }

    private void getAllBooksAfterYear2000() {
        this.bookService.findAllBooksAfterYear2000()
                .forEach(System.out::println);
    }

    private void seedData() throws IOException {
        this.categoryService.seedCategories();
        this.authorService.seedAuthors();
        this.bookService.seedBooks();
    }
}
