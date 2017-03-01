package pl.diabeticclac.datamodel;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by pswiatek on 2017-03-01.
 */
@Data
@Table(name="MEASUREMENT")
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_MEASUREMENT")
    @SequenceGenerator(name = "S_MEASUREMENT", sequenceName = "S_MEASUREMENT", allocationSize = 1)
    @Column(name = "ID", precision = 10, scale = 0)
    private Long id;

    private Double value;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "measurement", cascade = CascadeType.ALL)
    private Dose insulinDose;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private Date measurementDate;
}
