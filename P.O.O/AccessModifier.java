class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        ContaBancaria acc = new ContaBancaria();
        acc.depositar(55.0);
        acc.depositar(129.0);
        System.out.println(acc.getSaldo());
    }
}