package Cuentas;

/**
 *
 * @author 34655
 */
public class CCuenta{

    /**
    *Devuelve el nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * Cambia el nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
    * Devuelve la cuenta
    */
    public String getCuenta() {
        return cuenta;
    }

    /**
    * Cambia la cuenta
    */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
    * Devuelve el salario actual
    */
    public double getSaldo() {
        return saldo;
    }

    /**
    * Cambia el salario
    */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
    *Devuelve el Tipo de interes
    */
    public double gettipointeres() {
        return tipointeres;
    }

    /**
    * Cambia el tipo de interes
    */
    public void settipointeres(double tipointeres) {
        this.tipointeres = tipointeres;
    }


    private String nombre; /** Aqui declara el tipo de variable nombre */
    
    private String cuenta; /** Aqui declara el tipo de variable saldo  */
   
    private double saldo; /** Aqui declara el tipo de variable saldo */
     
    private double tipointeres; /** Aqui declara el tipo de variable tipointerés */

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)  
    {    
        nombre =nom; /**Nombre del usuario*/
        cuenta=cue; /**La cuenta*/
        saldo=sal; /**EL saldo de la cuenta*/
    }
/**
* Estado , devolveria el saldo
*/
    public double estado()
    {
        return getSaldo();
    }
/**
* Este metodo es el de ingresar, verifica que la cantidad no es menor que 0 , si es menor que 0 dara error
* 
*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
* Este es el metodo de retirar dinero , primero verificara que la cantidad a retirar es mayor o igual que 0
* Y despues verificara si la cantidad actual de la variable estado es menor que la cantidad a retirar
*
*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
