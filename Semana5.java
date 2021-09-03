/*1.Aumente a quantidade de números que terão os fatoriais
 impressos, até 20, 30, 40. Em um determinado momento,
 além desse cálculo demorar, vai começar a mostrar
 respostas completamente erradas. Por quê? Mude de
  int para long para ver alguma mudança no caso do
   fatorial de 20? e de 30 e 40?*/
public class Semana5{
    public static void main(String[]args){//ags de argumento pode ser outro nome
//fazer fatorial,testar 20; 30;40
//20*19*18*17*....5*4*3*2*1
/*--int recebe uma quant limitada de número...
int fatorial = 1;
for (int ft=5; ft>=1;ft--){
    fatorial = f*fatorial;
}
---long também tem uma limitação com números BIG
long fatorial = 1;
for (int ft=20; ft>=1;ft--){
    fatorial = ft*fatorial;
}----Sugestão é o float
float fatorial = 1;
for (int ft=30; ft>=1;ft--){
    fatorial = ft*fatorial;
}
System.out.println(fatorial);

/*2.Escreva um programa que, dada uma variável x 
com algum valor inteiro, temos um novo x de acordo
 com a seguinte regra: se x é par, x = x / 2
se x é impar, x = 3 * x + 1  imprime x
O programa deve parar quando x tiver o valor final
 de 1. Por exemplo, para x = 13 , a saída
será:
40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

int x = 13;
while (x !=1){
 if (x%2==0){
     x = x/2;
     else {
         x = 3*x+1;
     }
     System.out.print(x +"->");
 }
}
3. Imprima a seguinte tabela, usando for s encadeados:
1
2 4
3 6 9
4 8 12 16
Regra
n n*2 n*3 .... n*n*/
int n = 1;
int i = 1;
int n1 =1;
System.out.println(n);
	for (n=2; n<= 4; n+=2) {
        System.out.print(n+" ");       
       i=n*2;       		
		}       
        for (n1=3; n1<=9; n1+=3){
            System.out.println("");// não tirar quebrou a linha
            i=n*3;              
             System.out.print(n1+" "); 
             //System.out.print("");                
        }
       for (n=4; n<=16; n+=4){
            //System.out.println("");
            i=n*4;              
             System.out.print(n+"\n ");                  
        }
        //CERTOOOOOOOO
	
    
    }
}