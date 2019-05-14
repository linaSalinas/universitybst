package model;

public class AcademicUnit implements Comparable<AcademicUnit>{
	
	private String name;
	private  int code;
	private String director;
	private AcademicUnit right;
	private AcademicUnit left;
	
	public AcademicUnit(String name, int code, String director) {

		this.name = name;
		this.code = code;
		this.director = director;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public AcademicUnit getRight() {
		return right;
	}

	public void setRight(AcademicUnit right) {
		this.right = right;
	}

	public AcademicUnit getLeft() {
		return left;
	}

	public void setLeft(AcademicUnit left) {
		this.left = left;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public int compareTo(AcademicUnit au) {
	
		int comparation = 0;
		if(this.getCode()>au.getCode()) {
			comparation = 1;
		}
		else if(this.getCode()==au.getCode()) {
			return comparation;
		}
		else if(this.getCode()<au.getCode()) {
			comparation = -1;
		}
		return comparation;
		
	}


}
