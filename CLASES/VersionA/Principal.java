package VersionA;
public class Principal {
    public static void main(String[] args){
        System.out.println("Creando cuenta 1 de banco");
        CuentaBancaria cuenta1 = new CuentaBancaria("Denzel Mora","123456",0.0);
        System.out.println(cuenta1.toString());

        cuenta1.depositar(500);
        
        cuenta1.retirar(200);
        

        System.out.println(cuenta1.toString());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Creando cuenta 2 de banco");
        CuentaBancaria cuenta2 = new CuentaBancaria("","12345",-10);
        System.out.println(cuenta2.toString());

        cuenta2.depositar(20);
        
        cuenta1.retirar(30);

        System.out.println(cuenta2.toString());

        System.out.println("-------------------------------------------------------------");
    }
}
