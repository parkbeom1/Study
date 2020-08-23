package StringClass;

// 데이터를 담을수 있는 클래스  = 목적상 DTO , VO , DOMAIN 이라고 한다.
// 데이터를 담아서 이동할수 있는 객체 = DTO
public class Emp {
	private int empno;
	private String empname;
	
	public Emp(int empno,String empname) {
		this.empno = empno;
		this.empname = empname;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	// 보통 toString 재정의는  자신의 멤버변수를 촐력할때 많이 사용한다.
	public String toString() {
		return this.empno + this.empname;
	}
}
