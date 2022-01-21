package com.revature.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Ingredient;
import com.revature.util.ConnectionClosers;
import com.revature.util.ConnectionUtil;

/*
 * This class is an implementation of our IngredientRepository.
 * Any instance of this class will be a Data Access Object (DAO)
 * this is a design pattern that provides a nice abstraction for your data access in applications
 * this is a dedicated class for data access, which makes it easy to refactor and generally maintain our source code
 */

public class IngredientRepoImpl implements IngredientRepository{

	@Override
	public void save(Ingredient ingredient) {
		
		final String SQL = "insert into ingredient values(default,?,?)";
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = ConnectionUtil.getConnection();
			stmt = conn.prepareStatement(SQL);
			//stmt.setInt(1, ingredient.getId());  //now default- serial numeric
			stmt.setString(1, ingredient.getName()); //correspond to question marks, not column #
			stmt.setString(2, ingredient.getFlavor());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeStatement(stmt);
		}
	}

	@Override
	public Ingredient findById(int id) {
		
		Ingredient ingredient= null;
		final String SQL = "select * from ingredient where ingredient_id = " + id;
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		
		
		try {
			conn= ConnectionUtil.getConnection();
			stmt = conn.createStatement();
			set = stmt.executeQuery(SQL);
			
			if(set.next()) {
				ingredient = new Ingredient(set.getInt(1),
						set.getString(2),
						set.getString(3),
						0.0f);
						
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeResultSet(set);
			ConnectionClosers.closeStatement(stmt);
		}
				
		return ingredient;
		
	}

	@Override
	public Ingredient findByName(String name) {
		
		Ingredient ingredient= null;
		final String SQL = "select * from ingredient where ingredient_name = '" + name + "'"; // SQL uses ' '
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		
		try {
			conn= ConnectionUtil.getConnection();
			stmt = conn.createStatement();
			set = stmt.executeQuery(SQL);
			
			if(set.next()) {
				ingredient = new Ingredient(set.getInt(1),
						set.getString(2),
						set.getString(3),
						0.0f);
						
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeResultSet(set);
			ConnectionClosers.closeStatement(stmt);
		}
				
		return ingredient;
	}

	@Override
	public List<Ingredient> findAll() {
		// since our method has to return a List, we create one now:

		List<Ingredient> ingredients = new ArrayList<>();
		
		final String SQL = "select * from ingredient";
		Connection connection = null;
		Statement stmt = null;
		ResultSet set = null;
		
		try {
			//get a connection to your database
			connection = ConnectionUtil.getConnection();
			
			// once you have a connection to your DB, you can execute SQL statements against it
			
			stmt = connection.createStatement();
			
			// must store results of running the query in a ResultSet so records returned can be accessed
								
		 set =	stmt.executeQuery(SQL);
		
		 //must unpack records from ResultSet and store them in a List since that is the return type
				
		/*
		 * we want to iterate over the ResultSet to grab all of the records and place them into our ArrayList
		 * we must do this by accessing the data in each column
		 */
		
		while(set.next()) {
			
			ingredients.add(
					new Ingredient(set.getInt(1), set.getString(2), set.getString(3), 0.0f)
					);
					
//			int ingredientId = set.getInt(1);
//			String ingredientName = set.getString(2);
//			String ingredientFlavor = set.getString(3);

//			Ingredient ingredient = new Ingredient(ingredientId, ingredientName, ingredientFlavor, 0.0f);
//			ingredients.add(ingredient);
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				ConnectionClosers.closeConnection(connection);
				ConnectionClosers.closeStatement(stmt);
				ConnectionClosers.closeResultSet(set);
			}
		return ingredients;
		}
		
		
	

	@Override
	public void update(Ingredient ingredient) {
		final String SQL = "update ingredient set ingredient_name = ? where ingredient_flavor = ?";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = ConnectionUtil.getConnection();
			stmt= conn.prepareStatement(SQL);
			stmt.setString(1, ingredient.getName());
			stmt.setString(2, ingredient.getFlavor());
			stmt.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeStatement(stmt);
		}
	}

	@Override
	public void delete(Ingredient ingredient) {
		
		
	}

}
