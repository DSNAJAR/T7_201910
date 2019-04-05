package model.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Representation of a Trip object
 */
public class VOMovingViolations  implements Comparable<VOMovingViolations>{

	//Atributos
	
	/**
	 * Identificador �nico de la infracci�n
	 */
	private int objectId;
	
	/**
	 * Direcci�n en formato de texto
	 */
	private String rowLocation;
	
	/**
	 * ID de la direcci�n
	 */
	private int addresId;
	
	/**
	 * ID del segmento de la calle
	 */
	private int streetSegId;
	
	/**
	 * Coordenada X donde ocurri� (No corresponde a una longitud geogr�fica)
	 */
	private double xCoord;
	
	/**
	 * Coordenada y donde ocurri� (No corresponde a una longitud geogr�fica)
	 */
	private double yCoord;
	
	/**
	 * Tipo de infracci�n
	 */
	private String ticketType;
	
	/**
	 * Cantidad a pagar por la infracci�n en USD
	 */
	private int fineAMT;
	
	/**
	 * Cuanto dinero pag� el que recibi� la multa
	 */
	private int totalPaid;
	
	/**
	 * Dinero extra que debe pagar el conductor
	 */
	private int penal1;
	
	/**
	 * Dinero extra que debe pagar el conductor
	 */
	private int penal2;
	
	/**
	 * Indicador de accidente
	 */
	private String accidentIndicator;
	
	/**
	 * Numero de la agencia
	 */
	private int agencyId;
	
	/**
	 * Fecha cuando se puso la infracci�n
	 */
	private Date ticketIssueDate;
	
	/**
	 * C�digo de la infracci�n
	 */
	private String violationCode;
	
	/**
	 * Descripci�n textual de la infracci�n
	 */
	private String violationDesc;
	
	private int rowId;
	
	/**
	 * Es el formato que se usara para las fechas
	 */
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	
	//Constructor
	
	public VOMovingViolations( int pObjectId, String pLocation, int pAddrresId, int pStreetSegId,int pXCoord, int pYCoord, String pTicketType, int pSumaFINEAMT, int pTotalPaid, int pPenal1, int pPenal2, String pAccidentIndicator, String pTicketIssueDate, String pViolationCode, String pViolationDescription, int pRowId) throws ParseException
	{
		// TODO Implementar
		objectId = pObjectId;
		rowLocation = pLocation;
		addresId = pAddrresId;
		streetSegId = pStreetSegId;
		xCoord = pXCoord;
		yCoord = pYCoord;
		ticketType = pTicketType;
		fineAMT = pSumaFINEAMT;
		totalPaid = pTotalPaid;
		penal1 = pPenal1;
		penal2 = pPenal2;
		accidentIndicator =  pAccidentIndicator;
		agencyId = 0;
		ticketIssueDate = format.parse(pTicketIssueDate);
		violationCode = pViolationCode;
		violationDesc = pViolationDescription;
		rowId = pRowId;
	}	
	
	//Metodos
	
	@Override
	public String toString() {
		return "VOMovingViolations [objectId()=" + objectId() + ",\n getLocation()=" + getLocation()
				+ ",\n getTicketIssueDate()=" + getTicketIssueDate() + ",\n getTotalPaid()=" + getTotalPaid()
				+ ",\n getAccidentIndicator()=" + getAccidentIndicator() + ",\n getViolationDescription()="
				+ getViolationDescription() + ",\n getStreetSegId()=" + getStreetSegId() + ",\n getAddressId()="
				+ getAddressId() + "]\n\n";
	}


	/**
	 * @return id - Identificador único de la infracción
	 */
	public int objectId() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
	
	/**
	 * @return location - Dirección en formato de texto.
	 */
	public String getLocation() {
		// TODO Auto-generated method stub
		return "";
	}

	/**
	 * @return date - Fecha cuando se puso la infracción .
	 */
	public String getTicketIssueDate() {
		// TODO Auto-generated method stub
		return "";
	}
	
	/**
	 * @return totalPaid - Cuanto dinero efectivamente pagó el que recibió la infracción en USD.
	 */
	public int getTotalPaid() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * @return accidentIndicator - Si hubo un accidente o no.
	 */
	public String  getAccidentIndicator() {
		// TODO Auto-generated method stub
		return "";
	}
		
	/**
	 * @return description - Descripción textual de la infracción.
	 */
	public String  getViolationDescription() {
		// TODO Auto-generated method stub
		return "";
	}
	
	public String getStreetSegId() {
		return "";
	}
	
	public String getAddressId() {
		return "";
	}


	@Override
	public int compareTo(VOMovingViolations arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
