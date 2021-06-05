package advance.dev;
import java.util.Scanner;
import java.sql.Array;

public class MainApp{
	
		static Student[] input() {
			Student[] stu = new Student[2];
				for(int i = 0; i < 10; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Nhap vao ten: ");
					String ten = sc.next();
					System.out.println("Nhap vao tuoi:");
					int tuoi = sc.nextByte();
					System.out.println("Nhap vao dia chi:");
					String diaChi = sc.next();
					System.out.println("Nhap vao so dien thoai:");
					int number = sc.nextInt();
					System.out.println("Nhap DTB= ");
					float mark = sc.nextFloat();
					Student std = new Student(ten, tuoi, diaChi, number, mark);	
					stu[i] = std;
					System.out.println("Nguoi tiep theo: ");
				}
				return stu;
			}
		static void print(Student[] stu) {
				for (int i = 0; i < 10; i++) {
					String str = String.format("Ten: %s, Tuoi: %d, DiaChi: %s, SDT: %s, diemTb: %f", stu[i].ten,stu[i].tuoi,stu[i].diaChi,stu[i].number,stu[i].mark);
					System.out.println(str);
				}
			}
		public static void main(String[] args) {
				Student[] student = new Student[10];
				student = input();
				print(student);
				
			}
		}
