package classSet;

import java.time.LocalDate;
import Screen.AddController;


/*
 *  Plan 클래스입니다.
 *  계획을 추가하고 삭제할 때 생성되는 객체의 정보를 담고 있습니다.
 */
public class Plan { 
	public static String name;
	public static LocalDate planBeginTime;
	public static LocalDate planEndTime;
	public static String category;
	public static String memo;
	
	public static void main(String[] args) {
		

		System.out.println(name);
		System.out.println(category.toString());
		System.out.println(planBeginTime.toString());
		System.out.println(planEndTime.toString());
		System.out.println(memo);
	}
	
	
	
	
	
//	public Plan(String name, String category, LocalDate planBeginTime, LocalDate planEndTime, String memo) {
//	
//		this.name = name;
//		this.category = category;
//		this.planBeginTime = planBeginTime;
//		this.planEndTime = planEndTime;
//		this.memo = memo;
//	}
	
	public void getName(String name) {
		this.name = name;
	}
	public void getPlanBeginTime(LocalDate planBeginTime) {
		this.planBeginTime = planBeginTime;
	}
	
	public void getPlanEndTime(LocalDate planEndTime) {
		this.planEndTime = planEndTime;
	}
	
	public void getCategory(String category) {
		this.category = category;
	}
	
	public void getMemo(String memo) {
		this.memo = memo;
	}
	

}
