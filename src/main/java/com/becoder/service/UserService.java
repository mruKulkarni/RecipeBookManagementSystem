// UserService.java
package com.becoder.service;
import java.util.List;
import com.becoder.dao.UserDao;
import com.becoder.dao.DaoFactory;
import com.becoder.entity.User;
import com.becoder.entity.indian;
import com.becoder.entity.request;
import com.becoder.entity.Recipe;
import com.becoder.entity.continental;
import com.becoder.entity.fastfood;
import com.becoder.entity.desserts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    private UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public static UserService getInstance() {
        return UserServiceHolder.INSTANCE;
    }

    private static class UserServiceHolder {
        private static final UserService INSTANCE = new UserService(DaoFactory.getInstance().getUserDao());
    }

    public int saveRequest(request in ) {
        return userDao.saveRequest(in);
    }
    
    // *********** BEVERAGES ************ //
    public List<Recipe> getRecipe() {
        return userDao.getRecipe();
    }
    public List<Recipe> searchBeverages(String query) {
        return userDao.searchBeverages(query);
    }
    
    public void  likeRecipe(int id) {
        userDao.likeRecipe(id);
    }
    
    
    // *********** INDIAN ************* //
    public List<indian> getIndian() {
        return userDao.getIndian();
    }
    public List<indian> searchIndian(String query) {
        return userDao.searchIndian(query);
    }
    public void  likeIndian(int id) {
        userDao.likeIndian(id);
    }
    
 // *********** CONTINENTAL ************* //
    public List<continental> getContinental() {
        return userDao.getContinental();
    }
    public List<continental> searchContinental(String query) {
        return userDao.searchContinental(query);
    }
    public void  likeContinental(int id) {
        userDao.likeContinental(id);
    }
    
 // *********** FASTFOOD ************* //
    public List<fastfood> getFastfood() {
        return userDao.getFastfood();
    }
    public List<fastfood> searchFastfood(String query) {
        return userDao.searchFastfood(query);
    }
    public void  likeFastfood(int id) {
        userDao.likeFastfood(id);
    }
    
 // *********** DESSERTS ************* //
    public List<desserts> getDesserts() {
        return userDao.getDesserts();
    }
    public List<desserts> searchDesserts(String query) {
        return userDao.searchDesserts(query);
    }
    public void  likeDesserts(int id) {
        userDao.likeDesserts(id);
    }

}
