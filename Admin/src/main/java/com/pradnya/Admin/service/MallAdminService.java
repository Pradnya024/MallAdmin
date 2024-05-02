package com.pradnya.Admin.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pradnya.Admin.entity.MallAdmin;
import com.pradnya.Admin.repository.MallAdminRepository;
@Service
public class MallAdminService {
	@Autowired
	MallAdminRepository malladminRepository;
	
	public MallAdmin save(MallAdmin emp) {
		return malladminRepository.save(emp);
		}
	public MallAdmin getMallAdmin(int id) {
		return malladminRepository.findById(id).get();
		}
	public MallAdmin update(int id,MallAdmin malladmin) {
		MallAdmin emps =malladminRepository.findById(id).get();
		emps.setName(malladmin.getName());
		emps.setPassword(malladmin.getPassword());
		emps.setMall(malladmin.getMall());
		emps.setPhone(malladmin.getPhone()); 
		return malladminRepository.save(emps); 
		}
	public String delete(int id)
	{
	malladminRepository.deleteById(id);
	return "Entity deleted" +id;
	}
	public List<MallAdmin> getEmplist()
	{
	return malladminRepository.findAll();
	}
	public MallAdminRepository getMallAdminRepository() {
		return malladminRepository;
	}
	public void setMallAdminRepository(MallAdminRepository malladminRepository) {
		this.malladminRepository = malladminRepository;
	}
}
   