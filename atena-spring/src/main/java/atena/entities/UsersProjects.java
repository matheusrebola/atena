package atena.entities;

import jakarta.persistence.Entity;

@Entity
public record UsersProjects(
		Users user,
		Projects project) 
{

}
