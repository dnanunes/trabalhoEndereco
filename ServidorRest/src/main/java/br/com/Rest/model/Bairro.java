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
@Table(name = "bairro")
public class Bairro implements Serializable 
{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;

   private Long cidadeId;
   
   private String nome;
   
   
   
   @OneToMany(targetEntity = Logradouro.class, fetch = FetchType.EAGER)
   @JoinColumn(name= "bairroId")
   private List<Logradouro> logradourost;

    public Long getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(Long cidadeId) {
        this.cidadeId = cidadeId;
    }
   
   
   
   
   
   
   
   
   
    
   
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
   
    
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public List<Logradouro> getLogradouros() {
        return logradourost;
    }

    public void setLogradouros(List<Logradouro> logradouros) {
        this.logradourost = logradouros;
    }
  
    
}
