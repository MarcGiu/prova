////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    // Converte i numeri interi nel range [1,1000] in numeri romani
    public static String convert(int number){

        if (number<1 || number>1000) {
            throw new IllegalArgumentException(number + " is not in range [1,1000]");
        }

        String roman="";

        while (number!=0){
            if (number>=1000){
                roman=roman+"M";
                number=number-1000;
            }
            else if (number>=900){
                roman=roman+"CM";
                number=number-900;
            }
            else if (number>=500){
                roman=roman+"D";
                number=number-500;
            }
            else if (number>=400){
                roman=roman+"CD";
                number=number-400;
            }
            else if (number>=100){
                roman=roman+"C";
                number=number-100;
            }
            else if (number>=90){
                roman=roman+"XC";
                number=number-90;
            }
            else if (number>=50){
                roman=roman+"L";
                number=number-50;
            }
            else if (number>=40){
                roman=roman+"XL";
                number=number-40;
            }
            else if (number>=10){
                roman=roman+"X";
                number=number-10;
            }
            else if (number>=9){
                roman=roman+"IX";
                number=number-9;
            }
            else if (number>=5){
                roman=roman+"V";
                number=number-5;
            }
            else if (number>=4){
                roman=roman+"IV";
                number=number-4;
            }
            else {
                roman=roman+"I";
                number--;
            }
        }

        return roman;
    }
}
