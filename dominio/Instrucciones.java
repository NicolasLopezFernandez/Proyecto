import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TiendaElectronica implements Serializable {
    private List<Productos> Caracteristicas = new ArrayList<>();

    public void addcpu(Cpu cpu) {
        cpu.add(cpu);
        return;
    }

    public void addGpu(Gpu gpu) {
        addGPU(gpu);
        return;
    }

    public void addRAM(RAM ram) {
        addRAM(ram);
        return;
    }

    public void listData() {
        Caracteristicas.forEach(System.out::println);
    }

    public void saveData(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(Caracteristicas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadData(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Caracteristicas = (List<Caracteristicas>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
