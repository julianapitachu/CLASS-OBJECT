import java.util.Scanner;
public class Class_Main {

	public static void main(String[] args) 
	{
		// Kotak
		Kotak kotakHitam = new Kotak();
		
		kotakHitam.setpanjang(5);
		kotakHitam.setlebar(3);
		
		kotakHitam.hitungLuas();
		kotakHitam.hitungkeliling();
		
		System.out.println("#Object Class Kotak#");
		System.out.println("panjang : " + kotakHitam.getpanjang());
		System.out.println("lebar : " + kotakHitam.getlebar());
		System.out.println("Luas : " + kotakHitam.getLuas());
		System.out.println("Keliling : " + kotakHitam.getkeliling());
		System.out.println("--------------------------------------");
		
		
		// Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
		
		mhs1.setNama("Juliana");
		mhs1.setNim("D0217010");
		mhs1.setAlamat("Matakali");
		mhs1.setGolonganDarah("O");
		mhs1.setStatus("Mahasiswi");
		mhs1.setTinggiBadan(156);
		mhs1.setBeratBadan(40);
		
	    System.out.println("#Object Class Mahasiswa#");
		System.out.println("Nama : " + mhs1.getNama());
		System.out.println("Nim : " + mhs1.getNim());
		System.out.println("Alamat : " + mhs1.getAlamat());
		System.out.println("Golongan Darah : " + mhs1.getGolonganDarah());
		System.out.println("Status : " + mhs1.getStatus());
		System.out.println("Tinggi Badan : "+ mhs1.getTinggiBadan());
		System.out.println("Berat Badan : " + mhs1.getBeratBadan());
		System.out.println("---------------------------------------");
		
		
		// Node
		Node Node = new Node();
		
		Node.Label = "IZAURA";
		Node.Value = 1;
		
		System.out.println("#Object Class Node#");
		System.out.println("Nama Label : " + Node.getLabel());
		System.out.println("Jumlah label : " + Node.getValue());
		System.out.println("---------------------------------------");
		

		// Stack
		Stack stack = new Stack();
		
		System.out.println("#Object Class Stack#");
		stack.value[0] = "Khodijah";
		stack.value[1] = "Fatimah";
		stack.value[2] = "Aisyah";
		stack.value[3] = "Risdaynti";
		stack.value[4] = "Juliana";
		stack.value[5] = "Nurul";
		stack.value[6] = "Asiah";
		stack.value[7] = "Anti";
		stack.value[8] = "Siska";
		stack.value[9] = "Reni";
		stack.value[10] = "Lisma";
		stack.value[11] = "Mila";
		stack.value[12] = "Vera";
		stack.value[13] = "Andika";
		stack.value[14] = "Afriandi";
		stack.value[15] = "Rifai";
		stack.value[16] = "Ismail";
		stack.value[17] = "Abrar";
		stack.value[18] = "Herni";
		stack.value[19] = "Inda";
		stack.value[20] = "Eka";
		stack.value[21] = "Anggi";
		stack.value[22] = "Nafisha";
		stack.value[23] = "Yuli";
		stack.value[24] = "Ahmad";
		stack.value[25] = "Aswad";
		stack.value[26] = "Udin";
		stack.value[27] = "Darmawan";
		stack.value[28] = "Sudarmin";
		stack.value[29] = "Masdar";
		stack.value[30] = "Alfandy";
		stack.value[31] = "Lisa";
		stack.value[31] = "Fadilah";
		stack.value[32] = "Dina";
		stack.value[33] = "Fatma";
		stack.value[34] = "Nas";
		stack.value[35] = "Kurniadi";
		stack.value[36] = "Ela";
		stack.value[37] = "Marni";
		stack.value[38] = "Arming";
		stack.value[39] = "Leliah";
		stack.value[40] = "Ridwan";
		stack.value[41] = "Ewing";
		stack.value[42] = "Lelia";
		stack.value[43] = "Dian";
		stack.value[44] = "Ros";
		stack.value[45] = "Indah";
		stack.value[46] = "Sinar";
		stack.value[47] = "Hasna";
		stack.value[48] = "Parnita";
		stack.value[49] = "Yusri";
		stack.value[50] = "Ichsan";
		stack.value[51] = "Lala";
		stack.value[52] = "Nina";
		stack.value[53] = "Hani";
		stack.value[54] = "Indah";
		stack.value[55] = "Nurma";
		stack.value[56] = "Ayu";
		stack.value[57] = "Rara";
		stack.value[58] = "Jannah";
		stack.value[59] = "Jamila";
		stack.value[60] = "Engang";
		stack.value[61] = "Sudirman";
		stack.value[62] = "Nining";
		stack.value[63] = "Hasbi";
		stack.value[64] = "Alif";
		stack.value[65] = "Apip";
		stack.value[66] = "Ain";
		stack.value[67] = "Bebi";
		stack.value[68] = "Along";
		stack.value[69] = "Asri";
		stack.value[70] = "Emmag";
		stack.value[71] = "Lilis";
		stack.value[72] = "Misna";
		stack.value[73] = "Masni";
		stack.value[74] = "Mirna";
		stack.value[75] = "Mira";
		stack.value[76] = "Ardi";
		stack.value[77] = "Sinnah";
		stack.value[78] = "Amir";
		stack.value[79] = "Mardina";
		stack.value[80] = "Muttia";
		stack.value[81] = "Ramadhan";
		stack.value[82] = "Widya";
		stack.value[83] = "Rosmalia";
		stack.value[84] = "Fatma";
		stack.value[85] = "Bagus";
		stack.value[86] = "Bagas";
		stack.value[87] = "Wira";
		stack.value[88] = "Ida";
		stack.value[89] = "Irna";
		stack.value[90] = "Isda";
		stack.value[91] = "Badri";
		stack.value[92] = "Humairah";
		stack.value[93] = "Nurmawati";
		stack.value[94] = "Iin";
		stack.value[95] = "Wahda";
		stack.value[96] = "Hafni";
		stack.value[97] = "Mutmainna";
		stack.value[98] = "Wilda";
		stack.value[99] = "Darmi";
			
		
		
		stack.setvalueAt(7, "Juliana");

		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};
	}
}




	

