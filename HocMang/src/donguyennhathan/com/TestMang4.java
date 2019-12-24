package donguyennhathan.com;

import java.util.Scanner;

public class TestMang4 {

	/**
	 * Đây là hàm nhập mảng tăng dần
	 * @param M
	 */
	static void nhapMangTangDanVaKhongTrung(int[] M)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<M.length;i++)
		{
			if(i==0)
			{
				System.out.println("Nhập M["+i+"] =");
				M[i]=sc.nextInt();
			}
			else
			{
				System.out.println("Nhập M["+i+"] =");
				M[i]=sc.nextInt();
				while(M[i]<=M[i-1])
				{
					System.out.println("Sai rồi");
					System.out.println("Nhập lại đi M["+i+"] =");
					M[i]=sc.nextInt();
					if(M[i]>M[i-1])
					{
						break;
					}
					else
					{
						continue;
					}
				}
			}
		}
	}
	/**
	 * Đây là hàm dùng để xuất mảng
	 * @param M
	 */
	static void xuatMang(int[] M)
	{
		for(int i=0; i<M.length;i++)
		{
			System.out.println("M["+i+"] = "+M[i]);
		}
	}
	public static void main(String[] args) {
		/*
		 * 1. Viết hàm nhập giá trị từ bàn phím cho mảng M
		 * yêu cầu nhập tăng dần, nếu nhập sai quy cách thì thông báo bắt nhập lại
		 */
		try
		{
			int[] M;
			System.out.println("Nhập số phần tử của mảng: ");
			int n= new Scanner(System.in).nextInt();
			M= new int[n];
			nhapMangTangDanVaKhongTrung(M);
			xuatMang(M);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
