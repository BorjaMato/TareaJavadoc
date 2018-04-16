/*
 * Cálculo de interés simple = capital * redito * tiempo/100.
 * El capital y el tiempo son >0.
 * El redito puede ser negativo o cero.
 * autor: profesor
 */
package proyecto_interes;

/**
 * Los intereses
 * @author uadmin
 * @version 1.0.1
 */
public class Interes {

    /**
     * Esta es la clase Interes donde esta x capital redito y tiempo
     */
    public int x=2;
    private float capital;
    private float redito;
    private int tiempo;

    /**
     * este es el constructor
     * @param capital capital
     * @param redito redito 
     * @param tiempo tiempo
     */
    public Interes(float capital, float redito, int tiempo) {        
        this.capital=capital;
        this.redito=redito;
        this.tiempo=tiempo;
    }

    /**
     *
     * @return double captial*reduto*tiempo/100
     * @throws Exception
     */
    public double CalcularInteres()throws Exception{
        if (capital<=0)
            throw (new Exception ("Error. El capital tiene que ser >=0"));
        if (tiempo<=0)
            throw (new Exception ("Error. El interés tiene que ser >=0"));
        x=25;
        return (double)capital*redito*tiempo/100;
    }
}
