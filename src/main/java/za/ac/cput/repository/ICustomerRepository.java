/*
ICustomerRepository.java
Interface for customer repository
Author: Anesu Bandama(221295755)
Date: 10 September 2023
*/
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, String> {
}
