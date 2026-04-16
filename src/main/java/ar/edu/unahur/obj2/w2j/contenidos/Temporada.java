package ar.edu.unahur.obj2.w2j.contenidos;
import java.util.ArrayList;
import java.util.List;

public class Temporada {
     private final Integer numero;
    private List<Episodio> episodios = new ArrayList<>();
    
    public Temporada(Integer numero) {
        this.numero = numero;
    }

    public Temporada(Integer numero, List<Episodio> episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public void agregarepisodio(Episodio unEpisodio){
        episodios.add(unEpisodio);
    }

    public Integer getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public Double costo(){
        return episodios.stream().mapToDouble(e -> e.getCosto()).average().orElse(0.0);
    }    
}
