package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("api/programminglanguages")
public class ProgrammingLanguagesController {
		private ProgrammingLanguageService languageService;

		public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
			this.languageService = languageService;
		}
		
		@GetMapping("/getall")
		public List<ProgrammingLanguage> getAll(){
		return languageService.getAll();	
		}
		
		@PostMapping("/add")
		public void add(ProgrammingLanguage language) throws Exception{
			languageService.add(language);
		}
		
		@DeleteMapping("/delete")
		public void delete(int id) {
			languageService.delete(id);
		}
		
		@PutMapping("/update")
		public void update(int id,String newName) {
			languageService.update(id, newName);
		}
		
		
		ProgrammingLanguage getById(int id) {
			return languageService.getById(id);
			
		}
		
		}
