package com.example.h2demo;

import java.io.FileWriter;

public class SqlDataGenarator {

    public static void main(String[] args) {
        generateData();
    }

    private static void generateData() {
        String filePath="src/main/resources/data.sql";
        FileWriter fileWriter;
            try {
                fileWriter=new FileWriter(filePath);
                String data="INSERT INTO EMPLOYEE (id, first_name, last_name, gender, job, salary, bonus, email, phone) VALUES\n";

                for(int i=1;i<=100;i++) {
                    data=data+"("+i+", 'FirstName"+i+"', 'LastName"+i+"', ";

                    if(i%2==0)                      data=data+"'Female', ";
                    else                            data=data+"'Male', ";

                    if(i==100)                      data=data+"'Boss', 20000.00, 0.00, ";
                    else if(i==51)                  data=data+"'Manager', 15000.00, 0.00, ";
                    else if(i%20==0)                data=data+"'Secretary', 4000.00, 0.00, ";
                    else if(i%20==3 || i%20==19)    data=data+"'PHP Developer', 10000.00, 0.00, ";
                    else if(i%20==6 || i%20==11)    data=data+"'Fullstack Developer', 13000.00, 0.00, ";
                    else if(i%20==9 || i%20==15)    data=data+"'Data Analyst', 6000.00, 0.00, ";
                    else if(i%20==5)                data=data+"'Project Manager', 10000.00, 0.00, ";
                    else                            data=data+"'Junior Java Developer', 5000.00, 0.00, ";

                    data=data+"'surname"+i+".mail.com', ";

                    if(i<10)                        data=data+"'"+i+"00"+i+"00"+i+"00')";
                    else if(i<100)                  data=data+"'"+i+"0"+i+"0"+i+"0')";
                    else                            data=data+"'101101101')";

                    if(i<100)                       data=data+",\n";
                    else                            data=data+";";
                }
                fileWriter.write(data);
                fileWriter.close();
            }catch(Exception e){
                System.out.println("Something went wrong...");
            }
    }

}
