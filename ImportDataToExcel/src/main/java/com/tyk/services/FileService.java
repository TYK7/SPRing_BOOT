package com.tyk.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tyk.entity.Files;
import com.tyk.repository.FileRepository;

@Service
public class FileService {

	@Autowired
	private FileRepository fileRepo;
	
	
	public String saveFile(MultipartFile file) throws Exception {
		Files files = Files.builder()
		.fileName(file.getOriginalFilename())
		.fileType(file.getContentType())
		.fileData(file.getBytes())
		.build();
		Files save = fileRepo.save(files);
		if(save.getFileId()!=0) {
			return "File Upload Successfully Completed";
		}
		return "Upload Failed Please Try Again";
	}
	
	public byte[] getFileByName(String name) {
		
 
		return fileRepo.findByFileName(name).getFileData();
	}
}
