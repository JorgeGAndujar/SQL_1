
package ExpresionRegular;

import java.util.Scanner;

public class Principal3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    ejemplo15();
    }
    public static void ejemplo1 (){
         String cadena = "";
         String patron = "\\d+";
         boolean correcto;
            
        do{
            
            System.out.println("Ingrese una cadena?");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if(!correcto)
                System.out.println("NO ES UN NUMERO ENTERO VUELVE INGRESAR");
            
                        
            
        }while(!correcto);
        
    }
    //VALIDAR QQUE NO ES UN NUMERO
    public static void ejemplo2 (){
         String cadena = "";
         String patron = "\\D+";//^[0-9]
         boolean correcto;
            
        do{
            
            System.out.println("Ingrese una cadena?");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if(!correcto)
                System.out.println("TIENE UN DIGITO, VUELVE INGRESAR");
            
                        
            
        }while(!correcto);
        
    }
    //VALIDAR UNA CADENA SIN ESPACIOS EN BLANCO
     public static void ejemplo3 (){
         String cadena = "";
         String patron = "\\S+";//^[]
         boolean correcto;
            
        do{
            
            System.out.println("Ingrese una cadena?");
            cadena = sc.nextLine();
            correcto = cadena.matches(patron);
            if(!correcto)
                System.out.println("TIENE ESPACIOS EN BLANCO, VUELVE INGRESAR");              
            
        }while(!correcto);
        
     }
     //ELIMINAR muchos ESPACIOS EN BLANCO y remplazarlos con un solo espacio
     public static void ejemplo4 (){
         String cadena = "";
         String patron = "\\s+";//DE UNO A MÁS ESPACIOS EN BLANCO
         String CadenaSinEspacios;
         System.out.println("Ingrese una cadena con espacios en blanco?");
         cadena = sc.nextLine();// Walter     Ismael   Sagastegui
         CadenaSinEspacios = cadena.replaceAll(patron," ");
         System.out.println(cadena);              
         System.out.println(CadenaSinEspacios);              
   
     }
      //ELIMINAR numeros, remplazarlos por algo
     public static void ejemplo5 (){
         String cadena = "";
         String patron = "\\d+";//DE UNO A MÁS DIGITOS
         String CadenaLimpia;
         System.out.println("Ingrese una cadena con espacios en blanco?");
         cadena = "Luis tiene 25 años y Carmen 40 y sus telefonos son 6767777221 y 888888888" ;
         CadenaLimpia = cadena.replaceAll(patron,"XXXX");
         System.out.println(cadena);              
         System.out.println(CadenaLimpia);              
   
     }
     public static void ejemplo6() {
         //HACER ESPACIOS CON CADA LETRA MAYUSCULA
        Scanner scan = new Scanner(System.in);
        String cadena = "";
        String patron = "(?<!^)(?=[A-Z])";
        String cadenaConEspacios;

        System.out.print("Ingrese una cadena: ");
        cadena = scan.nextLine();  // Ejemplo: MihaiIoniMatei
        cadenaConEspacios = cadena.replaceAll(patron, " ");
        System.out.println("Cadena original: " + cadena);
        System.out.println("Resultado: " + cadenaConEspacios);
     }  
        //(2) ER que coincida con cadenas que inician en 'ab' y continuan con cero o mas caracteres cualquiera
         public static void ejemplo7 (){
         String cadena = "";
         String patron = "ab.*";//
         boolean correcto;
            
        do{
            
            System.out.println("Ingrese una cadena?");
            cadena = sc.nextLine();
            correcto = cadena.matches(patron);
            if(!correcto)
                System.out.println("no cumples con patron VUELVE INGRESAR");              
            
        }while(!correcto);
        
        }
        
        //BUSCAR UNA PALABRA EN UN TEXTO
         public static void ejemplo8() {
        String texto = "";
        boolean correcto;
        String textoCorrecto = null;
        String patron = ".*ERROR.*";
        String patron1 = "ERROR";
        texto = "En un puerto ERROR ItalERRORiano al pie de la ERRORmontaña.";  
        correcto = texto.matches(patron);
        if(correcto){
            textoCorrecto = texto.replaceAll(patron1, "");
        }
        System.out.println(texto);
        System.out.println(textoCorrecto);
        }
          //VALIDAR UNOS AÑOS---> OR |
         public static void ejemplo9 (){
         String cadena = "";
         String patron = "(191[6-8]|200[0123])";//
         boolean correcto;
            
        do{
            
            System.out.println("Ingrese una cadena?");
            cadena = sc.nextLine();
            correcto = cadena.matches(patron);
            if(!correcto)
                System.out.println("no cumples con patron VUELVE INGRESAR");              
            
        }while(!correcto);
        
      }
         //HACER UN PROGRAMA QUE GENERE UN PASWORD ALEATORIO
         //DE 8 CARACTERES
         //INCLUIR SOLAMENTE ESTOS CARACTERES"A-Z 0-9 ? = # & %"
         //ADEMAS EL PROGRAMA SI ES SOLO LETRAS TE LO DA INCORRECTO
         public static void ejemplo10 (){
         String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789=#&%";
         int longitud = simbolos.length()-1;//
         char[] password = {' ',' ',' ',' ',' ',' ',' ',' '};
         String clave = "";
         String patron = "[A-ZÑ]{8}";
         for(int i=0; i<8; i++){
             int na =(int)(Math.random()*longitud);
             char letra = simbolos.charAt(na);//String.valueOf(simbolos.charAt(na))
             System.out.print(letra + " ");
             password[i] = letra;
         }
         clave = String.valueOf(password);
         if(clave.matches(patron)){
             System.out.println(clave + "CLAVE INCORRECTA");
             
         }else {
             System.out.println(clave + "CLAVE CORRECTA");
         }
             
         
      }
            //GENERAR UNA CONTRASEÑA CON PATRON
         public static void ejemplo11 (){
         String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789=#&%";
         int longitud = simbolos.length()-1;//
         char[] password = {' ',' ',' ',' ',' ',' ',' ',' '};
         String clave = "";
         String patron = "[A-ZÑ]{8}";
         do{
            for(int i=0; i<8; i++){
             int na =(int)(Math.random()*longitud);
             char letra = simbolos.charAt(na);//String.valueOf(simbolos.charAt(na))
             System.out.print(letra + " ");
             password[i] = letra;
            }
             clave = String.valueOf(password);
         }while(clave.matches(patron));//VERDADERO SE REPITE
         System.out.println(clave);
             
     }    
            //GENERAR UNA CONTRASEÑA CON PATRON DE MINIMO 8 Y MAX 12
         public static void ejemplo12 (){
         String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789=#&%";
         int [] tamaño = {8,9,10,11,12};
         int ta = (int)(Math.random()*tamaño.length);//tamaño aleatorio
         int longitud = simbolos.length();
         char[] password = new char[tamaño[ta]]; 
         String clave = "";
         String patron = "[A-ZÑ0123456789]{" + ta + "}";
         do{
            for(int i=0; i<tamaño[ta]; i++){
             int na =(int)(Math.random()*longitud);
             char letra = simbolos.charAt(na);//String.valueOf(simbolos.charAt(na))
             //System.out.print(letra + " ");
             password[i] = letra;
            }
             clave = String.valueOf(password);
         }while(clave.matches(patron));//VERDADERO SE REPITE
         System.out.println(clave);
             
     }  
             public static void ejemplo13 (){
         String cadena = "";
         String patron = "[+-]?[0-9]+";
         boolean correcto;
            
        do{
            
            System.out.println("Ingrese una cadena?");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if(!correcto)
                System.out.println("NO ES UN NUMERO ENTERO VUELVE INGRESAR");
            
                        
            
        }while(!correcto);
        
    }
         //VALIDAR UN ENTERO Y PUNTO FLOTANTE
                 public static void ejemplo14 (){
         String cadena = "";
         String patron = "[+-]?[0-9]+|([+-]?[0-9]+\\.,[0-9]+)";
         boolean correcto;
            
        do{
            
            System.out.println("Ingrese una cadena?");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if(!correcto)
                System.out.println("NO ES UN NUMERO ENTERO VUELVE INGRESAR");
            
                        
            
        }while(!correcto);
        
    }
                 
         //EXPRESION REGULAR PARA RECONOCER CORREOS DE HOTMAIL, GMAIL Y YAHOO.
                 public static void ejemplo15 (){
         String cadena = "";
         String patron = "[a-zA-Z0-9._%+-]+@(gmail|hotmail|yahoo)+\\.(com|es)";
         boolean correcto;
            
        do{
            
            System.out.println("Ingrese un CORREO?");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if(!correcto)
                System.out.println("NO ES VÁLIDO, VUELVE INGRESAR");
            
                        
            
        }while(!correcto);
        
    }
           
         
         
     
}
     
