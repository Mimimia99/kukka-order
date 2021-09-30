package kukka;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="order", path="orders")
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {

}
