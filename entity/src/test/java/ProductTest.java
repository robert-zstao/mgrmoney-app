import com.uek.mgrmoney.entity.Product;
import com.uek.mgrmoney.enumeration.ProductStatus;
import org.apache.log4j.Logger;
import org.junit.Test;


import java.math.BigDecimal;
import java.util.Date;

/**
 * 实体测试类
 * 使用日志测试
 */
public class ProductTest {
    private static Logger logger=Logger.getLogger(ProductTest.class);
    @Test
    public void createProduct(){
        Product product = new Product();
        product.setId("T001");
        product.setName("月光贷");
        product.setStartAmount(BigDecimal.valueOf(1000));
        product.setStatus(ProductStatus.LOCKED);  // 锁定 销售中 结束
        product.setCreateAt(new Date());
        product.setCreateUser("张三");
        logger.info(product);
    }
}
