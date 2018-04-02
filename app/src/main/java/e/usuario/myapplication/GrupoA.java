package e.usuario.myapplication;

/**
 * Created by USUARIO on 1/04/2018.
 */

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

public class GrupoA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grupoa, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        ListView listView;
        listView = (ListView) getView().findViewById(R.id.listview);
        String [] elementos = {
                "RUSIA V. ARABIA SAUDITA",
                "URUGUAY V. EGIPTO",
                "RUSIA V. URUGUAY",
                "EGIPTO V. ARABIA SAUDITA",
                "URUGUAY V. ARABIA SAUDITA",
                "EGIPTO V. RUSIA"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_expandable_list_item_1, elementos);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(String.valueOf(position).equals("0")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "RUSIA");
                    i.putExtra("Equipo2", "ARABIA SAUDITA");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("1")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "URUGUAY");
                    i.putExtra("Equipo2", "EGIPTO");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("2")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "RUSIA");
                    i.putExtra("Equipo2", "URUGUAY");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("3")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "EGIPTO");
                    i.putExtra("Equipo2", "ARABIA SAUDITA");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("4")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "URUGUAY");
                    i.putExtra("Equipo2", "ARABIA SAUDITA");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("5")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "EGIPTO");
                    i.putExtra("Equipo2", "RUSIA");
                    startActivity(i);

                }

            }
        });
    }
}
