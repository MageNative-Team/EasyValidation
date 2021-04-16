package rvr.magenative.easyvalidation;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SpecialFunctions {


        public static   <k , v> k getMapKeyFromValue(Map<k, v> map, v value){

           if (Build.VERSION.SDK_INT >Build.VERSION_CODES.N){

               return map
                       .entrySet()
                       .stream()
                       .filter(entry -> value.equals(entry.getValue()))
                       .map(Map.Entry::getKey).findFirst().orElse(null);


           }else {
               for (Map.Entry<k, v> entry : map.entrySet()) {
                   if (entry.getValue().equals(value)) {
                       return entry.getKey();
                   }
               }
               return null;
           }

        }



        


}
