package com.tyk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tyk.entity.UploadFile;
import com.tyk.repository.UploadFileRepository;

@Service
public class FileStorageService {
	
	@Autowired
	private UploadFileRepository uploadRepo;
	
	public UploadFile save(MultipartFile file)
	{
		String fileName=file.getOriginalFilename();
		try {
	          UploadFile uf= new UploadFile();
	          uf.setFileName(fileName);
	          uf.setFileType(file.getContentType());
	          uf.setFileData(file.getBytes());
	         return uploadRepo.save(uf);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		 return null;
	}
	public UploadFile  getFile(Integer id)
	{
		 Optional<UploadFile> file = uploadRepo.findById(id);
		 if(file.isPresent()) {
			 return file.get();
		 }
		 return null;
	}
	public List<UploadFile>getAllFiles()
	{
		return uploadRepo.findAll();
	}

}
