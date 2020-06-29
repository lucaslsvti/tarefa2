package actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Contato;

public class BuscaContatos {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("select c from Contato as c");
		
//		query.setParameter("paramFinalizado", true);
		
		@SuppressWarnings("unchecked")
		List<Contato> lista = query.getResultList();
		
		for (Contato c : lista) {
			System.out.println(c.getNome());
		}
		
		manager.close();
	}
}