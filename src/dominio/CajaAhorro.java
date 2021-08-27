
package dominio;

public class CajaAhorro {
    private String nombre;
    private double saldo;
    private static int contador_int;
    private int nroCuenta;
   
    public CajaAhorro(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.nroCuenta = CajaAhorro.contador_int++;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
     public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
    public void retirar(double valor) {
        this.saldo = this.saldo - valor;
    }
}
