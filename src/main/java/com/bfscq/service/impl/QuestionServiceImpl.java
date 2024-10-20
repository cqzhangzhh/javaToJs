package com.bfscq.service.impl;

import com.bfscq.mapper.UserMapper;
import com.bfscq.pojo.User;
import com.bfscq.service.UserService;
import com.bfscq.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionMapper questionMapper;

	@Override
	@Transactional
	public void addQuestion(Question question) {
		questionMapper.insertQuestion(question);
	}

	@Override
	@Transactional
	public void updateQuestion(Question question) {
		questionMapper.updateQuestion(question);
	}

	@Override
	@Transactional
	public void deleteQuestion(Integer id) {
		questionMapper.deleteQuestion(id);
	}

	@Override
	public List<Question> getAllQuestions() {
		return questionMapper.getAllQuestions();
	}

	@Override
	public Question getQuestionById(Integer id) {
		return questionMapper.getQuestionById(id);
	}
}
