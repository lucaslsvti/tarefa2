package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Contato;

public class AtualizarTarefa {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId(1L);
		contato.setNome("ex contatinho 01");
		contato.setEmail(null);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(contato);
		manager.getTransaction().commit();
		
		System.out.println("Contato atualizado, ID: "+contato.getId());
		
		manager.close();	
	}
}