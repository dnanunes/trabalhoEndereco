
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
@Table(name = "estado")
public class Estado implements Serializable 
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Long paisId;
   private String nome;
  
   @OneToMany(targetEntity = Cidade.class, fetch = FetchType.EAGER)
   @JoinColumn(name= "estadoId")
   private List<Cidade> cidadest;

   
   
   
   

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

    
   
    public List<Cidade> getCidades() {
        return cidadest;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidadest = cidades;
    }
    
   
    
    
    
}
