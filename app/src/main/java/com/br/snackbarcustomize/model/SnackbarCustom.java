package com.br.snackbarcustomize.model;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

public class SnackbarCustom {
    private View view;
    private CharSequence text;
    private int duration; /* duration == 0 => Snackbar.LENGTH_LONG | duration == -1 => Snackbar.LENGTH_SHORT */
    private String hexadecimalBackground;
    private String hexadecimalColor;

    public SnackbarCustom(){

    }

    public SnackbarCustom(View view, CharSequence text, Integer duration, String hexadecimalBackground, String hexadecimalColor) {
        this.view = view;
        this.text = text;
        this.duration = duration;
        this.hexadecimalBackground = hexadecimalBackground;
        this.hexadecimalColor = hexadecimalColor;
    }

    /* Call => SnackbarCustom.make(view, "Your text here", 0, "#000000").show(); */
    public static Snackbar make(View view, CharSequence text, int duration, String hexadecimalBackground){
        Snackbar snackbar = Snackbar.make(view, text, duration);
        View snackView = snackbar.getView();
        snackView.setBackgroundColor(Color.parseColor(hexadecimalBackground));
        return snackbar;
    }
    /* Call => SnackbarCustom.make(view, "Your text here", 0, "#000000", ""#FFFFFF).show(); */
    public static Snackbar make(View view, CharSequence text, int duration, String hexadecimalBackground, String hexadecimalColor){
        Snackbar snackbar = Snackbar.make(view, text, duration);
        View snackView = snackbar.getView();
        snackView.setBackgroundColor(Color.parseColor(hexadecimalBackground));
        TextView textView = (TextView) snackView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.parseColor(hexadecimalColor));
        return snackbar;
    }

    public void showComplete(){
        Snackbar snackbar = Snackbar.make(this.view, this.text, this.duration);
        View snackView = snackbar.getView();
        snackView.setBackgroundColor(Color.parseColor(this.hexadecimalBackground));
        TextView textView = (TextView) snackView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.parseColor(this.hexadecimalColor));
        snackbar.show();
    }

    public void showBackgroundColor(){
        Snackbar snackbar = Snackbar.make(this.view, this.text, this.duration);
        View snackView = snackbar.getView();
        snackView.setBackgroundColor(Color.parseColor(this.hexadecimalBackground));
        snackbar.show();
    }

    public void showTextColor(){
        Snackbar snackbar = Snackbar.make(this.view, this.text, this.duration);
        View snackView = snackbar.getView();
        TextView textView = (TextView) snackView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.parseColor(this.hexadecimalColor));
        snackbar.show();
    }
    public void setView(View view) {
        this.view = view;
    }

    public void setText(CharSequence text) {
        this.text = text;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setHexadecimalBackground(String hexadecimalBackground) {
        this.hexadecimalBackground = hexadecimalBackground;
    }

    public void setHexadecimalColor(String getHexadecimalColor) {
        this.hexadecimalColor = getHexadecimalColor;
    }
}
