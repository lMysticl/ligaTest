package secound_task;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @autor Putrenkov Pavlo.
 * @since 2017-09-13
 */
@Entity
@Table(name = "product_characteristics")
@Data
public class ProductCharacteristic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private double value;

    @ManyToMany(cascade =
            CascadeType.PERSIST,mappedBy = "product_characteristics")
    private List<Product> products = new ArrayList<>();

}
