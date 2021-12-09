package sv.edu.usam.portal_notas.apiClient;

import java.util.List;

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
    Call<List<ResponseDTO>> horariosActuales(@Path("carnet")String carnet);
    @GET("alumno/{carnet}/info")
    Call<ResponseDTO> alumnoInfo(@Path("carnet")String carnet);
    @GET("horarios/disponibles")
    Call<ResponseDTO> horarioDisponible(@Path("carnet")String carnet);


}
