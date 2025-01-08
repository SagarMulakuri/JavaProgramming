package constructor;

class Subject{
	
	private String subId;
	private String name;
	private int maxMarks;
	private int marksObtain;
	
	public Subject(String subId, String name, int maxMarks) {
		this.subId= subId;
		this.name= name; //This Keyword is used to reference to the current value
		this.maxMarks=maxMarks;//This keyword will point to the local variable in the class on other hand side it will denotes parameter 
	}
	
	public String getSubId() {
		return subId;	
	}
	
	public String getName() {
		return name;	
	}
	
	public int getMaxMarks() {
		return maxMarks;
	}
	
	public int getMarksObtain() {
		return marksObtain;
	}
	
	public void setmaxMarks(int mm) {
		maxMarks=mm;
	}
	public void setMarksObtain(int m) {
		marksObtain =m;
	}
	boolean isQualified(int m) {
		return m>=maxMarks;
	}
	boolean isQualified() {
		return maxMarks>=maxMarks/10*4;
	}
	public String toString() {
		return "\nsubjectID:"+subId+"\nName :"+name+"\nMarks Obtained: "+marksObtain;
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject subs[]= new Subject[3];
		subs[0]=new Subject("s101","DS",100);
		subs[1]=new Subject("s102","Algo",100);
		subs[2]=new Subject("s103","Operating System",100);
		
		for (Subject s:subs) {
			System.out.println(s);
		}
		
	}

}
