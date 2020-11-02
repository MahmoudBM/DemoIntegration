package tn.esprit.spring;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

import java.util.List;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {
	
	@Autowired
	IEntrepriseService eps;
	
	@Test
	public void TestajouterEntreprise(){
		int entreprise = eps.ajouterEntreprise(new Entreprise());
		assertEquals(entreprise,19);	
	}

	@Test
	public void TestgetAllDepartementsNamesByEntreprise(){
		List<String>  listDep= eps.getAllDepartementsNamesByEntreprise(2);
		assertEquals(2, listDep.size());
		
	}
}
