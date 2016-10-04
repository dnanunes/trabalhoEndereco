package br.com.Rest;

import br.com.Rest.model.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.Rest.model")

@EnableJpaRepositories(basePackages = "br.com.Rest.Repository")
public class TrabalhoEndereco {

	public static void main(String[] args) 
        {
            
         
         
            
	 SpringApplication.run(TrabalhoEndereco.class, args);
         
         
          
	}
}
