
/**
 BUG TRACKING:

 #1 Abbruch in der Whileschleife (Eingabe 25) funktioniert nicht -> fix 05.08.2015 um 09:55 Uhr


 Wichtige Änderungen, die erledigt werden müssen:

 #1 itemNumber kann vom Kunden ja auch like "1234.HF.lol.1234%" erfolgen
 Somit muss int entfernt werden und ein String abgefragt werden. -> feature erledigt 05.08. 10:10 Uhr


 Features nice to have:

 #1 Kunden entscheiden lassen ob Eingabge Nummer oder EAN -> EAN muss abgefragt werden ob 12 oder 13 Stellig. Da sonst ungültig.
 #2 Marge in % eingeben lassen -> bei plenty allerdings % wegfallen lassen, sonst kann glaube ich nicht gerechnet werden.
 #3 VK Brutto und Netto runden lassen auf 2 Nachkommastellen (Kaufmännisches runden)
 #4 CSV Export
 #6 GUI
 #5 SOAP Anbindung zu plentymarkets

 */
public class Main
{
	public static void main(String [] args)
	{
		int inputMarketplace;
		int invalid = 0;
		int invalid2 = 0;
		String inputItemNumber = "null";
		double inputPurchasePrice = 0;
		double inputMarge = 0;
		double inputShippingCostNet = 0;
		double itemVAT = 0;
		double salesPriceNet;
		double salesPriceGross;
		double marketplaceChargePercent;
		double marketplaceChargeValue;



		do
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Preiskalkulator v. 0.8 von Java Elite");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Für welchen Marktplatz möchten Sie einen Preis kalkulieren?");
			System.out.println("- * - * - * - * - * - * - * - * - * - *");
			System.out.println("(0)Amazon");
			System.out.println("(1)Cdiscount");
			System.out.println("(2)DaWanda");
			System.out.println("(3)Fruugo");
			System.out.println("(4)eBay");
			System.out.println("(5)Gimahot");
			System.out.println("(6)grosshandel.eu");
			System.out.println("(7)Herie");
			System.out.println("(8)Hitmeister");
			System.out.println("(9)Hood");
			System.out.println("(10)Kauflux");
			System.out.println("(11)La Redoute");
			System.out.println("(12)Allyouneed");
			System.out.println("(13)Mercateo");
			System.out.println("(14)PIXmania");
			System.out.println("(15)Play.com");
			System.out.println("(16)Plus.de");
			System.out.println("(17)Rakuten");
			System.out.println("(18)Restposten");
			System.out.println("(19)ricardo");
			System.out.println("(20)Shopgate");
			System.out.println("(21)SumoNet");
			System.out.println("(22)Yatego");
			System.out.println("(23)Zalando");
			System.out.println("(24)Zentralverkauf");
			System.out.println("(25)Programm beenden");
			System.out.println("- * - * - * - * - * - * - * - * - * - *");

			do
			{
				System.out.println("Ihre Eingabe: ");

				inputMarketplace = In.readInt();

				if (inputMarketplace > 25)
				{
					System.out.println("Ungültige Eingabe");
					invalid = 1;
				}
				else if (inputMarketplace < 0)
				{
					System.out.println("Ungültige Eingabe");
					invalid = 1;
				}
				else if (inputMarketplace != 25)
				{
					System.out.println("Bitte geben Sie die Artikelnummer ein: ");
					inputItemNumber = In.readString();

					System.out.println("Bite geben Sie den Einkaufspreis (netto) ein: ");
					inputPurchasePrice = In.readDouble();

					System.out.println("Bitte geben Sie die Marge in % ein: ");
					inputMarge = In.readDouble();

					System.out.println("Bitte geben Sie die Versandkosten (netto) für diesen Artikel an: ");
					inputShippingCostNet = In.readDouble();

					do
					{
						System.out.println("Bitte geben Sie den MwSt. Satz an");
						System.out.println("(0) 19%");
						System.out.println("(1) 7%");
						itemVAT = In.readDouble();

						if (itemVAT > 1)
						{
							System.out.println("Ungültige Eingabe");
							invalid2 = 0;
						}else if(itemVAT < 0)
						{
							System.out.println("Ungültige Eingabe");
							invalid2 = 0;
						}else if (itemVAT == 0)
						{
							itemVAT = 1.19;
							invalid2 = 1;
						}else
						{
							itemVAT = 1.07;
							invalid2= 1;
						}
					} while(invalid2 != 1);

				}
			}while(invalid == 1);


			switch(inputMarketplace)
			{
				case 0:
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + inputShippingCostNet)*itemVAT)*inputMarge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - Nummer: " + inputItemNumber);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 1:
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + inputShippingCostNet)*itemVAT)*inputMarge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikelnummer: " + inputItemNumber);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;

			}




		}while(inputMarketplace!=25);




	}

}
