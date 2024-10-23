class Codigo10{
    public static void main(String[] args) {
        int [] nums = {10,20,30,40,50,60,70,80,90,100};//Se declara el arreglo
        imprimirArreglo(nums);//Llamamos a la funcion

    }
    public static void imprimirArreglo(int[] arreglo) {//Se hace la funcion
        for (int i = 0; i < arreglo.length; i++) {//Se usa la iteracion
            System.out.println(arreglo[i]);//Se imprime
        }
    }

}