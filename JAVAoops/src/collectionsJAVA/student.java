package collectionsJAVA;

//import java.util.Objects;

public class student {
	private int id;
	private String name;
	private int mark;
	
	student(int ids, String names, int marks) {
	this.setId(ids);
	this.name=names;
	this.setMark(marks);
	}

	@Override
	public int hashCode() {
		return id;
	}
	

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		student other = (student) obj;
		return id == other.id ;
	}
	
	

	@Override
	public String toString() {
		return "student [id=" + getId() + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	

}
