package dominio;
import java.io.Serializable;

public class portatiles implements Serializable{
  private String CPU;
  private String GPU;
  private int RAM;
  private String Marca;

  public portatil (String CPU, String GPU, int RAM, String Marca) {
    this.CPU = this.CPU;
    this.GPU = this.GPU;
    this.RAM = this.RAM;
    this.Marca = this.Marca;
  }
  public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca_) {
        marca = Marca_;
    }
    public String getCPU() {
        return CPU;
    }
    public void setCpu(String CPU_) {
        CPU = CPU_;
    }
    public String getGPU() {
        return GPU;
    }
    public void setGpu(String GPU_) {
        GPU = GPU_;
    }
    public int getRam() {
        return RAM;
    }
    public void setRam(int RAM_) {
        RAM = RAM_;
    }
  public String detallesDelPortatil toString() {
    StringBuilder sb = new String StringBuilder();
    sb.append "CPU: " .append CPU .append " GPU: " .append GPU .append " RAM: " .append RAM .append " Marca: " .append Marca;
  }
}
