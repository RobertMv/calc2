package com.example.robert.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityThree extends AppCompatActivity {

    TextView sizeText;
    TextView matrixAtext;
    TextView matrixBtext;
    TextView matrixCtext;
    //int [][] matrixA = new int[a][a];
    public int [][] resultA;
    public int [][] resultB;
    public int matrixSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        sizeText = (TextView) findViewById(R.id.sizeTextView);

        matrixAtext = (TextView) findViewById(R.id.matrixA);
        matrixBtext = (TextView) findViewById(R.id.matrixB);
        matrixCtext = (TextView) findViewById(R.id.matrixC);
    }

    public void buttonClick(View v){
        switch(v.getId()){
            case R.id.button1:{
                clearMethod();
                matrixSize = 1;
                sizeText.setText("1x1");
                fillMatrixA(1);
                fillMatrixB(1);
                break;
            }
            case R.id.button2:{
                clearMethod();
                matrixSize = 2;
                sizeText.setText("2x2");
                fillMatrixA(2);
                fillMatrixB(2);
                break;
            }
            case R.id.button3:{
                clearMethod();
                matrixSize = 3;
                sizeText.setText("3x3");
                fillMatrixA(3);
                fillMatrixB(3);
                break;
            }
            case R.id.buttonPlus:{
                try {
                    matrixCtext.setText(null);
                    plusResultMatrix(matrixSize, resultA, resultB);
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Выберите размерность матрицы",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
                }
                break;
            }
            case R.id.buttonMinus:{
                try {
                    matrixCtext.setText(null);
                    minusResultMatrix(matrixSize, resultA, resultB);
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Выберите размерность матрицы",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
                }
                break;
            }
            case R.id.buttonMult:{
                try{
                matrixCtext.setText(null);
                multResultMatrix(matrixSize, resultA, resultB);
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Выберите размерность матрицы",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
                }
                break;
            }
            case R.id.buttonTrans:{
                try{
                matrixCtext.setText(null);
                matrixBtext.setText(null);
                transResultMatrix(matrixSize, resultA);
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Выберите размерность матрицы",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
                }
                break;
            }

        }
    }

    public void fillMatrixA(int size){ //метод по заполнению матрицы А
        int [][] filledmatrixA = new int[size][size];
        StringBuilder strBuild = new StringBuilder();
        for(int i=0; i<filledmatrixA.length; i++){
            for (int j=0; j<filledmatrixA[i].length; j++){
                filledmatrixA [i][j] = (int)(Math.random()*11)-5;
                strBuild.append(filledmatrixA[i][j]);
                strBuild.append(" ");
                //matrixAtext.setText(matrixAtext.getText().toString() + filledmatrixA[i][j] + " ");
            }
            strBuild.append("\n");
        }
        matrixAtext.setText(strBuild.toString());
        resultA = filledmatrixA;
    }

    public void fillMatrixB(int size){ //метод по заполнению матрицы В
        int [][] filledmatrixB = new int[size][size];
        StringBuilder strBuild = new StringBuilder();
        for(int i=0; i<filledmatrixB.length; i++){
            for (int j=0; j<filledmatrixB[i].length; j++){
                filledmatrixB [i][j] = (int)(Math.random()*11)-5;
                strBuild.append(filledmatrixB[i][j]);
                strBuild.append(" ");
                //matrixBtext.setText(matrixBtext.getText().toString() + filledmatrixB[i][j] + " ");
            }
            strBuild.append("\n");
        }
        matrixBtext.setText(strBuild.toString());
        resultB = filledmatrixB;
    }

    public void plusResultMatrix(int size, int [][] matrixA, int [][] matrixB){
        int [][] matrixC = new int[size][size];
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixB.length; j++){
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                strBuild.append(matrixC[i][j]);
                strBuild.append(" ");
                //matrixCtext.setText(matrixCtext.getText().toString() + matrixC[i][j] + " ");
            }
            strBuild.append("\n");
        }
        matrixCtext.setText(strBuild.toString());
    }

    public void minusResultMatrix(int size, int [][] matrixA, int [][] matrixB){
        int [][] matrixC = new int[size][size];
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixB.length; j++){
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
                strBuild.append(matrixC[i][j]);
                strBuild.append(" ");
                //matrixCtext.setText(matrixCtext.getText().toString() + matrixC[i][j] + " ");
            }
            strBuild.append("\n");
        }
        matrixCtext.setText(strBuild.toString());
    }

    public void multResultMatrix(int size, int [][] matrixA, int [][] matrixB){
        int [][] matrixC = new int[size][size];
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixB.length; j++){
                matrixC[i][j] = matrixA[i][j] * matrixB[i][j];
                strBuild.append(matrixC[i][j]);
                strBuild.append(" ");
                //matrixCtext.setText(matrixCtext.getText().toString() + matrixC[i][j] + " ");
            }
            strBuild.append("\n");
        }
        matrixCtext.setText(strBuild.toString());
    }

    public void transResultMatrix(int size, int [][] matrixA){
        StringBuilder strBuild = new StringBuilder();
        int [][] matrixCTrans = new int[size][size];
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                matrixCTrans[i][j] = matrixA[j][i];
                strBuild.append(matrixCTrans[i][j]);
                strBuild.append(" ");
                //matrixCtext.setText(matrixCtext.getText().toString() + matrixA[i][j] + " ");
            }
            strBuild.append("\n");
        }
        matrixCtext.setText(strBuild.toString());
    }

    public void clearMethod(){
        matrixAtext.setText(null);
        matrixBtext.setText(null);
        matrixCtext.setText(null);
    }

}