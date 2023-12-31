package vn.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.book.Entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}
