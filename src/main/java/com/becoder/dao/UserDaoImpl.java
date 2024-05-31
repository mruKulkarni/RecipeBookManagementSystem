package com.becoder.dao;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;





import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.Hints;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.becoder.entity.Recipe;
import com.becoder.entity.request;
import com.becoder.entity.User;
import com.becoder.entity.indian;
import com.becoder.entity.continental;
import com.becoder.entity.fastfood;
import com.becoder.entity.desserts;



import java.beans.Transient;
import java.util.List;

//@jakarta.transaction.Transactional
@Transactional
@Repository
public class UserDaoImpl implements UserDao {

//	@Autowired private HibernateTemplate hibernateTemplate;
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	    hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	public int saveUser(User user) {
		int i = (Integer) hibernateTemplate.save(user);
		return i;
	}

	public User login(String email, String password) {

		String sql = "from User where email=:em and password=:pwd";
//		
		User user = (User) hibernateTemplate.execute(s -> {
	        Query<User> q = s.createQuery(sql, User.class); // Specify the result type explicitly
	        q.setParameter("em", email);
	        q.setParameter("pwd", password);
	        return q.uniqueResult();
	    });


		return user;
	}
	
	
	public void deleteUser(int userId) {
	    User user = hibernateTemplate.get(User.class, userId);
	    if (user != null) {
	        hibernateTemplate.delete(user);
	    }
	}

	// ************** BEVERAGES ******************** //

	public List<Recipe> getRecipe() {
	    String sql = "from Recipe";

	    List<Recipe> list = hibernateTemplate.execute(s -> {
	        Query q = s.createQuery(sql);
	        return q.getResultList();
	    });

	    return list;
	}

	@Override
	public Recipe getRecipeById(int id) {
		Recipe n = hibernateTemplate.get(Recipe.class, id);
		return n;
	}
	 @Override
	    public List<Recipe> searchBeverages(String query) {
	        // Implement the search query here, for example:
	        String sql = "from Recipe r where r.title like :query or r.description like :query";
	        List<Recipe> results = hibernateTemplate.execute(s -> {
	            Query<Recipe> q = s.createQuery(sql, Recipe.class);
	            q.setParameter("query", "%" + query + "%");
	            return q.getResultList();
	        });
	        return results;
	    }

	 @Override
	    public void likeRecipe(int recipeId) {
	        Recipe recipe = hibernateTemplate.get(Recipe.class, recipeId);
	       
	        recipe.setLikes(recipe.getLikes() + 1);
	        hibernateTemplate.update(recipe);
	    }
	
	
	// *************** INDIAN ******************** //
	public List<indian> getIndian() {
	    String sql = "from indian";

	    List<indian> list = hibernateTemplate.execute(s -> {
	        Query q = s.createQuery(sql);
	        return q.getResultList();
	    });

	    return list;
	}

	@Override
	public indian getIndianById(int id) {
		indian n = hibernateTemplate.get(indian.class, id);
		return n;
	}
	 @Override
	    public List<indian> searchIndian(String query) {
	        // Implement the search query here, for example:
	        String sql = "from indian r where r.title like :query or r.description like :query";
	        List<indian> results = hibernateTemplate.execute(s -> {
	            Query<indian> q = s.createQuery(sql, indian.class);
	            q.setParameter("query", "%" + query + "%");
	            return q.getResultList();
	        });
	        return results;
	    }

	    
	    @Override
	    public void likeIndian(int recipeId) {
	        indian recipe = hibernateTemplate.get(indian.class, recipeId);
	       
	        recipe.setLikes(recipe.getLikes() + 1);
	        hibernateTemplate.update(recipe);
	    }
	    
	    
	    
	    
	 // *************** CONTINENTAL ******************** //
		public List<continental> getContinental() {
		    String sql = "from continental";

		    List<continental> list = hibernateTemplate.execute(s -> {
		        Query q = s.createQuery(sql);
		        return q.getResultList();
		    });

		    return list;
		}

		@Override
		public continental getContinentalById(int id) {
			continental n = hibernateTemplate.get(continental.class, id);
			return n;
		}
		 @Override
		    public List<continental> searchContinental(String query) {
		        String sql = "from continental r where r.title like :query or r.description like :query";
		        List<continental> results = hibernateTemplate.execute(s -> {
		            Query<continental> q = s.createQuery(sql, continental.class);
		            q.setParameter("query", "%" + query + "%");
		            return q.getResultList();
		        });
		        return results;
		    }
		    
		    @Override
		    public void likeContinental(int recipeId) {
		        continental recipe = hibernateTemplate.get(continental.class, recipeId);
		       
		        recipe.setLikes(recipe.getLikes() + 1);
		        hibernateTemplate.update(recipe);
		    }
		    
		    
		    
	    
		 // *************** FAST FOOD ******************** //
			public List<fastfood> getFastfood() {
			    String sql = "from fastfood";

			    List<fastfood> list = hibernateTemplate.execute(s -> {
			        Query q = s.createQuery(sql);
			        return q.getResultList();
			    });

			    return list;
			}

			@Override
			public fastfood getFastfoodById(int id) {
				fastfood n = hibernateTemplate.get(fastfood.class, id);
				return n;
			}
			 @Override
			    public List<fastfood> searchFastfood(String query) {
			        String sql = "from fastfood r where r.title like :query or r.description like :query";
			        List<fastfood> results = hibernateTemplate.execute(s -> {
			            Query<fastfood> q = s.createQuery(sql, fastfood.class);
			            q.setParameter("query", "%" + query + "%");
			            return q.getResultList();
			        });
			        return results;
			    }	
			    
			    @Override
			    public void likeFastfood(int recipeId) {
			        fastfood recipe = hibernateTemplate.get(fastfood.class, recipeId);
			       
			        recipe.setLikes(recipe.getLikes() + 1);
			        hibernateTemplate.update(recipe);
			    }
			    

			 // *************** DESSERTS ******************** //
				public List<desserts> getDesserts() {
				    String sql = "from desserts";

				    List<desserts> list = hibernateTemplate.execute(s -> {
				        Query q = s.createQuery(sql);
				        return q.getResultList();
				    });

				    return list;
				}

				@Override
				public desserts getDessertsById(int id) {
					desserts n = hibernateTemplate.get(desserts.class, id);
					return n;
				}
				 @Override
				    public List<desserts> searchDesserts(String query) {
				        String sql = "from desserts r where r.title like :query or r.description like :query";
				        List<desserts> results = hibernateTemplate.execute(s -> {
				            Query<desserts> q = s.createQuery(sql, desserts.class);
				            q.setParameter("query", "%" + query + "%");
				            return q.getResultList();
				        });
				        return results;
				    }
				    
				    @Override
				    public void likeDesserts(int recipeId) {
				        desserts recipe = hibernateTemplate.get(desserts.class, recipeId);
				       
				        recipe.setLikes(recipe.getLikes() + 1);
				        hibernateTemplate.update(recipe);
				    }
	    
	
		// ************************ REQUEST ********************* //
		@Override
		public int saveRequest(request in) {

			int i = (Integer) hibernateTemplate.save(in);

			return i;
		}
		
		public List<request> getRequest() {
		    String sql = "from request";

		    List<request> list = hibernateTemplate.execute(s -> {
		        Query q = s.createQuery(sql);
		        return q.getResultList();
		    });

		    return list;
		}
		 
}
