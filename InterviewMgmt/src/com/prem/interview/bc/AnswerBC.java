/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prem.interview.bc;

import java.util.Vector;

import com.prem.interview.dao.AnswerDAO;
import com.prem.interview.pojo.AnswerDTO;
import com.prem.interview.pojo.QuestionDTO;

/**
 * 
 * @author PREMENDRA
 */
public class AnswerBC extends AbstractBC {
	AnswerDAO objAnswerDAO;

	public AnswerBC() {
		objAnswerDAO = new AnswerDAO();
	}

	public boolean keyExists(AnswerDTO objAnswerDTO) throws Exception {
		return objAnswerDAO.keyExists(objAnswerDTO);
	}

	public void save(AnswerDTO objAnswerDTO) throws Exception {
		objAnswerDAO.save(objAnswerDTO);
	}

	public void update(AnswerDTO objAnswerDTO) throws Exception {
		objAnswerDAO.update(objAnswerDTO);
	}

	public void retrieve(AnswerDTO objAnswerDTO) throws Exception {
		objAnswerDAO.retrieve(objAnswerDTO);
	}

	public Vector<AnswerDTO> fetchAllByQuestion(QuestionDTO objQuestionDTO) throws Exception {
		return objAnswerDAO.fetchAllByQuestion(objQuestionDTO);
	}
	
	public String deleteAnswer(AnswerDTO objAnswerDTO) throws Exception {
		return objAnswerDAO.deleteAnswer(objAnswerDTO);
	}
}
