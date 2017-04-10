package br.com.ergildo.controleestoque.dao;

import java.io.Serializable;
import java.util.List;

import br.com.ergildo.controleestoque.exception.PersistenceException;

/**
 * @author desenv
 *
 * @param <T>
 * @param <ID>
 */
public interface DAO<T extends Serializable, ID extends Serializable> {
	/**
	 * @param entity
	 * @throws PersistenceException
	 */
	public void salvar(T entity) throws PersistenceException;

	/**
	 * @param id
	 * @return
	 * @throws PersistenceException
	 */
	public T consultar(ID id) throws PersistenceException;

	/**
	 * @param entity
	 * @throws PersistenceException
	 */
	public void excluir(T entity) throws PersistenceException;

	/**
	 * @return
	 * @throws PersistenceException
	 */
	public List<T> listar() throws PersistenceException;
}
