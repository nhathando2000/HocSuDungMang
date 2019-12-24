package donguyennhathan.com;

import java.util.Random;

public class TestMang {

	public static void main(String[] args) {
		//Khai báo mảng M có kiểu int
		int[] M; //đang null
		//Cấp phát 5 phần tử cho mảng M để M quản lý:
		M= new int[30];
		//Vậy mảng M chiếm 1 dung lượng trong thanh RAM là:
		int dl=Integer.BYTES*5;
		System.out.println("M chiếm = "+dl+" byte(s)");
		//Bây h ta thay đổi giá trị các ô nhớ mà M đang quản lý:
		Random rd= new Random();
		for(int i=0; i<M.length;i++)
		{
			M[i]=rd.nextInt(100);
		}
		//Bây giờ ta xuất ra màn hình:
		for(int i=0; i< M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
	}

}
