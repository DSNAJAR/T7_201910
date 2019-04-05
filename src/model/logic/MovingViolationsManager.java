package model.logic;

import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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
		String[] archivos = new String[12];
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
			nInfracciones[i+1] = loadMovinViolations(fileName);
		}
		
		System.out.println("El total de infracciones del semestre es:" + movingViolationsRB.size());
		
		System.out.println("El número de infracciones de Enero es:" + nInfracciones[1]);
		System.out.println("El número de infracciones de Febrero es:" + nInfracciones[2]);
		System.out.println("El número de infracciones de Marzo es:" + nInfracciones[3]);
		System.out.println("El número de infracciones de Abril es:" + nInfracciones[4]);
		System.out.println("El número de infracciones de Mayo es:" + nInfracciones[5]);
		System.out.println("El número de infracciones de Junio es:" + nInfracciones[6]);
	}
	
	public int loadMovinViolations(String pJson) {
		JsonParser parser = new JsonParser();
		int i = 0;
		
		try {
			JsonArray array = (JsonArray) parser.parse(new FileReader(pJson));
			Iterator iter = array.iterator();
			
			while(iter.hasNext()) {
				JsonObject object = (JsonObject) array.get(i);
				
				String objectId = " ";
				if(object.get("OBJECTID") != null) {
					objectId = object.get("OBJECTID").toString();
				}
				
				String row = " ";
				if(object.get("ROW_") != null) {
					row = object.get("ROW_").toString();
				}
				
				String location = " ";
				if(object.get("LOCATION") != null) {
					location = object.get("LOCATION").toString();
				}
				
				String addressId = " ";
				if(object.get("ADDRESS_ID") != null) {
					addressId = object.get("ADDRESS_ID").toString();
				}
				
				String streetSegId = " ";
				if(object.get("STREETSEGID") != null) {
					streetSegId = object.get("STREETSEGID").toString();
				}
				
				String xCoord = " ";
				if(object.get("XCOORD") != null) {
					xCoord = object.get("XCOORD").toString();
				}
				
				String yCoord = " ";
				if(object.get("YCOORD") != null) {
					yCoord = object.get("YCOORD").toString();
				}
				
				String ticketType = " ";
				if(object.get("TICKETTYPE") != null) {
					ticketType = object.get("TICKETTYPE").toString();
				}
				
				String fineAMT = " ";
				if(object.get("FINEAMT") != null) {
					fineAMT = object.get("FINEAMT").toString();
				}
				
				String totalPaid = " ";
				if(object.get("TOTALPAID") != null) {
					totalPaid = object.get("TOTALPAID").toString();
				}
				
				String penalty1 = " ";
				if(object.get("PENALTY1") != null) {
					penalty1 = object.get("PENALTY1").toString();
				}
				
				String penalty2 = " ";
				if(object.get("PENALTY2") != null) {
					penalty2 = object.get("PENALTY2").toString();
				}
				
				String accidentIndicator = " ";
				if(object.get("ACCIDENTINDICATOR") != null) {
					accidentIndicator = object.get("ACCIDENTINDICATOR").toString();
				}
				
				String ticketIssueDate = " ";
				if(object.get("TICKETISSUEDATE") != null) {
					ticketIssueDate = object.get("TICKETISSUEDATE").toString();
				}
				
				String violationCode = " ";
				if(object.get("VIOLATIONCODE") != null) {
					violationCode = object.get("VIOLATIONCODE").toString();
				}
				
				String violationDesc = " ";
				if(object.get("VIOLATIONDESC") != null) {
					violationDesc = object.get("VIOLATIONDESC").toString();
				}
				
				String rowId = " ";
				if(object.get("ROW_ID") != null) {
					rowId = object.get("ROW_ID").toString();
				}
				
				movingViolationsRB.put(Integer.parseInt(objectId), new VOMovingViolations(Integer.parseInt(objectId), location, Integer.parseInt(addressId), Integer.parseInt(streetSegId), Integer.parseInt(xCoord), Integer.parseInt(yCoord), ticketType, Integer.parseInt(fineAMT), Integer.parseInt(totalPaid), Integer.parseInt(penalty1), Integer.parseInt(penalty2), accidentIndicator, ticketIssueDate, violationCode, violationDesc, Integer.parseInt(rowId)));
				
				iter.next();
				i++;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i+1;
	}
}
