
package misrc;


public class Principal6 {//BLOQUE DE CODIGO
    
    public static void main(String[] args) {

  int c = 0;
  int c1,c2,c3,c4,c5,c6;
  
   c1 = c2 = c3 = c4 = c5 =c6=0;
    for(int i = 0; i <= 100; i++){
    int dado = (int)(Math.random()*6+1);
    System.out.print( dado +" ");
    if (c == 11){
    System.out.println();
    c = 0;
    }
 c++;
  switch (dado){
      case 1: c1++; break;
      case 2: c2++; break;
      case 3: c3++; break;
      case 4: c4++; break;
      case 5: c5++; break;
      case 6: c6++; break;
  }
    }
   System.out.println("Lado 1: " + c1);
   System.out.println("Lado 2: " + c2);
   System.out.println("Lado 3: " + c3);
   System.out.println("Lado 4: " + c4);
   System.out.println("Lado 5: " + c5);
   System.out.println("Lado 6: " + c6);
   
}    
  

    
    
    
    
    
    
   /*
    public static void main(String[] args) {
       int x = 10;
       if (x >= 1 && x <= 100){
           System.out.println("PERTENECE");
      }else {
           System.out.println("NO PERTENECE");
       }
       
     */
                
        //LANZAR DADO 100 VECES
       /*System.out.println("FOR");
            for (int i=1; i <= 100; i++) {
                int contador = (int)(Math.random()*100+ 1);
                System.out.print(contador + "  ");
        */
        
        /*
        System.out.println("FOR");
        long n = Long.MAX_VALUE;
        int contador = 1;
        for(long i = n; i>1; i=i-1){
            System.out.print(i + " ");
            if(contador == 5 ){
                System.out.println();
                contador = 1;
            }
            contador++;
    }*/
        /*
        System.out.println("FOR");
        int n = 10;
        for (int i=n; i>=1; i--){
            System.out.println(i + " ");  
            if(i == 5) System.out.println();
                
            }
        
        */
        
        
        /*
        System.out.println("FOR");
        int n = 10;
        for (int i=n; i>=1; i--){
            System.out.println(i + " ");   
                
            }
          
      }
        
        */
        
       /* 
        System.out.println("FOR");
        int i = 1;
        for (;true;){
            System.out.println(i);
            if (i == 60000){
                break;
            } 
            i++;
        }
        */
        /*{//INICIO 1
        System.out.println("WHILE");
        int i = 1;
        int n = 5;
        while(i <= n ){
            System.out.println(i);
            i++;// i = i + 1      i+=1    i++ CONTADOR
        }
      }//FIN 1
      {//INICIO 2
        System.out.println("DO-WHILE");
        int i = 1;
        int n = 5;
        do{
            System.out.println(i);
            i++;// i = i + 1      i+=1    i++ CONTADOR
        }while(i <= n );
      }//FIN 2

      {//INICIO 3
        System.out.println("FOR");
        int n = 5;
        for( int i = 1; i <= n; i++){
            System.out.println(i);
        }
        
      }//FIN 3
      {//INICIO 4
        System.out.println("FOR");
        int i = 1;
        for(;true;){
            System.out.println(i);
            i++;
        }
              
      }//FIN 4
                
      {//INICIO 4
        System.out.println("FOR");
        int n = 5;
        for(int i = 1; i > n ;i++){//ERROR SEMANTICO(ERRORES LÓGICOS)
            System.out.println(i);
        }
        
      }//FIN 4
        */
        
        
        
        
        
        
        
        
        /*TRADUCIR EL DÍA DE LA SEMANA DE NUMERO A LETRA
        1 Lunes
        2 Martes
*/
        /*
        String dialetra = "";
        int día = (int)(Math.random()* 9 +1);
        switch(día) {
            case 1: dialetra = "Lunes";break;
            case 2: dialetra = "Martes";break;
            case 3: dialetra = "Miercoles";break;
            case 4: dialetra = "Jueves";break;
            case 5: dialetra = "Viernes";break;
            case 6: dialetra = "Sabado";break;
            case 7: dialetra = "Domingo";break;
            default: System.out.print("DIA NO VALIDO ");
        }
        
        System.out.println(día + " " + dialetra);
        */
      /*
        Scanner sc = new Scanner(System.in);        
        System.out.print("Ingrese año: ");
        double anio = sc.nextDouble();
        int diames = 0;
        int mes = (int)(Math.random()* 12 +1);
        switch(mes) {
            case 1,3,5,7,8,10,12: diames = 31;break;
            case 4,6,9,11: diames = 30;break;
            case 2:
                if((anio % 4 == 0 && anio % 100 !=0)||(anio % 400 == 0)) {
                    diames = 29;
                }else {
                    diames = 28;
                }
                break;  
        }
        
       System.out.println(anio + " " + mes + " = " + diames);
       
       */
       
       
       
            
        
        
        
        
        /*
        int numero = 0;//0,5,-5
        System.out.println("Numero: " + numero );
        if (numero == 0){
             System.out.println("Cero");
        }else if (numero >0){ 
             System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
                
        }
        
             
          
            
        }
        
        //int dado  = (int)(Math.random()*6 + 1);
        //if (dado % 2 == 0){
            //System.out.println("par");
        //}else{
            //System.out.println("impar");
        //}
        
        
        //System.out.println("lado: "+ dado);
       */ 
    }   

    
