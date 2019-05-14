	package model;

	public class University {
		
		private String name;
		private String adress;
		
		private AcademicUnit root;
		
		public University (String name, String adress) {
			this.name = name;
			this.adress = adress;
		}
		
		public void addAcademicUnit(String name,int code, String director) {
			AcademicUnit au = new AcademicUnit(name,code,director);
			if(root == null) {
				root = au;
			}
			else 
			{
				AcademicUnit current = root;
				boolean added = false;
				while(!added) {
					if(au.compareTo(current)>0) {
						if(current.getRight()==null) {
							current.setRight(au);
							added = true;
						}
						else {
							current = current.getRight();
						}
					}
					else {
						if(current.getLeft()==null) {
							current.setLeft(au);
							added = true;
						}
						else {
							current = current.getLeft();
						}
					}
				}
			}
		}
	}
