package sv.edu.usam.portal_notas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sv.edu.usam.portal_notas.DTO.AlumnoDTO;
import sv.edu.usam.portal_notas.DTO.ResponseDTO;
import sv.edu.usam.portal_notas.apiClient.PortalAlumnoWsRetroFit;
import sv.edu.usam.portal_notas.utils.Utils;


public class Login extends AppCompatActivity {
    EditText carnet, clave;
    String str_carnet, str_contra;
    String url = "http://192.168.1.4:8080/alumnos-ws/alumno/login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        carnet = findViewById(R.id.txtCarnet);
        clave = findViewById(R.id.txtClave);
    }

    /*public void Login(View view) {
        if (carnet.getText().toString().equals("")) {
            Toast.makeText(this, "Ingrese el Carnet", Toast.LENGTH_SHORT).show();

        } else if (clave.getText().toString().equals("")) {
            Toast.makeText(this, "Ingrese la Contraseña", Toast.LENGTH_SHORT).show();

        } else {
            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Espere unos segundos");
            progressDialog.show();

            str_carnet = carnet.getText().toString().trim();
            str_contra = clave.getText().toString().trim();

            StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();

                    if (response.equalsIgnoreCase("ingreso correctamente")) {
                        carnet.setText("");
                        clave.setText("");
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        Toast.makeText(Login.this, response, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Login.this, response, Toast.LENGTH_SHORT).show();
                    }

                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    Toast.makeText(Login.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            ) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("Carnet del Estudiante", str_carnet);
                    params.put("Contraseña del Estudiante", str_contra);
                    return params;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(Login.this);
            requestQueue.add(request);


        }
    }*/

    public void login(View view){
        // on below line we are creating a retrofit
        // builder and passing our base url
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Utils.URL_PORTAL_ALUMNO_WS)
                // as we are sending data in json format so
                // we have to add Gson converter factory
                .addConverterFactory(GsonConverterFactory.create())
                // at last we are building our retrofit builder.
                .build();
        PortalAlumnoWsRetroFit apiAlumno=retrofit.create(PortalAlumnoWsRetroFit.class);
        AlumnoDTO alumnoDTO= new AlumnoDTO();
        alumnoDTO.setCarnet(carnet.getText().toString());
        alumnoDTO.setClave(clave.getText().toString());
        Call<ResponseDTO> loginCall=apiAlumno.login(alumnoDTO);
        loginCall.enqueue(new Callback<ResponseDTO>() {
            @Override
            public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {
                if (response.body().getCode().equalsIgnoreCase("00")) {
                    carnet.setText("");
                    clave.setText("");
                    AlumnoDTO alumno= Utils.mapper.convertValue( response.body().getResponse(),AlumnoDTO.class);
                    SharedPreferences prefs = getSharedPreferences("login_data",   Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putString("carnet", alumno.getCarnet());
                    editor.commit();
                    startActivity(new Intent(getApplicationContext(), Home.class));
                    Toast.makeText(Login.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Login.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseDTO> call, Throwable t) {
                Toast.makeText(Login.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}