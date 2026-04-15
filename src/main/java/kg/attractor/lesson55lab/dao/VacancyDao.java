package kg.attractor.lesson55lab.dao;

import kg.attractor.lesson55lab.model.Vacancy;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VacancyDao {
    private final JdbcTemplate jdbcTemplate;

    public VacancyDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Vacancy> findAll() {
        String sql = "SELECT * FROM vacancies";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Vacancy.class));
    }

    public void save(Vacancy vacancy) {
        String sql = "INSERT INTO vacancies (title, description, salary) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, vacancy.getTitle(), vacancy.getDescription(), vacancy.getSalary());
    }
}