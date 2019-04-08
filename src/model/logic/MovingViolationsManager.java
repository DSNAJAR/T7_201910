package model.logic;

import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import controller.ObjectId;
import model.data_structures.DoubleLinkedList;
import model.data_structures.RedBlackBST;
import model.vo.VOMovingViolations;

public class MovingViolationsManager {
	
	//---------------------------------------------------------------------------------------------------
		// Constantes
		// --------------------------------------------------------------------------------------------------

		/**
		 * Constante que representa los datos de las infracciones realizadas en Enero
		 */
		public static final String DATOS_MES_1 = "./data/Moving_Violations_Issued_in_January_2018.json";
		
		/**
		 * Constante que representa los datos de las infracciones realizadas en Febrero
		 */
		public static final String DATOS_MES_2 = "./data/Moving_Violations_Issued_in_February_2018.json";
		
		/**
		 * Constante que representa los datos de las infracciones realizadas en Marzo
		 */
		public static final String DATOS_MES_3 = "./data/Moving_Violations_Issued_in_March_2018.json";
		
		/**
		 * Constante que representa los datos de las infracciones realizadas en Abril
		 */
		public static final String DATOS_MES_4 = "./data/Moving_Violations_Issued_in_April_2018.json";
		
		/**
		 * Constante que representa los datos de las infracciones realizadas en Mayo
		 */
		public static final String DATOS_MES_5 = "./data/Moving_Violations_Issued_in_May_2018.json";
		
		/**
		 * Constante que representa los datos de las infracciones realizadas en Junio
		 */
		public static final String DATOS_MES_6= "./data/Moving_Violations_Issued_in_June_2018.json";
		
		
	/**
	 * Arbol rojo-negro donde se van a cargar los datos de los archivos
	 */
	private RedBlackBST<Integer, VOMovingViolations> movingViolationsRB;	
		
	/**
	 * Metodo constructor
	 */
	public MovingViolationsManager()
	{
		//TODO inicializar los atributos
		movingViolationsRB = new RedBlackBST<Integer, VOMovingViolations>();
	}
	
	public void load() {
		String[] archivos = new String[6];
		for(int i = 0; i < 6; i++){
			if(i == 0){archivos[i] = DATOS_MES_1;}
			else if(i==1){archivos[i] = DATOS_MES_2;}
			else if(i==2){archivos[i] = DATOS_MES_3;}
			else if(i==3){archivos[i] = DATOS_MES_4;}
			else if(i==4){archivos[i] = DATOS_MES_5;}
			else if(i==5){archivos[i] = DATOS_MES_6;}
		}
		
		String fileName = null;
		int nInfracciones[] = new int[6];
		
		for(int i = 0; i < 6; i++) {
			fileName = archivos[i];
			nInfracciones[i] = loadMovinViolations(fileName);
		}
		
		System.out.println("El total de infracciones del semestre es:" + movingViolationsRB.size());
		
		System.out.println("El número de infracciones de Enero es:" + nInfracciones[0]);
		System.out.println("El número de infracciones de Febrero es:" + nInfracciones[1]);
		System.out.println("El número de infracciones de Marzo es:" + nInfracciones[2]);
		System.out.println("El número de infracciones de Abril es:" + nInfracciones[3]);
		System.out.println("El número de infracciones de Mayo es:" + nInfracciones[4]);
		System.out.println("El número de infracciones de Junio es:" + nInfracciones[5]);
	}
	
