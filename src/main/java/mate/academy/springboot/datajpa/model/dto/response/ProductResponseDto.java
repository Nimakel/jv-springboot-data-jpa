package mate.academy.springboot.datajpa.model.dto.response;

import java.math.BigDecimal;
import lombok.Setter;
import mate.academy.springboot.datajpa.model.Category;

@Setter
public class ProductResponseDto {
    private Long id;
    private String title;
    private BigDecimal price;
    private Category category;
}