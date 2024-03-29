package it.epicode.beservice.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="fattura")
public class Fattura {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	@Column(unique=true)
	private String numero;
	private String anno;
	private Double importo;
	@ManyToOne
	private StatoFattura stato;
	@ManyToOne
	private Cliente cliente;
}
