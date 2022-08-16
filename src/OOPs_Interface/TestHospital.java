package OOPs_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioServvices();
		fh.dentalServices();
		fh.emergencyServices();
        fh.entServices();
        fh.medicalinsurance();
        fh.peadiatricServices();
        
        USMedical us = new FortisHospital();
        us.cardioServvices();
        us.emergencyServices();
        us.neuroServices();
        us.physioServices();


        
        UKMedical uk = new FortisHospital();
        uk.dentalServices();
        uk.entServices();
        uk.emergencyServices();
        ((USMedical) uk).physioServices();
        
        
	}

}
