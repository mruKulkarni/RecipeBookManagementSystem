package com.becoder.dao;


import java.util.List;

import com.becoder.entity.Recipe;

import com.becoder.entity.User;
import com.becoder.entity.indian;
import com.becoder.entity.continental;
import com.becoder.entity.fastfood;
import com.becoder.entity.desserts;
import com.becoder.entity.request;
public interface UserDao {

	public int saveUser(User user);

	public User login(String email, String password);
	

	public  void deleteUser(int userId);
	
	   
    // *********** BEVERAGES ************ //
	public List<Recipe> getRecipe();
	public Recipe getRecipeById(int id);
	void likeRecipe(int recipeId);
	public  List<Recipe> searchBeverages(String query);
	
	// *********** INDIAN ************** //
	void likeIndian(int recipeId); 
	public  List<indian> searchIndian(String query);
	public List<indian> getIndian();
	public indian getIndianById(int id);

	// *********** CONTINENTAL ************** //
	void likeContinental(int recipeId); 
	public  List<continental> searchContinental(String query);
	public List<continental> getContinental();
	public continental getContinentalById(int id);
	
	// ************* FASTFOOD *************** //
	void likeFastfood(int recipeId); 
	public  List<fastfood> searchFastfood(String query);
	public List<fastfood> getFastfood();
	public fastfood getFastfoodById(int id);
	
	// ************** DESSERTS *************** //
	void likeDesserts(int recipeId); 
	public  List<desserts> searchDesserts(String query);
	public List<desserts> getDesserts();
	public desserts getDessertsById(int id);

	
	
	public int saveRequest(request in);

}
