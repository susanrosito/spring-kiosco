package kiosco.dao;

import kiosco.model.Producto;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoDAO extends JpaRepository<Producto, Integer> {

    Producto findByNombre(String nombreProducto);
    List<Producto> findAllByOrderByNombreAsc();

    //@Query("select i.especie from Bicho i where i.entrenador <> null group by i.especie order by count(*) desc, i.especie.nombre")
    //List<Producto> getPopulares(Pageable pageable);
/*
    default List<Producto> getPopulares() {
        return getPopulares(PageRequest.of(0, 10));
    }

    @Query("select i.especie from Bicho i where i.entrenador = null group by i.especie order by count(*), i.especie.nombre")
    List<Producto> getImpopulares(Pageable pageable);

    default List<Producto> getImpopulares() {
        return getImpopulares(PageRequest.of(0, 10));
    }

    @Query("select c.campeon.especie from Campeon c group by c.campeon.especie order by COUNT(DISTINCT c.campeon) desc, c.campeon.especie.nombre")
    List<Producto> lider(Pageable pageable);

    default Producto lider() {
        return lider(PageRequest.of(0, 1)).get(0);
    }
*/
}