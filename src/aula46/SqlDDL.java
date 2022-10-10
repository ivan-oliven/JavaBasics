package aula46;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public interface SqlDDL {

	void create(String query);
	void alter(String query);
	void drop(String query);
}
