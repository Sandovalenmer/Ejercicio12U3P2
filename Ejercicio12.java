import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		double altura, alturah, alturam, edad, edadt, h, m, promedioalturah, promedioalturahombres, promedioalturam, promedioalturamujeres, promedioedadparticipantes, totalparticipantes, tp;
		String sexo;
		Scanner scanner = new Scanner(System.in);
		alturah = 0;
		alturam = 0;
		edadt = 0;
		tp = 0;
		m = 0;
		h = 0;
		altura = 0.1;
		while (altura!=0) {
			System.out.println(" Ingrese la altura en metros del participante: ");
			altura = scanner.nextDouble();
			System.out.println("Ingrese la edad");
			edad = scanner.nextDouble();
			edadt = edadt+edad;
			tp = tp+1;
			System.out.println("Ingrese el sexo M o F");
			sexo = scanner.next();
			if (sexo.equals("F") || sexo.equals("f")) {
				alturam = alturam+altura;
				m = m+1;
				System.out.println("Participante de sexo femenino registrada...");
				System.out.println(" ");
			} else {
				if (sexo.equals("M") || sexo.equals("m")) {
					alturah = alturah+altura;
					h = h+1;
					System.out.println("Participante de sexo masculino registrado...");
					System.out.println(" ");
				} else {
					System.out.println("Dato no valido");
				}
			}
		}
		promedioalturah = alturah/h;
		promedioalturam = alturam/m;
		promedioedadparticipantes = edadt/tp;
		System.out.println("El promedio de altura de hombres  es: "+promedioalturah);
		System.out.println("El promedio de altura de mujeres es: "+promedioalturam);
		System.out.println("El promedio de todas las edades es: "+promedioedadparticipantes);
	}


}

