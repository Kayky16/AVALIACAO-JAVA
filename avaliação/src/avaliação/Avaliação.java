/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliação;
import java.util.Scanner;
public class Avaliação {
    public static void main(String[] args) {
        Scanner tecla = new
        Scanner(System.in);
        
        System.out.println("Gasto Energético Basal: 01 \n"
                            + "Número escrito: 02 \n"
                            + "Múltiplos: 03 \n"
                            + "Inteiros: 04 \n"
                            + "Prêmios Natal: 05 \n"
                            + "Horários: 06 \n"
                            + "Média dos números: 07 \n"
                            + "Cardápio: 08 \n"
                            + "Soma dos primeiros números: 09 \n"
                            + "Soma dos números primos: 10 \n"
                            + "Sair: 00 \n");
                int td = 11;
                
                do{
                
                    System.err.println("Digite o programa que deseja executar!");
                    
                    td = tecla.nextInt();
                    
                    switch(td){
                    
                        case 1: geb();
                        break;
                        case 2: ne();
                        break;
                        case 3: mult();
                        break;
                        case 4: inte();
                        break;
                        case 5: premio();
                        break;
                        case 6: hr();
                        break;
                        case 7: med();
                        break;
                        case 8: card();
                        break;
                        case 9: soma();
                        break;
                        case 10: primos();
                        break;
                        case 0: System.out.println("Saindo..");
                        break;
                        default: System.out.println("Insira um valor válido!");
                    }
                    }while (td != 0);
                }              
        public static void geb(){

            Scanner tecla = new Scanner(System.in);
            System.out.println("Digite 1 para calcular o Gasto " + "Energético Basal de um homem e 2 para calcular de uma mulher");
            int gen = tecla.nextInt();

            System.out.println("Digite a altura");
            double a = tecla.nextDouble();
            System.out.println("Digite o peso");
            double p = tecla.nextDouble();
            System.out.println("Digite a idade");
            double i = tecla.nextDouble();

            if(gen == 1){

            double geb = 66.47 + (13.75 * p) + (5 * a) - (6.78 * i);
            System.out.println("O GEB total é: " + geb);

            }else{

            if(gen == 2){

                double geb = 65.51 + (9.56*p)+(1.95*a)-(4.67*i);
                    System.out.println("O GEB total é: " + geb);

            }
            else
                System.out.println("Valor inválido");
        }
}
        public static void ne(){

        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro entre 0 e 999");
        int num = tecla.nextInt();
        
        String uni = "";
        int numM = num;
        int unidade = (int) numM%10;
        numM = num/10;
        int dzn = numM%10;
        String dzna = "";
        numM = numM/10;
        int cem = numM%10;
        String cent = "";
        
        if (num == 0)
            System.out.println("Zero");
        if(unidade != 0 && dzn != 1){
            switch (unidade){
                case 1: uni = "um";
                break;
                case 2: uni = "dois";
                break;
                case 3: uni = "três";
                break;
                case 4: uni = "quatro";
                break;
                case 5: uni = "cinco";
                break;
                case 6: uni = "seis";
                break;
                case 7: uni = "sete";
                break;
                case 8: uni = "oito";
                break;
                case 9: uni = "nove";
                break;
             }
         } else{
                if (dzn == 1){
                    switch(unidade){
                        case 0: uni = "dez";
                        break;
                        case 1: uni = "onze";
                        break;
                        case 2: uni = "doze";
                        break;
                        case 3: uni = "treze";
                        break;
                        case 4: uni = "quatorze";
                        break;
                        case 5: uni = "quinze";
                        break;
                        case 6: uni = "dezesseis";
                        break;
                        case 7: uni = "dezessete";
                        break;
                        case 8: uni = "dezoito";
                        break;
                        case 9: uni = "dezenove";
                        break;
                    }
                }
            }
        if (dzn != 0 && dzn !=1 && unidade ==0){
            switch (dzn){
                case 2: dzna = "vinte";
                break;
                case 3: dzna = "trinta";
                break;
                case 4: dzna = "quarenta";
                break;
                case 5: dzna = "cinquenta";
                break;
                case 6: dzna = "sessenta";
                break;
                case 7: dzna = "setenta";
                break;
                case 8: dzna = "oitenta";
                break;
                case 9: dzna = "noventa";
                break;
            }
        } else {
            if (dzn != 0 && dzn !=1 && unidade !=0){
                switch (dzn){
                    case 2: dzna = "vinte e ";
                    break;
                    case 3: dzna = "trinta e ";
                    break;
                    case 4: dzna = "quarenta e ";
                    break;
                    case 5: dzna = "cinquenta e ";
                    break;
                    case 6: dzna = "sessenta e ";
                    break;
                    case 7: dzna = "setenta e ";
                    break;
                    case 8: dzna = "oitenta e ";
                    break;
                    case 9: dzna = "noventa e ";
                    break;
                }
            }
        }
        
        if (cem != 0 && (dzn!= 0 || unidade != 0)){
            switch(cem){
                case 1: cent = "cento e ";
                break;
                case 2: cent = "duzentos e ";
                break;
                case 3: cent = "trezentos e ";
                break;
                case 4: cent = "quatrocentos e ";
                break;
                case 5: cent = "quinhentos e ";
                break;
                case 6: cent = "seiscentos e ";
                break;
                case 7: cent = "setecentos e ";
                break;
                case 8: cent = "oitocentos e ";
                break;
                case 9: cent = "novecentos e ";
                break;
            }
        }else{
            if (cem != 0 && dzn == 0 && unidade == 0){
                switch(cem){
                    case 1: cent = "cem";
                    break;
                    case 2: cent = "duzentos";
                    break;
                    case 3: cent = "trezentos";
                    break;
                    case 4: cent = "quatrocentos";
                    break;
                    case 5: cent = "quinhentos";
                    break;
                    case 6: cent = "seiscentos";
                    break;
                    case 7: cent = "setecentos";
                    break;
                    case 8: cent = "oitocentos";
                    break;
                    case 9: cent = "novecentos";
                    break;
                }
            }
        } 
        if(num!=0)
            System.out.println(cem+dzn+uni);
    }
        public static void mult(){
            
            Scanner tecla = new Scanner(System.in);
        
        System.out.println("Digite o valor de a");
        double a = tecla.nextDouble();
        System.out.println("Digite o valor de b");
        double b = tecla.nextDouble();
        
        if (a%b == 0 || b%a == 0)
            System.out.println(a + " e " + b + " são múltiplos");
        else
            System.out.println(a + " e " + b + " não são múltiplos");

        }
        public static void inte(){ 
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        double a = tecla.nextDouble();
        System.out.println("Digite o segundo número");
        double b = tecla.nextDouble();
        System.out.println("Digite o terceiro número");
        double c = tecla.nextDouble();
        
        System.out.println("Digite 1 para exibir o número em ordem crescente e 2 em ordem decrescente.");
        int in = tecla.nextInt();
        
        while (in!= 1 && in != 2){
            System.out.println("Tente novamente!");
            in = tecla.nextInt();
        }
        
        if(in==2){
        if (a>=b && b>=c)
            System.out.println(a+", "+b+", "+c);
        else if (a>=c && c>=b)
            System.out.println(a+", "+c+", "+b);
        else if (b>=a && a >=c)
            System.out.println(b+", "+a+", "+c);
        else if (b>=c && c>=a)
            System.out.println(b+", "+c+", "+a);
        else if (c>=a && a>=b)
            System.out.println(c+", "+a+", "+b);
        else if (c>=b && b>=a)
            System.out.println(c+", "+b+", "+a);
        } else         
            if(in==1){
            if (a>=b && b>=c)
                System.out.println(c+", "+b+", "+a);
            else if (a>=c && c>=b)
                System.out.println(b+", "+c+", "+a);
            else if (b>=a && a >=c)
                System.out.println(c+", "+a+", "+b);
            else if (b>=c && c>=a)
                System.out.println(a+", "+c+", "+b);
            else if (c>=a && a>=b)
                System.out.println(b+", "+a+", "+c);
            else if (c>=b && b>=a)
                System.out.println(a+", "+b+", "+c);
            }
            
        }
        public static void premio(){   
        Scanner tecla = new Scanner(System.in);

        
        System.out.println("Digite o tanto de horas extras do funcionário");
        int hre = tecla.nextInt();
        System.out.println("Digite o número de horas-falta");
        int hf = tecla.nextInt();
        
       float h = hre * 60 - (2 / 3 * (hf * 60));
       
       if (h>2400)
            System.out.println("O prêmio é de R$500");
       else if (h >= 1801)
            System.out.println("O prêmio é de R$400");
       else if (h >= 1201)
            System.out.println("O prêmio é de R$300");
       else if (h >= 600)
            System.out.println("O prêmio é de R$200");
       else 
            System.out.println("O prêmio é de R$100");
        }
        public static void hr(){     
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Digite o horário de entrada");
        int en = tecla.nextInt(); 
        
        while (en<0 && en>24){
            System.out.println("Valor inválido, digite um valor inteiro entre 0 e 24!");
            en = tecla.nextInt(); 
        }
        if (en<=18){
            int sai = en+6;
            System.out.println("O horário de saída será: "+sai+"h");
        }else if (en>18){
            int sai = en - 24 + 6; 
            System.out.println("O horário de saída será: "+sai+"h");
        }       
        }
        public static void med(){    
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Digite 4 números inteiros, caso um deles seja negativo, será calculada a média dos outros");
        int a = tecla.nextInt();
        int b = tecla.nextInt();
        int c = tecla.nextInt();
        int d = tecla.nextInt();
        
        if(a < 0){
            float media = (b+c+d)/3;
            System.out.println("Com o primeiro número sendo negativo a média dos outros números é: "+media);
        }
        if(b<0){
            float media = (a+c+d)/3;
            System.out.println("Com o segundo número sendo negativo a média dos outros números é: "+media);
        }
        if(c<0){
            float media = (b+a+d)/3;
            System.out.println("Com o terceiro número sendo negativo, a média dos outros números é: "+media);
        }
        if(d<0){
            float media = (b+c+a)/3;
            System.out.println("Com o quarto número sendo negativo, a média dos outros números é: "+media);
        }         
        }
        public static void card(){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de cachorros quentes *R$2*");
        int cd = tecla.nextInt();
        System.out.println("Digite a quantidade de refrigerantes *R$2,50*");
        int r = tecla.nextInt();
        System.out.println("Digite a quantidade de sobremesas *R$1,50*");
        int s = tecla.nextInt();
        
        float conta = (float) (2*cd + 2.5*r + 1.5*s);
        System.out.println("O valor da conta ficou: R$" + conta);
        }
        public static void soma(){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro para somarmos todos os números que o antecedem");
        int num = tecla.nextInt();
        int soma = 0;

        for (int i=0; i<=num;i++){
            soma += i;
        }
        System.out.println("A soma dos números inteiros até o que você digitou é: "+soma);
        }
        public static void primos(){
        Scanner src = new Scanner(System.in);
        
        System.out.println("Digite n números inteiros positivos para efetuar a soma dos primos: ");
        int num = src.nextInt();
        int soma = 0;
        if (num>=2)
            soma+=2;
        if (num>=3)
            soma+=3;
        if (num>=5)
            soma+=5;
        if (num>=7)
            soma+=7;
        if (num>=11)
            soma+=11;
        for (int i=2; i<=num;i++){
            if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0)
                soma+=i;
        }
        System.out.println("A soma dos primos até "+num+" é: "+soma);
    }     
}




    





