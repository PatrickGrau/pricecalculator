
/**
 BUG TRACKING:

 #1 Abbruch in der Whileschleife (Eingabe 25) funktioniert nicht


 Features nice to have:

 EAN prüfen  12 oder 13 stellig
 */
public class Main
{
	public static void main(String [] args)
	{
		int InputMarketplace;
		int itemEAN = 0;
		int invalid;
		int invalid2;
		double inputPurchasePrice = 0;
		double salesPriceNet;
		double salesPriceGross;
		double shippingCostNet;
		double marge;
		double marketplaceChargePercent;
		double marketplaceChargeValue;
		double itemVAT = 0;

		do
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Preiskalkulator v. 0.8 von Patrick Grau");
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

				InputMarketplace = In.readInt();

				if (InputMarketplace > 25)
				{
					System.out.println("Ungültige Eingabe");
					invalid = 1;
				}
				else if (InputMarketplace < 0)
				{
					System.out.println("Ungültige Eingabe");
					invalid = 1;
				}
				else
				{
					System.out.println("Bitte geben Sie die EAN des Artikels ein: ");
					itemEAN = In.readInt();

					System.out.println("Bite geben Sie den Einkaufspreis (netto) ein: ");
					inputPurchasePrice = In.readDouble();

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
					invalid = 0;
				}
			}while(invalid == 1);


			switch(InputMarketplace)
			{
				case 0:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 1:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 2:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 3:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 4:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 5:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 6:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 7:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 8:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 9:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 10:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 11:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 12:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 13:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 14:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 15:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 16:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 17:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 18:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 19:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 20:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 21:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 22:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 23:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;
				case 24:
					marge = 1.1;
					shippingCostNet = 0;
					marketplaceChargePercent = 1.12;
					marketplaceChargeValue = 0.35;
					salesPriceGross = ((((inputPurchasePrice + shippingCostNet)*itemVAT)*marge)*marketplaceChargePercent)+marketplaceChargeValue;
					salesPriceNet = salesPriceGross / itemVAT;

					System.out.println("Artikel - EAN: " + itemEAN);
					System.out.println("Verkaufspreis Netto: " + salesPriceNet);
					System.out.println("Verkaufspreis Brutto: " + salesPriceGross);
					break;

			}




		}while(InputMarketplace!=25);




	}

}
