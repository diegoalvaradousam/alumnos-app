package sv.edu.usam.portal_notas.apiClient;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import sv.edu.usam.portal_notas.DTO.AlumnoDTO;
import sv.edu.usam.portal_notas.DTO.ResponseDTO;

public interface PortalAlumnoWsRetroFit {
    @POST("alumno/login")
    Call<ResponseDTO> login(@Body AlumnoDTO a);
    @GET("horarios/{carnet}/actual")
    Call<ResponseDTO> horariosActuales(@Path("carnet")String carnet);
}
