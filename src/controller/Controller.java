package controller;

import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;
import model.data_structures.DoubleLinkedList;
import model.data_structures.Nodo;
import model.logic.MovingViolationsManager;
import model.vo.VOMovingViolations;
import sun.reflect.generics.tree.VoidDescriptor;
import view.MovingViolationsManagerView;

/**
 * Esta clase representa el controlador de los datos
 */
public class Controller {
	//--------------------------------------------------------------------------------------------------
	// Atributos
	//--------------------------------------------------------------------------------------------------
	/**
	 * Es la referencia al view
	 */
	private MovingViolationsManagerView view;
		
	// Componente modelo (logica de la aplicacion)
	private MovingViolationsManager model;
	
	/**
	 * Semestre del cual se subiran los datos - 1(Enero - Junio) o 2(Julio - Diciembtre) 
	 */
	public int semestre;
	
	//-----------------------------------------------------------------------------------------------
	// Constructores
	// ----------------------------------------------------------------------------------------------
	
	/**
	 * Construye un nuevo controlador con una lista doblemente encadenada.
	 * <b>post:</b> se construyo  un nuevo controlador con una lista doblemente encadenada
	 * La lista doblemente encadenada esta vacía <br>
	 */
	public Controller() {
		view = new MovingViolationsManagerView();
		model = new MovingViolationsManager();
	}
	
	/**
	 * Lee la opcion que el usuario escoja para el desarrollo del programa
	 * @throws Exception 
	 */
	/**
	 * Metodo encargado de ejecutar los  requerimientos segun la opcion indicada por el usuario
	 */
	public void run(){

		long startTime;
		long endTime;
		long duration;

		Scanner sc = new Scanner(System.in);
		boolean fin = false;
		Controller controller = new Controller();

		while(!fin){
			view.printMenu();

			int option = sc.nextInt();

			switch(option){

			case 0:
				break;

			case 1:
				break;

			case 2:
				break;

			case 3:
				fin = true;
				sc.close();
				break;
			}
		}
	}
}
