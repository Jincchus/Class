package kr.co.farmstory2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.farmstory2.dao.TermsDAO;
import kr.co.farmstory2.dto.TermsDTO;

public class TermsService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private TermsDAO dao = new TermsDAO();
	
	public void insertTerms(TermsDTO dto) {}
	public TermsDTO selectTerms() {
		return dao.selectTerms();
	}
	public void updateTerms(TermsDTO dto) {}
	public void deleteTerms() {}
	
}
