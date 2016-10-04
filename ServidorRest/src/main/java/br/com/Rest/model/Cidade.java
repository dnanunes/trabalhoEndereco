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
@Table(name = "cidade")
public class Cidade implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long estadoId;
    
    private String nome;
    
    @OneToMany(targetEntity = Bairro.class, fetch = FetchType.EAGER)
    @JoinColumn(name= "cidadeId")
    private List<Bairro> bairrost;

    
    
    
    
    
    
    
    
    
    
    
    
    
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

    public List<Bairro> getBairros() {
        return bairrost;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairrost = bairros;
    }
    
    
}
