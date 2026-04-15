package kg.attractor.lesson55lab.dao;

import kg.attractor.lesson55lab.model.Resume;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResumeDao {
    private final JdbcTemplate jdbcTemplate;

    public ResumeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Resume> findAll() {
        String sql = "SELECT * FROM resumes";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Resume.class));
    }

    public void save(Resume resume) {
        String sql = "INSERT INTO resumes (title, description) VALUES (?, ?)";
        jdbcTemplate.update(sql, resume.getTitle(), resume.getDescription());
    }
}