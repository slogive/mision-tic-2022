public class ComputadoresPortatiles extends Computadores {
  private final static Integer PULGADAS_BASE = 20;

  private Integer pulgadas;
  private boolean camaraITG;

  public ComputadoresPortatiles() {
    this(PRECIO_BASE, PESO_BASE, CONSUMO_W, PULGADAS_BASE, false);
  }

  public ComputadoresPortatiles(double precioBase, Integer peso) {
    this(precioBase, peso, CONSUMO_W, PULGADAS_BASE, false);
  }

  public ComputadoresPortatiles(double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG) {
    super(precioBase, peso, consumoW);
    this.pulgadas = pulgadas;
    this.camaraITG = camaraITG;
  }

  public double calcularPrecio() {
    double adicion = super.calcularPrecio();
    if (pulgadas > 40) {
      adicion += precioBase * 0.3;
    }
    if (camaraITG) {
      adicion += 50.0;
    }

    return adicion;
  }
}