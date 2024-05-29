package com.tyk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.tyk.entity.Course;
import com.tyk.repository.CourseRepository;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class PdfGenerator {
	@Autowired
	private CourseRepository cr;
	
	public PdfPTable generatePdf(HttpServletResponse response) throws Exception{
		PdfPTable table=null;
		Document doc= new Document(PageSize.A4);
		PdfWriter.getInstance(doc, response.getOutputStream());
		doc.open();
		Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setSize(18);
		Paragraph para=new Paragraph("Course_Information",font);
		para.setAlignment(Paragraph.ALIGN_CENTER);
		doc.add(para);
		Font paraFont = FontFactory.getFont(FontFactory.HELVETICA);
		paraFont.setSize(12);
		Paragraph paragraph = new Paragraph("Below is SOme Information About Course_Details",paraFont);
		paragraph.setAlignment(Paragraph.ALIGN_LEFT);
		doc.add(paragraph);
		
		Font paraFont3 = FontFactory.getFont(FontFactory.HELVETICA);
		paraFont3.setSize(12);
		Paragraph paragraph3 = new Paragraph(" ",paraFont3);
		paragraph.setAlignment(Paragraph.ALIGN_LEFT);
		doc.add(paragraph3);
		table=new PdfPTable(4);
		table.addCell("CourseId");
		table.addCell("CourseName");
		table.addCell("CoursePrice");
		table.addCell("CourseDuration");
		List<Course> all = cr.findAll();
		for(Course c:all) {
			table.addCell(c.getId().toString());
			table.addCell(c.getName());
			table.addCell(c.getPrice().toString());
			table.addCell(c.getDuration());
		}
		doc.add(table);
		doc.close();
		return table;
		
		
		
		
		
	}

}
