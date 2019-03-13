package learning_chapter2;

import java.util.Scanner;

public class Main {
 
  public static void main(String[] args) {
	  String str1 = "shaun"; 
	  str1 += " is  dhamna";
	  System.out.println(str1.charAt(2));
	  StringBuilder sbfirst = new StringBuilder();
	  sbfirst.append(true);
	  sbfirst.append(false);
	  sbfirst.insert(3, 'b');
	  
	  System.out.println("Enter String");
	  Scanner scan  = new Scanner(System.in);
	  System.out.println(scan);
	  char[] name1 = {'J', 'a', 'v', 'a'};
	  sbfirst.insert(0, name1);
	  System.out.println(sbfirst); 
	  
	  String Str = getProtectedStatement();
	  System.out.println(Str);
  }
  
 public static String getProtectedStatement(){  
      String pstatmnt1 = new StringBuilder()
      .append("select suscust.ZEITID as 'Scoring ID',\n")
      .append("allcust.INSTITUTSNR as 'Institute',\n")						
      .append("allcust.KU_KZE_02 as 'Direction commerciale',\n")
      .append("allcust.BANKORG as 'Agence',\n")
      .append("allcust.FK_BETRNR as 'CC',\n")
      .append("suscust.KUNDNR as 'Client ID',\n")
      .append("allcust.NACHNAME as 'Nom',\n")
      .append("allcust.VORNAME as 'Prénom',\n")
      .append("allcust.KU_ART as 'Type de client',\n")
      .append("allcust.RISIKOKLASSE as 'Classe de risque',\n")	
      .append("suscust.GESAMTSCORE as 'Score',\n")
      .append("suscust.LSCOREDAT as 'Date de suspicion',\n")
      .append("STRING_AGG (allhits.INDIZID, ',') as 'Indicateurs',\n")
      .append("cases.VFA_LFD_NR as 'N° cas',\n")
      .append("vorfall.ERFASSER as 'Initiateur',\n")
      .append("allcust.KU_KZE_01 as 'Code Marché',\n")
      .append("allcust.KUSY as 'Secteur dactivité',\n")
      .append("suscust.KD_SP_02 as 'Code PCS',\n")	
      .append("allcust.NAT_LAND as 'Nationalité',\n")
      .append("allcust.H_LAND as 'Résidence',\n")
      .append("allcust.V_LAND as 'Domicile'\n")	
      .toString();
      String pstatmnt2 = "from [CLIENT].[GWAKUNDE] as suscust left join [CLIENT].[GWASCORE] as allhits \n"
                      +"on suscust.INSTITUTSNR = allhits.KD_INSTITUTSNR \n"
                      +"and suscust.KUNDNR = allhits.KD_KUNDNR \n"
                      +"and suscust.ZEITID = allhits.ZEITID \n"
                      +"left join [CLIENT].[GWGKUNDE] as allcust \n"
                      +"on suscust.INSTITUTSNR = allcust.INSTITUTSNR \n"
                      +"and suscust.KUNDNR = allcust.KUNDNR \n"
                      +"and allcust.HISTBIS = '9999' \n"
                      +"left join [CLIENT].[CVFAAUFF] as cases\n"
                      +"on suscust.INSTITUTSNR = cases.INSTITUTSNR\n"
                      +"and suscust.KUNDNR = cases.KUNDNR \n"
                      +"and suscust.ZEITID = cases.ZEITID \n"
                      +"and suscust.ORGEINHEIT = cases.AFA_ORGEINHEIT \n"
                      +"and cases.HISTBIS = '9999' \n";
      return pstatmnt1+pstatmnt2;
      
  }


 	  
}
