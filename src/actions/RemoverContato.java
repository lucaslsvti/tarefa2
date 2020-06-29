package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Contato;

public class RemoverContato {
	public static void main(String[] args) {
		Contato contato;
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		contato = manager.find(Contato.class, 1L);
		
		manager.getTransaction().begin();
		manager.remove(contato);
		manager.getTransaction().commit();
		
		System.out.println("Contato excluído!");
		
		manager.close();
		
	}
}