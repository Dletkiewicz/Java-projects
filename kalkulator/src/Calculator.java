public class Calculator {
    int a;
    int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int dodaj() {
        return this.a + this.b;
    }

    int odejmij() {
        return this.a - this.b;
    }

    int pomnoz() {
        return this.a * this.b;
    }

    int podziel() {
        return this.a / this.b;
    }


}
