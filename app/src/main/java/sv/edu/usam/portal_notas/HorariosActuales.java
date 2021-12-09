package sv.edu.usam.portal_notas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class HorariosActuales extends AppCompatActivity {
ListView listView;
Adapter adapter;

public static ArrayList<HorarioActualLista>horarioActualListaArrayList = new ArrayList<>();

    String url = "http://192.168.1.4:8080/alumnos-ws/horarios/{carnet}/actual";
   HorarioActualLista horarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios_actuales);
    }

    public void horarioActual(View view){
StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
    @Override
    public void onResponse(String response) {
        horarioActualListaArrayList.clear();

        try {
            JSONObject jsonObject = new JSONObject(response);
            String exito = jsonObject.getString("exito");
            JSONArray jsonArray = jsonObject.getJSONArray("horarios");
            if (exito.equals("1")) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject object = jsonArray.getJSONObject(i);

                    String id = object.getString("id");
                    String hora_inicio = object.getString("hora inicio");
                    String hora_fin = object.getString("hora fin");
                    String id_materia = object.getString("materia");
                    String dia = object.getString("dia ");
                    String id_ciclo = object.getString("ciclo");

                    horarios = new HorarioActualLista(id, hora_inicio, hora_fin, id_materia, dia, id_ciclo);
                    horarioActualListaArrayList.add(horarios);
                    adapter.notifyDataSetChanged();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }
}, new Response.ErrorListener() {
    @Override
    public void onErrorResponse(VolleyError error) {
Toast.makeText( HorariosActuales.this,error.getMessage(), Toast.LENGTH_SHORT).show();

              }
         });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}