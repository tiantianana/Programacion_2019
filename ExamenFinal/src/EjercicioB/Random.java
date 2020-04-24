package EjercicioB;

public class Random {

    public int getRandomIntRange(int minimo,int maximo){

        int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
    }
}
