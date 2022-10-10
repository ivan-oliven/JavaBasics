package aula46;

/*
 * Author: Ivan de Oliveira
Feature: Basic Java Training
Course: Loiane Groner 
Reference: loiane.training
 * 
 * */

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

	void abrirConexao();
	void fecharConexao();
}
