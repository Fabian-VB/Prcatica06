public class Parametros{
  public static void main(String[] args){

    int x = 5;
    //Llamamos el metodo
    metodo(x);
    //El metodo no modifica la variable original
    System.out.println("La variable a sigue valiendo " + x);



    int num[] = new int[3];
    //Un objeto tiene una direccion de memoria que es esta
    System.out.println("Fuera del metodo, la direccion del array es " + num);

    //Llamamos el metodo, con el parametro la direccion del array por paso de parametro por valor
    rellenaArray(num);

    //Accedemos al contenido del array
    System.out.println("El primer valor de array es " + num[0]);
    System.out.println("El segundo valor de array es " + num[1]);
    System.out.println("El tercer valor de array es " + num[2]);
  }
  
//------------------------------------------------------------------------------

  public static void metodo(int x){
    //Modificamos el parametro pasado por valor
    x = 10;
  }

  public static void rellenaArray(int num[]){
    System.out.println("Dentro del metodo, la direccion del array es " + num);
    //Aqui modifica el "a" lo que apunta el array, pero la direccion es la misma
    for (int i=0; i<num.length; i++){
      num[i]=i;
    }
  }

}
