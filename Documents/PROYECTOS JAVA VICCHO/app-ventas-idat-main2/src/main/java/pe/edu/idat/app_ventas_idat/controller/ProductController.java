package pe.edu.idat.app_ventas_idat.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.idat.app_ventas_idat.model.dto.ProductDto;
import pe.edu.idat.app_ventas_idat.service.IProductService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/producto")
public class ProductController {
    private IProductService iProductService;

    public String frmProducto(Model model){
        model.addAttribute("listproduct",iProductService.listarProductos());
        return "product/frmproducto";
    }

    public List<ProductDto> listarProductos(){
        return iProductService.listarProductos();
    }


}
