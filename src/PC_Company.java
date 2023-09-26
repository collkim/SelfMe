
public class PC_Company {

	private String company = "콜킴 전자상가" ;
	
	
	
	private String name;
	private String phorn;
	private String number;
	
	Pc MyPc;
	
	public PC_Company (String name, String phorn, String number) {
		
		this.name = name;
		this.phorn = phorn;
		this.number = number;
		
		MyPc = new Pc();	
		}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhorn() {
		return phorn;
	}

	public void setPhorn(String phorn) {
		this.phorn = phorn;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	public void MyPc(String GPU, String CPU, String RAM, String SSD, String MAIN, String CASE, String POW) {
		MyPc.GPU = GPU;
		MyPc.CPU = CPU;
		MyPc.RAM = RAM;
		MyPc.SSD = SSD;
		MyPc.MAIN = MAIN;
		MyPc.CASE = CASE;
		MyPc.POW = POW;
	}

	public void ShowInfo () {
		System.out.println("====" + company + "====");
		System.out.println("고객 성함: " + name);
		System.out.println("고객 연락처: " + phorn);
		System.out.println("고객 구매번호: " + number);
		System.out.println("==== 구매한 PC 스펙 ====");
		System.out.println("그래픽카드: " + MyPc.GPU);
		System.out.println("CPU: " + MyPc.CPU);
		System.out.println("RAM: " + MyPc.RAM);
		System.out.println("저장장치: " + MyPc.SSD);
		System.out.println("메인보드: " + MyPc.MAIN);
		System.out.println("케이스: " + MyPc.CASE);
		System.out.println("파워: " + MyPc.POW);
		System.out.println("============");		
	}
}
