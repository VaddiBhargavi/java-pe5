package com.stackroute.junitdemo;
import java.util.HashMap;
import java.util.Map;

    public class ChangeTheValueOf {

        public Map<String,String> changeTheValueInTheMap(Map<String,String> newmap){
            for(Map.Entry<String,String> entry:newmap.entrySet())
            {
                if(entry.getKey().equals("val1")&&entry.getValue()!=null)
                {
                    String value=entry.getValue();
                    newmap.put("val1"," ");
                    newmap.put("val2",value);
                }
                else {
                    continue;
                }
            }
            return newmap;
        }
    }
