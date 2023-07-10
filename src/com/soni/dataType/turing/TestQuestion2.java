package com.soni.dataType.turing;

public class TestQuestion2 {
//    given an aaray k where k[i]=[gender_i, name_i, age_i] and also given an attrubute
//    to match the defines as a key a and as a value b. return number of the persons that match the given
//    attribute. input = [["male", "jake","19"],  ["female", "je","20"], ["female", "ko","19"]]
//    output = 1 for a = "gender" and b="male" write jave code for this

    public static int countFrequency(String[][] str, String a, String b){
        String value = "";
        int count = 0;
        for(int i = 0; i< str.length; i++){
            switch(a){
                case "gender" -> value = str[i][0];
                case "name" -> value = str[i][1];
                case "age" -> value = str[i][2];

            }
            if(value.equals(b)){
                count++;
            }


        }
        return count;

    }

    public static void main(String[] args) {
        String[][] str = {{"male", "jake","19"},  {"female", "je","20"}, {"female", "ko","19"}};
        System.out.println(countFrequency(str, "gender", "female"));
        System.out.println(countFrequency(str, "age", "20"));
    }

}
