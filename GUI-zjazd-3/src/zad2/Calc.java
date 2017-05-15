/**
 *
 *  @author Duda Michał S14228
 *
 */

package zad2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;

public class Calc {

    public String doCalc(String cmd) {
        try {
            String tab[] = cmd.split("\\s+");

            String firstNumber = tab[0];
            String operator = tab [1];
            String secondNumber = tab [2];

            BigDecimal bdFirst = new BigDecimal(firstNumber);
            BigDecimal bdSecond = new BigDecimal(secondNumber);

            HashMap<String, BigDecimal> map = new HashMap<>();

            BigDecimal sum = bdFirst.add(bdSecond);
            map.put("+", sum);
            BigDecimal subscract = bdFirst.subtract(bdSecond);
            map.put("-", subscract);
            BigDecimal mulitiply = bdFirst.multiply(bdSecond);
            map.put("*", mulitiply);
            BigDecimal devide = bdFirst.divide(bdSecond, new MathContext(32));
            map.put("/", devide);


            BigDecimal calculate = map.get(operator);
            return calculate.toString();
        }catch (Exception e){
            return "Invalid command to calc";
        }


    }
} 
