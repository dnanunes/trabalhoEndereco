package br.com.Rest.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author danilo
 */

@Entity
@Table(name = "pais")
public class Pais implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String nome;
    
    
    @OneToMany(targetEntity = Estado.class, fetch = FetchType.EAGER)
    @JoinColumn(name= "paisId")
    private List<Estado> estadost;
    
    
    
    
    
    
    
    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Estado> getEstados() {
        return estadost;
    }

    public void setEstados(List<Estado> estados) {
        this.estadost = estados;
    }
    
    
    
    
    
    
    
}
