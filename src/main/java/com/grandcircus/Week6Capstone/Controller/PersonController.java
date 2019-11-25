package com.grandcircus.Week6Capstone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grandcircus.Week6Capstone.Repository.PersonRepository;
import com.grandcircus.Week6Capstone.Repository.TaskRepository;
import com.grandcircus.Week6Capstone.model.Person;
import com.grandcircus.Week6Capstone.model.Task;

@Controller
public class PersonController {
	
	@Autowired
	PersonRepository pRepo;
	
	@Autowired
	TaskRepository tRepo;
	
	@RequestMapping("/")
	public ModelAndView loginPage()
	{
		return new ModelAndView("index","tryAgain", "New User? Create an Account!");	
	}
	
	@RequestMapping("new-user")
	public ModelAndView loggedIn(Person p, String password2)
	{
		System.out.println(p.getEmail());
		if(!p.getEmail().matches("\\w{1,}[@]\\w{2,10}[.]\\w{2,3}"))
			return new ModelAndView("index","tryAgain", "Not a valid email, please try again");	
		else if(pRepo.findByEmail(p.getEmail()) != null)
			return new ModelAndView("index","tryAgain", "email is already in use, please try again");
		else if(!p.getPassword().equals(password2))
			return new ModelAndView("index","tryAgain", "password does not match, please try again.");
		else	
		{
			pRepo.save(p);
		return loginComplete(p);
		}
	}
		@RequestMapping("old-user")
		public ModelAndView loginComplete(Person p)
		{
			if(pRepo.findByEmail(p.getEmail()) != null && (pRepo.findByPassword(p.getPassword())) != null)
			if(pRepo.findByEmail(p.getEmail()).equals(pRepo.findByPassword(p.getPassword())))
				return new ModelAndView("home-page","user", pRepo.findByPassword(p.getPassword()));
				return new ModelAndView("index","tryAgain","that email/password combination is not in our database, please try again.");
		
		}	
		
		@RequestMapping("home-page")
		public ModelAndView addTask(Task t)
		{
			ModelAndView mav = new ModelAndView("home-page");
			tRepo.save(t);
			mav.addObject("taskList", tRepo.findByPerson(t.getPerson()));
			return mav;
		}
		
		
		
}
	
	
	


