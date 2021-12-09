package sv.edu.usam.portal_notas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter  extends ArrayAdapter<HorarioActualLista> {

    Context context;
    List<HorarioActualLista> arrayhorarios;

    public Adapter(@NonNull Context context, List<HorarioActualLista>arrayhorarios) {

        super(context, R.layout.activity_horarios_actuales,arrayhorarios);
        this.context=context;
        this.arrayhorarios=arrayhorarios;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_horarios_actuales, null, true);

        TextView txtid = view.findViewById(R.id.txtid);
        TextView txtid_materia = view.findViewById(R.id.txtid_materia);
        TextView txtHorario_inicio= view.findViewById(R.id.txtHorario_Inicio);
        TextView txtHorario_salida = view.findViewById(R.id.txtHorario_Salida);
        TextView txtid_ciclo = view.findViewById(R.id.txtid_ciclo);
        TextView txtdia = view.findViewById(R.id.txtdia);



        txtid.setText(arrayhorarios.get(position).getid());
        txtid_materia.setText(arrayhorarios.get(position).getid_materia());
        txtHorario_inicio.setText(arrayhorarios.get(position).getHoraInicio());
        txtHorario_salida.setText(arrayhorarios.get(position).gethoraFin());
        txtid_ciclo.setText(arrayhorarios.get(position).getid_ciclo());
        txtdia.setText(arrayhorarios.get(position).getdia());
        return view;
    }

}
