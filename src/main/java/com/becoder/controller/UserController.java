package com.becoder.controller;
import com.becoder.service.UserService;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.becoder.dao.UserDao;
import com.becoder.entity.Recipe;
import com.becoder.entity.User;
import com.becoder.entity.indian;
import com.becoder.entity.continental;
import com.becoder.entity.fastfood;
import com.becoder.entity.desserts;
import com.becoder.entity.request;
@Controller
@RequestMapping("/user/")
public class UserController {

	 private final UserService userService;



	    @Autowired
	    public UserController(UserService userService) {
	        this.userService = userService;
	        
	    }


	
	// ***************** BEVERAGES ****************** // 
	 @RequestMapping("/view_beverages")
		public String view_beverages(HttpSession session, Model m) {
			
			List<Recipe> recipe = userService.getRecipe();
			m.addAttribute("list",recipe);
			return "view_beverages";
		}
	 
	 @RequestMapping(value = "/search_beverages", method = RequestMethod.GET)
	    public String searchBeverages(@RequestParam("query") String query, Model model) {
	        // Call your DAO method to search for beverages based on the query
	        List<Recipe> searchResults = userService.searchBeverages(query);
	        model.addAttribute("list", searchResults);
	        return "view_beverages"; // Return the same view to display search results
	    }
	 

	  @RequestMapping("/likeRecipe")
	    public String likeRecipe(@RequestParam("recipeId") int recipeId, HttpSession session) {
	        // You need to implement this method to update the like count for the recipe with the given recipeId
	        // Example:
	        userService.likeRecipe(recipeId);
	        session.setAttribute("msg", "Recipe liked successfully");
	        return "redirect:/user/view_beverages";
	    }
	 
	 // ******************** INDIAN ***************** //
	 @RequestMapping("/view_indian")
		public String view_indian(HttpSession session, Model m) {
			
			List<indian> indian = userService.getIndian();
			m.addAttribute("list",indian);
			return "view_indian";
		}
	 
	 @RequestMapping(value = "/search_in", method = RequestMethod.GET)
	    public String searchIndian(@RequestParam("query") String query, Model model) {
	        // Call your DAO method to search for beverages based on the query
	        List<indian> searchResults = userService.searchIndian(query);
	        model.addAttribute("list", searchResults);
	        return "view_indian"; // Return the same view to display search results
	    }
	  
	  @RequestMapping("/likeIndian")
	    public String likeIndian(@RequestParam("recipeId") int recipeId, HttpSession session) {
	        // You need to implement this method to update the like count for the recipe with the given recipeId
	        // Example:
	        userService.likeIndian(recipeId);
	        session.setAttribute("msg", "Recipe liked successfully");
	        return "redirect:/user/view_indian";
	    }

	// ******************** CONTINENTAL ***************** //
	 @RequestMapping("/view_continental")
			public String view_continental(HttpSession session, Model m) {
				
				List<continental> continental = userService.getContinental();
				m.addAttribute("list",continental);
				return "view_continental";
			}	 
	 
	 
	 @RequestMapping(value = "/search_con", method = RequestMethod.GET)
	    public String searchContinental(@RequestParam("query") String query, Model model) {
	        // Call your DAO method to search for beverages based on the query
	        List<continental> searchResults = userService.searchContinental(query);
	        model.addAttribute("list", searchResults);
	        return "view_continental"; // Return the same view to display search results
	    }
	 

	  
	  
	  @RequestMapping("/likeContinental")
	    public String likeContinental(@RequestParam("recipeId") int recipeId, HttpSession session) {
	        // You need to implement this method to update the like count for the recipe with the given recipeId
	        // Example:
	        userService.likeContinental(recipeId);
	        session.setAttribute("msg", "Recipe liked successfully");
	        return "redirect:/user/view_continental";
	    }
	// ******************** FAST FOOD ***************** //
		 @RequestMapping("/view_fastfood")
				public String view_fastfood(HttpSession session, Model m) {
					
					List<fastfood> fastfood = userService.getFastfood();
					m.addAttribute("list",fastfood);
					return "view_fastfood";
				}	 
		 
		 @RequestMapping(value = "/search_fas", method = RequestMethod.GET)
		    public String searchFastfood(@RequestParam("query") String query, Model model) {
		        // Call your DAO method to search for beverages based on the query
		        List<fastfood> searchResults = userService.searchFastfood(query);
		        model.addAttribute("list", searchResults);
		        return "view_fastfood"; // Return the same view to display search results
		    }
		 
		  
		  @RequestMapping("/likeFastfood")
		    public String likeFastfood(@RequestParam("recipeId") int recipeId, HttpSession session) {
		        // You need to implement this method to update the like count for the recipe with the given recipeId
		        // Example:
		        userService.likeFastfood(recipeId);
		        session.setAttribute("msg", "Recipe liked successfully");
		        return "redirect:/user/view_fastfood";
		    }
		// ******************** DESSERTS ***************** //
		 @RequestMapping("/view_desserts")
				public String view_desserts(HttpSession session, Model m) {
					
					List<desserts> desserts = userService.getDesserts();
					m.addAttribute("list",desserts);
					return "view_desserts";
				}	 
	 
		 @RequestMapping(value = "/search_des", method = RequestMethod.GET)
		    public String searchDesserts(@RequestParam("query") String query, Model model) {
		        // Call your DAO method to search for beverages based on the query
		        List<desserts> searchResults = userService.searchDesserts(query);
		        model.addAttribute("list", searchResults);
		        return "view_desserts"; // Return the same view to display search results
		    }
		  
		  
		  @RequestMapping("/likeDesserts")
		    public String likeDesserts(@RequestParam("recipeId") int recipeId, HttpSession session) {
		        // You need to implement this method to update the like count for the recipe with the given recipeId
		        // Example:
		        userService.likeDesserts(recipeId);
		        session.setAttribute("msg", "Recipe liked successfully");
		        return "redirect:/user/view_desserts";
		    }
		 
		 
// ************************************************************************************************** //
		 
	 @RequestMapping("/logout")
		public String logout(HttpSession session) {

			session.removeAttribute("userObj");
			session.setAttribute("msg", "Logout Successful");
			return "home";
		}
	 
	 
	 
	 @RequestMapping(path = "/saveRequest", method = RequestMethod.POST)
		public String saveRequest(@ModelAttribute request n, HttpSession session) {
			
			
		 userService.saveRequest(n);
			session.setAttribute("msg", "Request Added sucessfully");

			return "redirect:/user/addRequest";
		}
	
	
	 @RequestMapping(value="/addRequest")
	    public String addRequest() {
	        // Handle beverages logic
		 
	        return "addRequest"; // Return the view name
	    }
	 
	 
	 
	  
	  

	}

