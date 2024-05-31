package com.becoder.controller;
import com.becoder.service.WriterService;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.becoder.entity.Recipe;
import com.becoder.entity.User;
import com.becoder.entity.indian;
import com.becoder.entity.continental;
import com.becoder.entity.fastfood;
import com.becoder.entity.desserts;
import com.becoder.entity.request;
//import com.becoder.dao.UserDao;
import com.becoder.dao.WriterDao;

@Controller

@RequestMapping("/writer/")
public class WriterController {

	
//	private UserDao userDao;
	

	  private final WriterService writerService;
	

	    @Autowired
	    public WriterController(WriterService writerService) {
	        this.writerService = writerService;
	      
	    }

	// *************** BEVERAGES ******************* //
	 @RequestMapping(value="/beverages")
	    public String beverages() {
	        // Handle beverages logic
		 
	        return "beverages"; // Return the view name
	    }
	 
	 @RequestMapping(path = "/saveRecipe", method = RequestMethod.POST)
		public String saveRecipe(@ModelAttribute Recipe n, HttpSession session) {
			
	 writerService.saveRecipe(n);
			session.setAttribute("msg", "Recipe Added sucessfully");

		return "redirect:/writer/beverages";
	}
	 
	 @RequestMapping("/editBeverages")
		public String editBeverages(@RequestParam("id") int id, Model m) {
			Recipe n = writerService.getRecipeById(id);
				m.addAttribute("recipe", n);
			return "editBeverages";
			}

		@RequestMapping(path = "/updateBeverages", method = RequestMethod.POST)
		public String updateBeverages(@ModelAttribute Recipe n, HttpSession session) {
			

			writerService.updateBeverages(n);
			session.setAttribute("msg", "Recipe update sucessfully");
			return "redirect:/writer/beverages_w";
			} 
	 @RequestMapping("/deleteBeverages")
		public String deleteBeverages(@RequestParam("id") int id, HttpSession session) {
		 writerService.deleteBeverages(id);
			session.setAttribute("msg", "Recipe Deleted Sucessfully");
			return "redirect:/writer/beverages_w";
		}
	 
	 @RequestMapping("/beverages_w")
			public String beverages_w(HttpSession session, Model m) {
			
			List<Recipe> recipe = writerService.getRecipe();
			m.addAttribute("list",recipe);
			return "beverages_w";
		}
	 
	 
	 // **************** INDIAN ********************** //
	 @RequestMapping(value="/indian")
	    public String indian() {
	        // Handle beverages logic
		 
	        return "indian"; // Return the view name
	    }
	 
	 @RequestMapping(path = "/saveRecipeInd", method = RequestMethod.POST)
		public String saveRecipeInd(@ModelAttribute indian n, HttpSession session) {
			
	 writerService.saveRecipeInd(n);
			session.setAttribute("msg", "Recipe Added sucessfully");

		return "redirect:/writer/indian";
	}
	 
	 @RequestMapping("/editIndian")
		public String editIndian(@RequestParam("id") int id, Model m) {
			indian n = writerService.getRecipeByIdInd(id);
				m.addAttribute("recipe", n);
			return "editIndian";
			}

		@RequestMapping(path = "/updateInd", method = RequestMethod.POST)
		public String updateInd(@ModelAttribute indian n, HttpSession session) {
			

			writerService.updateInd(n);
			session.setAttribute("msg", "Recipe update sucessfully");
			return "redirect:/writer/indian_w";
			} 
	 @RequestMapping("/deleteInd")
		public String deleteInd(@RequestParam("id") int id, HttpSession session) {
		 writerService.deleteInd(id);
			session.setAttribute("msg", "Recipe Deleted Sucessfully");
			return "redirect:/writer/indian_w";
		}
	 
	 @RequestMapping("/indian_w")
			public String indian_w(HttpSession session, Model m) {
			
			List<indian> recipe = writerService.getRecipeInd();
			m.addAttribute("list",recipe);
			return "indian_w";
		}
	 
	 // ******************** CONTINENTAL ********************* //
	 @RequestMapping(value="/continental")
	    public String continental() {
	        // Handle beverages logic
		 
	        return "continental"; // Return the view name
	    }
	 
	 @RequestMapping(path = "/saveRecipeCon", method = RequestMethod.POST)
		public String saveRecipeCon(@ModelAttribute continental n, HttpSession session) {
			
	 writerService.saveRecipeCon(n);
			session.setAttribute("msg", "Recipe Added sucessfully");

		return "redirect:/writer/continental";
	}
	 
	 @RequestMapping("/editContinental")
		public String editContinental(@RequestParam("id") int id, Model m) {
			continental n = writerService.getRecipeByIdCon(id);
				m.addAttribute("recipe", n);
			return "editContinental";
			}

