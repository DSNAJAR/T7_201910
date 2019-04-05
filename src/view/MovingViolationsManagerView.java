package view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controller.Controller;
import model.vo.VOMovingViolations;

public class MovingViolationsManagerView 
{
	/**
	 * Constante con el número maximo de datos maximo que se deben imprimir en consola
	 */
	public static final int N = 20;
	
	public void printMenu() {
		System.out.println("---------ISIS 1206 - Estructuras de datos----------");
		System.out.println("---------------------Taller 7----------------------");
		System.out.println("----David Alejandro Ruiz & David Santiago Najar----");
		System.out.println("0. Cargar datos del semestre");
		System.out.println("1. Consultar la informaci�n de una infracci�n mediante un id de su interes.");
		System.out.println("2. Consultar las infracciones con id's dentro de un rango de su interes.");
		System.out.println("3. Salir");
		
		System.out.println("Digite el numero de opcion para ejecutar la tarea, luego presione enter: (Ej., 1):");
		
	}
	
	public void printMessage(String mensaje) {
		System.out.println(mensaje);
	}
}
