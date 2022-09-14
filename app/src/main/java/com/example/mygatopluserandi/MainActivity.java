package com.example.mygatopluserandi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button arreglo [] [];
    int turno=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arreglo = new Button[6][6];
        arreglo[0][0] = this.findViewById(R.id.boton00);
        arreglo[0][1] = this.findViewById(R.id.boton01);
        arreglo[0][2] = this.findViewById(R.id.boton02);
        arreglo[0][3] = this.findViewById(R.id.boton03);
        arreglo[0][4] = this.findViewById(R.id.boton04);
        arreglo[0][5] = this.findViewById(R.id.boton05);
        arreglo[1][0] = this.findViewById(R.id.boton10);
        arreglo[1][1] = this.findViewById(R.id.boton11);
        arreglo[1][2] = this.findViewById(R.id.boton12);
        arreglo[1][3] = this.findViewById(R.id.boton13);
        arreglo[1][4] = this.findViewById(R.id.boton14);
        arreglo[1][5] = this.findViewById(R.id.boton15);
        arreglo[2][0] = this.findViewById(R.id.boton20);
        arreglo[2][1] = this.findViewById(R.id.boton21);
        arreglo[2][2] = this.findViewById(R.id.boton22);
        arreglo[2][3] = this.findViewById(R.id.boton23);
        arreglo[2][4] = this.findViewById(R.id.boton24);
        arreglo[2][5] = this.findViewById(R.id.boton25);
        arreglo[3][0] = this.findViewById(R.id.boton30);
        arreglo[3][1] = this.findViewById(R.id.boton31);
        arreglo[3][2] = this.findViewById(R.id.boton32);
        arreglo[3][3] = this.findViewById(R.id.boton33);
        arreglo[3][4] = this.findViewById(R.id.boton34);
        arreglo[3][5] = this.findViewById(R.id.boton35);
        arreglo[4][0] = this.findViewById(R.id.boton40);
        arreglo[4][1] = this.findViewById(R.id.boton41);
        arreglo[4][2] = this.findViewById(R.id.boton42);
        arreglo[4][3] = this.findViewById(R.id.boton43);
        arreglo[4][4] = this.findViewById(R.id.boton44);
        arreglo[4][5] = this.findViewById(R.id.boton45);
        arreglo[5][0] = this.findViewById(R.id.boton50);
        arreglo[5][1] = this.findViewById(R.id.boton51);
        arreglo[5][2] = this.findViewById(R.id.boton52);
        arreglo[5][3] = this.findViewById(R.id.boton53);
        arreglo[5][4] = this.findViewById(R.id.boton54);
        arreglo[5][5] = this.findViewById(R.id.boton55);
    }

    public void darValor(int fila, int columna){
        if(arreglo[fila][columna].getText().equals("")){
            if (turno==1){
                arreglo[fila][columna].setText("x");
                turno = 2;
            }else{
                arreglo[fila][columna].setText("O");
                turno = 1;
            }
            comprobar();
        }
    }

    public void comprobar() {
        if (arreglo[0][0].getText().equals("x") && arreglo [0][1].getText().equals("x")
                && arreglo[0][2].getText().equals("x") && arreglo [0][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].getText().equals("x") && arreglo [0][2].getText().equals("x")
                && arreglo[0][3].getText().equals("x") && arreglo [0][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].getText().equals("x") && arreglo [0][3].getText().equals("x")
                && arreglo[0][4].getText().equals("x") && arreglo [0][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][0].getText().equals("x") && arreglo [1][1].getText().equals("x")
                && arreglo[1][2].getText().equals("x") && arreglo [1][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].getText().equals("x") && arreglo [1][2].getText().equals("x")
                && arreglo[1][3].getText().equals("x") && arreglo [1][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][2].getText().equals("x") && arreglo [1][3].getText().equals("x")
                && arreglo[1][4].getText().equals("x") && arreglo [1][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].getText().equals("x") && arreglo [2][1].getText().equals("x")
                && arreglo[2][2].getText().equals("x") && arreglo [2][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][1].getText().equals("x") && arreglo [2][2].getText().equals("x")
                && arreglo[2][3].getText().equals("x") && arreglo [2][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].getText().equals("x") && arreglo [2][3].getText().equals("x")
                && arreglo[2][4].getText().equals("x") && arreglo [2][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][0].getText().equals("x") && arreglo [3][1].getText().equals("x")
                && arreglo[3][2].getText().equals("x") && arreglo [3][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][1].getText().equals("x") && arreglo [3][2].getText().equals("x")
                && arreglo[3][3].getText().equals("x") && arreglo [3][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][2].getText().equals("x") && arreglo [3][3].getText().equals("x")
                && arreglo[3][4].getText().equals("x") && arreglo [3][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][0].getText().equals("x") && arreglo [4][1].getText().equals("x")
                && arreglo[4][2].getText().equals("x") && arreglo [4][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][1].getText().equals("x") && arreglo [4][2].getText().equals("x")
                && arreglo[4][3].getText().equals("x") && arreglo [4][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][2].getText().equals("x") && arreglo [4][3].getText().equals("x")
                && arreglo[4][4].getText().equals("x") && arreglo [4][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][0].getText().equals("x") && arreglo [5][1].getText().equals("x")
                && arreglo[5][2].getText().equals("x") && arreglo [5][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][1].getText().equals("x") && arreglo [5][2].getText().equals("x")
                && arreglo[5][3].getText().equals("x") && arreglo [5][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][2].getText().equals("x") && arreglo [5][3].getText().equals("x")
                && arreglo[5][4].getText().equals("x") && arreglo [5][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][0].getText().equals("x") && arreglo [1][0].getText().equals("x")
                && arreglo[2][0].getText().equals("x") && arreglo [3][0].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][0].getText().equals("x") && arreglo [2][0].getText().equals("x")
                && arreglo[3][0].getText().equals("x") && arreglo [4][0].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].getText().equals("x") && arreglo [3][0].getText().equals("x")
                && arreglo[4][0].getText().equals("x") && arreglo [5][0].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].getText().equals("x") && arreglo [1][1].getText().equals("x")
                && arreglo[2][1].getText().equals("x") && arreglo [3][1].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].getText().equals("x") && arreglo [2][1].getText().equals("x")
                && arreglo[3][1].getText().equals("x") && arreglo [4][1].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][1].getText().equals("x") && arreglo [3][1].getText().equals("x")
                && arreglo[4][1].getText().equals("x") && arreglo [5][1].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].getText().equals("x") && arreglo [1][2].getText().equals("x")
                && arreglo[2][2].getText().equals("x") && arreglo [3][2].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][2].getText().equals("x") && arreglo [2][2].getText().equals("x")
                && arreglo[3][2].getText().equals("x") && arreglo [4][2].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].getText().equals("x") && arreglo [3][2].getText().equals("x")
                && arreglo[4][2].getText().equals("x") && arreglo [5][2].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][3].getText().equals("x") && arreglo [1][3].getText().equals("x")
                && arreglo[2][3].getText().equals("x") && arreglo [3][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][3].getText().equals("x") && arreglo [2][3].getText().equals("x")
                && arreglo[3][3].getText().equals("x") && arreglo [4][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][3].getText().equals("x") && arreglo [3][3].getText().equals("x")
                && arreglo[4][3].getText().equals("x") && arreglo [5][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][4].getText().equals("x") && arreglo [1][4].getText().equals("x")
                && arreglo[2][4].getText().equals("x") && arreglo [3][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][4].getText().equals("x") && arreglo [2][4].getText().equals("x")
                && arreglo[3][4].getText().equals("x") && arreglo [4][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][4].getText().equals("x") && arreglo [3][4].getText().equals("x")
                && arreglo[4][4].getText().equals("x") && arreglo [5][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][5].getText().equals("x") && arreglo [1][5].getText().equals("x")
                && arreglo[2][5].getText().equals("x") && arreglo [3][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][5].getText().equals("x") && arreglo [2][5].getText().equals("x")
                && arreglo[3][5].getText().equals("x") && arreglo [4][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][5].getText().equals("x") && arreglo [3][5].getText().equals("x")
                && arreglo[4][5].getText().equals("x") && arreglo [5][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][0].getText().equals("x") && arreglo [1][1].getText().equals("x")
                && arreglo[2][2].getText().equals("x") && arreglo [3][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].getText().equals("x") && arreglo [2][2].getText().equals("x")
                && arreglo[3][3].getText().equals("x") && arreglo [4][4].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].getText().equals("x") && arreglo [3][3].getText().equals("x")
                && arreglo[4][4].getText().equals("x") && arreglo [5][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][5].getText().equals("x") && arreglo [1][4].getText().equals("x")
                && arreglo[2][3].getText().equals("x") && arreglo [3][2].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][4].getText().equals("x") && arreglo [2][3].getText().equals("x")
                && arreglo[3][2].getText().equals("x") && arreglo [4][1].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][3].getText().equals("x") && arreglo [3][2].getText().equals("x")
                && arreglo[4][1].getText().equals("x") && arreglo [5][0].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].getText().equals("x") && arreglo [1][3].getText().equals("x")
                && arreglo[2][4].getText().equals("x") && arreglo [3][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].getText().equals("x") && arreglo [3][1].getText().equals("x")
                && arreglo[4][2].getText().equals("x") && arreglo [5][3].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][3].getText().equals("x") && arreglo [1][2].getText().equals("x")
                && arreglo[2][1].getText().equals("x") && arreglo [3][0].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][2].getText().equals("x") && arreglo [4][3].getText().equals("x")
                && arreglo[3][4].getText().equals("x") && arreglo [2][5].getText().equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][0].getText().equals("O") && arreglo [0][1].getText().equals("O")
                && arreglo[0][2].getText().equals("O") && arreglo [0][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].getText().equals("O") && arreglo [0][2].getText().equals("O")
                && arreglo[0][3].getText().equals("O") && arreglo [0][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].getText().equals("O") && arreglo [0][3].getText().equals("O")
                && arreglo[0][4].getText().equals("O") && arreglo [0][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][0].getText().equals("O") && arreglo [1][1].getText().equals("O")
                && arreglo[1][2].getText().equals("O") && arreglo [1][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].getText().equals("O") && arreglo [1][2].getText().equals("O")
                && arreglo[1][3].getText().equals("O") && arreglo [1][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][2].getText().equals("O") && arreglo [1][3].getText().equals("O")
                && arreglo[1][4].getText().equals("O") && arreglo [1][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].getText().equals("O") && arreglo [2][1].getText().equals("O")
                && arreglo[2][2].getText().equals("O") && arreglo [2][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][1].getText().equals("O") && arreglo [2][2].getText().equals("O")
                && arreglo[2][3].getText().equals("O") && arreglo [2][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].getText().equals("O") && arreglo [2][3].getText().equals("O")
                && arreglo[2][4].getText().equals("O") && arreglo [2][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][0].getText().equals("O") && arreglo [3][1].getText().equals("O")
                && arreglo[3][2].getText().equals("O") && arreglo [3][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][1].getText().equals("O") && arreglo [3][2].getText().equals("O")
                && arreglo[3][3].getText().equals("O") && arreglo [3][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][2].getText().equals("O") && arreglo [3][3].getText().equals("O")
                && arreglo[3][4].getText().equals("O") && arreglo [3][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][0].getText().equals("O") && arreglo [4][1].getText().equals("O")
                && arreglo[4][2].getText().equals("O") && arreglo [4][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][1].getText().equals("O") && arreglo [4][2].getText().equals("O")
                && arreglo[4][3].getText().equals("O") && arreglo [4][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][2].getText().equals("O") && arreglo [4][3].getText().equals("O")
                && arreglo[4][4].getText().equals("O") && arreglo [4][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][0].getText().equals("O") && arreglo [5][1].getText().equals("O")
                && arreglo[5][2].getText().equals("O") && arreglo [5][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][1].getText().equals("O") && arreglo [5][2].getText().equals("O")
                && arreglo[5][3].getText().equals("O") && arreglo [5][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][2].getText().equals("O") && arreglo [5][3].getText().equals("O")
                && arreglo[5][4].getText().equals("O") && arreglo [5][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][0].getText().equals("O") && arreglo [1][0].getText().equals("O")
                && arreglo[2][0].getText().equals("O") && arreglo [3][0].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][0].getText().equals("O") && arreglo [2][0].getText().equals("O")
                && arreglo[3][0].getText().equals("O") && arreglo [4][0].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].getText().equals("O") && arreglo [3][0].getText().equals("O")
                && arreglo[4][0].getText().equals("O") && arreglo [5][0].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].getText().equals("O") && arreglo [1][1].getText().equals("O")
                && arreglo[2][1].getText().equals("O") && arreglo [3][1].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].getText().equals("O") && arreglo [2][1].getText().equals("O")
                && arreglo[3][1].getText().equals("O") && arreglo [4][1].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][1].getText().equals("O") && arreglo [3][1].getText().equals("O")
                && arreglo[4][1].getText().equals("O") && arreglo [5][1].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].getText().equals("O") && arreglo [1][2].getText().equals("O")
                && arreglo[2][2].getText().equals("O") && arreglo [3][2].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][2].getText().equals("O") && arreglo [2][2].getText().equals("O")
                && arreglo[3][2].getText().equals("O") && arreglo [4][2].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].getText().equals("O") && arreglo [3][2].getText().equals("O")
                && arreglo[4][2].getText().equals("O") && arreglo [5][2].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][3].getText().equals("O") && arreglo [1][3].getText().equals("O")
                && arreglo[2][3].getText().equals("O") && arreglo [3][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][3].getText().equals("O") && arreglo [2][3].getText().equals("O")
                && arreglo[3][3].getText().equals("O") && arreglo [4][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][3].getText().equals("O") && arreglo [3][3].getText().equals("O")
                && arreglo[4][3].getText().equals("O") && arreglo [5][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][4].getText().equals("O") && arreglo [1][4].getText().equals("O")
                && arreglo[2][4].getText().equals("O") && arreglo [3][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][4].getText().equals("O") && arreglo [2][4].getText().equals("O")
                && arreglo[3][4].getText().equals("O") && arreglo [4][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][4].getText().equals("O") && arreglo [3][4].getText().equals("O")
                && arreglo[4][4].getText().equals("O") && arreglo [5][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][5].getText().equals("O") && arreglo [1][5].getText().equals("O")
                && arreglo[2][5].getText().equals("O") && arreglo [3][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][5].getText().equals("O") && arreglo [2][5].getText().equals("O")
                && arreglo[3][5].getText().equals("O") && arreglo [4][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][5].getText().equals("O") && arreglo [3][5].getText().equals("O")
                && arreglo[4][5].getText().equals("O") && arreglo [5][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][0].getText().equals("O") && arreglo [1][1].getText().equals("O")
                && arreglo[2][2].getText().equals("O") && arreglo [3][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].getText().equals("O") && arreglo [2][2].getText().equals("O")
                && arreglo[3][3].getText().equals("O") && arreglo [4][4].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].getText().equals("O") && arreglo [3][3].getText().equals("O")
                && arreglo[4][4].getText().equals("O") && arreglo [5][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][5].getText().equals("O") && arreglo [1][4].getText().equals("O")
                && arreglo[2][3].getText().equals("2") && arreglo [3][2].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][4].getText().equals("O") && arreglo [2][3].getText().equals("O")
                && arreglo[3][2].getText().equals("O") && arreglo [4][1].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][3].getText().equals("O") && arreglo [3][2].getText().equals("O")
                && arreglo[4][1].getText().equals("O") && arreglo [5][0].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].getText().equals("O") && arreglo [1][3].getText().equals("O")
                && arreglo[2][4].getText().equals("O") && arreglo [3][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].getText().equals("O") && arreglo [3][1].getText().equals("O")
                && arreglo[4][2].getText().equals("O") && arreglo [5][3].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][3].getText().equals("O") && arreglo [1][2].getText().equals("O")
                && arreglo[2][1].getText().equals("O") && arreglo [3][0].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][2].getText().equals("O") && arreglo [4][3].getText().equals("O")
                && arreglo[3][4].getText().equals("O") && arreglo [2][5].getText().equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][0].getText().equals("x") && arreglo [0][1].getText().equals("O")
                && arreglo[0][2].getText().equals("x") && arreglo [0][3].getText().equals("O")
                && arreglo[0][4].getText().equals("x") && arreglo [0][5].getText().equals("O")
                && arreglo[1][0].getText().equals("O") && arreglo [1][1].getText().equals("x")
                && arreglo[1][2].getText().equals("O") && arreglo [1][3].getText().equals("x")
                && arreglo[1][4].getText().equals("O") && arreglo [1][5].getText().equals("x")
                && arreglo[2][0].getText().equals("x") && arreglo [2][1].getText().equals("O")
                && arreglo[2][2].getText().equals("x") && arreglo [2][3].getText().equals("O")
                && arreglo[2][4].getText().equals("x") && arreglo [2][5].getText().equals("O")
                && arreglo[3][0].getText().equals("x") && arreglo [3][1].getText().equals("O")
                && arreglo[3][2].getText().equals("x") && arreglo [3][3].getText().equals("O")
                && arreglo[3][4].getText().equals("x") && arreglo [3][5].getText().equals("O")
                && arreglo[4][0].getText().equals("O") && arreglo [4][1].getText().equals("x")
                && arreglo[4][2].getText().equals("O") && arreglo [4][3].getText().equals("x")
                && arreglo[4][4].getText().equals("O") && arreglo [4][5].getText().equals("x")
                && arreglo[5][0].getText().equals("O") && arreglo [5][1].getText().equals("x")
                && arreglo[5][2].getText().equals("O") && arreglo [5][3].getText().equals("x")
                && arreglo[5][4].getText().equals("O") && arreglo [5][5].getText().equals("x"))
        {
            Toast.makeText(this, "Empate", Toast.LENGTH_LONG).show();
        }
    }
    public void boton00(View view){
        darValor( 0, 0);
    }
    public void boton01(View view){
        darValor(0, 1);
    }
    public void boton02(View view){
        darValor(0, 2);
    }
    public void boton03(View view){
        darValor(0, 3);
    }
    public void boton04(View view){
        darValor(0, 4);
    }
    public void boton05(View view){
        darValor(0, 5);
    }
    public void boton10(View view){
        darValor(1, 0);
    }
    public void boton11(View view){
        darValor(1, 1);
    }
    public void boton12(View view) {
        darValor(1, 2);
    }
    public void boton13(View view){
        darValor(1, 3);
    }
    public void boton14(View view){
        darValor(1, 4);
    }
    public void boton15(View view){
        darValor(1, 5);
    }
    public void boton20(View view){
        darValor(2, 0);
    }
    public void boton21(View view){
        darValor(2, 1);
    }
    public void boton22(View view){
        darValor(2, 2);
    }
    public void boton23(View view){
        darValor(2, 3);
    }
    public void boton24(View view){
        darValor(2, 4);
    }
    public void boton25(View view){
        darValor(2, 5);
    }
    public void boton30(View view){
        darValor(3, 0);
    }
    public void boton31(View view){
        darValor(3, 1);
    }
    public void boton32(View view){
        darValor(3, 2);
    }
    public void boton33(View view){
        darValor(3, 3);
    }
    public void boton34(View view){
        darValor(3, 4);
    }
    public void boton35(View view){
        darValor(3, 5);
    }
    public void boton40(View view){
        darValor(4, 0);
    }
    public void boton41(View view){
        darValor(4, 1);
    }
    public void boton42(View view){
        darValor(4, 2);
    }
    public void boton43(View view){
        darValor(4, 3);
    }
    public void boton44(View view){
        darValor(4, 4);
    }
    public void boton45(View view){
        darValor(4, 5);
    }
    public void boton50(View view){
        darValor(5, 0);
    }
    public void boton51(View view){
        darValor(5, 1);
    }
    public void boton52(View view){
        darValor(5, 2);
    }
    public void boton53(View view){
        darValor(5, 3);
    }
    public void boton54(View view){
        darValor(5, 4);
    }
    public void boton55(View view){
        darValor(5, 5);
    }



}