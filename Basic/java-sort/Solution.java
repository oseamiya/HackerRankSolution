import java.util.*;

class compareStudents implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        int cgpa = Double.compare(a.getCgpa(), b.getCgpa());
        int name = a.getFname().compareTo(b.getFname());
        int id = Integer.compare(a.getId(), b.getId());
        return cgpa != 0 ? (-1 * cgpa) : (name != 0 ? name : id); // we multiplied with -1 becuase we need greater cgpa not smaller
    }
}

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}


public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList, new compareStudents());
      	for(Student st: studentList){
            System.out.println(st.getFname());
		}
	}
}



