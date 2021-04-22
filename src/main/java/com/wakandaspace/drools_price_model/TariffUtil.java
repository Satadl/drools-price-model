package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TariffUtil implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public TariffUtil() {
	}

	public static java.util.List<com.wakandaspace.drools_price_model.Tariff> getTariffsList = new java.util.ArrayList<com.wakandaspace.drools_price_model.Tariff>() {
		{
			add(new Tariff("Basic outpatient and in-patient Treatment", 2000.0,
					1500.0, 400.0, 400.0, 1250.0));
			// Specialist consultation
			add(new Tariff("Obstetrician", 150000.0, 100000.0, 26700.0,
					16700.0, 25.0));
			add(new Tariff("Gynaecologist", 150000.0, 1000000.0, 26700.0,
					16700.0, 28.0));
			add(new Tariff("Pediatrician", 15000.0, 12000.0, 2500.0, 1700.0,
					34.0));
			add(new Tariff("General surgeon", 40000.0, 30000.0, 6700.0, 3400.0,
					34.0));
			add(new Tariff("Cardiothoracic surgeon", 5000000.0, 3500000.0,
					833400.0, 666700.0, 3.0));
			add(new Tariff("Neurosurgeon", 500000.0, 300000.0, 66700.0,
					33400.0, 13.5));
			add(new Tariff("ENT Surgeon (Otorhinolaryngologist)", 30000.0,
					25000.0, 6700.0, 5000.0, 16.0));
			add(new Tariff("Urologist", 27000.0, 26000.0, 8400.0, 7700.0, 4.0));
			add(new Tariff("Orthopedic Surgeon", 250000.0, 225000.0, 66700.0,
					33400.0, 12.0));
			add(new Tariff("Gastroenterologist", 250000.0, 225000.0, 66700.0,
					33400.0, 4.0));
			add(new Tariff("Cardiologist", 250000.0, 225000.0, 66700.0,
					33400.0, 3.0));
			add(new Tariff("Neurologist", 250000.0, 225000.0, 66700.0, 33400.0,
					5.0));
			add(new Tariff("Nephrologist", 250000.0, 225000.0, 66700.0,
					33400.0, 6.0));
			add(new Tariff("Psychiatrist", 250000.0, 225000.0, 66700.0,
					33400.0, 4.0));
			add(new Tariff("Neonatologist", 60000.0, 50000.0, 11700.0, 11700.0,
					3.0));
			add(new Tariff("Dermatologist", 250000.0, 225000.0, 66700.0,
					33400.0, 10.0));
			add(new Tariff("Haematologist", 45000.0, 360000, 9400.0, 8400.0,
					3.0));
			add(new Tariff("Dietician", 250000.0, 225000.0, 66700.0, 33400.0,
					4.0));
			add(new Tariff("Nutritionist", 250000.0, 225000.0, 66700.0,
					33400.0, 4.0));
			add(new Tariff("Pulmonologist", 250000.0, 225000.0, 66700.0,
					33400.0, 3.0));
			add(new Tariff("Respiratory Physician", 250000.0, 225000.0,
					66700.0, 33400.0, 3.0));
			add(new Tariff("Hematologist", 250000.0, 225000.0, 66700.0,
					33400.0, 3.0));
			add(new Tariff("Oncologist", 100000.0, 75000.0, 16700.0, 16700.0,
					15.0));
			add(new Tariff("Pathologist", 250000.0, 225000.0, 66700.0, 33400.0,
					23.0));
			add(new Tariff("Endocrinologist", 250000.0, 225000.0, 66700.0,
					33400.0, 134.0));
			add(new Tariff("Family Physician", 250000.0, 225000.0, 66700.0,
					33400.0, 45.0));
			add(new Tariff("Oral and Maxilofacial Surgeon", 250000.0, 225000.0,
					66700.0, 33400.0, 3.0));
			// Access to free telemedecine app
			add(new Tariff("Chat-certified Doctors during medical emergency",
					500.0, 500.0, 500.0, 500.0, 1000.0));
			add(new Tariff("Chat-certified Doctors for medical Information",
					500.0, 500.0, 500.0, 500.0, 1000.0));
			add(new Tariff("Free drug Pick up at designated Pharmacies", 500.0,
					500.0, 500.0, 500.0, 1000.0));
			add(new Tariff("GPS-enabled access to hospital directories", 500.0,
					500.0, 500.0, 500.0, 1000.0));
			add(new Tariff("Telemedecine app with details of covered benefits",
					500.0, 500.0, 500.0, 500.0, 1000.0));
			// Accident and emergency care
			add(new Tariff("Resuscitative care needed to stabilize patient",
					12000.0, 10000.0, 3000.0, 2500.0, 50.0));
			// Basic Diagnostic imaging
			add(new Tariff("Chest X-Rays", 9500.0, 9000.0, 2700.0, 2500.0, 23.0));
			add(new Tariff("Abdominal X-Rays", 12000.0, 10000.0, 3200.0,
					2700.0, 85.0));
			add(new Tariff("Limbs X-Rays", 4000.0, 2500.0, 700.0, 700.0, 15.0));
			add(new Tariff("Neck X-Rays", 4000.0, 2500.0, 700.0, 700.0, 23.0));
			add(new Tariff("Sinus X-Rays", 4000.0, 2500.0, 700.0, 700.0, 12.0));
			add(new Tariff("Mastoid X-Rays", 4000.0, 2500.0, 700.0, 700.0, 15.0));
			add(new Tariff("Cervical Spine X-Rays", 4000.0, 2500.0, 700.0,
					700.0, 19.0));
			add(new Tariff("Skull X-Rays", 4000.0, 2500.0, 700.0, 700.0, 2.5));
			add(new Tariff("Pelvic X-Rays", 4000.0, 2500.0, 700.0, 700.0, 11.0));
			add(new Tariff("Thoracic Inlet X-Rays", 4000.0, 2500.0, 700.0,
					700.0, 3.0));
			add(new Tariff("Thoraco-Lumbar X-Rays", 4000.0, 2500.0, 700.0,
					700.0, 2.0));
			add(new Tariff("Lumbosacral X-Rays", 4000.0, 2500.0, 700.0, 700.0,
					2.0));
			add(new Tariff("Mandibles/Temporomandibular Joint X-Rays", 4000.0,
					2500.0, 700.0, 700.0, 33.0));
			add(new Tariff("X-Rays of All Body Joints", 4000.0, 2500.0, 700.0,
					700.0, 2.4));
			add(new Tariff("Ultrasound Scan", 4000.0, 2500.0, 700.0, 700.0,
					32.0));
			// Advanced diagnosic imaging
			add(new Tariff("Doppler Ultrasound Scan", 45000.0, 40000.0,
					11700.0, 8400.0, 12.0));
			add(new Tariff("ECG(PRE AND POST EXERCISE)", 45000.0, 40000.0,
					11700.0, 8400.0, 23.0));
			add(new Tariff("CT Scan", 45000.0, 40000.0, 11700.0, 8400.0, 21.0));
			add(new Tariff("MRI", 45000.0, 40000.0, 11700.0, 8400.0, 21.0));
			add(new Tariff("Echocardiography", 45000.0, 40000.0, 11700.0,
					8400.0, 4.0));
			add(new Tariff("Protoscopy", 45000.0, 40000.0, 11700.0, 8400.0, 3.0));
			add(new Tariff("Sigmoidoscopy", 45000.0, 40000.0, 11700.0, 8400.0,
					2.0));
			add(new Tariff("Upper GI Endoscopy", 45000.0, 40000.0, 11700.0,
					8400.0, 2.0));
			add(new Tariff("Endoscopic Ultrasound", 45000.0, 40000.0, 11700.0,
					8400.0, 1.0));
			add(new Tariff("Endoscopic retrogade cholangiopancreatography",
					45000.0, 40000.0, 11700.0, 8400.0, 2.0));
			add(new Tariff("Enteroscopy", 45000.0, 40000.0, 11700.0, 8400.0,
					2.0));
			add(new Tariff("Gastrocopy", 45000.0, 40000.0, 11700.0, 8400.0, 3.0));
			add(new Tariff("Colonoscopy", 45000.0, 40000.0, 11700.0, 8400.0,
					12.0));
			add(new Tariff("Laryngoscopy(Direct and Indirect)", 45000.0,
					40000.0, 11700.0, 8400.0, 2.0));
			add(new Tariff("Bronchoscopy", 45000.0, 40000.0, 11700.0, 8400.0,
					3.0));
			add(new Tariff("Thoracoscopy", 45000.0, 40000.0, 11700.0, 8400.0,
					1.0));
			add(new Tariff("Hysteroscopy", 45000.0, 40000.0, 11700.0, 8400.0,
					2.0));
			add(new Tariff("Crystocopy", 45000.0, 40000.0, 11700.0, 8400.0, 1.0));
			add(new Tariff("Laparoscopy", 45000.0, 40000.0, 11700.0, 8400.0,
					3.0));
			add(new Tariff("Anthroscopy", 45000.0, 40000.0, 11700.0, 8400.0,
					2.0));

			//
			add(new Tariff("Dialysis and all related care", 225000.0, 220000.0,
					205000.0, 200000.0, 1.5));
		}
	};
	/**
	 * The function allows you to return a Tariff object according to a given
	 * benefit
	 */
	public static com.wakandaspace.drools_price_model.Tariff getFactorsPerBenefit(
			String benefit) {
		Tariff tarif = new Tariff();
		for (Tariff tariff : getTariffsList) {
			if (tariff.getBenefit().compareToIgnoreCase(benefit) == 0) {
				tarif = tariff;
			}
		}
		return tarif;
	}
	/**
	 * The function allows you to return the cost of a tiers according to the
	 * benefit and the tiers
	 */
	public static double getCost(String benefit, String hospitalTier) {
		double cost = 0;
		for (Tariff tariff : getTariffsList) {
			if (tariff.getBenefit().compareToIgnoreCase(benefit) == 0) {
				if (hospitalTier.equalsIgnoreCase("tier1")) {
					cost = tariff.getTier1();
				}
				if (hospitalTier.equalsIgnoreCase("tier2")) {
					cost = tariff.getTier2();
				}
				if (hospitalTier.equalsIgnoreCase("tier3")) {
					cost = tariff.getTier3();
				}
				if (hospitalTier.equalsIgnoreCase("tier4")) {
					cost = tariff.getTier4();
				}
			}
		}
		return cost;
	}
	/**
	 * The function allows you to return utilisation per 1000 according to the
	 * benefit
	 */
	public static double getUtilisationPerBenefit(String benefit) {
		double utilisation = 0;
		for (Tariff tariff : getTariffsList) {
			if (tariff.getBenefit().compareToIgnoreCase(benefit) == 0) {
				utilisation = tariff.getUtilisation();
			}
		}
		return utilisation;
	}

}