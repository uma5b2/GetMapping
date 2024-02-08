package com.example.springboot.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class GetMappingController
{
	@Autowired
	GetMappingService service;

	@GetMapping("/string")
	public String getString()
	{
		return "Spring Boot Project";
	}
	
	@GetMapping("/list")
	public List<String> getList()
	{
		List<String> list=Arrays.asList("Item1","Item2","Item3");
		return list;
	}
	
	@GetMapping("/object")
	public List<Item> getobject()
	{
		List<Item> itemlist=Arrays.asList(
				new Item(1,"Item1 Desc",100),
				new Item(2,"Item2 Desc",200),
				new Item(3,"Item3 Desc",300));
		return itemlist;
	}
	
	@GetMapping("/object2")
	public List<Item>  getObject2()
	{
		return service.getAllItems();
	}
	
	@GetMapping("/objectbyid/{price}")
	public List<Item> getObjectById(@PathVariable float price)
	{
		return service.getItemById(price);
	}
	
}
