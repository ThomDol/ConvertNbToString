package fr.td;

public class StringUtil {
    private static final String [] UNITE = {"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
    private static final String [] DIZAINE= {"dix","onze","douze","treize","quatorze","quinze","seize", "dix sept","dix huit","dix neuf"};
    private static final String [] DIZAINE_SPEC={"","","vingt","trente","quarante","cinquante","soixante","soixante","quatre vingt","quatre vingt"};
    private static final int [] PALLIER = {ePower(9),ePower(6),ePower(3),ePower(0)};
    private static final String [] LIBELLE = {"milliard","million","mille",""};
    private StringUtil(){}

    public static String fizzBuzz (int n){
        if(n==0){return "0";}
        if (n%15==0){return "fizzBuzz";}
        if (n%3==0){return "fizz";}
        if (n%5==0){return "buzz";}
        return String.valueOf(n);
    }


    private static String transformToLiteral(String res, int n) {
        for(int i=0;i<PALLIER.length;i++){
            int unitValue = n/PALLIER[i];

            if(i==2 && unitValue==1 ){res=separator(res,LIBELLE[i]);}
            else{
                switch(i){
                    case 3 :
                    res = unitValue>0?separator(res,tripletDisplay(unitValue)+LIBELLE[i]):res;
                    if(res.length()>4){
                        res = (res.substring(res.length()-4).equals("cent")&&unitValue>1)?plural(res):res;}
                    break;
                    case 2 :
                    res = unitValue>0?separator(res,tripletDisplay(unitValue)+" "+LIBELLE[i]):res;

                    break;
                    default :
                    res = unitValue>0?separator(res,tripletDisplay(unitValue)+" "+(unitValue>1?plural(LIBELLE[i]):LIBELLE[i])):res;
                }}

            n=n-unitValue*PALLIER[i];}



        return res;

    }

    private static int ePower(double nb){
        return (int)Math.pow(10,nb);
    }


    private static String tripletDisplay(int n){
        String result="";
        int unite = n%10;
        int dizaine = (n%100-unite)/10;
        int centaine = (n%1000-dizaine)/100;

        if (centaine==0){result ="";}
        if(centaine>=1){result+=(centaine==1)?"cent":UNITE[centaine]+" "+"cent";}


        if (dizaine>=2) {
              String resTemp="";
            switch (unite){
                case 0:
                    if(dizaine<7){
                        resTemp =  DIZAINE_SPEC[dizaine]; }
                    else if (dizaine==8){resTemp =  DIZAINE_SPEC[dizaine]+"s"; }
                    else{resTemp =  DIZAINE_SPEC[dizaine]+" "+DIZAINE[0]; }
                    break;
                case 1:
                    resTemp=dizaine<=7?(dizaine<7?DIZAINE_SPEC[dizaine]+" et "+UNITE[1]:DIZAINE_SPEC[dizaine]+" et "+DIZAINE[1]):(dizaine==8?DIZAINE_SPEC[dizaine]+" "+UNITE[1]:DIZAINE_SPEC[dizaine]+" "+DIZAINE[1]);

                    break;
                default:
                    resTemp=(dizaine<7 || dizaine==8)?DIZAINE_SPEC[dizaine]+" "+UNITE[unite]:DIZAINE_SPEC[dizaine]+" "+DIZAINE[unite];



            }
            result=separator(result,resTemp);
        }
        if(dizaine==1 ){result =  separator(result,DIZAINE[unite]);}
        if(dizaine==0) {
            if (unite != 0 )  {
                result = separator(result,UNITE[unite]);
            }
        }
        return result;
    }

    private static String plural (String nom){
      return nom+"s";
    }

    private static String separator(String nom1,String nom2){
        String res="";
        if(!nom1.isEmpty() && !nom2.isEmpty()){res=nom1+" "+nom2;}
        else{res=nom1+nom2;}
        return res;
    }



    public static String toLiteral (int n){
        String nombre = "";

        if (n==0){return "zéro";}


        nombre = transformToLiteral(nombre,n);




        return nombre;
    }

}
