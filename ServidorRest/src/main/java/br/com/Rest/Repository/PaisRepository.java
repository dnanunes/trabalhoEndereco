
package br.com.Rest.Repository;

import br.com.Rest.model.Pais;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author danilo
 */
@RepositoryRestResource(collectionResourceRel = "Pais", path = "paises")
public interface PaisRepository extends PagingAndSortingRepository<Pais, Long>
{
        /**
         * Método que retorna uma lista de clientes fazendo a busca pelo nome passado como parâmetr
         *  
         * @param name
         * @return lista de clientes  

         */
        List<Pais> findByNome(@Param("name") String name);

        
        /**
         * Método que retorna o cliente com apenas seu nome fazendo a busca com o id passado como p
         * 
         * @param id
         * @return cliente do id passado como parâmetro.
         */   
        @Query("SELECT p.nome FROM Pais p where p.id = :id") 
      Pais findNomeById(@Param("id") Long id);
        
        /**
         * Método que retorna uma lista de clientes fazendo a busca pelo nome passado como parâmetr
         * clientes pelo nome.
         *  
         * @param name
         * @return lista de clientes
         */
        List<Pais> findByNomeOrderByNome(@Param("name") String name);
    
    
    
    
    
}
