
public class Test {

	public static void main(String[] args) {
		
		
		PC_Company Kim = new PC_Company("김영민" , "010-2222-3333" , "1번 구매자");
		
		Kim.MyPc("MSI RTX4070TI", "i5 13600KF" , "Team 8X2", "PM9A1", "MSI B760M D4", "DLX21" ,"마이크로닉스 700W");
		Kim.ShowInfo();
		
		System.out.println(Kim.getCompany());
	}

}
