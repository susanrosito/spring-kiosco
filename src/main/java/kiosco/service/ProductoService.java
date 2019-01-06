package kiosco.service;

import java.util.List;

import kiosco.dao.ProductoDAO;
import kiosco.model.Producto;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("productos")
@Transactional
public class ProductoService {

    private ProductoDAO productoDAO;

    public ProductoService(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }
    
    @Transactional
    @PostMapping
    public void create(@RequestBody Producto producto) {
    	productoDAO.save(producto);
    }
    
    @GetMapping("/{id}")
    public Producto get(@PathVariable Integer id) {
    	Producto producto = productoDAO.getOne(id);
        return producto;
    }
    @GetMapping
    public List<Producto> getAll() {
        return productoDAO.findAllByOrderByNombreAsc();
    }
}