public class CuentaBancaria {
    
    //Atributos
    private String titular;
    private String numeroCuenta;
    private double saldo;

    //Constructor por defecto
    public CuentaBancaria() {
        this.titular = "Sin Titular";
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
    }

    //Constructor parametrado
    public CuentaBancaria (String titular, String numeroCuenta, double saldo){
        //Validaciones
        if(titular == null){
            System.out.println("EL titular no puede estar vacio");
        }  
        if(numeroCuenta.length() < 6){
            System.out.println("El numero de cuenta debe tener al menos 6 digitos.");
        }
        if (saldo < 0){
            System.out.println("El saldo no puede ser negativo");
        }

        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //getters y setters
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }


    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setNUmeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }


    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double Saldo){
        this.saldo = Saldo;
    }


    //M todo depositar
    public void depositar(double monto){
        if (monto > 0){
            this.saldo += monto;
        }
    }

    //M retirar
    public void retirar(double monto){
        if (saldo >= monto){
            saldo -= monto;
        }
    }

    //M todo toString
    public String toString(){
        return "CUENTA BANCARIA [ Titular: " + titular + "Numero De Cuenta: " + numeroCuenta + "Saldo De La Cuenta: " + saldo +;
    }
}
