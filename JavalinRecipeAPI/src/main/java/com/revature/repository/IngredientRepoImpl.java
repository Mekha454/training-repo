package com.revature.repository;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Ingredient;
import com.revature.util.HibernateSessionFactory;

/*
 * This class is an implementation of our IngredientRepository.
 * Any instance of this class will be a Data Access Object (DAO)
 * this is a design pattern that provides a nice abstraction for your data access in applications
 * this is a dedicated class for data access, which makes it easy to refactor and generally maintain our source code
 */

public class IngredientRepoImpl implements IngredientRepository{

	@Override
	public void save(Ingredient ingredient) {
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			transaction = session.beginTransaction();
			session.save(ingredient);
			transaction.commit();
		}catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public Ingredient findById(int id) {
		
		
		return null;
		
	}

	@Override
	public Ingredient findByName(String name) {
		
		return null;
	}

	@Override
	public List<Ingredient> findAll() {
		
		List<Ingredient> ingredients = null;
		/*
		 * we need a hibernate session to do work on the DB.
		 */
		Session session = null;
		/*
		 * hibernate also has an interface which is used in lieu of transaction control language
		 */
		Transaction transaction = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			transaction = session.beginTransaction();
			ingredients = session.createQuery("FROM Ingredient", Ingredient.class).getResultList();
			transaction.commit();
		}catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
		
		}
		
		
		return ingredients;
		}
		
		
	@Override
	public void update(Ingredient ingredient) {
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			transaction = session.beginTransaction();
			session.update(ingredient);
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Ingredient ingredient) {
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			transaction = session.beginTransaction();
			session.delete(ingredient);
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
			e.printStackTrace();
		}
		
	}

}
