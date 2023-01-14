package com.jaxRest.RestBasics;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class DetailsRepo {

	
	//List<Details> detailsList;
	
	Connection con = null;
	
	public DetailsRepo() {
		
		/*detailsList = new ArrayList<>();
		
		Details d1 = new Details();
		d1.setId(101);
		d1.setName("SOVA");
		d1.setPoints(90);
		
		Details d2 = new Details();
		d2.setId(102);
		d2.setName("Chamber");
		d2.setPoints(80);
		
		detailsList.add(d1);
		detailsList.add(d2);*/
		try {
		
		Class.forName("org.postgresql.Driver");
		con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public List<Details> getAgentDetails(){
		
		List<Details> detailsList = new ArrayList<>();
		String sql="select * from agents";
		
		try {
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()) {
			
			Details d = new Details();
			d.setId(rs.getInt(1));
			d.setName(rs.getString(2));
			d.setPoints(rs.getInt(3));
			
			detailsList.add(d);
		}
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		return detailsList;
	}
	
	public Details getAgent(int id) {
		
		
		
		/*for (Details j: detailsList) {
			
			if(j.getId()==id) {
				return j;
			}
		}
		return null;*/
		
		String sql="select * from agents where id="+id;
		Details d = new Details();
		
		try {
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		if(rs.next()) {
			
			
			d.setId(rs.getInt(1));
			d.setName(rs.getString(2));
			d.setPoints(rs.getInt(3));
			
		}
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return d;
	}

	public void create(Details dd1) {
		// TODO Auto-generated method stub
		
		//	detailsList.add(dd1);
		
		String sql = "insert into agents values(?,?,?)";
		
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			
			st.setInt(1, dd1.getId());
			st.setString(2, dd1.getName());
			st.setInt(3, dd1.getPoints());
			st.executeUpdate();	
		}
			catch(Exception e){
				System.out.println(e);
			}
			
	}
	
}
