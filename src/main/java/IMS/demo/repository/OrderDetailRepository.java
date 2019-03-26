package IMS.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import IMS.demo.dataobject.OrderDetail;

import java.util.List;

/**
 * @author IMS
 * Created on 2017/10/15
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
