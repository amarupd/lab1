# lab1
package JPALAB;



import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Person;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TicketPU");
		EntityManager entitymanager = emf.createEntityManager();
		Person obj = new Person();
		obj.setPersonName("rams");
		obj.setPersonEmail("teja123@gmail.com");
		obj.setPersonPhone(9166778967);
		
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(obj);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
	}
}