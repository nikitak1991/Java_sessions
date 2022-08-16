package OOPs_Interface;

public class FortisHospital implements USMedical, IndianMedical, UKMedical{

	@Override
	public void entServices() {
		System.out.println("Uk---entservice");
		
	}

	@Override
	public void dentalServices() {
		 
		System.out.println("Uk---dental");
	}

	@Override
	public void peadiatricServices() {
		System.out.println("indian-----peadiatric");
		
	}

	@Override
	public void onclogyServices() {
		System.out.println("indian-----oncology");
		
	}

	@Override
	public void cardioServvices() {
		System.out.println("US-----cardioservices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("US-----neuroservice");
		
	}

	@Override
	public void physioServices() {
		System.out.println("US-----physio");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("common Emergency services");
		
	}
	
	public void medicalTraining() {
		System.out.println("Fortis===medical training");
	}
	public void medicalinsurance() {
		System.out.println("Fortis===medical insurance");
	}

	

}
