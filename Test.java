package pkt;

import java.net.URISyntaxException;
import java.util.Scanner;

import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class Test {

	
	public static void main (String[] args) throws URISyntaxException {
		Scanner in = new Scanner(System.in);
		System.out.print("Uyku Süresi: ");
		double uykusuresi = in.nextDouble();
		System.out.print("Yağ Tüketimi: ");
		double yagtuketimi = in.nextDouble();
		KalpKriziOlasiligi kalpKriziOlasiligi = new KalpKriziOlasiligi(uykusuresi, yagtuketimi);
		System.out.println(kalpKriziOlasiligi);
		JFuzzyChart.get().chart(kalpKriziOlasiligi.getModel());	}

}
