package testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraContato {
	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
        factory.close();
    }
}