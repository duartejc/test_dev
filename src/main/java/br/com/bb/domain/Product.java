package br.com.bb.domain;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Jean Duarte
 */
@Data
@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @SequenceGenerator(name = "product-generator", allocationSize = 1, sequenceName = "product_id_seq")
    @GeneratedValue(generator = "product-generator")
    private Integer id;

    private String name;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

}
