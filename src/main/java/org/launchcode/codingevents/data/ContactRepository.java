package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.NetworkingContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface ContactRepository extends CrudRepository<NetworkingContact, Integer> {
}
