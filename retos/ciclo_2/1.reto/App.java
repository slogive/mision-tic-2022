public class App {
  public static void main(String[] args) {
    BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
    System.out.println(becaUniversitaria.calcularInteresSimple());
    System.out.println(becaUniversitaria.calcularInteresCompuesto());
    System.out.println(becaUniversitaria.compararInversion(60, 13000, 1.4));
  }
}
