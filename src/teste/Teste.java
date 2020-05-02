package teste;
import com.upis.dataadapter.*;


public class Teste {
	public static void main(String[]args) {
		Data data = new AdapterData(2020, 5, 2);
		System.out.println(data);
		
		((AdapterData)data).setDiaMes(11, 8);
		System.out.println(data);
		
		((AdapterData)data).setMesAno(11, 2022);
		System.out.println(data);
		
		((AdapterData)data).setDiaAno(19, 2021);
		System.out.println(data);
		
		
		((AdapterData)data).setDiaMesAno(18, 6, 2020);
		System.out.println(data);
		
	}
}
