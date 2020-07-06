import java.util.Scanner;
import java.util.*;

public class Pila 
{
public int PilaA[];
public int PilaB[];
public int tope,MAX;
public Pila(int Max)
{
    Max=200;
    MAX=Max;
    PilaA=new int[MAX];
    tope=0;
    PilaB=new int[MAX];
}

public int LlenarA()
{
    int a;
    Scanner teclado=new Scanner(System.in);
    System.out.println("\n De que tamaño es su pila");
    a=teclado.nextInt();
    Pila Pila1=new Pila(a);
    Scanner datos=new Scanner(System.in);
    System.out.println("\n Cuantos datos ingresara");
    int ingresar=datos.nextInt();
    if(ingresar<=a)
    {
       int numaleatorios;
       int Resultados;
       for(int i=0;i<a;i++)
       {
           numaleatorios=(int)(Math.random()*400-200);
           PilaA[tope]=numaleatorios;
           Resultados=PilaA[tope];
           tope++;
           System.out.println("Se añadieron datos a la pila A");
       }
    }
    else
            {
             if(ingresar>a)
             {
                 System.out.println("Verifique sus datos");
             }
            }
    return 0;
}

public boolean Vacia()
{
    if(PilaA==null)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public void Desplegar()
{
    if(!Vacia())
    {
        for(int i=(tope-1);i>=0;i--)
        {
            int Mostrar;
            Mostrar=(PilaA[i]);
            System.out.println(Mostrar);
        }
    }
    else
    {
       System.out.println("Esta vacia su pila");
    }
}

public void VaciarA()
{
    if(tope>0)
    {
        tope--;
        System.out.println("Se elimino un dato");
    }
    else
    {
        System.out.println("Esta vacia la pila");
    }
}

public int LlenarB()

{
    int b;
    Scanner teclado=new Scanner(System.in);
    System.out.println("De que tamaño sera su pila B");
    b=teclado.nextInt();
    Pila Pila2=new Pila(b);
    Scanner  leer=new Scanner(System.in);
   System.out.println("Cuantos datos ingresara a su pila B");
   int ingresar=leer.nextInt();
   if(ingresar<=b)
   {
       int aleatorio;
       int Resultados;
       for(int i=0;i<ingresar;i++)
       {
           aleatorio=(int)(Math.random()*400-200);
           PilaB[tope]=aleatorio;
           Resultados=PilaB[tope]=aleatorio;
           tope++;
     System.out.println("\n Se añadieron datos a su pila b");

       }
   }
   else 
   {
       if(ingresar>b)
       {
           System.out.println("\n Verifique sus datos");
       }
   }
    return 0;
}
public boolean VaciaB()
{
    if(PilaB==null)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public void DesplegarB()
{
    if(!VaciaB())
    {
        for(int i=(tope-1);i>=0;i--)
        {
            int B;
            B=(PilaB[i]);
            System.out.println(B);
        }
    }
    else
    {
       System.out.println("esta vacia su pila B");
    }
}
public void VaciarB()
{
    if(tope>0)
    {
        tope--;
        System.out.println("Dato eliminad");
    }
    else
    {
        System.out.println("La pila esta vacia");
    }
}


    public static void main(String[] args) 
    {
       int x=0;
      int opcion;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Pila:Practica 3");
      Pila PilaA=new Pila(x);
      Pila PilaB=new Pila(x);
      do
      {
            System.out.println("1.-Pila A");
            System.out.println("2.-Pila B");
            System.out.println("3.-PILA C");
            System.out.println("4.-SALIR");
            opcion=teclado.nextInt();
            switch(opcion)
            {
                case 1:
                {
                    int A;
                    System.out.println("\n Pila A");
                System.out.println("1.-Llenar");
                System.out.println("2.-Mostrar");
                System.out.println("3.-Vaciar");
                System.out.println("4.-Salir"); 
                A=teclado.nextInt();
                switch(A)
                {
                    case 1:
                    {
                         System.out.println("\n "); 
                        PilaA.LlenarA();
                    }
                    break;
                    case 2:
                    {
                        System.out.println("\n "); 
                        PilaA.Desplegar();
                    }
                    break;
                    case 3:
                    {
                        System.out.println("\n "); 
                        PilaA.VaciarA();
                    }
                }
                }
                break;
                
          
                case 2:
                {
                    int B;
                    System.out.println("\n Pila B");
                System.out.println("1.-Llenar");
                System.out.println("2.-Mostrar");
                System.out.println("3.-Vaciar");
                System.out.println("4.-Salir"); 
                    B=teclado.nextInt();
                    switch(B)
                    {
                       
                        case 1:
                    {
                         System.out.println("\n "); 
                        PilaB.LlenarB();
                    }
                    break;
                    case 2:
                    {
                        System.out.println("\n "); 
                        PilaB.DesplegarB();
                    }
                    break;
                    case 3:
                    {
                        System.out.println("\n "); 
                        PilaB.VaciarB();
                    }
                      
                    }
                }
                break;
                
               
                
                case 3:
                {
                   int C;
                System.out.println("\n Pila C");   
                System.out.println("1.-Mostrar");
                C=teclado.nextInt();
               switch(C)
               {
                   case 1:
                   {
                       System.out.println("\n ");               
                       PilaA.Desplegar();
                       PilaB.DesplegarB();
                   }
                   break;
               }
                }
                break;
            }
      }
      while(opcion!=4);
    }
    
}
