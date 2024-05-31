package com.becoder.dao;


import java.util.List;

import com.becoder.entity.User;
import com.becoder.entity.Recipe;
import com.becoder.entity.indian;
import com.becoder.entity.continental;
import com.becoder.entity.fastfood;
import com.becoder.entity.desserts;
import com.becoder.entity.request;
public interface WriterDao {

	
	
	// ************ BEVERAGES ************* //
	public int saveRecipe(Recipe recipe);
	public void deleteBeverages(int id);
	public void updateBeverages(Recipe n);
	public List<Recipe> getRecipe();
	public Recipe getRecipeById(int id);
	
	
	// ************* INDIAN *************** //
	public List<indian> getRecipeInd();
	public indian getRecipeByIdInd(int id);
	public int saveRecipeInd(indian in);
	public void deleteInd(int id);
	public void updateInd(indian n);
	
	
	// ************* CONTINENTAL *************** //
	public List<continental> getRecipeCon();
	public continental getRecipeByIdCon(int id);
	public int saveRecipeCon(continental in);
	public void deleteCon(int id);
	public void updateCon(continental n);
	
	
	// ************* FASTFOOD *************** //
	public List<fastfood> getRecipeFas();
	public fastfood getRecipeByIdFas(int id);
	public int saveRecipeFas(fastfood in);
	public void deleteFas(int id);
	public void updateFas(fastfood n);
	
	
	// ************* DESSERTS *************** //
	public List<desserts> getRecipeDes();
	public desserts getRecipeByIdDes(int id);
	public int saveRecipeDes(desserts in);
	public void deleteDes(int id);
	public void updateDes(desserts n);
	
	
	public request getRequestById(int id);

public List<request> getRequest();
	
	public void deleteRequest(int id);
	

}
