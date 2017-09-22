package br.ufjf.dcc.exercicio4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt1;
    private Button btn1;
    private EditText edt1;
    private String str="";
    private String aux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(TextView)findViewById(R.id.txt1);
        btn1=(Button)findViewById(R.id.btn1);
        edt1=(EditText)findViewById(R.id.edt1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aux=edt1.getText().toString();
                for(int i= edt1.length()-1;i>=0;i--){
                    str=str+String.valueOf(aux.charAt(i));

                }
                txt1.setText(str);
            }
        });
    }
}
