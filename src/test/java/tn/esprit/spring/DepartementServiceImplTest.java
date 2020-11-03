package tn.esprit.spring;



import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementServiceImplTest {
	
	@Autowired 
	IDepartementService dep; 

	@Test
	public void testRetrieveAllDepartment() {
		List<Departement> listDepartments = dep.getAllDepartements(); 
		// il ya 3 departements
		assertEquals(3, listDepartments.size());
	}

}

