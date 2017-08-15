/**
 * 
 */
package fr.dta.springhibernate.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.springhibernate.company.model.Company;
import fr.dta.springhibernate.company.repository.CompanyRepository;

/**
 * @author Ayoub Benghal
 * 
 * 
 *
 *
 * 2017
 *
 *
 * CompanyMockService.java
 */

@Service
@Transactional
public class CompanyMockService implements CompanyService{
	
	@Autowired
	private CompanyRepository companyRepository;

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#add(java.lang.Object)
	 */
	@Override
	public void add(Company t) {
		companyRepository.add(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#addList(java.util.List)
	 */
	@Override
	public void addList(List<Company> list) {
			companyRepository.addList(list);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#update(java.lang.Object)
	 */
	@Override
	public void updateType(Company t) {
		companyRepository.updateType(t);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#getList()
	 */
	@Override
	public List<Company> getList() {
		return companyRepository.getList();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.service.AppService#truncate()
	 */
	@Override
	public void truncate() {
		companyRepository.truncate();
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.company.service.CompanyService#findByName(java.lang.String)
	 */
	@Override
	public Company findByName(String name) {
		return companyRepository.findByName(name);
	}

	/* (non-Javadoc)
	 * @see fr.dta.springhibernate.company.service.CompanyService#restartSequenceId()
	 */
	@Override
	public void restartSequenceCompanyId() {
		companyRepository.restartSequenceCompanyId();
	}

}
