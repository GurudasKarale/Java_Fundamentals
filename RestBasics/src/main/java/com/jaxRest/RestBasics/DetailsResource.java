package com.jaxRest.RestBasics;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("details")
public class DetailsResource {

	
	DetailsRepo repo = new DetailsRepo();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Details> getDetails() {
		
		System.out.println("Method called");
		/*Details d1 = new Details();
		d1.setName("Raze");
		d1.setPoints(80);
		
		Details d2 = new Details();
		d2.setName("Viper");
		d2.setPoints(70);
		
		List<Details> detailList = Arrays.asList(d1,d2);*/
		
		return repo.getAgentDetails();
	}
	
	@GET
	@Path("agentDetails/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Details getSpecificAgent(@PathParam("id") int id) {
		
		//System.out.println("Method called");
		
		return repo.getAgent(id);
	}
	
	@POST
	@Path("agentDetails")
	public Details createAgent(Details dd1) {
		
		 
		repo.create(dd1);
		
		return dd1;
	}
	
}