	public int loadMovinViolations(String pJson) {
		JsonParser parser = new JsonParser();
		int i = 0;
		
		try {
			JsonArray array = (JsonArray) parser.parse(new FileReader(pJson));
			Iterator iter = array.iterator();
			
			while(iter.hasNext()) {
				JsonElement obj = (JsonElement) iter.next();
				JsonObject object = obj.getAsJsonObject();
				
				int objectId = 0;
				if(object.get("OBJECTID") != null) {
					objectId = object.get("OBJECTID").getAsInt();
				}
				
				String row = " ";
				if(object.get("ROW_") != null) {
					row = object.get("ROW_").getAsString();
				}
				
				String location = " ";
				if(object.get("LOCATION") != null) {
					location = object.get("LOCATION").getAsString();
				}
				
				int addressId = 0;
				if(object.get("ADDRESS_ID") != null) {
					addressId = object.get("ADDRESS_ID").getAsInt();
				}
				
				int streetSegId = 0;
				if(object.get("STREETSEGID") != null) {
					streetSegId = object.get("STREETSEGID").getAsInt();
				}
				
				double xCoord = 0.0;
				if(object.get("XCOORD") != null) {
					xCoord = object.get("XCOORD").getAsDouble();
				}
				
				double yCoord = 0.0;
				if(object.get("YCOORD") != null) {
					yCoord = object.get("YCOORD").getAsDouble();
				}
				
				String ticketType = " ";
				if(object.get("TICKETTYPE") != null) {
					ticketType = object.get("TICKETTYPE").getAsString();
				}
				
				int fineAMT = 0;
				if(object.get("FINEAMT") != null) {
					fineAMT = object.get("FINEAMT").getAsInt();
				}
				
				int totalPaid = 0;
				if(object.get("TOTALPAID") != null) {
					totalPaid = object.get("TOTALPAID").getAsInt();
				}
				
				int penalty1 = 0;
				if(object.get("PENALTY1") != null) {
					penalty1 = object.get("PENALTY1").getAsInt();
				}
				
				int penalty2 = 0;
				if(object.get("PENALTY2") != null) {
					penalty2 = object.get("PENALTY2").getAsInt();
				}
				
				String accidentIndicator = " ";
				if(object.get("ACCIDENTINDICATOR") != null) {
					accidentIndicator = object.get("ACCIDENTINDICATOR").getAsString();
				}
				
				String ticketIssueDate = " ";
				if(object.get("TICKETISSUEDATE") != null) {
					ticketIssueDate = object.get("TICKETISSUEDATE").getAsString();
				}
				
				String violationCode = " ";
				if(object.get("VIOLATIONCODE") != null) {
					violationCode = object.get("VIOLATIONCODE").getAsString();
				}
				
				String violationDesc = " ";
				if(object.get("VIOLATIONDESC") != null) {
					violationDesc = object.get("VIOLATIONDESC").getAsString();
				}
				
				int rowId = 0;
				if(object.get("ROW_ID") != null) {
					rowId = object.get("ROW_ID").getAsInt();
				}
				
				movingViolationsRB.put(objectId, new VOMovingViolations(objectId, location, addressId, streetSegId, xCoord, yCoord, ticketType, fineAMT, totalPaid, penalty1, penalty2, accidentIndicator, ticketIssueDate, violationCode, violationDesc, rowId));
				
				iter.next();
				i++;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i+1;
	}
	
	/**
	 * Consulta la información asociada a un valor ObjectId.
	 * @param pObjectId Identificador de la infraccion.
	 * @return VOMovingViolations Informacion de la infraccion.
	 */
	public VOMovingViolations searchInfoMovingViolation(int pObjectId) {
		VOMovingViolations x = movingViolationsRB.get(pObjectId);
		return x;
	}	
	
	/**
	 * Consulta los ObjectsID registrados en un rango dado por ObjectID menor y ObjectID mayor
	 * Por cada ObjectID existente dentro del rango se muestra la información correspondiente a esta 
	 * @param iDMenor Identificador que define el inicio del rango de busqueda
	 * @param iDMayor Identificador que define el final del rango de busqueda. iDMayor >= iDMenor
	 * 
	 */
	public Iterator<Integer> registeredInRange (int iDMenor, int iDMayor)
	{
		Iterator<Integer> estan = movingViolationsRB.keysInRange(iDMenor, iDMayor);
		
		return estan;
	}
}
