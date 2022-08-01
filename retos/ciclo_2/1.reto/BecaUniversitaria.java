// package co.edu.utp.misiontic2022.reto1.p45;

public class BecaUniversitaria {
  private int tiempo;
  private double monto;
  private double interes;

  public BecaUniversitaria(int tiempo, double monto, double interes) {
    this.tiempo = tiempo;
    this.monto = monto;
    this.interes = interes;
  }

  public BecaUniversitaria() {
  }

  public double calcularInteresSimple() {
    double interesSimple = monto * (interes / 100) * tiempo;
    return interesSimple;
  }

  public double calcularInteresCompuesto() {
    double interesCompuesto = monto * (Math.pow(1 + (interes / 100), tiempo) - 1);
    return interesCompuesto;
  }

  public String compararInversion(int pTiempo, double pMonto, double pInteres) {
    this.tiempo = pTiempo;
    this.monto = pMonto;
    this.interes = pInteres;

    double inversion = calcularInteresCompuesto() - calcularInteresSimple();
    String mensaje = "";

    if (inversion > 0) {
      mensaje = "La diferencia entre la proyección de interés compuesto e interés simple es: $" + Math.round(inversion);
    } else {
      mensaje = "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }

    return mensaje;
  }

  public String compararInversion() {
    double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
    String mensaje = "";

    if (diferencia > 0) {
      mensaje = "La diferencia entre la proyección de interés compuesto e interés simple es: $"
          + Math.round(diferencia);
    } else {
      mensaje = "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }

    return mensaje;
  }
}