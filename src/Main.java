public class Main{
    public static void main(String args[]){

        //======

        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        promedio avg = new promedio(nums);
        System.out.println("Promedio: "+avg.FloatPromedio());

        //======

        calculadora calc = new calculadora();
        System.out.println("Calculadora: ");
        for(int i=0; i<10; i++){
            System.out.println(calc.fibonacci(i));
        }   

        //======

        esPrimo nump = new esPrimo();
        System.out.println("esPrimo: ");
        for(int indice = 0;indice<nums.length;indice++){ 
            System.out.println(nums[indice]+"-->"+nump.primo(nums[indice]));
        }

        //======
    }
}
