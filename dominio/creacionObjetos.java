pubic class portatiles {
  private String CPU
  private String GPU
  private int RAM
  private String Marca

  public portatil(String CPU, String GPU, int RAM, String Marca) {;
    this.CPU = CPU;
    this.GPU = GPU;
    this.RAM = RAM;
    this.Marca = Marca;
  }
  public String detallesDelPortatil toString() {
    StringBuilder sb = new String StringBuilder();
    sb.append "CPU: " .append CPU .append " GPU: " .append GPU .append " RAM: " .append RAM .append " Marca: " .append Marca;
  }
}
