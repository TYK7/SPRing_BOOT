package com.tyk.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.tyk.entity.EmpAddress;
import com.tyk.entity.EmpDetails;
import com.tyk.repository.EmpAddressRepository;
import com.tyk.repository.EmpDetailseRepository;

@Service
public class EmployeeService {
	
	private EmpAddressRepository addressRepository;
	
	private EmpDetailseRepository detailseRepository;

	public EmployeeService(EmpAddressRepository addressRepository, EmpDetailseRepository detailseRepository) {
		super();
		this.addressRepository = addressRepository;
		this.detailseRepository = detailseRepository;
	}
	
	@Transactional(rollbackOn =Exception.class)
	public void saveEmp()
	{
		EmpAddress empAdd=new EmpAddress();
		empAdd.setAddId(201);
		empAdd.setEmpId(101);
		empAdd.setState("TS");
		empAdd.setCity("HYDERABAD");
		empAdd.setCountry("INDIA");
		addressRepository.save(empAdd);
		
		
		
		EmpDetails empDet= new EmpDetails();
		
		empDet.setEmpId(101);
		empDet.setEmpName("Kushal");
		empDet.setDepartment("FULLSTack DEVELOPER");
		empDet.setSalary(35000.00);
		detailseRepository.save(empDet);
	}

}
