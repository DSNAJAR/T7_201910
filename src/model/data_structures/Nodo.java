package model.data_structures;

public class Nodo <T extends Comparable<T>>
{
	private T item;
	
	private Nodo<T> siguiente;
	
	private Nodo<T> anterior;
	
	public Nodo(T pItem, Nodo<T> pAnterior, Nodo<T> pSiguiente)
	{
		this.item = pItem;
		
		this.siguiente = pSiguiente;
		
		this.anterior = pAnterior;
	}
	
	/**
	 * Devuelve el siguiente de la lista
	 * @return Nodo siguiente
	 */
	public Nodo<T> getSiguiente() 
	{
	return siguiente;
	}
	
	/**
	 * Devuelve el anterior de la lista
	 * @return Nodo anterior
	 */
	public Nodo<T> getrAnterior()
	{
		return anterior;
	}
	
	/**
	 * M�todo que inserta en la posici�n siguiente.
	 * @param next
	 */
	public void cambiarSiguiente ( Nodo<T> pSiguiente ) 
	{
		this.siguiente = siguiente ;
	}
	
	/**
	 * M�to que inserta un nodo en la posici�n anterior.
	 */
	public void cambiarAnterior ( Nodo<T> pAnterior )
	{
		this.anterior = anterior;		
	}
	
	/**
	 * Retorna el item que contiene el ndo
	 * @return item que contiene el nodo
	 */
	public T getItem()
	{
		return item;
	}
	
	/**
	 * Inserta el item en el nodo
	 * @param item. Item a insertar
	 */
	public void cambiarItem (T item) 
	{
		this.item = item;
	}
}

