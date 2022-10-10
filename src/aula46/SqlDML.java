package aula46;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public interface SqlDML {

	void select(String query);
	void insert(String query);
	void delete(String query);
	void update(String query);
}
