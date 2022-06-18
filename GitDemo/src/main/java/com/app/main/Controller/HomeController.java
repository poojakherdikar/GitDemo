package com.app.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping
	public String data()
	{
		return "Ajinkya";
	}
	
	@RequestMapping
	public String datapj()
	{
		return "Pooja";
	}
	@RequestMapping
	public String dataps()
	{
		return "Snehal";
	}
}
