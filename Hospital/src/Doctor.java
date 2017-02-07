
public class Doctor {

	private String computer;
	private String medicalAppliance;
//
//	public Doctor() {
//		this.computer = "전산시스템";
//		this.medicalAppliance = "청진기";
//	}
//
//	public Doctor(String name, String computer, String medicalAppliance) { 
//		// 메인에서 객체생성 시 호출 시작됨.
//		System.out.println("Doctor 생성자가 호출되었습니다.");
//		this.computer = computer;
//		this.medicalAppliance = medicalAppliance;
//		System.out.println(name + "객체가 생성되었습니다!");
//	}
//
//	public void setComputer(String computer) {
//		this.computer = computer;
//	}
//
//	public String getComputer() {
//		return computer;
//	}
//
//	public void setMedicalAppliance(String medicalAppliance) {
//		this.medicalAppliance = medicalAppliance;
//	}
//
//	public String getMedicalAppliance() {
//		return medicalAppliance;
//	}

	private DoctorModel doctorModel;
	
	public Doctor(DoctorModel doctorModel) {
	this.doctorModel = doctorModel;
}

	public void inquery(/*DoctorModel doctorModel*/) {
		System.out.println(doctorModel.getComputer() + "에서 환자의 이름을 조회합니다.");
	}

	public void treatment(/*DoctorModel doctorModel*/) {
		System.out.println("의사가" + doctorModel.getMedicalAppliance() + " 로 환자를 진료합니다");
	}

	public void prescription(/*DoctorModel doctorModel*/) {
		System.out.println("의사가" +  doctorModel.getComputer() + " 환자의 처방전을 작성합니다.");
	}
}
