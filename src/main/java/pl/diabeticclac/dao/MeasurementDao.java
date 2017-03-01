package pl.diabeticclac.dao;

import pl.diabeticclac.datamodel.Dose;
import pl.diabeticclac.datamodel.User;

import java.util.Date;

/**
 * Created by pswiatek on 2017-03-01.
 */
public interface MeasurementDao {
    void addMeasurement(User user, Double measurementValue, Dose insulinDose, Date measurementDate);

}
