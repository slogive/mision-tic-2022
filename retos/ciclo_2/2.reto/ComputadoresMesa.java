public class ComputadoresMesa extends Computadores {
  private final static Integer ALMACENAMIENTO_BASE = 50;

  private Integer almacenamiento;

  public ComputadoresMesa() {
    this(PRECIO_BASE, PESO_BASE, CONSUMO_W, ALMACENAMIENTO_BASE);
  }

  public ComputadoresMesa(double precioBase, Integer peso) {
    this(precioBase, peso, CONSUMO_W, ALMACENAMIENTO_BASE);
  }

  public ComputadoresMesa(double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
    super(precioBase, peso, consumoW);
    this.almacenamiento = almacenamiento;
  }

  public double calcularPrecio() {
    double adicion = super.calcularPrecio();
    if (almacenamiento > 100) {
      adicion += 50.0;
    }

    return adicion;
  }

  public Integer getCarga() {
    return almacenamiento;
  }
}