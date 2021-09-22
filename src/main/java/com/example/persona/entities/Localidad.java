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
@Table(name="localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Builder
public class Localidad extends Base {
@Column(name="denominacion")
private String denominacion;
}
