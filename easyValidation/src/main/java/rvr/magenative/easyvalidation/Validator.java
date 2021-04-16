package rvr.magenative.easyvalidation;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validator {


    public static EditText validateEditText(EditText... editText) {
        EditText field = null;
        for (EditText text : editText) {
            if (text == null || text.getText().toString().trim().equals("")) {
                field = text;
                break;
            }
        }
        return field;
    }


    public  static boolean isEmptyEditText(EditText... editTexts){
        boolean isEmpty = false;
        for (EditText text : editTexts) {
            if (text == null || text.getText().toString().trim().equals("")) {
                isEmpty = true;
                break;
            }
        }
        return isEmpty;
    }


    public  static boolean isValidEmail(String email){
        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (email.matches(emailPattern)){
            return true;
        }else {
            return false;
        }

    }





}


