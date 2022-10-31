package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
		List<ProgrammingLanguage> getAll();
		void add(ProgrammingLanguage language);
		void delete(int id);
		void update(int id, String newName);
		ProgrammingLanguage getById(int id);
		
		
}
