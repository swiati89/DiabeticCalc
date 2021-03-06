package pl.diabeticclac.datamodel;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by pswiatek on 2017-03-01.
 */
@Data
@Entity
@Table(name="DOSE")
public class Dose implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_DOSE")
    @SequenceGenerator(name = "S_DOSE", sequenceName = "S_DOSE", allocationSize = 1)
    @Column(name = "ID", precision = 10, scale = 0)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @Column
    private Measurement measurement;

    @Column
    private Date doseDate;
}
