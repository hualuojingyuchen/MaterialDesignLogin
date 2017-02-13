package com.yoloho.materiallogin;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.et_username)
    EditText mEtUsername;
    @InjectView(R.id.et_password)
    EditText mEtPassword;
    @InjectView(R.id.bt_go)
    Button mBtGo;
    @InjectView(R.id.cv)
    CardView mCv;
    @InjectView(R.id.text_input_username)
    TextInputLayout mTextInputUsername;
    @InjectView(R.id.text_input_password)
    TextInputLayout mTextInputPassword;
    @InjectView(R.id.et_test)
    EditText mEtTest;
    @InjectView(R.id.til_test)
    TextInputLayout mTilTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initListener();

//        mEtTest.setError("只是展示下错误的显示样式2");
    }

    private void initListener() {
        mEtTest.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (isPasswordValid(s.toString().trim())){
                    mTilTest.setError("超过字符限制");
                }else{
                    if (mTilTest.getError()!=null){
                        mTilTest.setError(null);
                    }
                }
            }
        });

        mEtUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
//                if (TextUtils.isEmpty(mEtUsername.getText().toString().trim()) || !isAccountValid(mEtUsername.getText().toString().trim())) {
//                    mTextInputUsername.setError(getString(R.string.error_invalid_account));
//                }
//
////                if (TextUtils.isEmpty(mEtPassword.getText().toString().trim()) || !isPasswordValid(mEtPassword.getText().toString().trim())) {
////                    mTextInputPassword.setError(getString(R.string.error_invalid_password));
////                }
////                if (mEtPassword.getError() != null) {
////                    mEtPassword.setError(null);
////                }
//                if (mEtUsername.getError() != null) {
//                    mEtUsername.setError(null);
//                }
            }
        });
        mEtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
//                if (TextUtils.isEmpty(mEtUsername.getText().toString().trim()) || !isAccountValid(mEtUsername.getText().toString().trim())) {
//                    mTextInputUsername.setError(getString(R.string.error_invalid_account));
//                }

//                if (TextUtils.isEmpty(mEtPassword.getText().toString().trim()) || !isPasswordValid(mEtPassword.getText().toString().trim())) {
//                    mTextInputPassword.setError(getString(R.string.error_invalid_password));
//                }
//                if (mEtPassword.getError() != null) {
//                    mEtPassword.setError(null);
//                }
//                if (mEtUsername.getError() != null) {
//                    mEtUsername.setError(null);
//                }
            }
        });

    }

    private boolean isAccountValid(String name) {
        //TODO: Replace this with your own logic
        Pattern pattern = Pattern.compile("^(13[0-9]|14[5|7]|15\\d|17[6|7]|18[\\d])\\d{8}$");
        return pattern.matcher(name).matches();
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 11;
    }


    @OnClick({R.id.et_username, R.id.et_password, R.id.bt_go, R.id.cv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.et_username:

                break;
            case R.id.et_password:

                break;
            case R.id.bt_go:

//                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();

                break;
            case R.id.cv:
                break;
        }
    }

    @OnClick(R.id.text_input_username)
    public void onClick2() {
    }

    @OnClick(R.id.text_input_password)
    public void onClick() {
    }

    @OnClick({R.id.et_test, R.id.til_test})
    public void onClick3(View view) {
        switch (view.getId()) {
            case R.id.et_test:
                break;
            case R.id.til_test:
                break;
        }
    }
}
