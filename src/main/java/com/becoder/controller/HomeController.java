package com.becoder.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.becoder.entity.User;

//import com.becoder.dao.UserDao;
import com.becoder.service.UserProxy;

@Controller
public class HomeController {
	
	

	
	  private final UserProxy userproxy;

	@Autowired
	    public HomeController(UserProxy userproxy) {
	        this.userproxy = userproxy;
	    }


    private static final String FIXED_EMAIL = "fixed@example.com";
    private static final String FIXED_PASSWORD = "password123";
	 
	@RequestMapping("/home")
	public String home() {
        // Handle home logic
    	
        return "home"; // Return the view name
    }

    @RequestMapping("/login")
    public String login() {
        // Handle login logic
        return "login"; // Return the view name
    }

    @RequestMapping("/register")
    public String register() {
        // Handle register logic
        return "register"; // Return the view name
    }
    

	@RequestMapping(path = "/registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, HttpSession session) {

		 System.out.println(user);

		 userproxy.registerUser(user);
	session.setAttribute("msg", "Register Sucessfully");

		return "redirect:/register";
	}

	@RequestMapping(path = "/loginUser", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session) {

		User user = userproxy.login(email, password);

		if (user != null) {
			session.setAttribute("userObj", user);
			return "profile";
		} else {
			session.setAttribute("msg", "Invalid Email or Password . Please re-enter");
			return "redirect:/login";
		}

	}
	
	
	 @RequestMapping("/loginWriter")
	    public String loginwriter() {
	        // Handle login logic
	        return "loginWriter"; // Return the view name
	    }

	    // Other existing methods remain unchanged

	    @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
	    public String loginUserwriter(@RequestParam("email") String email, @RequestParam("password") String password,
	                            HttpSession session) {

	        // Check if the provided email and password match the fixed combination
	        if (email.equals(FIXED_EMAIL) && password.equals(FIXED_PASSWORD)) {
	            // If matched, create a dummy User object and set it in session
	            User fixedUser = new User();
	            fixedUser.setEmail(email);
	            fixedUser.setPassword(password);
	            session.setAttribute("userObj", fixedUser);
	            return "WriterProfile"; // Redirect to profile page or wherever you want
	        } else {
	            // If not matched, show login failed message
	            session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
	            return "redirect:/loginWriter";
	        }
	    }
	    @RequestMapping("/deleteAccount")
	    public String deleteAccount(HttpSession session) {
	        User user = (User) session.getAttribute("userObj");
	        if (user != null) {
	            userproxy.deleteUser(user.getId()); // Assuming userDao has a method to delete user by ID
	            session.invalidate(); // Invalidate the session after deletion
	        }
	        return "redirect:/login"; // Redirect to login page after deletion
	    }
	    
	    @RequestMapping("/non_sub")
	    public String non_sub() {
	        // Handle login logic
	        return "non_sub"; // Return the view name
	    }
	    


}
