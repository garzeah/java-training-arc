package garzeah.spring5webapp.controllers;

import garzeah.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        // At runtime when spring gets a request to /books it will execute the
        // getBooks method and it's going to provide that method a model object
        // and our code is saying for that model we are going to add the attribute
        // called books and we're going to execute bookRepository which is going
        // to give us a list of books
        model.addAttribute("books", bookRepository.findAll());
        // This model is going to get returned back to our view layer and it's going
        // to have an attribute books and a list of books. Then we'll be able to
        // utilize that value insode of our view layer

        return "books/list";
    }
}
