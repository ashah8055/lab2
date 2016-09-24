package translater.model;

public class translate_class {

	int id;
	String english;
	String spanish;
	
	public translate_class()
	{
		
	}
	
	public translate_class(int id,String english,String spanish)
	{
		this.id=id;
		this.english= english;
		this.spanish=spanish;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getSpanish() {
		return spanish;
	}

	public void setSpanish(String spanish) {
		this.spanish = spanish;
	}
	
	
}
