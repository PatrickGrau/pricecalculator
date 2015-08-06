
/**
 BUG TRACKING:

 #1 ???


 Wichtige Änderungen, die erledigt werden müssen:

 #1 CSV Export


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
			System.out.println("(7)Hertie");
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
					Marketplace.calcAmazon(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 1:
					Marketplace.calcCdiscount(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 2:
					Marketplace.calcDaWanda(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 3:
					Marketplace.calcFruugo(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 4:
					Marketplace.calceBay(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 5:
					Marketplace.calcGimahot(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 6:
					Marketplace.calcgrosshandeleu(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 7:
					Marketplace.calcHertie(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 8:
					Marketplace.calcHitmeister(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 9:
					Marketplace.calcHood(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 10:
					Marketplace.calcKauflux(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 11:
					Marketplace.calcLaRedoute(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 12:
					Marketplace.calcAllyouneed(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 13:
					Marketplace.calcMercateo(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 14:
					Marketplace.calcPIXmania(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 15:
					Marketplace.calcPlaycom(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 16:
					Marketplace.calcPlusde(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 17:
					Marketplace.calcRakuten(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 18:
					Marketplace.calcRestposten(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 19:
					Marketplace.calcricardo(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 20:
					Marketplace.calcShopgate(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 21:
					Marketplace.calcSumoNet(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 22:
					Marketplace.calcYatego(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 23:
					Marketplace.calcZalando(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;
				case 24:
					Marketplace.calcZentralverkauf(inputItemNumber, inputPurchasePrice, inputMarge, inputShippingCostNet, itemVAT);
					break;

			}




		}while(inputMarketplace!=25);




	}

}
