package org.example;

import static spark.Spark.*;

public class SparkWebServer {
// {
//
// "operation": "collatzsequence",
//
// "input":  13,
//
// "output":  "13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1"
//
//}
    public static void main(String... args){
        port(getPort());
        staticFiles.location("/static");
        get("hello", (req,res) -> "Hello Docker!");
        get("collatzsequence", (req,res) -> {
            res.type("application/json");
            Integer value = Integer.valueOf(req.queryParams("value"));
            String result = value.toString();
            String resultJson = "{\"operation\": \"collatzsequence\"," +
                    "\"input\":" + "\"" + value.toString() + "\",";
            while (!(value == 1)){
                if(value % 2 == 0){
                    value = value/2;
                }else{
                    value = 3 * value +1;
                }
                result += "->" + value.toString();
                System.out.println(value);
                System.out.println(result);
            }
            resultJson += "\"output\":" + "\"" + result + "\"}";
            System.out.println(value);
            return resultJson;
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 80;
    }

}