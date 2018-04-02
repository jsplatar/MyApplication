package e.usuario.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by USUARIO on 1/04/2018.
 */

public class GrupoH extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grupoh, container, false);
        return rootView;
    }
    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        ListView listView;
        listView = (ListView) getView().findViewById(R.id.listview);
        String [] elementos = {
                "POLONIA V. JAPON",
                "COLOMBIA V. SENEGAL",
                "POLONIA V. COLOMBIA",
                "SENEGAL V. JAPON",
                "COLOMBIA V. JAPON",
                "SENEGAL V. POLONIA"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_expandable_list_item_1, elementos);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(String.valueOf(position).equals("0")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "POLONIA");
                    i.putExtra("Equipo2", "JAPON");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("1")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "COLOMBIA");
                    i.putExtra("Equipo2", "SENEGAL");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("2")) {
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "POLONIA");
                    i.putExtra("Equipo2", "COLOMBIA");
                    startActivity(i);
                }
                    if(String.valueOf(position).equals("3")){
                        Intent i = new Intent(view.getContext(), EditorResultados.class);
                        i.putExtra("Equipo1", "SENEGAL");
                        i.putExtra("Equipo2", "JAPON");
                        startActivity(i);

                    }
                    if(String.valueOf(position).equals("4")){
                        Intent i = new Intent(view.getContext(), EditorResultados.class);
                        i.putExtra("Equipo1", "COLOMBIA");
                        i.putExtra("Equipo2", "JAPON");
                        startActivity(i);

                    }
                    if(String.valueOf(position).equals("5")){
                        Intent i = new Intent(view.getContext(), EditorResultados.class);
                        i.putExtra("Equipo1", "SENEGAL");
                        i.putExtra("Equipo2", "POLONIA");
                        startActivity(i);

                    }

                }

        });
    }
}