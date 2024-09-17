package com.adur.microservices.inventory.repository;

import com.adur.microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Created 17/09/2024 - 13:36
 * @author Jarisiber
 * +62 813 8522 9903
 */
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
}
