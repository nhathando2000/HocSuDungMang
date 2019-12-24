package donguyennhathan.com;

public class TestMang3 {

	public static void main(String[] args) {
		//New hay dùng cách dưới đều cấp phát ô nhớ
		int []M1= {1,2,3};
		int M2[]= {4,5,6};
		//Lúc này thì HĐH sẽ cấp phát 2 vùng nhớ cho M1 và M2
		M1=M2; //Thì ngôn ngữ nói là M1 = M2
		//Nhưng máy ko làm như vậy:
		// M1 trỏ tới vùng nhớ mà M2 đang quản lý
		// lúc này nó xảy ra 2 TH:
		//TH1: Vùng nhớ Y có 2 đối tượng quản lý đó là M1 và M2
		// 1 vùng nhớ mà có 2 đối tượng tham gia cùng quản lý
		// Thì gọi là ALIAS
		// vậy thì nó dẫn tới vấn đề gì
		// Khi có bất kỳ 1 đối tượng nào thay đổi giá trị trên ô nhớ
		// này thì đối tương khác cũng bị ảnh hưởng
		//TH2: Vùng nhớ X ko còn ai tham gia quản lý
		// lúc này hđh sẽ tự động thu hồi ô nhớ đã cấp
		// gọi là GARBAGE COLLECTION (cơ chế gom rác tự động)
		// Lưu ý với C, C++ ta phải tự thu hồi ô nhớ
		// Nếu ko nó bị 1 lỗi nghiêm trọng là MEMORY LEAK (đăc biệt nguy hiểm trong lập trình hệ thống)
		
		//Ta thử thay đổi M1 hoặc M2
		M1[2]=113;
		//Hỏi M2[2] có bị đổi ko
		System.out.println(M2[2]);
		int []D= M1;
		D[0]=100;
		System.out.println("M1[0]= "+M1[0]);
		System.out.println("M2[0]= "+M2[0]);
		int E[]= {-1,-2,-3};
		M2=E;
		// hỏi M1[0], D1[0], E[0] bằng mấy
	}

}
