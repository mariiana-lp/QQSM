package com.ab.springboot.backend.millonario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "options")
public class Options implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	private Integer idQuestion;
	@Column(nullable = false, columnDefinition = "TINYINT(1)")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean correctAnswer;
	private String opt;
	
	
	
	
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




	public Boolean getCorrectAnswer() {
		return correctAnswer;
	}




	public void setCorrectAnswer(Boolean correctAnswer) {
		this.correctAnswer = correctAnswer;
	}




	public String getOpt() {
		return opt;
	}




	public void setOpt(String opt) {
		this.opt = opt;
	}




	private static final long serialVersionUID = 1L;

}
