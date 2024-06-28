package pe.edu.idat.app_ventas_idat.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {
    private Integer productid;
    //@Column(name = "productname")
    private String productname;
    private Double unitprice;
    private boolean discontinued;
    private Integer supplierid;
    private Integer categoryid;
    private String companyname;
    private String categoryname;
}
