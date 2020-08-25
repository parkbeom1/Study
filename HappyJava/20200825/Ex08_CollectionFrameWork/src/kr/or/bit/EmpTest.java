package kr.or.bit;

public class EmpTest {
	private int empno;
	private String ename;
	private String job;
	
	public EmpTest(int empno, String ename, String job) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}
	
	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String toString() {
		return "이름은 : " + getEname() + " 번호는 : " + getEmpno() + " 직업은 " + getEmpno();
	}
	
}
