package todolist.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class todolistclass {

	String name;
	Date date;
	//String date;
	//DateFormat dateFormat2 = new SimpleDateFormat("MM-dd-yyyy");
	int id;
	boolean f;
	
	public todolistclass()
	{
		id=0;
	}
	
	public todolistclass(int id,String name,Date date,boolean f)
	{
		this.id=id;
		this.name= name;
		this.date = date;
		this.f=f;
	}

	public boolean isF() {
		return f;
	}

	public void setF(boolean f) {
		this.f = f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
}
