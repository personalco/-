
public class Hospital {

	public static void main(String[] args) {
		/*
		 * Doctor 김사부 = new Doctor("김사부", "아이패드", "체온계" ); //new뒤를 생성자라고 함
		 * 
		 * 김사부.setComputer("MRI"); 김사부.inquery(); 김사부.treatment();
		 * 
		 * String computer = 김사부.getComputer(); String medicalAppliance =
		 * 김사부.getMedicalAppliance();
		 * 
		 * System.out.println("김사부의 컴퓨터는" + computer + " 입니다.");
		 * System.out.println("김사부의 진료도구는" + medicalAppliance + " 입니다.");
		 * 
		 * Doctor 봉달희 = new Doctor(); 봉달희.inquery(); 봉달희.treatment();
		 */

		DoctorModel 김사부의장비 = new DoctorModel("아이패드1", "내시경1");
		DoctorModel 봉달희의장비 = new DoctorModel("아이패드2", "내시경2");
		DoctorModel 유혜정의장비 = new DoctorModel("아이패드3", "내시경3");

		 Doctor 김사부 = new Doctor(김사부의장비);
		 김사부.inquery();
		 김사부.treatment();
		 김사부.prescription();
		
		Doctor[] doctors = new Doctor[3];
		doctors[0] = new Doctor(김사부의장비);
		doctors[1] = new Doctor(봉달희의장비);
		doctors[2] = new Doctor(유혜정의장비);


		doctors[1].inquery();
		doctors[1].treatment();
		doctors[1].prescription();
		System.out.println("===================");
		for (int i = 0; i < doctors.length; i++) {
			doctors[i].inquery();
			doctors[i].treatment();
			doctors[i].prescription();
		}
		System.out.println("=====================");
		for (Doctor 의사 : doctors) {
			의사.inquery();
			의사.treatment();
			의사.prescription();
	}
}
}