package com.example.qudracticsolver;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.qudracticsolver.databinding.ActivityMainBinding;

public class Myquationsolver extends BaseObservable {
    String a;
    String b;
    String c;
    ActivityMainBinding binding;

    public Myquationsolver(ActivityMainBinding binding) {
        this.binding = binding;
    }

    public Myquationsolver() {
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
    public void soleq(View view)
    {
        int a=Integer.parseInt(getA());
        int b=Integer.parseInt(getB());
        int c=Integer.parseInt(getC());
        //calclaute the discriminat
        double dis= b*b-4*a*c;
        double x1,x2;

        if(dis>0)
        {
            //two real and distinct roots
            x1=(-b+Math.sqrt(dis))/2*a;
            x2=(-b-Math.sqrt(dis))/2*a;

           binding.textView2.setText("x1= "+x1+"\n"+"x2= "+x2);
        }
        else if(dis<0)
        {
            //no real roots
            binding.textView2.setText("No real solution");
        }
        else {
            //only one solution
            x1=-b/(2*a);
            binding.textView2.setText("x1= "+x1);
        }
    }

}
