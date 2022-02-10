package com.patika.paycore.test.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Cinema  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

        private String name;

}
