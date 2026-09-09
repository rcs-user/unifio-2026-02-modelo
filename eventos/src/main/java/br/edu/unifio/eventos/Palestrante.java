package br.edu.unifio.eventos;

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

public class Palestrante {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private short id;
    private String nome;
    private String miniBio;
    private String email;
    @OneToMany 
    private Evento evento;
}
