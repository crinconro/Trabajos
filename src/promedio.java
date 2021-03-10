//esta clase saca promedios de numeros enteros

public class promedio{
    int sum=0;
    int size;
    public promedio(int[] numbers){
        this.size=numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            this.sum+=numbers[i];
        }
    }
    public int IntPromedio(){
        return (this.sum)/this.size;
    }
    public float FloatPromedio(){
        
        return (float)this.sum/this.size;
    }
    public Double DoublePromedio(){
        return (double) this.sum/this.size;
    }
}