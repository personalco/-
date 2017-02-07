
public class Doctor {

	private Patient patient;
	private DoctorModel doctorModel;

	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
	}

	public void requestTreatment(Patient patient) {
		this.patient = patient;

		inquery();
		treatment();
		prescription();

	}

	private void inquery() {
		System.out.println(patient.talkMyName() + "님, 병적을 조회하겠습니니다.");
		System.out.println(doctorModel.getComputer() + "에서 환자의 이름을 조회합니다.");
	}

	private void treatment() {
		System.out.println(patient.talkTroubleType() + "..그러시군요..");
		System.out.println("의사가" + doctorModel.getMedicalAppliance() + " 로 환자를 진료합니다");
	}

	private void prescription() {
		
		if ( patient.talkMyAge() >=20 ) {
			System.out.println(patient.talkMyAge() + "살 이시군요. 강한약을 드릴게요.");
				}
		else {
			System.out.println(patient.talkMyAge() + "살 이시군요. 약한 약을 드릴게요.");
		}
		
		System.out.println("의사가" +  doctorModel.getComputer() + " 환자의 처방전을 작성합니다.");
	}

}
