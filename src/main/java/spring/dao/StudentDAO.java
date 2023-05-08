package spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;



import spring.dto.Student;

@Component
public class StudentDAO {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("gamma");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	public void saveStudent(Student a) {
	
		transaction.begin();
		manager.persist(a);
	    transaction.commit();
	}
	
	public List<Student> getAllStudents() {
		Query query = manager.createQuery("select a from Student a");
		List<Student> ss = query.getResultList();
		return ss;
		
	}
	
	public Student getStudent(int id) {
		return manager.find(Student.class, id);
	}
	
	public void updateStudent(Student a) {
		transaction.begin();
		manager.merge(a);
		transaction.commit();
		
	}
	
	public void deleteStudent(Student a) {
		transaction.begin();
		manager.remove(a);
		transaction.commit();
	}
}
