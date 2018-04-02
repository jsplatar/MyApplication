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

public class GrupoC extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grupoc, container, false);
        return rootView;
    }
    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        ListView listView;
        listView = (ListView) getView().findViewById(R.id.listview);
        String [] elementos = {
                "FRANCIA V. AUSTRALIA",
                "PERU V. DINAMARCA",
                "FRANCIA V. PERU",
                "DINAMARCA V. AUSTRALIA",
                "PERU V. AUSTRALIA",
                "DINAMARCA V. FRANCIA"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_expandable_list_item_1, elementos);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(String.valueOf(position).equals("0")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "FRANCIA");
                    i.putExtra("Equipo2", "AUSTRALIA");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("1")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "PERU");
                    i.putExtra("Equipo2", "DINAMARCA");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("2")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "FRANCIA");
                    i.putExtra("Equipo2", "PERU");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("3")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "DINAMARCA");
                    i.putExtra("Equipo2", "AUSTRALIA");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("4")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "PERU");
                    i.putExtra("Equipo2", "AUSTRALIA");
                    startActivity(i);

                }
                if(String.valueOf(position).equals("5")){
                    Intent i = new Intent(view.getContext(), EditorResultados.class);
                    i.putExtra("Equipo1", "DINAMARCA");
                    i.putExtra("Equipo2", "FRANCIA");
                    startActivity(i);

                }

            }
        });
    }
}
