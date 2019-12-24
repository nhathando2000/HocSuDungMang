package donguyennhathan.com;

public class TestMang5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do
		{
			System.out.println("Tiếp tục không?(c/k):");
			String kq= new java.util.Scanner(System.in).nextLine();
			if(kq.equalsIgnoreCase("k"))
			{
				break;
			}
		}while(true);
		System.out.println("Tạm biệt!");
	}

}
