package com.niit.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public abstract class HelloController extends AbstractController
{
@Override
protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response )throws Exception{
	ModelAndView modelandview = new ModelAndView("Hellopage");
	modelandview.addObject("message","Successfully done");
	return modelandview;
}

}
