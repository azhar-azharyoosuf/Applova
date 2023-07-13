package com.example.hellomanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DatabaseTester {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertData() {
        String insertQuery = "INSERT INTO books (title, author, year) VALUES (?, ?, ?)";

        // First row of values
        jdbcTemplate.update(insertQuery, "Book Title 1", "Author Name 1", 2023);

        // Second row of values
        jdbcTemplate.update(insertQuery, "Book Title 2", "Author Name 2", 2024);

        // Third row of values
        jdbcTemplate.update(insertQuery, "Book Title 3", "Author Name 3", 2025);
    }

    public void testDatabaseConnection() {
        String query = "SELECT * FROM books";
        List<Map<String, Object>> results = jdbcTemplate.queryForList(query);

        // Process the query results
        for (Map<String, Object> row : results) {
            // Access the columns using the column names
            Long id = (Long) row.get("id");
            String title = (String) row.get("title");
            String author = (String) row.get("author");
            // ... Process other columns

            System.out.println(id+" "+title+" "+author);
        }
    }
}
