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
@Table(name = "products")
@Data
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @ManyToMany(cascade =
            CascadeType.PERSIST)
    @JoinTable(name = "product_characteristic",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "product_characteristics_id")
    )
    private List<ProductCharacteristic> product_characteristics = new ArrayList<>();
}
