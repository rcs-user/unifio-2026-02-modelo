package br.edu.unifio.eventos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

public class Evento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private short id;
    private String nome;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private BigDecimal capacidade;
    private String status;
    private String local;
    private String palestrante;
    @OneToMany 
    private Inscricao inscricao;
}
