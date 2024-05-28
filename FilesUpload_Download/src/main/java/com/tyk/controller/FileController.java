package com.tyk.controller;

//import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
//import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tyk.entity.UploadFile;
import com.tyk.exception_handeling.ResourceException;
import com.tyk.service.FileStorageService;

@RestController
public class FileController {
	@Autowired
	private FileStorageService storage;
	
	@GetMapping("/")
	public String getFiles(Model model){
		List<UploadFile> allFiles = storage.getAllFiles();
		model.addAttribute("upfiles",allFiles);
		return "fileUpload";
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/all")
	public ResponseEntity<UploadFile> getAllFiles(){
		List<UploadFile> allFiles = storage.getAllFiles();
		 
		return new ResponseEntity(allFiles,HttpStatus.OK);
	}
	
	@PostMapping("/uploadFiles")
	public String saveFiles(@RequestParam("files") MultipartFile[] files) {
		for(MultipartFile file:files) {
			storage.save(file);
		}
		return "redirect:/";
	}
	
	@PostMapping("/uploadFiles1")
	public ResponseEntity<String> saveFile(@RequestParam("files") MultipartFile[] files) {
		for(MultipartFile file:files) {
			storage.save(file);
		}
		return new ResponseEntity<String>("Upload Successfully",HttpStatus.ACCEPTED);
	}
	@PostMapping("/uploadFiles12")
	public ResponseEntity<String> saveFile1(@RequestParam("files") MultipartFile[] files) {
		for(MultipartFile file:files) {
			storage.save(file);
		}
		return new ResponseEntity<String>("Upload Successfully",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/download/{id}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer id){
	UploadFile file = storage.getFile(id);
	if(file!=null) {
		return ResponseEntity.ok()
	             .contentType(MediaType.parseMediaType(file.getFileType()))
	             .header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+file.getFileName()+"\"")
	             .body(new ByteArrayResource(file.getFileData()));
	}
		
	else {
		 throw new ResourceException(HttpStatus.BAD_REQUEST, "Your Entered Id Don't Having the Data");	}
					
	}

}
