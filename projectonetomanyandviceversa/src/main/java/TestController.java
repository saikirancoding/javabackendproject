import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Post;
import com.model.PostComment;

public class TestController {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jparelation");

		EntityManager em=emf.createEntityManager();
		
		Post post = new Post("First post");
		 
		post.getComments().add(
		    new PostComment("My first review")
		);
		post.getComments().add(
		    new PostComment("My second review")
		);
		post.getComments().add(
		    new PostComment("My third review")
		);
		em.getTransaction().begin();
		em.persist(post);
		em.getTransaction().commit();

	}

}
