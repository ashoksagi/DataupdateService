package com.dataupdate.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel ="UpdateForm",path ="UpdateForm")
public interface FormDataRepo extends JpaRepository<FormData, Integer>{

}


