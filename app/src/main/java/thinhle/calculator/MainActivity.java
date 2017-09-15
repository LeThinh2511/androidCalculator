package thinhle.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnNum1;
    private Button btnNum2;
    private Button btnNum3;
    private Button btnNum4;
    private Button btnNum5;
    private Button btnNum6;
    private Button btnNum7;
    private Button btnNum8;
    private Button btnNum9;
    private Button btnNum0;
    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;
    private Button btnAC;
    private Button btnC;
    private Button btnBang;
    private Button btnCham;
    private EditText edtInput;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setEventClickViews();
    }


    public void initView()
    {
        btnNum1 = (Button) findViewById(R.id.num1);
        btnNum2 = (Button) findViewById(R.id.num2);
        btnNum3 = (Button) findViewById(R.id.num3);
        btnNum4 = (Button) findViewById(R.id.num4);
        btnNum5 = (Button) findViewById(R.id.num5);
        btnNum6 = (Button) findViewById(R.id.num6);
        btnNum7 = (Button) findViewById(R.id.num7);
        btnNum8 = (Button) findViewById(R.id.num8);
        btnNum9 = (Button) findViewById(R.id.num9);
        btnNum0 = (Button) findViewById(R.id.num0);
        btnCong = (Button) findViewById(R.id.cong);
        btnTru = (Button) findViewById(R.id.tru);
        btnNhan = (Button) findViewById(R.id.nhan);
        btnChia = (Button) findViewById(R.id.chia);
        btnAC = (Button) findViewById(R.id.ac);
        btnC = (Button) findViewById(R.id.c);
        btnBang = (Button) findViewById(R.id.bang);
        btnCham = (Button) findViewById(R.id.cham);
        edtInput = (EditText) findViewById(R.id.edt_input);
        tvResult = (TextView) findViewById(R.id.tv_result);
    }

    public void setEventClickViews()
    {
        btnNum1.setOnClickListener(this);
        btnNum2.setOnClickListener(this);
        btnNum3.setOnClickListener(this);
        btnNum4.setOnClickListener(this);
        btnNum5.setOnClickListener(this);
        btnNum6.setOnClickListener(this);
        btnNum7.setOnClickListener(this);
        btnNum8.setOnClickListener(this);
        btnNum9.setOnClickListener(this);
        btnNum0.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnCham.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.num1:
                edtInput.append("1");
                break;
            case R.id.num2:
                edtInput.append("2");
                break;
            case R.id.num3:
                edtInput.append("3");
                break;
            case R.id.num4:
                edtInput.append("4");
                break;
            case R.id.num5:
                edtInput.append("5");
                break;
            case R.id.num6:
                edtInput.append("6");
                break;
            case R.id.num7:
                edtInput.append("7");
                break;
            case R.id.num8:
                edtInput.append("8");
                break;
            case R.id.num9:
                edtInput.append("9");
                break;
            case R.id.num0:
                edtInput.append("0");
                break;
            case R.id.cong:
                edtInput.append("+");
                break;
            case R.id.tru:
                edtInput.append("-");
                break;
            case R.id.nhan:
                edtInput.append("x");
                break;
            case R.id.chia:
                edtInput.append("/");
                break;
            case R.id.cham:
                edtInput.append(".");
                break;
            case R.id.ac:
                edtInput.setText("");
                break;
            case R.id.c:
                edtInput.setText(deleteAChar(edtInput.getText().toString()));
                break;
            case R.id.bang:
                edtInput.append("1");
                break;
        }
    }

    public String deleteAChar(String s)
    {
        int length = s.length();
        String tem = s.substring(0, length - 1);
        return tem;
    }
}
