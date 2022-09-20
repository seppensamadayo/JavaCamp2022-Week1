package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		char[] sesliHarf = { 'A', 'E', 'I', 'İ', 'O', 'Ö', 'U', 'Ü' };
		char[] incesesli= {'E','İ','Ö','Ü'};
		char[] kalinsesli= {'A','I','O','U'};
		boolean sesliharf = true;

		for (int i = 0; i < 8; i++) {
			if (sesliharf) {
				if(harf==incesesli[i]) {
					System.out.println("İnce Sesli Harf");
				}
				else if(harf==kalinsesli[i]) {
				System.out.println("Kalın Sesli Harf");

			}
				else {
				System.out.println("Geçersiz harf");
				return;
			}

				char harf1 = 'A';
				char[] Harfler = {'A','O','I','U','a','o','ı','u','E','e','İ','i','Ü','ü','Ö','ö'};
		
		for (int i1 = 0; i1 < Harfler.length; i1++) 
		{
			switch (harf1)
			{
			case 'A':
			case 'I':
			case 'U':
			case 'O':
			case 'a':
			case 'ı':
			case 'u':
			case 'o':
				System.out.println("Kalın sesli harf girdiniz.");
				return;
			case 'E':
			case 'İ':
			case 'Ö':
			case 'Ü':
			case 'e':
			case 'i':
			case 'ö':
			case 'ü':
				System.out.println("İnce sesli harf girdiniz");
			default:
				System.out.println("Yanlış bir harf girdiniz");
				break;
		}
	}
}
}

	
			}
		
	}
