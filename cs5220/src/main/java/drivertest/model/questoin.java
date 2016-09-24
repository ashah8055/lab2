package drivertest.model;

public class questoin {

	String description,answerA,answerB,answerC;
	int CorrectAnswer;
	boolean answerCorrect;
	
	public questoin()
	{
		
	}
	
	public questoin(String description,String answerA,String answerB,String answerC,int CorrectAnswer,boolean answerCorrect)
	{
		this.description=description;
		this.answerA=answerA;
		this.answerB=answerB;
		this.answerC=answerC;
		this.CorrectAnswer=CorrectAnswer;
		this.answerCorrect=answerCorrect;
	}
	
	public boolean isAnswerCorrect() {
		return answerCorrect;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAnswerA() {
		return answerA;
	}
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	public String getAnswerB() {
		return answerB;
	}
	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}
	public String getAnswerC() {
		return answerC;
	}
	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}
	public int getCorrectAnswer() {
		return CorrectAnswer;
	}
	public void setCorrectAnswer(int correctAnswer) {
		CorrectAnswer = correctAnswer;
	}
	
	
}
