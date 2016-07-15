package io.egen.movieflex.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen.movieflex.entity.Movies;

@Repository
public class MovieRepositoryImpl implements IMovieRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveAll(Movies[] movieArray) {
		for(Movies m : movieArray){
			em.persist(m);
		}
	}

	@Override
	public List<Movies> findAll() {
		TypedQuery<Movies> query = em.createQuery("from Movies", Movies.class);
		return query.getResultList();
	}

	@Override
	public List<Movies> getTopRated() {
		String jql = "Select m from Movies as m order by m.imdbRating desc";
		Query sortQuery = em.createQuery(jql);
		return sortQuery.getResultList();
	}

	@Override
	public List<Movies> getById(String id) {
		Query query = em.createNamedQuery("getById");
		query.setParameter("id", id);
		return query.getResultList();
	}

	@Override
	public List<Movies> getRatingsById(String id) {
		Query query = em.createNamedQuery("getRatingsById");
		query.setParameter("id", id);
		return query.getResultList();
	}

	@Override
	public List<Movies> getCommentsById(String id) {
		Query query = em.createNamedQuery("getCommentsById");
		query.setParameter("id", id);
		return query.getResultList();
	}

}
