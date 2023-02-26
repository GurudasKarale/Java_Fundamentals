package com.mvcBasicsAnno;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping(value = "/add")  
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response) {
		
		//System.out.println("Proj is created");
		//return "display.jsp";
		//int i=Integer.parseInt(request.getParameter("t1"));
		//int j=Integer.parseInt(request.getParameter("t2"));
		int k=i+j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		return mv;
	}

}
