package com.example.hellomanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int save(Book book) {
        String sql = "INSERT INTO books (title, author, year) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.getYear());
    }

    public int update(Book book) {
        String sql = "UPDATE books SET title = ?, author = ?, year = ? WHERE id = ?";
        return jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.getYear(), book.getId());
    }

    public int delete(int id) {
        String sql = "DELETE FROM books WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    public Book getBookById(int id) {
        String sql = "SELECT * FROM books WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setYear(rs.getInt("year"));
            return book;
        });
    }

    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setYear(rs.getInt("year"));
            return book;
        });
    }

}
