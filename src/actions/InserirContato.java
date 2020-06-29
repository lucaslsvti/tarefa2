package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Contato;

public class InserirContato {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Contatinho 01");
		contato.setEmail("contatinho01@email.com");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(contato);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa inserida, ID: "+contato.getId());
		
		manager.close();
	}
}