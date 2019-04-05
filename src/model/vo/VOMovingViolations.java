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
	 * Identificador único de la infracción
	 */
	private int objectId;
	
	/**
	 * Dirección en formato de texto
	 */
	private String rowLocation;
	
	/**
	 * ID de la dirección
	 */
	private int addresId;
	
	/**
	 * ID del segmento de la calle
	 */
	private int streetSegId;
	
	/**
	 * Coordenada X donde ocurrió (No corresponde a una longitud geográfica)
	 */
	private double xCoord;
	
	/**
	 * Coordenada y donde ocurrió (No corresponde a una longitud geográfica)
	 */
	private double yCoord;
	
	/**
	 * Tipo de infracción
	 */
	private String ticketType;
	
	/**
	 * Cantidad a pagar por la infracción en USD
	 */
	private int fineAMT;
	
	/**
	 * Cuanto dinero pagó el que recibió la multa
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
	 * Fecha cuando se puso la infracción
	 */
	private Date ticketIssueDate;
	
	/**
	 * Código de la infracción
	 */
	private String violationCode;
	
	/**
	 * Descripción textual de la infracción
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
	 * @return id - Identificador Ãºnico de la infracciÃ³n
	 */
	public int objectId() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
	
	/**
	 * @return location - DirecciÃ³n en formato de texto.
	 */
	public String getLocation() {
		// TODO Auto-generated method stub
		return "";
	}

	/**
	 * @return date - Fecha cuando se puso la infracciÃ³n .
	 */
	public String getTicketIssueDate() {
		// TODO Auto-generated method stub
		return "";
	}
	
	/**
	 * @return totalPaid - Cuanto dinero efectivamente pagÃ³ el que recibiÃ³ la infracciÃ³n en USD.
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
	 * @return description - DescripciÃ³n textual de la infracciÃ³n.
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
