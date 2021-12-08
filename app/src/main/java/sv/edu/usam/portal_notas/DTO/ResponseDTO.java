package sv.edu.usam.portal_notas.DTO;

public class ResponseDTO {
	private String code;
	private String message;
	private Object response;
	public static String CODE_OK = "00";
	public static String CODE_ERROR = "99";
	public static String MSG_OK = "Operacion realizada con éxito";

	public ResponseDTO() {
	}

	public ResponseDTO(String code, String message, Object response) {
		super();
		this.code = code;
		this.message = message;
		this.response = response;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

}
