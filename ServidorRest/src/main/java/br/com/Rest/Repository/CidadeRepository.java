
package br.com.Rest.Repository;

import br.com.Rest.model.Cidade;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author danilo
 */
@RepositoryRestResource(collectionResourceRel = "Cidade", path = "cidades")
public interface CidadeRepository extends PagingAndSortingRepository<Cidade, Long>
{
        /**
         * Método que retorna uma lista de clientes fazendo a busca pelo nome passado como parâmetr
         *  
         * @param name
         * @return lista de clientes  

         */
        List<Cidade> findByNome(@Param("name") String name);

        
        /**
         * Método que retorna o cliente com apenas seu nome fazendo a busca com o id passado como p
         * 
         * @param id
         * @return cliente do id passado como parâmetro.
         */   
        @Query("SELECT c.nome FROM Cidade c where c.id = :id") 
      Cidade findNomeById(@Param("id") Long id);
        
        /**
         * Método que retorna uma lista de clientes fazendo a busca pelo nome passado como parâmetr
         * clientes pelo nome.
         *  
         * @param name
         * @return lista de clientes
         */
        List<Cidade> findByNomeOrderByNome(@Param("name") String name);
    
    
    
    
    
}
