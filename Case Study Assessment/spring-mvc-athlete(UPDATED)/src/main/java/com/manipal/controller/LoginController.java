package com.manipal.controller;

import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.UserDAOImpl;
import com.manipal.model.User;

@Controller
public class LoginController {
	
	@Autowired
	UserDAOImpl userDao;

	@RequestMapping(value="/addPage", method=RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView modelAndView = new ModelAndView("addAthleteForm");
		return modelAndView;
	}

	
	@RequestMapping(value="/addUser", method=RequestMethod.GET)	
	public ModelAndView addFormSuccess(@ModelAttribute User user){
		ModelAndView modelAndView = new ModelAndView("useradded");
		modelAndView.addObject("user",user);
		Random rand = new Random();
		user.setAthleteId((int)rand.nextInt(999)+1001); // to generate random IDs
													    // b/w 1001 and 2000
														// static count can be used as
														// well to get it in serial order
		userDao.addUser(user);
		return modelAndView;
	}
	
	@RequestMapping(value="/showPage")
	public ModelAndView getUsers(){
		List<User> userList = userDao.showList();
		return new ModelAndView("showAthlete", "userList", userList);
	}
	
	@RequestMapping(value="/deletePage")
	public ModelAndView deleteAthletePage(){
		ModelAndView modelAndView = new ModelAndView("deleteAthlete");
		return modelAndView;
	}
	
	@RequestMapping(value="/remove")
	public ModelAndView deleteAthlete(@RequestParam int atID){
		if(userDao.delete(atID)>=1)
		{ModelAndView modelAndView = new ModelAndView("userdeleted");
		return modelAndView;}
		else
		{
			ModelAndView modelAndView = new ModelAndView("nouser");
			return modelAndView;
		}
	}
	
	
}
