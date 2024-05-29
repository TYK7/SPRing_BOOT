package com.tyk.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tyk.entity.Course;
import com.tyk.entity.Files;
import com.tyk.services.FileService;
import com.tyk.services.PdfGenerator;
import com.tyk.services.ReportService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportController {
	
	@Autowired
	private ReportService service;
	@Autowired
	private PdfGenerator pdfGen;
	@Autowired
	private FileService fileService;
	
	@GetMapping("/excel")
	public void getExcelDownload(HttpServletResponse response) throws Exception{
		response.setContentType("application/octet-stream");
		String headersKey="Content-Disposition";
		String headersValue="attachment;filename=course.xlsx";
		response.setHeader(headersKey, headersValue);
		service.generateExcelFile(response);
	}
	@PostMapping("/save")
	public ResponseEntity<String> saveCourseDetails(@RequestBody Course course){
		Course save = service.save(course);
		return new ResponseEntity<String>(HttpStatus.OK).ok(" Successfully saved");
	}
	
	@GetMapping("/pdf")
	public void generatePDF(HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");
		DateFormat date=new SimpleDateFormat("yyyy-MM-dd");
		String currentDate=date.format(new Date());
		String headersKey="Content-Disposition";
		String headersValue="attachment;filename=course"+currentDate+".pdf";
		response.setHeader(headersKey, headersValue);

		pdfGen.generatePdf(response);
		
		
	}
	
	@GetMapping("/get-excel")
	public void exportExcelSheet(HttpServletResponse response) throws Exception {
		response.setContentType("application/octet-stream");
		String headersKey="Content-Disposition";
		String headersValue="attachment; filename=course.xlsx";
		response.setHeader(headersKey, headersValue);
		
		service.generateExcelFile(response);
	}
	
	@PostMapping("/upload")
	public ResponseEntity<String> storeFile(@RequestParam("file") MultipartFile file) throws Exception{
		String status = fileService.saveFile(file);
		return  ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/file/{fileName}")
	public ResponseEntity<byte[]> getFileByName(@PathVariable("fileName") String fileName){
		
		 byte[] fileData = fileService.getFileByName(fileName);
		 return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("text/xml")).body(fileData);
	}
	
	
	

}
