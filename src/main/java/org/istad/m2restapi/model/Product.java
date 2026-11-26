package org.istad.m2restapi.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@Setter
@Getter
@Entity
@Table(name = "m2_products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(length = 100, nullable = false)
        private String name;

        @Column(columnDefinition = "TEXT")
        private String description;

        @Column(nullable = false)
        private BigDecimal price;

        @Column(nullable = false)
        private Integer quantity;

        @Column(nullable = false)
        private Boolean isAvailable;
        @ManyToOne
        private Category category;
        @ManyToOne
        private User user;
    }
