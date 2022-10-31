package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository programmingLanguageRepository;
	boolean isExist=false;
	
	public ProgrammingLanguageManager(ProgrammingLanguageRepository
			programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

		
	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}
	
	

	@Override
	public void add(ProgrammingLanguage language) throws Exception{
		if(language.getName()== null || language.getName().length()==0) {
			throw new Exception("Name can not be empty. Please try again.");
		}
		else {
			for(ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getAll()) {
				if(isExist(programmingLanguage)==true) {
					throw new Exception("Sorry , This name is already taken.");
				}
				else {
					System.out.println(language.getName()+"added to list the name of:"
							+language.getId());
				}
			}
		}
	}

	@Override
	public void delete(int id) {
			for(ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getAll()) {
				if(programmingLanguage.getId()==id) {
					programmingLanguageRepository.delete(id);
				}else {
					System.out.println("There is no language id who uses this number.");
				}
			}
		
	}

	@Override
	public void update(int id, String newName) {
		for(ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getAll()) {
			if(programmingLanguage.getId()==id) {
				if(programmingLanguage.getName()==newName) {
					System.out.println("Sorry , This programming language is already existed.");
				}
			}
		}
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}


	@Override
	public boolean isExist(ProgrammingLanguage language) {
		for(ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getAll()) {
			if(programmingLanguage.getName().toUpperCase()==language.getName().toUpperCase() ||programmingLanguage.getId()==language.getId()) {
				isExist=true;
			}
		}
		return isExist;
	}
	
}
