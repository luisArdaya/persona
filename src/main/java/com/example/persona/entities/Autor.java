package com.example.persona.entities;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;
@Entity
@Table(name="autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
@Builder
public class Autor extends Base {
@Column(name="nombre")
private String nombre;
@Column(name="nombre")
private String apellido;
@Column(name="nombre",length=1500)
private String biografia;

}
