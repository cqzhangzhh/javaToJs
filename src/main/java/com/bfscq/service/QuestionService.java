package com.bfscq.service;

import com.bfscq.pojo.User;

public interface QuestionService {
	void addQuestion(Question question);
	void updateQuestion(Question question);
	void deleteQuestion(Integer id);
	List<Question> getAllQuestions();
	Question getQuestionById(Integer id);
}

