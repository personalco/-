
public class Hospital {

	public static void main(String[] args) {
	
		DoctorModel 김사부의장비 = new DoctorModel("아이패드1", "내시경1");

		PatientModel patientModel = new PatientModel("아모개", 19, "마음이 아파요..");
		Patient 아모개 = new Patient(patientModel);

		 Doctor 김사부 = new Doctor(김사부의장비);
		 김사부.requestTreatment(아모개);
		 
	}
}