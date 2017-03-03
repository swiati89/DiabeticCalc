package pl.diabeticclac.datamodel;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pswiatek on 2017-03-01.
 */
@Entity
@Table(name="USER")
public @Data class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_USER")
    @SequenceGenerator(name = "S_USER", sequenceName = "S_USER", allocationSize = 1)
    @Column(name = "ID", precision = 10, scale = 0)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private Double weight;

    @Column
    private Double height;

    @Column
    private Double bmi;

    @Column
    private Integer dailyCalories;

    @Column
    private Integer illnessTime;

    @OneToMany(mappedBy = "User", orphanRemoval = true)
    @Fetch(FetchMode.SELECT)
    private List<Measurement> measurements;

}
