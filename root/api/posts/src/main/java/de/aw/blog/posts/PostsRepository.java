package de.aw.blog.posts;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//annotation generiert mehrere Endpunkte, von interface PagingAndSortingRepository<> erben -> extends

@RepositoryRestResource(collectionResourceRel = "posts" , path = "posts")
public interface PostsRepository extends PagingAndSortingRepository<Post, Long>{

	
}
