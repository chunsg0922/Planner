package classSet;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;



/*
 *  Plan 클래스입니다.
 *  계획을 추가하고 삭제할 때 생성되는 객체의 정보를 담고 있습니다.
 */
public class Plan { 
	// static으로 변수를 선언할 경우, 동적 변환이 이루어지지 않아 일관성있는 데이터를 받아올 수 없다.
	// StringProperty 타입에 대한 이해가 필요하다.
	public StringProperty category = new SimpleStringProperty(); 
	public StringProperty planName =  new SimpleStringProperty();
	public StringProperty memo = new SimpleStringProperty();
	
	public String getCategory() {
		return category.get();
	}
	
	public String getPlanName() {
		return planName.get();
	}
	
	public String getMemo() {
		return memo.get();
	}
	

}
	
	
	
	
	
//	public Plan(String category, String name, LocalDate planBeginTime, LocalDate planEndTime, String memo) {
//	
//		this.name = name;
//		this.category = category;
//		this.planBeginTime = planBeginTime;
//		this.planEndTime = planEndTime;
//		this.memo = memo;
//	}
