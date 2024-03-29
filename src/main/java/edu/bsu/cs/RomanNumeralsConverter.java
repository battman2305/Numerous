package edu.bsu.cs;

public class RomanNumeralsConverter {
    public String convert(int n){
        if((n - 1000) >= 0) {
            return "M" + convert(n - 1000);
        }else if((n - 900) >= 0){
            return "CM" + convert(n-900);
        }else if((n - 500) >= 0){
            return "D" + convert(n-500);
        }else if((n - 400) >= 0){
            return "CD" + convert(n-400);
        }else if((n - 100) >= 0){
            return "C" + convert(n-100);
        }else if((n - 90) >= 0){
            return "XC" + convert(n-90);
        }else if((n - 50) >= 0){
            return "L" + convert(n-50);
        }else if((n - 40) >= 0){
            return "XL" + convert(n-40);
        }else if((n - 10) >= 0){
            return "X" + convert(n-10);
        }else if((n - 9) >= 0){
            return "IX" + convert(n-9);
        }else if((n - 5) >= 0){
            return "V" + convert(n-5);
        }else if((n - 4) >= 0){
            return "IV" + convert(n-4);
        }else if((n - 1) >= 0){
            return "I" + convert(n-1);
        }
        return "";
    }
}
