package com.ab.springboot.backend.millonario.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "option")

public class Option implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	private Integer idQuestion;
	private String opt;
	private Boolean correctAnswer;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(Integer idQuestion) {
		this.idQuestion = idQuestion;
	}
	public String getOpt() {
		return opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}
	public boolean isCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(boolean correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	
	private static final long serialVersionUID = -3989355817064943847L;
	
	

}
