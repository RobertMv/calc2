package com.example.robert.calc;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {
    // объявляю все вьюшки и переменную системы счисления
    EditText editTextOne;

    TextView resultBin;
    TextView resultOct;
    TextView resultDec;
    TextView resultHex;

    Button btnBin;
    Button btnOct;
    Button btnDec;
    Button btnHex;
    //Button minus;

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    Button btnA;
    Button btnB;
    Button btnC;
    Button btnD;
    Button btnE;
    Button btnF;

    public int systShisl;
   // private ActionType lastAction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        //нахожу все элементы по id
        editTextOne = (EditText) findViewById(R.id.editTextOne);

        resultBin = (TextView) findViewById(R.id.resultBin);
        resultOct = (TextView) findViewById(R.id.resultOct);
        resultDec = (TextView) findViewById(R.id.resultDec);
        resultHex = (TextView) findViewById(R.id.resultHex);

        btnBin = (Button) findViewById(R.id.buttonBin);
        btnOct = (Button) findViewById(R.id.buttonOct);
        btnDec = (Button) findViewById(R.id.buttonDec);
        btnHex = (Button) findViewById(R.id.buttonHex);

        btn0 = (Button) findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);

        btnA = (Button) findViewById(R.id.buttonA);
        btnB = (Button) findViewById(R.id.buttonB);
        btnC = (Button) findViewById(R.id.buttonC);
        btnD = (Button) findViewById(R.id.buttonD);
        btnE = (Button) findViewById(R.id.buttonE);
        btnF = (Button) findViewById(R.id.buttonF);

        //minus = (Button) findViewById(R.id.button_minus);

    }

    //метод для всех кнопок
    public void buttonClick(View v) {

        switch (v.getId()) {
            // при нажатии на клаву записывает числа в эдит текст
            case R.id.button0:
            case R.id.button1:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
            case R.id.button8:
            case R.id.button9:
            case R.id.buttonA:
            case R.id.buttonB:
            case R.id.buttonC:
            case R.id.buttonD:
            case R.id.buttonE:
            case R.id.buttonF:
           // case R.id.button_minus:
            {
                editTextOne.setText(editTextOne.getText() + v.getContentDescription().toString());

            }
            //ставит заяпятую
            case R.id.buttonComma: {

                break;
            }
            //кнопка очистки.
            // использует метод очистки полей который ниже
            case R.id.buttonClear: {
                clearMethod();
                break;
            }

            case R.id.buttonBin: {
              /*  String [] massiv = new String [4];
                String editTextOne = editTextOne.getText().toString;
                massiv = fromBinToOther(number);
              */

                //куда девать эту строку ??
                // fromBinToOther(editTextOne.getText().toString());
                systShisl = 2;
                btn2.setEnabled(false);
                disableButton(btn2);
                btn3.setEnabled(false);
                disableButton(btn3);
                btn4.setEnabled(false);
                disableButton(btn4);
                btn5.setEnabled(false);
                disableButton(btn5);
                btn6.setEnabled(false);
                disableButton(btn6);
                btn7.setEnabled(false);
                disableButton(btn7);
                btn8.setEnabled(false);
                disableButton(btn8);
                btn9.setEnabled(false);
                disableButton(btn9);
                btnA.setEnabled(false);
                disableButton(btnA);
                btnB.setEnabled(false);
                disableButton(btnB);
                btnC.setEnabled(false);
                disableButton(btnC);
                btnD.setEnabled(false);
                disableButton(btnD);
                btnE.setEnabled(false);
                disableButton(btnE);
                btnF.setEnabled(false);
                disableButton(btnF);
                clearMethod();
                break;
            }

            case R.id.buttonOct: {
                systShisl = 8;
                btn2.setEnabled(true);
                enableButton(btn2);
                btn3.setEnabled(true);
                enableButton(btn3);
                btn4.setEnabled(true);
                enableButton(btn4);
                btn5.setEnabled(true);
                enableButton(btn5);
                btn6.setEnabled(true);
                enableButton(btn6);
                btn7.setEnabled(true);
                enableButton(btn7);
                btn8.setEnabled(false);
                disableButton(btn8);
                btn9.setEnabled(false);
                disableButton(btn9);
                btnA.setEnabled(false);
                disableButton(btnA);
                btnB.setEnabled(false);
                disableButton(btnB);
                btnC.setEnabled(false);
                disableButton(btnC);
                btnD.setEnabled(false);
                disableButton(btnD);
                btnE.setEnabled(false);
                disableButton(btnE);
                btnF.setEnabled(false);
                disableButton(btnF);
                clearMethod();
                break;
            }

            case R.id.buttonDec: {
                systShisl = 10;
                btn2.setEnabled(true);
                enableButton(btn2);
                btn3.setEnabled(true);
                enableButton(btn3);
                btn4.setEnabled(true);
                enableButton(btn4);
                btn5.setEnabled(true);
                enableButton(btn5);
                btn6.setEnabled(true);
                enableButton(btn6);
                btn7.setEnabled(true);
                enableButton(btn7);
                btn8.setEnabled(true);
                enableButton(btn8);
                btn9.setEnabled(true);
                enableButton(btn9);
                btnA.setEnabled(false);
                disableButton(btnA);
                btnB.setEnabled(false);
                disableButton(btnB);
                btnC.setEnabled(false);
                disableButton(btnC);
                btnD.setEnabled(false);
                disableButton(btnD);
                btnE.setEnabled(false);
                disableButton(btnE);
                btnF.setEnabled(false);
                disableButton(btnF);
                clearMethod();
                break;
            }

            case R.id.buttonHex: {
                systShisl = 16;
                btn2.setEnabled(true);
                enableButton(btn2);
                btn3.setEnabled(true);
                enableButton(btn3);
                btn4.setEnabled(true);
                enableButton(btn4);
                btn5.setEnabled(true);
                enableButton(btn5);
                btn6.setEnabled(true);
                enableButton(btn6);
                btn7.setEnabled(true);
                enableButton(btn7);
                btn8.setEnabled(true);
                enableButton(btn8);
                btn9.setEnabled(true);
                enableButton(btn9);
                btnA.setEnabled(true);
                enableButton(btnA);
                btnB.setEnabled(true);
                enableButton(btnB);
                btnC.setEnabled(true);
                enableButton(btnC);
                btnD.setEnabled(true);
                enableButton(btnD);
                btnE.setEnabled(true);
                enableButton(btnE);
                btnF.setEnabled(true);
                enableButton(btnF);
                clearMethod();
                break;
            }
            // кнопка "ПЕРЕВЕСТИ" вызывает метод перевода
            // в зависимости от переменной исходной системы счисления
            case R.id.resultButton: {
                try {
                    if (systShisl == 2) {
                        fromBinToOther(editTextOne.getText().toString());
                    } else if (systShisl == 8) {
                        fromOctToOther(editTextOne.getText().toString());
                    } else if (systShisl == 10) {
                        fromDecToOther(editTextOne.getText().toString());
                    } else if (systShisl == 16) {
                        fromHexToOther(editTextOne.getText().toString());
                    } else break;
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите число для перевода",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
                }
            }

        }
    }

    /*public void clickClick(View view){

    }*/
    //метод очистки полей ответа и поля ввода
    public void clearMethod() {
        editTextOne.setText(null);
        resultBin.setText(null);
        resultOct.setText(null);
        resultDec.setText(null);
        resultHex.setText(null);
    }

    //делаю кнопки серыми чтоюы придать им вид не активных
    public void disableButton(Button btn) {
        btn.getBackground().setColorFilter(Color.parseColor("#D6D7D7"), PorterDuff.Mode.MULTIPLY);
    }

    // наоборот, возвращаю им естественный цвет активной кнопки
    public void enableButton(Button btn) {
        btn.getBackground().setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.MULTIPLY);
    }

    //метод по переводу двочиного числа
    // во все остальные системы счисления 2,8,10,16
    // и установки результата в текст вью
    public void fromBinToOther(String number) {
        String resultBinary = Long.toBinaryString((Long.parseLong(number, 2)));
        String resultOctal = Long.toOctalString((Long.parseLong(number, 2)));
        String resultDecimal = Long.toString((Long.parseLong(number, 2)));
        String resultHexadecimal = Long.toHexString((Long.parseLong(number, 2)));

        resultBin.setText(resultBinary);
        resultOct.setText(resultOctal);
        resultDec.setText(resultDecimal);
        resultHex.setText(resultHexadecimal);

      /*  String [] mas = new String[4];
        mas[0] = resultBinary;
        mas[1] = resultOctal;
        mas[2] = resultDecimal;
        mas[3] = resultHexadecimal;
      */

    }

    //аналогично, только уже из восьмиричного во все остальные
    public void fromOctToOther(String number) {
        String resultBinary = Long.toBinaryString((Long.parseLong(number, 8)));
        String resultOctal = Long.toOctalString(Long.parseLong(number, 8));
        String resultDecimal = Long.toString(Long.parseLong(number, 8));
        String resultHexadecimal = Long.toHexString(Long.parseLong(number, 8));

        resultBin.setText(resultBinary);
        resultOct.setText(resultOctal);
        resultDec.setText(resultDecimal);
        resultHex.setText(resultHexadecimal);
    }

    //из десятичного во все остальные
    public void fromDecToOther(String number) {
        String resultBinary = Long.toBinaryString((Long.parseLong(number, 10)));
        String resultOctal = Long.toOctalString(Long.parseLong(number, 10));
        String resultDecimal = Long.toString(Long.parseLong(number, 10));
        String resultHexadecimal = Long.toHexString(Long.parseLong(number, 10));

        resultBin.setText(resultBinary);
        resultOct.setText(resultOctal);
        resultDec.setText(resultDecimal);
        resultHex.setText(resultHexadecimal);
    }

    // из шестнадцатиричного
    public void fromHexToOther(String number) {
        String resultBinary = Long.toBinaryString((Long.parseLong(number, 16)));
        String resultOctal = Long.toOctalString(Long.parseLong(number, 16));
        String resultDecimal = Long.toString(Long.parseLong(number, 16));
        String resultHexadecimal = Long.toHexString(Long.parseLong(number, 16));

        resultBin.setText(resultBinary);
        resultOct.setText(resultOctal);
        resultDec.setText(resultDecimal);
        resultHex.setText(resultHexadecimal);
    }

  /*  private double getDouble(Object value) {
        double result = 0;
        try {
            // замена запятой на точку
            result = Double.valueOf(value.toString().replace(',', '.')).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
            result = 0;
        }

        return result;
    }*/

}
