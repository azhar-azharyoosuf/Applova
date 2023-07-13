package com.example.hellomanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookDao bookDao;

    @GetMapping("/bookform")
    public String showForm(Model model) {
        model.addAttribute("book", new Book());
        return "bookform";
    }

    @PostMapping("/savebook")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookDao.save(book);
        return "redirect:/viewbook";
    }

    @GetMapping("/viewbook")
    public String viewBooks(Model model) {
        List<Book> bookList = bookDao.getAllBooks();
        model.addAttribute("bookList", bookList);
        return "viewbooks";
    }

    @GetMapping("/editbook/{id}")
    public String editBook(@PathVariable int id, Model model) {
        Book book = bookDao.getBookById(id);
        model.addAttribute("book", book);
        return "bookedtform";
    }

    @PostMapping("/updatebook")
    public String updateBook(@ModelAttribute("book") Book book) {
        bookDao.update(book);
        return "redirect:/viewbook";
    }

    @GetMapping("/deletebook/{id}")
    public String deleteBook(@PathVariable int id) {
        bookDao.delete(id);
        return "redirect:/viewbook";
    }

}
