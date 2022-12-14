package com.br.jhean.desafio2.entities;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Entity
public class Produto {

@Id
private long code ;

}
