package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
		List<ProgrammingLanguage> getAll();
		void add(ProgrammingLanguage language) throws Exception;
		void delete(int id);
		void update(int id, String newName);
		ProgrammingLanguage getById(int id) ;
		boolean isExist(ProgrammingLanguage language);
		
		
}
