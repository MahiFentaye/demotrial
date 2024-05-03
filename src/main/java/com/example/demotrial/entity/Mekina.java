package com.example.demotrial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Mekina
{
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mekina_gen")
//	@SequenceGenerator(name = "mekina_gen", sequenceName = "mekina_seq")
	@Column(name = "id", nullable = false)
	private Long id;

	private String description;

	private String model;


}
