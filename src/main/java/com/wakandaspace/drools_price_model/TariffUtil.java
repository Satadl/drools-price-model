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
			// Hemological tests
			add(new Tariff("Hemoglobin(HB)", 600.0, 500.0, 400.0, 200.0, 2.0));
			add(new Tariff("Packed cell volume(pcv)", 600.0, 500.0, 400.0,
					200.0, 3.0));
			add(new Tariff("White cell count(Total and differential)", 960.0,
					800.0, 600.0, 200.0, 4.0));
			add(new Tariff("Full Blood cound and credentials(FBC)", 1500.0,
					1500.0, 1000.0, 400.0, 2.0));
			add(new Tariff("White blood cell count", 960.0, 800.0, 600.0,
					200.0, 4.0));
			add(new Tariff("Red Blood cell /Reticulocyte count", 720.0, 600.0,
					500.0, 200.0, 2.0));
			add(new Tariff("Grouping and cross matching", 720.0, 600.0, 500.0,
					200.0, 2.0));
			add(new Tariff("Genotype(on request by clinician)", 720.0, 600.0,
					500.0, 200.0, 2.0));
			add(new Tariff("Blood group", 720.0, 600.0, 500.0, 200.0, 2.0));
			add(new Tariff("Erythrocyte sedimentation Rate (ESR)", 600.0,
					500.0, 400.0, 200.0, 2.0));
			add(new Tariff("MCHC", 600.0, 500.0, 400.0, 200.0, 3.0));
			add(new Tariff("MCH", 600.0, 500.0, 400.0, 200.0, 2.0));
			add(new Tariff("MCV", 600.0, 500.0, 400.0, 200.0, 4.0));
			add(new Tariff("Blood film", 600.0, 500.0, 400.0, 200.0, 2.0));
			add(new Tariff("Blood pregnancy (Beta HCG) Test", 600.0, 500.0,
					400.0, 200.0, 1.0));

			// Chemistry investigations
			add(new Tariff("Fasting Blood Sugar", 600.0, 600.0, 200.0, 200.0,
					2.0));
			add(new Tariff("Random Blood Sugar", 600.0, 600.0, 200.0, 200.0,
					3.0));
			add(new Tariff("2 Hours Post-prandial blood sugar", 600.0, 600.0,
					200.0, 200.0, 2.0));
			add(new Tariff("Oral glucose tolerance test (OGTT)", 1800.0,
					1500.0, 400.0, 400.0, 3.0));
			add(new Tariff("Glucose challenge test", 1800.0, 1500.0, 400.0,
					400.0, 2.0));
			add(new Tariff("Electrolytes, Urea and Creatinine", 2400.0, 2000.0,
					600.0, 400.0, 3.0));
			add(new Tariff("Lipid profile(fasting)(HDL,LDL,Triglyceride))",
					4200.0, 3500.0, 1000.0, 900.0, 2.0));
			add(new Tariff("Liver Function test (LFT)", 3600.0, 3000.0, 1000.0,
					900.0, 4.0));
			add(new Tariff("Serum ALT/SGPT", 600.0, 500.0, 200.0, 100.0, 2.0));
			add(new Tariff("Serum AST/SGOT", 600.0, 500.0, 200.0, 100.0, 4.0));
			add(new Tariff("Serum Sodium", 600.0, 500.0, 200.0, 100.0, 5.0));
			add(new Tariff("Serum Calcium", 600.0, 500.0, 200.0, 100.0, 3.0));
			add(new Tariff("Serum Magnesium", 600.0, 500.0, 200.0, 100.0, 4.0));
			add(new Tariff("Serum Potasium", 600.0, 500.0, 200.0, 100.0, 6.0));
			add(new Tariff("Serum Lithium", 600.0, 500.0, 200.0, 100.0, 4.0));
			add(new Tariff("Serum Chloride", 600.0, 500.0, 400.0, 100.0, 6.0));
			add(new Tariff("Serum Bicarbonate", 600.0, 500.0, 400.0, 100.0, 3.0));
			add(new Tariff("Serum Alkaline Phospate", 600.0, 500.0, 400.0,
					100.0, 3.0));
			add(new Tariff("Serum Acid Phosphate", 600.0, 500.0, 400.0, 100.0,
					2.0));
			add(new Tariff("Serum Inorganic Phosphate", 600.0, 500.0, 400.0,
					100.0, 2.0));
			add(new Tariff("Serum Albumin", 600.0, 500.0, 400.0, 100.0, 2.0));
			add(new Tariff("Serum Lactase Dehydrogenase", 600.0, 500.0, 400.0,
					100.0, 1.0));
			add(new Tariff("Serum Gamma Glutammyl Transferase", 600.0, 500.0,
					400.0, 100.0, 2.0));
			add(new Tariff("Prothrombin time(PT/INR)", 1200.0, 1000.0, 1000.0,
					400.0, 1.0));
			add(new Tariff("Urine Pregnancy test", 960.0, 800.0, 600.0, 200.0,
					1.0));
			// Microbiology and parasitology
			add(new Tariff("Malaria parasite(MP))", 600.0, 500.0, 400.0, 200.0,
					2.0));
			add(new Tariff("Widal", 2400.0, 2000.0, 1500.0, 500.0, 1.0));
			add(new Tariff("Urine M/C/S", 1200.0, 1000.0, 1000.0, 400.0, 2.0));
			add(new Tariff("Endocervical Swab(ECS) M/C/S", 600.0, 500.0, 500.0,
					200.0, 3.0));
			add(new Tariff("High Vaginal Swab(HVS) M/C/S", 900.0, 750.0, 750.0,
					300.0, 2.0));
			add(new Tariff("Urethral Swab M/C/S", 960.0, 800.0, 500.0, 200.0,
					3.0));
			add(new Tariff("Throat Swab M/C/S", 600.0, 500.0, 500.0, 200.0, 3.0));
			add(new Tariff("Ear Swab M/C/S", 600.0, 500.0, 500.0, 200.0, 4.0));
			add(new Tariff("Wound Swab M/C/S", 720.0, 600.0, 600.0, 200.0, 3.0));
			add(new Tariff("Eye Swab M/C/S", 1200.0, 1000.0, 1000.0, 400.0, 4.0));
			add(new Tariff("Sputum M/C/S", 1200.0, 1000.0, 1000.0, 400.0, 6.0));
			add(new Tariff("Aspirates M/C/S", 1200.0, 1000.0, 1000.0, 400.0,
					5.0));
			add(new Tariff("Stool M/C/S", 1200.0, 1000.0, 1000.0, 400.0, 3.0));
			add(new Tariff("VDRL (Veneral disease research laboratory) Test",
					1200.0, 1000.0, 1000.0, 400.0, 4.0));
			add(new Tariff("H.Pylori", 1200.0, 1000.0, 1000.0, 400.0, 4.0));
			add(new Tariff("Trypanosomes Screening", 1200.0, 1000.0, 1000.0,
					400.0, 4.0));
			add(new Tariff("Toxoplasma Screening", 1200.0, 1000.0, 1000.0,
					400.0, 3.0));
			add(new Tariff("Skin Snip for Microfilaria", 1200.0, 1000.0,
					1000.0, 400.0, 4.0));
			add(new Tariff("Skin Scraping for Fungi", 1200.0, 1000.0, 1000.0,
					400.0, 3.0));
			add(new Tariff("Leishmania Screening", 1200.0, 1000.0, 1000.0,
					400.0, 2.0));
			add(new Tariff("Mantoux/Heaf's Test", 1200.0, 1000.0, 1000.0,
					400.0, 3.0));
			add(new Tariff("Blood culture", 1200.0, 1000.0, 1000.0, 400.0, 2.0));
			add(new Tariff("Stool Occult Blood", 1200.0, 1000.0, 1000.0, 400.0,
					3.0));

			// Advanced laboratory investigations/pathology
			add(new Tariff("Blood Urea Nitrogen", 1800.0, 1500.0, 400.0, 300.0,
					2.0));
			add(new Tariff("Hepatitis B Surface Antigen (HBSAg)", 1800.0,
					1500.0, 400.0, 300.0, 2.0));
			add(new Tariff("HBA1C", 1800.0, 1500.0, 400.0, 300.0, 3.0));
			add(new Tariff("Hepatitis C Screening", 1800.0, 1500.0, 400.0,
					300.0, 32.0));
			add(new Tariff("Hepatits B Screening", 1800.0, 1500.0, 400.0,
					300.0, 4.0));
			add(new Tariff("HIV Screening", 1800.0, 1500.0, 400.0, 300.0, 3.0));
			add(new Tariff("HIV Confirmatory Test", 6000.0, 5000.0, 1400.0,
					1000.0, 3.0));
			add(new Tariff("G-6PD Screening", 1800.0, 1500.0, 400.0, 300.0, 3.0));
			add(new Tariff("Thyroid Funtion Tests", 1800.0, 1500.0, 400.0,
					300.0, 3.0));
			add(new Tariff("Serum Uric Acid", 1800.0, 1500.0, 400.0, 300.0, 2.0));
			add(new Tariff("Creatinine phosphokinase", 1800.0, 1500.0, 400.0,
					300.0, 3.0));
			add(new Tariff("Syphilis Screening", 1800.0, 1500.0, 400.0, 300.0,
					5.0));
			add(new Tariff("Serum immunoglobulins/Antibodies", 1800.0, 1500.0,
					400.0, 300.0, 6.0));
			add(new Tariff("Immunofluorescence assay", 1800.0, 1500.0, 400.0,
					300.0, 5.0));
			add(new Tariff(
					"QBC Malaria Concentration And Fluorescent Staining",
					1800.0, 1500.0, 400.0, 300.0, 7.0));
			add(new Tariff("Pap Smear and Cytology", 8500.0, 8000.0, 2700.0,
					2500.0, 3.0));
			add(new Tariff("Prostate Specific Antigen", 7200.0, 6000.0, 1700.0,
					1700.0, 4.0));
			add(new Tariff("Protein Electrophoresis", 2400.0, 2000.0, 500.0,
					400.0, 3.0));
			add(new Tariff("CSF M/C/S (CSF Analysis)", 1800.0, 1500.0, 400.0,
					300.0, 6.0));
			add(new Tariff("Semen M/C/S", 1800.0, 1500.0, 400.0, 300.0, 4.0));
			add(new Tariff("Serum Creatinine Phosphokinase", 1800.0, 1500.0,
					400.0, 300.0, 2.0));
			add(new Tariff("Serum Iron", 1800.0, 1500.0, 400.0, 300.0, 2.0));
			add(new Tariff("24 Hour Creatinine Clearance", 1800.0, 1500.0,
					400.0, 300.0, 3.0));
			add(new Tariff("Coomb's Test(Indirect)", 1800.0, 1500.0, 400.0,
					300.0, 3.0));
			add(new Tariff("Coomb's Test(Direct)", 1800.0, 1500.0, 400.0,
					300.0, 3.0));
			add(new Tariff("Osmotic Fragility Test", 1800.0, 1500.0, 400.0,
					300.0, 5.0));
			add(new Tariff("Chlamydia Screening", 1800.0, 1500.0, 400.0, 300.0,
					6.0));
			add(new Tariff("Seminal Fluid Analysis (SFA)", 1800.0, 1500.0,
					400.0, 300.0, 5.0));
			add(new Tariff("Clotting Time", 1800.0, 1500.0, 400.0, 300.0, 6.0));
			add(new Tariff("Bleeding Time", 1800.0, 1500.0, 400.0, 300.0, 6.0));
			add(new Tariff("D-Dimer", 1800.0, 1500.0, 400.0, 300.0, 5.0));
			add(new Tariff("Sputum Acid Fast Bacili (AFB) Test", 1800.0,
					1500.0, 400.0, 300.0, 6.0));

			// Admissions and accommodation
			add(new Tariff("Feedding for enrolles on admission", 2500.0,
					2000.0, 500.0, 400.0, 75.0));
			add(new Tariff("Hospital Ward Care", 15000.0, 10000.0, 2400.0,
					1700.0, 125.0));
			add(new Tariff("Skilled Medical and paramedical services", 20000.0,
					15000.0, 4000.0, 3400.0, 13.0));
			add(new Tariff("Supply of prescribed drugs", 1500.0, 1250.0, 400.0,
					300.0, 765.0));
			add(new Tariff("Supply of all medical and surgical consumables",
					2500.0, 2000.0, 500.0, 400.0, 765.0));
			add(new Tariff("Blood grouping, cross matching and transfusion",
					12000.0, 10000.0, 2500.0, 2200.0, 4.0));
			add(new Tariff("Accomodation for-in patient care", 15000.0,
					10000.0, 2400.0, 1700.0, 12.0));
			add(new Tariff(
					"Accommodation for parents/relatives (Excludes Feeding)",
					12000.0, 10000.0, 2700.0, 1700.0, 5.0));

			// Intensive care
			add(new Tariff("ICU and ICU-related care", 450000.0, 350000.0,
					275000.0, 250000.0, 1.5));

			// Eye/Optical care
			add(new Tariff("Specialist Ophtalmologist Consultation", 2000.0,
					1200.0, 300.0, 200.0, 65.0));
			add(new Tariff("Treatment of acute and chronic ocular infections",
					2000.0, 1200.0, 300.0, 200.0, 43.0));
			add(new Tariff("Basic ocular Tests", 2000.0, 1200.0, 300.0, 200.0,
					23.0));
			add(new Tariff("Advanced Ocular Tests", 5000.0, 2500.0, 500.0,
					400.0, 11.0));
			add(new Tariff("Lenses and Frames(Including Contact lenses)",
					2000.0, 1200.0, 300.0, 200.0, 85.0));

			// Dental care
			add(new Tariff("Specialist Consultation", 8000.0, 7000.0, 2000.0,
					1700.0, 32.0));
			add(new Tariff("Routine dental examination", 2000.0, 1500.0, 400.0,
					400.0, 22.0));
			add(new Tariff("Preventive dental care and counselling", 1200.0,
					1000.0, 300.0, 300.0, 1.0));
			add(new Tariff("Dental pain therapy", 1200.0, 1000.0, 300.0, 300.0,
					2.0));
			add(new Tariff("Treatment of acute  and chronic dental infections",
					1200.0, 1000.0, 300.0, 300.0, 1.0));
			add(new Tariff("Acces to prescribed drugs", 1000.0, 800.0, 200.0,
					200.0, 2.0));
			add(new Tariff("Surgical extraction", 2000.0, 1600.0, 500.0, 400.0,
					3.0));
			add(new Tariff("Non-surgical extraction", 1200.0, 1000.0, 300.0,
					300.0, 4.0));
			add(new Tariff("Root canal therapy", 5000.0, 4000.0, 1000.0, 900.0,
					5.0));
			add(new Tariff("Scaling and polishing", 1200.0, 1000.0, 300.0,
					300.0, 6.0));
			add(new Tariff("Operculectomy", 1200.0, 1000.0, 300.0, 300.0, 6.0));
			add(new Tariff("Gingival curettage", 1200.0, 1000.0, 300.0, 300.0,
					3.0));
			add(new Tariff("Composite filling", 1200.0, 1000.0, 300.0, 300.0,
					6.0));
			add(new Tariff("Amalgame filling", 1200.0, 1000.0, 300.0, 300.0,
					7.0));
			add(new Tariff("Incision and Drainage", 5000.0, 4500.0, 1400.0,
					1000.0, 3.0));

			// Physiotherapy care
			add(new Tariff("Specialist consultation", 15000.0, 10000.0, 3000.0,
					2700.0, 50.0));
			add(new Tariff("Routine fitness examination", 2000.0, 20000.0,
					700.0, 700.0, 32.0));
			add(new Tariff("Preventive Counselling on referral", 10000.0,
					10000.0, 400.0, 400.0, 15.0));
			add(new Tariff("Cervical Collar and Crutches", 4000.0, 3500.0,
					1000.0, 900.0, 5.0));
			add(new Tariff("Walker", 4000.0, 3500.0, 1000.0, 900.0, 4.0));
			add(new Tariff("Pain therapy", 4000.0, 3500.0, 1000.0, 900.0, 44.0));
			add(new Tariff("Acces to prescribed drugs", 4000.0, 3500.0, 1000.0,
					900.0, 78.0));
			add(new Tariff("Number of sessions covered", 4000.0, 3500.0,
					1000.0, 900.0, 1200.0));
			// Obstetrics care
			add(new Tariff(
					"Antenatal care(INCL. specialist care and ANC drugs)",
					60000.0, 50000.0, 35000.0, 25000.0, 32.0));
			add(new Tariff("Delivery(SVD/NORMAL and COMPLICATED)", 70000.0,
					50000.0, 40000.0, 35000.0, 3.0));
			add(new Tariff("Delivery(Multiple)", 80000.0, 60000.0, 45000.0,
					4000.0, 23.0));
			add(new Tariff("Assisted Delivery", 12000.0, 10000.0, 7500.0,
					7000.0, 23.0));
			add(new Tariff("Therapeutic Abortion(Manual vacuum aspiration)",
					22000.0, 20000.0, 20000.0, 15000.0, 2.0));
			add(new Tariff("Caesarian section", 450000.0, 350000.0, 200000.0,
					175000.0, 3.0));
			// Infertility care
			add(new Tariff(
					"Fertility specialist consultation  and counselling",
					50000.0, 47500.0, 42500.0, 40000.0, 23.0));
			add(new Tariff("Fertility investigations", 15000.0, 12500.0,
					10000.0, 5000.0, 2.0));
			// Incubator care
			add(new Tariff("Neonatal/ Special baby are unit", 15000.0, 12000.0,
					10000.0, 8000.0, 13.0));

			// NPI IMMUNIZATION (0-5years)
			add(new Tariff("BCG", 1200.0, 1000.0, 200.0, 200.0, 2.0));
			add(new Tariff("OPV/IPV", 900.0, 750.0, 200.0, 200.0, 4.0));
			add(new Tariff("Pentavalent", 2500.0, 2400.0, 700.0, 500.0, 3.0));
			add(new Tariff("Hepatitis B", 1200.0, 1000.0, 400.0, 400.0, 5.0));
			add(new Tariff("DPT", 900.0, 750.0, 200.0, 200.0, 4.0));
			add(new Tariff("Vitamin A", 750.0, 500.0, 100.0, 100.0, 56.0));
			add(new Tariff("Measles", 2400.0, 2000.0, 400.0, 200.0, 4.0));
			add(new Tariff("Yelow fever", 2400.0, 2000.0, 400.0, 200.0, 6.0));
			// Additionnal immunization(0-5 years)
			add(new Tariff("Chicken pox", 10000.0, 10000.0, 1700.0, 1700.0,
					54.0));
			add(new Tariff("Meningitis", 13500.0, 12000.0, 3000.0, 2900.0, 33.0));
			add(new Tariff("MMR", 6000.0, 5000.0, 1400.0, 1400.0, 2.0));
			add(new Tariff("Pneumococcal", 7000.0, 6000.0, 1400.0, 1400.0, 23.0));
			add(new Tariff("Rotavirus", 10000.0, 10000.0, 3400.0, 3400.0, 3.0));
			add(new Tariff("Thyphoid vaccine", 7000.0, 6500.0, 2000.0, 2000.0,
					2.0));

			//
			add(new Tariff("Dialysis and all related care", 600.0, 500.0,
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