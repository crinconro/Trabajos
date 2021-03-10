public class Main{
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        promedio avg = new promedio(nums);
        System.out.println(avg.IntPromedio());
        calculadora calc = new calculadora();
        for(int i=0; i<10; i++){
            System.out.println(calc.fibonacci(i));
        }        
        for(int indice = 0;indice<nums.size();indice++){
            esPrimo nump = new esPrimo(nums.get(indice));
        }
    }
}
