package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends CrudRepository<Job, Integer> {
}
