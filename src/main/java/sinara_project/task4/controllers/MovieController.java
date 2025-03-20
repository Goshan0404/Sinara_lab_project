package sinara_project.task4.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sinara_project.task4.excpetion.TestException;
import sinara_project.task4.model.Book;

@RestController
public class MovieController {

    @PostMapping("/book")
    public ResponseEntity<Book> postBook(@RequestBody Book book) {
        book.getInfo().setId(123);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/error")
    public void errorTest(HttpServletRequest request) {
        throw new TestException("Шляпа", request.getRequestURI());
    }

}
