package kg.attractor.lesson55lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vacancy {
    private Long id;
    private String title;
    private String description;
    private Double salary;
}