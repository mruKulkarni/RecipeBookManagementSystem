package com.becoder.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.becoder.dao.*;
import com.becoder.dao.DaoFactory;
import com.becoder.entity.Recipe;
import com.becoder.entity.indian;
import com.becoder.entity.continental;
import com.becoder.entity.fastfood;
import com.becoder.entity.desserts;
import com.becoder.entity.request;
@Service
public class WriterService {
    private final WriterDao writerDao;

    @Autowired
    public WriterService(WriterDao writerDao) {
        this.writerDao = writerDao;
    }

        public static WriterService getInstance() {
            return WriterServiceHolder.INSTANCE;
        }

        private static class WriterServiceHolder {
            private static final WriterService INSTANCE = new WriterService(DaoFactory.getInstance().getWriterDao());
        }

    
    // ************* BEVERAGES ****************** //
    
    public int saveRecipe(Recipe recipe) {
        return writerDao.saveRecipe(recipe);
    }

    public void deleteBeverages(int id) {
        writerDao.deleteBeverages(id);
    }

    public void updateBeverages(Recipe recipe) {
        writerDao.updateBeverages(recipe);
    }

    
    public Recipe getRecipeById(int id) {
        return writerDao.getRecipeById(id);
    }

    // *************** INDIAN ****************** //
    public int saveRecipeInd(indian recipe) {
        return writerDao.saveRecipeInd(recipe);
    }

    public void deleteInd(int id) {
        writerDao.deleteInd(id);
    }

    public void updateInd(indian recipe) {
        writerDao.updateInd(recipe);
    }
    
    public indian getRecipeByIdInd(int id) {
        return writerDao.getRecipeByIdInd(id);
    }

    // ************** CONTINENTAL *****************//
    public int saveRecipeCon(continental recipe) {
        return writerDao.saveRecipeCon(recipe);
    }

    public void deleteCon(int id) {
        writerDao.deleteCon(id);
    }

    public void updateCon(continental recipe) {
        writerDao.updateCon(recipe);
    }

    public continental getRecipeByIdCon(int id) {
        return writerDao.getRecipeByIdCon(id);
    }
    
    // ************** FAST FOOD ***************//
    public int saveRecipeFas(fastfood recipe) {
        return writerDao.saveRecipeFas(recipe);
    }

    public void deleteFas(int id) {
        writerDao.deleteFas(id);
    }

    public void updateFas(fastfood recipe) {
        writerDao.updateFas(recipe);
    }
    
    public fastfood getRecipeByIdFas(int id) {
        return writerDao.getRecipeByIdFas(id);
    }
    
    // ************** DESSERTS ****************//
    public int saveRecipeDes(desserts recipe) {
        return writerDao.saveRecipeDes(recipe);
    }

    public void deleteDes(int id) {
        writerDao.deleteDes(id);
    }

    public void updateDes(desserts recipe) {
        writerDao.updateDes(recipe);
    }
    
    public desserts getRecipeByIdDes(int id) {
        return writerDao.getRecipeByIdDes(id);
    }
    
    // ************** REQUEST ******************* //
    
    public void deleteRequest(int id) {
        writerDao.deleteRequest(id);
    }

    public List<request> getRequest() {
        return writerDao.getRequest();
    }
    public List<Recipe> getRecipe() {
        return writerDao.getRecipe();
    }
    public List<indian> getRecipeInd() {
        return writerDao.getRecipeInd();
    }
    public List<continental> getRecipeCon() {
        return writerDao.getRecipeCon();
    }
    public List<fastfood> getRecipeFas() {
        return writerDao.getRecipeFas();
    }
    public List<desserts> getRecipeDes() {
        return writerDao.getRecipeDes();
    }
   
	 
}