		@RequestMapping(path = "/updateCon", method = RequestMethod.POST)
		public String updateCon(@ModelAttribute continental n, HttpSession session) {
			writerService.updateCon(n);
			session.setAttribute("msg", "Recipe update sucessfully");
			return "redirect:/writer/continental_w";
			} 
	 @RequestMapping("/deleteCon")
		public String deleteCon(@RequestParam("id") int id, HttpSession session) {
		 writerService.deleteCon(id);
			session.setAttribute("msg", "Recipe Deleted Sucessfully");
			return "redirect:/writer/continental_w";
		}
	 
	 @RequestMapping("/continental_w")
			public String continental_w(HttpSession session, Model m) {
			List<continental> recipe = writerService.getRecipeCon();
			m.addAttribute("list",recipe);
			return "continental_w";
		}
	 
	// ******************** FAST FOOD ********************* //
		 @RequestMapping(value="/fastfood")
		    public String fastfood() {
		        // Handle beverages logic
			 
		        return "fastfood"; // Return the view name
		    }
		 
		 @RequestMapping(path = "/saveRecipeFas", method = RequestMethod.POST)
			public String saveRecipeFas(@ModelAttribute fastfood n, HttpSession session) {
				
		 writerService.saveRecipeFas(n);
				session.setAttribute("msg", "Recipe Added sucessfully");

			return "redirect:/writer/fastfood";
		}
		 
		 @RequestMapping("/editFastfood")
			public String editFastfood(@RequestParam("id") int id, Model m) {
				fastfood n = writerService.getRecipeByIdFas(id);
					m.addAttribute("recipe", n);
				return "editFastfood";
				}

			@RequestMapping(path = "/updateFas", method = RequestMethod.POST)
			public String updateFas(@ModelAttribute fastfood n, HttpSession session) {
				writerService.updateFas(n);
				session.setAttribute("msg", "Recipe update sucessfully");
				return "redirect:/writer/fastfood_w";
				} 
		 @RequestMapping("/deleteFas")
			public String deleteFas(@RequestParam("id") int id, HttpSession session) {
			 writerService.deleteFas(id);
				session.setAttribute("msg", "Recipe Deleted Sucessfully");
				return "redirect:/writer/fastfood_w";
			}
		 
		 @RequestMapping("/fastfood_w")
				public String fastfood_w(HttpSession session, Model m) {
				List<fastfood> recipe = writerService.getRecipeFas();
				m.addAttribute("list",recipe);
				return "fastfood_w";
			}
	 
		// ******************** DESSERTS ********************* //
		 @RequestMapping(value="/desserts")
		    public String desserts() {
		        // Handle beverages logic
			 
		        return "desserts"; // Return the view name
		    }
		 
		 @RequestMapping(path = "/saveRecipeDes", method = RequestMethod.POST)
			public String saveRecipeDes(@ModelAttribute desserts n, HttpSession session) {
				
		 writerService.saveRecipeDes(n);
				session.setAttribute("msg", "Recipe Added sucessfully");

			return "redirect:/writer/desserts";
		}
		 
		 @RequestMapping("/editDesserts")
			public String editDesserts(@RequestParam("id") int id, Model m) {
				desserts n = writerService.getRecipeByIdDes(id);
					m.addAttribute("recipe", n);
				return "editDesserts";
				}

			@RequestMapping(path = "/updateDes", method = RequestMethod.POST)
			public String updateDes(@ModelAttribute desserts n, HttpSession session) {
				writerService.updateDes(n);
				session.setAttribute("msg", "Recipe update sucessfully");
				return "redirect:/writer/desserts_w";
				} 
		 @RequestMapping("/deleteDes")
			public String deleteDes(@RequestParam("id") int id, HttpSession session) {
			 writerService.deleteDes(id);
				session.setAttribute("msg", "Recipe Deleted Sucessfully");
				return "redirect:/writer/desserts_w";
			}
		 
		 @RequestMapping("/desserts_w")
				public String desserts_w(HttpSession session, Model m) {
				List<desserts> recipe = writerService.getRecipeDes();
				m.addAttribute("list",recipe);
				return "desserts_w";
			}
	 
	// ******************* REQUEST ********************** //

	 @RequestMapping("/deleteRequest")
	public String deleteRequest(@RequestParam("id") int id, HttpSession session) {
		 writerService.deleteRequest(id);
		session.setAttribute("msg", "Request Deleted Sucessfully");
	return "redirect:/writer/viewRequest";
	}


 @RequestMapping("/viewRequest")
	public String viewRequest(HttpSession session, Model m) {
		
		List<request> request = writerService.getRequest();
		m.addAttribute("list",request);
		return "viewRequest";
		}
	 
	 
	 
	 
}
