package pl.diabeticclac.datamodel;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


import javax.persistence.*;
import java.util.List;

/**
 * Created by pswiatek on 2017-03-01.
 */
@Data
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_USER")
    @SequenceGenerator(name = "S_USER", sequenceName = "S_USER", allocationSize = 1)
    @Column(name = "ID", precision = 10, scale = 0)
    private Long id;

    private String name;
    private String surname;
    private String login;
    private String password;
    private Long weight;
    private Long height;
    private Long bmi;
    private Integer dailyCalories;
    private Integer illnessTime;

    @OneToMany(mappedBy = "User", orphanRemoval = true)
    @Fetch(FetchMode.SELECT)
    private List<Measurement> measurements;

}
