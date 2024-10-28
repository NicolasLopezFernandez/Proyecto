import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SistemaLocalidades implements Serializable {
    private List<Provincia> provincias = new ArrayList<>();

    public void addProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public void addMunicipio(String nombreProvincia, Municipio municipio) {
        for (Provincia prov : provincias) {
            if (prov.nombre.equals(nombreProvincia)) {
                prov.addMunicipio(municipio);
                return;
            }
        }
    }

    public void addLocalidad(String nombreProvincia, String nombreMunicipio, Localidad localidad) {
        for (Provincia prov : provincias) {
            if (prov.nombre.equals(nombreProvincia)) {
                for (Municipio muni : prov.municipios) {
                    if (muni.nombre.equals(nombreMunicipio)) {
                        muni.addLocalidad(localidad);
                        return;
                    }
                }
            }
        }
    }

    public void listData() {
        provincias.forEach(System.out::println);
    }

    public void saveData(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(provincias);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadData(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            provincias = (List<Provincia>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
