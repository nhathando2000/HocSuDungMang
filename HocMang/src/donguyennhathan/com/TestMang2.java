package donguyennhathan.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestMang2 {

	//hình thức là ko quan tâm tên biến, chỉ quan tâm kiểu dữ liệu
	/**
	 * Đây là hàm tạo mảng random
	 * @param M
	 */
	static void nhapMang(int []M)
	{
		Random rd= new Random();
		for(int i=0; i<M.length;i++)
		{
			M[i]=rd.nextInt(100);
		}
	}
	/**
	 * Đây là hàm xuất mảng có kiểu int
	 * @param M
	 */
	static void xuatMang(int[] M)
	{
		for(int i=0; i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
	}
	/**
	 * Tìm phần tử x có tồn tại trong mảng M hay ko?
	 * giải thuật này chạy chậm nhất khi không có phần tử nào tồn tại
	 * @param M 
	 * @param x
	 * @return -1 nếu ko thấy x, còn !=0 vị trí tìm thấy x
	 */
	static int timTuyenTinh(int[]M, int x)
	{
		for(int i=0; i<M.length;i++)
		{
			if(M[i]==x)
				return i;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		for(;;)
		{
			int []X;
			int n;
			System.out.println("Bạn muốn cấp bao nhiêu phần tử: ");
			n= new Scanner(System.in).nextInt();
			X=new int[n];
			nhapMang(X);
			System.out.println("Mảng ngẫu nhiên sau khi nhập: ");
			xuatMang(X);
			System.out.println();
			
			System.out.println("Muốn tìm gì?:");
			int k= new Scanner(System.in).nextInt();
			int kq= timTuyenTinh(X, k);
			if(kq!=-1)
			{
				System.out.println("Tìm thấy số "+k+" ở vị trí thứ "+kq);
			}
			else 
			{
				System.out.println("Không thấy k");
			}
			
			System.out.println("Mảng sau khi sắp xếp: ");
			Arrays.sort(X); //Học ứng dụng
			xuatMang(X);
			System.out.println();
			//Vì mảng đã sắp xếp nên ta dùng giả thuật nhị phân để sắp xếp
			int z=113;
			int kqz=Arrays.binarySearch(X, z);
			if(kqz>=0)
				System.out.println("Thấy "+z+" ở vị trí "+kqz);
			else
				System.out.println("Không thấy "+z);
		}
	}

}
