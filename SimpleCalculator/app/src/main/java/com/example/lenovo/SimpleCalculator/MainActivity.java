package com.example.lenovo.fengbaolu173401010410;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button 按钮0,按钮1,按钮2,按钮3,按钮4,按钮5,按钮6,按钮7,按钮8,按钮9,按钮小数点,按钮加,按钮减,按钮乘,按钮除,按钮等于,按钮AC;
    TextView 计算结果文本框;
    String  参数1,运算符,参数2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        按钮0=findViewById(R.id.按钮0);
        按钮1=findViewById(R.id.按钮1);
        按钮2=findViewById(R.id.按钮2);
        按钮3=findViewById(R.id.按钮3);
        按钮4=findViewById(R.id.按钮4);
        按钮5=findViewById(R.id.按钮5);
        按钮6=findViewById(R.id.按钮6);
        按钮7=findViewById(R.id.按钮7);
        按钮8=findViewById(R.id.按钮8);
        按钮9=findViewById(R.id.按钮9);
        按钮小数点=findViewById(R.id.按钮小数点);
        按钮加=findViewById(R.id.按钮加);
        按钮减=findViewById(R.id.按钮减);
        按钮乘=findViewById(R.id.按钮乘);
        按钮除=findViewById(R.id.按钮除);
        按钮等于=findViewById(R.id.按钮等于);
        按钮AC=findViewById(R.id.按钮AC);
        计算结果文本框=findViewById(R.id.textView计算结果);
        参数1="";
        参数2="";
        运算符="";
        计算结果文本框.setText("");
    }

    public void 按钮清除事件响应方法(View view) {

        计算结果文本框.setText("");
        参数1="";
        参数2="";
        运算符="";
    }

    public void 数值按钮事件响应方法(View view) {
        Button 数值=(Button) view;
        if(运算符=="") {
            参数1=参数1+数值.getText().toString();

        }else{
            参数2=参数2+数值.getText().toString();
        }
        计算结果文本框.setText(计算结果文本框.getText().toString()+数值.getText().toString());
    }

    public void 运算符按钮事件响应方法(View view) {

        Button 运算符按钮=(Button) view;

        if(参数1==""&&运算符 == "") {

            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
        }else if(参数1!=""&&运算符 ==""){

            运算符=运算符按钮.getText().toString();

            计算结果文本框.setText(计算结果文本框.getText().toString()+运算符);

        } else{
            Toast.makeText(this,"ERROR",Toast.LENGTH_SHORT).show();
        }
    }

    public void 等于按钮事件响应方法(View view) {

        if(参数1!=""&&参数2!=""){

            float num1,num2,result;
            num1 = Float.parseFloat(参数1);
            num2 = Float.parseFloat(参数2);

                switch(运算符) {
                    case "+":result=num1+num2;
                            计算结果文本框.setText(计算结果文本框.getText().toString()+"="+result);
                            break;
                    case "-":result=num1-num2;
                            计算结果文本框.setText(计算结果文本框.getText().toString()+"="+result);
                            break;
                    case "×":result=num1*num2;
                            计算结果文本框.setText(计算结果文本框.getText().toString()+"="+result);
                            break;
                    case "/":result=num1/num2;
                            计算结果文本框.setText(计算结果文本框.getText().toString()+"="+result);
                            break;
                }

        }else{
            Toast.makeText(this,"ERROR",Toast.LENGTH_SHORT).show();
        }
    }
}
