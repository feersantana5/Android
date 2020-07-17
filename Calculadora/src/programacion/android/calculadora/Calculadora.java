package programacion.android.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends Activity {
	
	private EditText numero1, numero2;
	private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        numero1 = (EditText) this.findViewById(R.id.numero1);
        numero2 = (EditText) this.findViewById(R.id.numero2);
        resultado = (TextView) this.findViewById(R.id.resultado);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculadora, menu);
        return true;
    }
    
    public void tratarSuma(View boton){
    	String sn1 = numero1.getText().toString();
    	String sn2 = numero2.getText().toString();
    	if(sn1.length() !=0 && sn2.length() !=0){
    		float n1 = Float.parseFloat(sn1);
    		float n2 = Float.parseFloat(sn2);
    		String suma = String.valueOf(n1+n2);
    		resultado.setText(suma);
    	}
    }
    
    public void tratarResta(View boton){	
    	String sn1 = numero1.getText().toString();
    	String sn2 = numero2.getText().toString();
    	if(sn1.length() !=0 && sn2.length() !=0){
    		float n1 = Float.parseFloat(sn1);
    		float n2 = Float.parseFloat(sn2);
    		String resta = String.valueOf(n1-n2);
    		resultado.setText(resta);
    	}
    }
    public void tratarMultiplicacion(View boton){
    	String sn1 = numero1.getText().toString();
    	String sn2 = numero2.getText().toString();
    	if(sn1.length() !=0 && sn2.length() !=0){
    		float n1 = Float.parseFloat(sn1);
    		float n2 = Float.parseFloat(sn2);
    		String multiplicacion = String.valueOf(n1*n2);
    		resultado.setText(multiplicacion);
    	}
    	
    }
    public void tratarDivision(View boton){
    	String sn1 = numero1.getText().toString();
    	String sn2 = numero2.getText().toString();
    	if(sn1.length() !=0 && sn2.length() !=0){
    		float n1 = Float.parseFloat(sn1);
    		float n2 = Float.parseFloat(sn2);
    		String division;
    		if(n2 == 0.0f){
    			division = "División por cero";
    		}else{
    			division = String.valueOf(n1/n2);
    		}
    		resultado.setText(division);
    	}
    }
    public void tratarPotencia(View boton){
    	String sn1 = numero1.getText().toString();
    	String sn2 = numero2.getText().toString();
    	if(sn1.length() !=0 && sn2.length() !=0){
    		double n1 = Double.parseDouble(sn1);
    		double n2 = Double.parseDouble(sn2);
    		double elevado = Math.pow(n1, n2);
    		String stringElevado = String.valueOf(elevado);
    		resultado.setText(stringElevado);
    	}
    }
    
    public void tratarLimpiar(View boton){
    	numero1.setText("");
    	numero1.clearFocus();
    	numero2.setText("");
    	numero2.clearFocus();
    	resultado.setText("");
    }
}
