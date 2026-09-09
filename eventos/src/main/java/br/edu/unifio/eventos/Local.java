package br.edu.unifio.eventos;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Local {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private short id;
    private String nome;
    private String endereco;
    private BigDecimal capacidade;
    @OneToMany
    private Evento evento;
}
