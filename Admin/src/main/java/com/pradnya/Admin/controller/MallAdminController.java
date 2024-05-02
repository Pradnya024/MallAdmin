package com.pradnya.Admin.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pradnya.Admin.entity.MallAdmin;
import com.pradnya.Admin.service.MallAdminService;
@RestController
@RequestMapping("/malladmin")
public class MallAdminController {
	
	@Autowired
	MallAdminService malladminService;
	public MallAdminService getMallAdminService() {
		return malladminService;
	}
	public void setMalladminService(MallAdminService malladminService) {
		this.malladminService = malladminService;  
	}
	@PostMapping("/create")
	public MallAdmin addMallAdmin(@RequestBody MallAdmin malladmin)
	{
	return malladminService.save(malladmin);   
	}
	@GetMapping(path="/{id}")
	public MallAdmin getMallAdmin(@PathVariable int id)
	{
	return malladminService.getMallAdmin(id); 
	}
	@PutMapping(path="/{id}") 
	public MallAdmin updateMallAdmin(@RequestBody MallAdmin malladmin,@PathVariable int id)
	{  
	return malladminService.update(id,malladmin); 
	}
	@DeleteMapping(path="/{id}")
	public String deleteMallAdmin(@PathVariable int id)
	{
	return malladminService.delete(id); 
	}
	
	@GetMapping
	public List<MallAdmin> getAllMallAdmin()
	{
	return malladminService.getEmplist();
	}


  


	
}
