package com.tyk.services;

import java.io.IOException;
import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Optional;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.entity.Course;
import com.tyk.repository.CourseRepository;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
@Service
public class ReportService {
 
	@Autowired
	private CourseRepository cr;
	
	public void generateExcelFile(HttpServletResponse response) throws Exception
	{
		List<Course> allCourses = cr.findAll();
		HSSFWorkbook workBook= new HSSFWorkbook();
		HSSFSheet sheet = workBook.createSheet("CourseInfo");
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("Course_Id");
		row.createCell(1).setCellValue("Course_Name");
		row.createCell(2).setCellValue("Course_Price");
		row.createCell(3).setCellValue("Course_Duration");

            int dataRowIndex=1;
            for(Course course:allCourses) {
            	HSSFRow dataRow = sheet.createRow(dataRowIndex);
            	dataRow.createCell(0).setCellValue(course.getId());
            	dataRow.createCell(1).setCellValue(course.getName());
            	dataRow.createCell(2).setCellValue(course.getPrice());
            	dataRow.createCell(3).setCellValue(course.getDuration());
                
            	dataRowIndex ++;
            	
            }
            ServletOutputStream outputStream = response.getOutputStream();
            workBook.write(outputStream);
            workBook.close();
            outputStream.close();

	}
	
	public Course save(Course course) {
		Course save = cr.save(course);
		return save;
	}
	public Optional<Course> finById(Integer id) {
		return cr.findById(id);
	}
}
