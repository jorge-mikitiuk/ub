package ejercicio4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Application {

  public static void main(String[] args) throws IOException {
    Collection<Persona> collection = read(Paths.get("listaDePersonas.txt"));
    System.out.println(collection.size());
  }

  public static Collection<Persona> read(Path source) throws IOException {
    Collection<Persona> out = new ArrayList<>();
    List<String> lines = Files.readAllLines(source);
    for (String line : lines) {
      String[] split = line.split(",");
      out.add(new Persona(split[0], split[1], Integer.parseInt(split[2]), Genero.valueOf(split[3])));
    }

    return out;
  }
}
