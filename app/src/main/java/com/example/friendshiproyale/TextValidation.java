package com.example.friendshiproyale;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;


public class TextValidation implements TextWatcher {
        private final TextView textView;

        public TextValidation(TextView textView) {
            this.textView = textView;
        }



        public void nameValidate(TextView textView, String text){
            if (textView.length() > 20) {
                textView.setError("Must be less than 20 characters");
            }else{
                textView.setError(null);
            }
        }

        @Override
        final public void afterTextChanged(Editable s) {
            String text = textView.getText().toString();
            nameValidate(textView, text);
        }

        @Override
        final public void beforeTextChanged(CharSequence s, int start, int count, int after) { /* Don't care */ }

        @Override
        final public void onTextChanged(CharSequence s, int start, int before, int count) { /* Don't care */ }
}

