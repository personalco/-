
public class Doctor {

	private String computer;
	private String medicalAppliance;
//
//	public Doctor() {
//		this.computer = "����ý���";
//		this.medicalAppliance = "û����";
//	}
//
//	public Doctor(String name, String computer, String medicalAppliance) { 
//		// ���ο��� ��ü���� �� ȣ�� ���۵�.
//		System.out.println("Doctor �����ڰ� ȣ��Ǿ����ϴ�.");
//		this.computer = computer;
//		this.medicalAppliance = medicalAppliance;
//		System.out.println(name + "��ü�� �����Ǿ����ϴ�!");
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
		System.out.println(doctorModel.getComputer() + "���� ȯ���� �̸��� ��ȸ�մϴ�.");
	}

	public void treatment(/*DoctorModel doctorModel*/) {
		System.out.println("�ǻ簡" + doctorModel.getMedicalAppliance() + " �� ȯ�ڸ� �����մϴ�");
	}

	public void prescription(/*DoctorModel doctorModel*/) {
		System.out.println("�ǻ簡" +  doctorModel.getComputer() + " ȯ���� ó������ �ۼ��մϴ�.");
	}
}
