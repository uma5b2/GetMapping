package com.example.springboot.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class GetMappingService
{
	
	public  List<Item> getAllItems()
	{
		List<Item> itemobject=new ArrayList<>();
		itemobject.add(new Item(1,"Item1 Desc",100));
		itemobject.add(new Item(2,"Item2 Desc",200));
		itemobject.add(new Item(3,"Item3 Desc",300));
		return itemobject;
		
	}
	
	public List<Item> getItemById(float price)
	{
		List<Item> ids= getAllItems().stream().filter(item->item.getItemPrice() == price).collect(Collectors.toList());
		return ids;
		
	}
	
}
