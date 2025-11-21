public class prueba {
    public static void main(String[] args) {
    int n=60;
    int cont=0;
    int div=1;
    for(int i=2;i<=60;i++){
        cont=0;
        while(n%i==0)
        {
            n/=i;
            cont++;

        }
        if (cont>0){
            System.out.println("El divisor "+i+" se repite "+ cont+" veces");
        }
        if(n==1) break;
    }
    }
}
