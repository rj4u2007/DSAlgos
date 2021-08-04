package com.practice.hackerrank.problems;

public class ClearWater2 {

	public static void main(String[] args) {
		System.out.println(getDate("4th Nov 2030"));
	}
	
    public static String getDate(String date) {
        int len = date.length();
        String year = date.substring(len-4,len);
        String month = date.substring(len-8,len-5);
        String day = date.substring(0,len-9);
        if(month.equals("Jan")) {
            month = "01";
        } else if(month.equals("Feb")) {
             month = "02";
        }  else if(month.equals("Mar")) {
             month = "03";
        }  else if(month.equals("Apr")) {
             month = "04";
        }  else if(month.equals("May")) {
             month = "05";
        }  else if(month.equals("Jun")) {
             month = "06";
        }  else if(month.equals("Jul")) {
             month = "07";
        }  else if(month.equals("Aug")) {
             month = "08";
        }  else if(month.equals("Sep")) {
             month = "09";
        }  else if(month.equals("Oct")) {
             month = "10";
        }  else if(month.equals("Nov")) {
             month = "11";
        }  else if(month.equals("Dec")) {
             month = "12";
        }
        
        if(day.length()==3) {
            day = new String("0")+ day.substring(0,1);
        } else {
            day = day.substring(0,2);
        }
        
        return year+"-"+month+"-"+day;
    }
}
