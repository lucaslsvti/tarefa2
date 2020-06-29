package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Contato;

public class BuscaUmContato {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();

		Contato c = manager.find(Contato.class, 2L);
		System.out.println(c.getNome());

		manager.close();
	}

}
