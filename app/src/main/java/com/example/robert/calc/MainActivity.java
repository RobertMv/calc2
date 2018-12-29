package com.example.robert.calc;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public float numberOne;
    public float numberTwo;
    public float result;

    EditText editTextOne;
    EditText editTextTwo;

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextOne = (EditText) findViewById(R.id.editTextOne);
        editTextTwo = (EditText) findViewById(R.id.editTextTwo);
        resultText = (TextView) findViewById(R.id.textResult);
    }


    public void buttonClick(View view) {

        switch (view.getId()) {
            //запуск третьего активити(матрричный кальк)
            case R.id.btnOfThirdActivity: {
                Intent intent = new Intent(this, ActivityThree.class);
                startActivity(intent);
                break;
            }
            //кнопка запускающая второе активити (конвертор)
            case R.id.btnOfSecondActivity: {
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            }

            case R.id.buttonPlus:{
                try{
                    numberOne = Float.parseFloat(editTextOne.getText().toString());
                    numberTwo = Float.parseFloat(editTextTwo.getText().toString());
                    result = numberOne + numberTwo;
                    resultText.setText(String.valueOf(result));
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите оба числа",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
                }
                break;
            }
            case R.id.buttonMinus:{
                try {
                    numberOne = Float.parseFloat(editTextOne.getText().toString());
                    numberTwo = Float.parseFloat(editTextTwo.getText().toString());
                    result = numberOne - numberTwo;
                    resultText.setText(String.valueOf(result));
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите оба числа",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
                }
                break;
            }
            case R.id.buttonDivide:{
                try {
                    numberOne = Float.parseFloat(editTextOne.getText().toString());
                    numberTwo = Float.parseFloat(editTextTwo.getText().toString());
                    result = numberOne / numberTwo;
                    resultText.setText(String.valueOf(result));
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите оба числа",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
                }
                break;
            }
            case R.id.buttonMult:{
                try {
                    numberOne = Float.parseFloat(editTextOne.getText().toString());
                    numberTwo = Float.parseFloat(editTextTwo.getText().toString());
                    result = numberOne * numberTwo;
                    resultText.setText(String.valueOf(result));
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите оба числа",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
                }
                break;
            }
        }
    }

}
